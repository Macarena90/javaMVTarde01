package ejercicio01;

public class Init {
    public static void main(String[] args) {
        double[] indices = new double[args.length];
        
        for (int x = 0; x < args.length; x++) {
            indices[x] = (Double.valueOf(args[x]) / 100) + 1;            
        }
        
        double baseAcumulado = 100;
        
        for (double idx : indices) {
            baseAcumulado = baseAcumulado * idx;
            System.out.println(idx);
        }
        baseAcumulado = (baseAcumulado - 100) * 100;
        baseAcumulado = (double)Math.round(baseAcumulado) / (double)100; 
        System.out.println(baseAcumulado);
    }
}
