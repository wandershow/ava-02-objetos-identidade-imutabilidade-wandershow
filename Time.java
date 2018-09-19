class Time{

private final int segundos;

Time(){
  this.segundos = 0;
}

Time(int horas){
  this.segundos = horas * 3600;
}

Time(int horas, int minutos){
  this.segundos = ((horas * 3600) + (minutos * 60));
}

Time(int horas, int minutos, int segundos){
  this.segundos = ((horas * 3600) + (minutos * 60) + segundos);
}

int hours(){
  return ((this.segundos / 3600) % 24);
}

int minutes(){
  return ((this.segundos % 3600) / 60);
}

int seconds(){
  return this.segundos % 60;
}

Time plus(Time t){
  return new Time(0, 0, this.segundos + t.segundos);
}

Time plusHours(int t){
  return new Time(((hours()) + t), minutes(),seconds());
}

Time plusMinutes(int t){
  return new Time(hours(),(minutes() + t), seconds());
}

Time plusSeconds(int t){
  return new Time(hours(), minutes(), (seconds() + t));
}

Time minus(Time t){
  return new Time(0, 0,(this.segundos + 86400) - t.segundos);
}


Time minusHours(int t){
  return new Time(((hours()) - t), minutes(),seconds());
}

Time minusMinutes(int t){
  return new Time(hours(),(minutes() - t), seconds());
}

Time minusSeconds(int t){
  return new Time(hours(), minutes(), (seconds() - t));
}

boolean isMidDay(){
  return this.segundos == 43200;
}
boolean isMidNight(){
  return this.segundos == 86400;
}

Time tick(){
  return new Time(hours(), minutes(), seconds() + 1);
}

Time shift(){
  return new Time((hours() + 12),minutes(), seconds());
}

@Override
public String toString(){
  return (this.hours() < 10 ? "0" : "") + this.hours() + ":" + (this.minutes() < 10 ? "0" : "") + this.minutes()
   + ":" + (this.seconds() < 10 ? "0" : "") + this.seconds();
}

@Override
public boolean equals(Object o){
  Time outroTime = (Time) o;
    return this.segundos == outroTime.segundos;
}

}
