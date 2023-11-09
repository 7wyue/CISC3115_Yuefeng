public class Rational extends Number implements Comparable<Rational> {
    private long numerator;
    private long denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(long numerator, long denominator) {

        if (denominator != 0) {
            
            long gcd = gcd(numerator, denominator);
            System.out.println(gcd);
            // if(numerator%gcd==0&&denominator%gcd==0){
            this.numerator = numerator / gcd;
            
            this.denominator = denominator / gcd;
            // }else{
            //     this.numerator=numerator;
            //     this.denominator=denominator;
            // }
        }

    }

    public long getNumerator() {

        return this.numerator;

    }

    public long getDenominator() {
        return this.denominator;
    }

    public Rational add(Rational secondRational) {
        long n, d;
        if (this.denominator == secondRational.getDenominator()) {
            n = this.numerator + secondRational.getNumerator();
            d = this.denominator;
            return new Rational(n, d);
        } else {
            n = this.numerator * secondRational.getDenominator() + secondRational.getNumerator() * this.denominator;
            d = this.denominator * secondRational.getDenominator();
            return new Rational(n, d);
        }

    }

    public Rational subtract(Rational secondRational) {
        long n, d;
        if (this.denominator == secondRational.getDenominator()) {
            n = this.numerator - secondRational.getNumerator();
            d = this.denominator;
            return new Rational(n, d);
        } else {
            n = this.numerator * secondRational.getDenominator() - secondRational.getNumerator() * this.denominator;
            d = this.denominator * secondRational.getDenominator();
            return new Rational(n, d);
        }

    }

    public Rational divide(Rational secondRational) {
        long n, d;
        n = this.numerator * secondRational.getDenominator();
        d = this.denominator * secondRational.getNumerator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        long n, d;
        n = this.numerator * secondRational.getNumerator();
        d = this.denominator * secondRational.getDenominator();
        return new Rational(n, d);

    }

    @Override
    public String toString() {

        return numerator + (denominator == 1 ? "" : "/" + denominator);
    }

    private long gcd(long n, long d) {
        long numerator, denominator, mod;
        numerator = Math.abs(n);
        denominator = Math.abs(d);
        mod = numerator % denominator;
                    System.out.println(mod);
        while (mod != 0) {

            numerator = denominator;
            System.out.println(numerator);
            denominator = mod;
            System.out.println(denominator);
            mod = numerator % denominator;
            System.out.println(mod);
            System.out.println("------");
            
        }

        return denominator;
    }

    @Override
    public int compareTo(Rational secondRational) {
        if (Math.abs(this.doubleValue() - secondRational.doubleValue()) < 0.000001) {
            return 0;
        } else if (this.doubleValue() > secondRational.doubleValue()) {
            return 1;
        }
        return -1;

    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {

        return (double) numerator / denominator;
    }
    public static void main(String[] args) {
        // Create and initialize two rational numbers r1 and r2
		Rational r1 = new Rational(12, 13);
		// Rational r2 = new Rational(2, 3);

		// // Display results
        System.out.println(r1);
		// System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		// System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		// System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		// System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		// System.out.println(r2 + " is " + r2.doubleValue());
    }
}