class Main_Coordenada{
  public static void main(String[] args) {
    // construtores:
Coordenada c1 = new Coordenada();
System.out.println(c1.latitude == 0.0);
System.out.println(c1.longitude == 0.0);

Coordenada c2 = new Coordenada(50.0, 134.0);
System.out.println(c2.latitude == 50.0);
System.out.println(c2.longitude == 134.0);

Coordenada c3 = new Coordenada(-90.0, -180.0);
System.out.println(c3.latitude == -90.0);
System.out.println(c3.longitude == -180.0);

// estas coordenadas são inválidas e devem lançar exceção
// faça serem rejeitadas e depois comente-as para não parar o programa
Coordenada e1 = new Coordenada(-91.0, 0.0);
Coordenada e2 = new Coordenada(100.0, 0.0);
Coordenada e3 = new Coordenada(10.0, -182.0);
Coordenada e4 = new Coordenada(10.0, 200.0);
Coordenada e5 = new Coordenada(-95.0, -200.0);

// imutabilidade: as linhas a seguir devem causar erro de compilação
// verifique se está de acordo e depois comente-as
Coordenada c4 = new Coordenada();
//c4.latitude = 30.0;  // não deve permitir reatribuição
//c4.longitude = 80.0; // não deve permitir reatribuição

// operações/comandos:
Coordenada in = new Coordenada(30.0, 50.0);
Coordenada out = in.norte(5.0);
System.out.println(in.latitude == 30.0); // deve ser imutável
System.out.println(out.latitude == 35.0);
out.norte(5.0); // sem reatribuição sem alteração
System.out.println(out.latitude == 35.0);
out = out.norte(5.0); // reatribuindo
System.out.println(out.latitude == 40.0);
out = out.sul(60.0);
System.out.println(out.latitude == -20.0);
out = out.sul(30.0);
System.out.println(out.latitude == -50.0);
out = out.sul(-10.0);
System.out.println(out.latitude == -40.0);
out = out.norte(-10.0);
System.out.println(out.latitude == -50.0);
System.out.println(out.longitude == 50.0);
out = out.leste(50.0);
System.out.println(out.longitude == 100.0);
out = out.oeste(180.0);
System.out.println(out.longitude == -80.0);
out = out.oeste(-10.0);
System.out.println(out.longitude == -70.0);
out = out.leste(-10.0);
System.out.println(out.longitude == -80.0);
// até aqui 0.2

// consultas:
Coordenada q = new Coordenada();
System.out.println(q.latitude == 0);
System.out.println(q.longitude == 0);
System.out.println(q.noEquador() == true);
System.out.println(q.noMeridiano() == true);
q = q.norte(10.0);
System.out.println(q.latitude == 10);
System.out.println(q.noEquador() == false);
q = q.leste(10.0);
System.out.println(q.noMeridiano() == false);
q = q.leste(170.0);
System.out.println(q.longitude == 180.0);
System.out.println(q.noMeridiano() == true);
q = q.oeste(200.0);
System.out.println(q.longitude == -20.0);
System.out.println(q.noMeridiano() == false);
q = q.oeste(160.0);
System.out.println(q.longitude == -180.0);
System.out.println(q.noMeridiano() == true);

Coordenada r = new Coordenada(30.0, 70.0);
System.out.println(r.latitude == 30.0);
System.out.println(r.longitude == 70.0);
System.out.println(r.noNorte() == true);
System.out.println(r.noSul() == false);
System.out.println(r.noOriente() == true);
System.out.println(r.noOcidente() == false);
r = r.oeste(140.0).sul(60.0);
System.out.println(r.latitude == -30.0);
System.out.println(r.longitude == -70.0);
System.out.println(r.noNorte() == false);
System.out.println(r.noSul() == true);
System.out.println(r.noOriente() == false);
System.out.println(r.noOcidente() == true);

// toString:
System.out.println(c1.toString().equals("0.0000000°, 0.0000000°"));
System.out.println(c2.toString().equals("50.0000000°, 134.0000000°"));
System.out.println(c3.toString().equals("-90.0000000°, -180.0000000°"));
System.out.println(out.toString().equals("-50.0000000°, -80.0000000°"));
System.out.println(q.toString().equals("10.0000000°, -180.0000000°"));
System.out.println(r); // -30.0000000°, -70.0000000°
System.out.println(r.toString().equals("-30.0000000°, -70.0000000°"));

Coordenada t = new Coordenada(-32.0714021, -52.1425059); // String t = l + ""
// https://www.google.com.br/maps/@-32.0714021,-52.1425059,13z?hl=pt-BR
System.out.println(t); // -32.0714021°, -52.1425059°
System.out.println();
System.out.println(t.toString().equals("-32.0714021°, -52.1425059°"));

// equals:
System.out.println(t.equals(r) == false);
Coordenada y = new Coordenada(-32.0714021, -52.1425059);
System.out.println(t.equals(y) == true);
System.out.println(y.equals(t) == true);
System.out.println(y.equals(y) == true);
System.out.println(y.equals(r) == false);

// desafio: escrever método que retorna link para Google Maps!
//Coordenada t = new Coordenada(37.402473, -122.3212843);
//String url = t.googleMaps();
//System.out.println(url.equals("https://www.google.com.br/maps/@37.402473,-122.3212843,10z?hl=pt-BR"));
// descomente para ver se funciona (não testei)
// Runtime.getRuntime().exec("google-chrome " + url);
// tente outro navegador, no windows tente "start " + url
  }
}
