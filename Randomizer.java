class Randomizer{
  long semente;

Randomizer(){
  semente = System.currentTimeMillis();
  long a = (semente/100000000000L)%10;
  long b = (semente/10000000000L)%10;
  long c = (semente/1000000000)%10;
  long d = (semente/100000000)%10;
  long e = (semente/10000000)%10;
  long f = (semente/1000000)%10;
  long g = (semente/100000)%10;
  long h = (semente/10000)%10;
  long i = (semente/1000)%10;
  long j = (semente/100)%10;
  long k = (semente/10)%10;
  long l = semente%10;

    semente = (d * 100000) + (e * 10000) + (f * 1000) + (g * 100) + (h * 10) + (i *1);
//    System.out.println(semente);
}

double next(){
  double r =0.0;
  semente = semente * semente;
long a = (semente/100000000000L)%10;
long b = (semente/10000000000L)%10;
long c = (semente/1000000000)%10;
long d = (semente/100000000)%10;
long e = (semente/10000000)%10;
long f = (semente/1000000)%10;
long g = (semente/100000)%10;
long h = (semente/10000)%10;
long i = (semente/1000)%10;
long j = (semente/100)%10;
long k = (semente/10)%10;
long l = semente%10;

  semente = (d * 100000) + (e * 10000) + (f * 1000) + (g * 100) + (h * 10) + (i *1);
	r = semente;
  return r / 1000000;
}
int nextInt(int a){
  return (int)(next() * a); // cast transforma de double para int
  }

int nextInt(int a, int b){
    return (int)((next() * (b - a)) + a);

 }
}
