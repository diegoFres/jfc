package JFC;
import java.util.HashSet;
import java.util.Set;

public class jfc {

    // Unión de dos conjuntos
    public static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
        Set<Integer> res = new HashSet<>(a);
        res.addAll(b);
        return res;
    }

    // Intersección
    public static Set<Integer> interseccion(Set<Integer> a, Set<Integer> b) {
        Set<Integer> res = new HashSet<>(a);
        res.retainAll(b);
        return res;
    }

    // Diferencia a b
    public static Set<Integer> diferencia(Set<Integer> a, Set<Integer> b) {
        Set<Integer> res = new HashSet<>(a);
        res.removeAll(b);
        return res;

    }

    // probar si b es subconjunto de a
    public static boolean subconjunto(Set<Integer> a, Set<Integer> b) {
        // probar si a tiene los elementos de b
        return a.containsAll(b);
    }

    // Producto cartesiano
    public static Set<String> cartesiano(Set<Integer> a, Set<Integer> b) {
        Set<String> res = new HashSet<>();
        for (Integer x : a) {
            // Recorremos cada elemento de "b"
            for (Integer y : b) {
                // Agregamos el par ordenado como una cadena "(x, y)"
                res.add("(" + x + ", " + y + ")");
            }
        }
        return res; // Regresar el conjunto con el producto cartesiano
    }

    public static void main(String[] args) {
        // Crear dos conjuntos de ejemplo
        Set<Integer> conjuntoA = new HashSet<>();
        Set<Integer> conjuntoB = new HashSet<>();

        conjuntoA.add(1);
        conjuntoA.add(2);
        conjuntoA.add(3);

        conjuntoB.add(3);
        conjuntoB.add(4);
        conjuntoB.add(5);

        // imprimir original
        System.out.println("Conjunto a: " + conjuntoA);
        System.out.println("Conjunto b: " + conjuntoB);

        //resultados
        System.out.println("Unión: " + union(conjuntoA, conjuntoB));
        System.out.println("Intersección: " + interseccion(conjuntoA, conjuntoB));
        System.out.println("Diferencia a-b " + diferencia(conjuntoA, conjuntoB));
        System.out.println(" b es subconjunto de a? " + subconjunto(conjuntoA, conjuntoB));
        System.out.println("Producto cartesiano a x b: " + cartesiano(conjuntoA, conjuntoB));
    }
}