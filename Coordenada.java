class Coordenada{

final double latitude;
final double longitude;


Coordenada(double latitude, double longitude){
  if (latitude < -90.0000000 || latitude > 90.0000000) {
    }
  if (longitude < -180.0000000 || longitude > 180.0000000) {
    }
  this.latitude = latitude;
  this.longitude = longitude;
  }

Coordenada(){
  this.latitude = 0.0000000;
  this.longitude = 0.0000000;
  }

  Coordenada norte(double latitude){
    return new Coordenada((this.latitude + latitude),this.longitude);
    }

  Coordenada sul(double latitude){
    return new Coordenada((this.latitude - latitude), this.longitude);
    }

  Coordenada leste(double longitude ){
      return new Coordenada(this.latitude,(this.longitude + longitude));
    }

  Coordenada oeste(double longitude){
    return new Coordenada(this.latitude,(this.longitude - longitude));
    }
  double latitude(){
    return this.latitude;
    }
  double longitude(){
    return this.longitude;
    }
  boolean noEquador(){
    return latitude == 0
      || latitude == 90.0000000
      || latitude == -90.0000000;
    }
  boolean noMeridiano(){
    return longitude == 0
      || longitude == 180.0000000
      || longitude == -180.0000000;
    }
  boolean noNorte(){
    return latitude > 0
      && latitude < 90.0000000;
    }

  boolean noSul(){
    return latitude < 0
      && latitude > -90.0000000;
    }

  boolean noOcidente(){
    return longitude < 0.0000000
      && longitude > -180.0000000;
    }

  boolean noOriente(){
    return longitude > 0
      && longitude < 180.0000000;
    }

  // REPRESENTAÇÃO STRING DO OBJETO
  // SOBRESCREVER O MÉTODO toString()
  @Override
    public String toString() {
      // TODO: imprimir os zeros à esquerda
      if( this.latitude % 10 != 0 && this.longitude % 10 != 0){
        return this.latitude + "°" + ", "
         + this.longitude + "°" ;}
         return this.latitude + "000000" + "°" + ", "
        + this.longitude + "000000" + "°";
      
}
      // SOBRESCREVER O EQUALS
  @Override
    public boolean equals(Object o) {
      Coordenada h = (Coordenada) o; // cast
      return this.latitude == h.latitude
        && this.longitude == h.longitude;
      }
}
