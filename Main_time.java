class Main_time{
  public static void main(String[] args) {
  //  Implementar uma classe para gerar objetos imutáveis de Tempo e suas operações (0.4 pts)

   //Considere um instante no tempo em horas, minutos e segundos, entre 00:00:00 e 23:59:59.
   //Implementar construtores e métodos para lidar com esse tempo de maneira
   //fail-safe (sem rejeitar as entradas, mas adaptando-as).
   // A API (interface do objeto) será implementada na língua inglesa com construtores para h:m:s,
   // h:m e somente h. Os métodos disponíveis serão Time#plus(Time):Time,
   //Time#plusHours(int):Time, Time#plusMinutes(int):Time, Time#plusSeconds(int):Time,
   // Time#minus(Time):Time, //Time#minusHours(int):Time, Time#minusSeconds(int):Time,
   // Time#tick():Time (adiciona um segundo), Time#shift():Time (inverte o turno),
   //Time#isMidDay():boolean (questiona se é meio-dia) e Time#isMidNight():boolean (questiona se é meia-noite).

//Regra específica: a classe Time deve ter apenas um atributo int constante.

//Casos de teste:

Time t1 = new Time();
// representação string, padrão 00:00:00
System.out.println(t1.toString().equals("00:00:00"));
Time t2 = new Time(1, 40, 5);
System.out.println(t2.toString().equals("01:40:05"));
Time t3 = t1.plus(t2);
System.out.println(t3.toString().equals("01:40:05"));
System.out.println(t3.hours() == 1);
System.out.println(t3.minutes() == 40);
System.out.println(t3.seconds() == 5);
// deve ser imutável
System.out.println(t1.hours() == 0);
System.out.println(t1.minutes() == 0);
System.out.println(t1.seconds() == 0);
// plus
Time t4 = t3.plus(t2);
System.out.println(t4.toString().equals("03:20:10"));
// implementar equals
System.out.println(t4.equals(new Time(3, 20, 10)));
Time t5 = t2.plusHours(1);
System.out.println(t5);

System.out.println(t5.toString().equals("02:40:05"));
Time t6 = t4.plusHours(23);
System.out.println(t6);
System.out.println(t6.toString().equals("02:20:10"));
Time t7 = t6.plusMinutes(10);
System.out.println(t7);
System.out.println(t7.toString().equals("02:30:10"));
Time t8 = t7.plusSeconds(80);
System.out.println(t8);
System.out.println(t8.toString().equals("02:31:30"));
// até aqui 0.2
Time t9 = new Time().plusHours(19).plusMinutes(23).plusSeconds(18);
System.out.println(t9.toString().equals("19:23:18"));
Time t10 = t9.plusHours(-1).plusMinutes(-1).plusSeconds(-1);
System.out.println(t10.toString().equals("18:22:17"));
Time t11 = t10.minusHours(2).minusMinutes(2).minusSeconds(2);
System.out.println(t11.toString().equals("16:20:15"));
Time t12 = t11.minusHours(-5);
System.out.println(t12.toString().equals("21:20:15"));
Time t13 = t11.minus(t12);
System.out.println(t13.toString().equals("19:00:00"));
System.out.println(t13.isMidDay() == false);
Time t14 = t13.minus(t13);
System.out.println(t14.toString().equals("00:00:00"));
System.out.println(t14.isMidDay() == false);
System.out.println(t14.isMidNight() == true);
System.out.println(t14.plusHours(12).isMidDay() == true);
Time t15 = new Time(3, 40);
System.out.println(t15.toString().equals("03:40:00"));
Time t16 = t15.shift();
System.out.println(t16.toString().equals("15:40:00"));
Time t17 = t16.shift();
System.out.println(t17.toString().equals("03:40:00"));
Time t18 = t17.tick();
System.out.println(t18.toString().equals("03:40:01"));
Time t19 = t18.tick().tick().tick();
System.out.println(t19.toString().equals("03:40:04"));
Time t20 = t19.plusHours(50).plusMinutes(50).minusSeconds(50).tick().shift();
System.out.println(t20.toString().equals("18:29:15"));

  }
}
