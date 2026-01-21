package Principal;



import Entidades.Gatos;
import Implementacion.ImpGatos;

public class Principal {
    
    public static void main(String[] args) {
        // Instanciar Gatos
        Gatos g1 = new Gatos("Catsito", "Naranja", 4, 500);
        Gatos g2 = new Gatos("Chucha", "Blanco", 3, 450);
        Gatos g3 = new Gatos("Lisa", "Gris", 5, 600);
        Gatos g4 = new Gatos("Dewey", "Naranja", 6, 700);
        Gatos g5 = new Gatos("Pecas", "Blanco", 3, 550);
        Gatos g6 = new Gatos("", "Negro", 4, 480);
        Gatos g7 = new Gatos("Tigre", "Atigrado", 5, 520);
        
        // Auxiliar
        Gatos auxG = null;
        
        // Implementación
        ImpGatos impG = new ImpGatos();
        
        // Agregar
        impG.create(g1.getNombre(), g1);
        impG.create(g2.getNombre(), g2);
        impG.create(g3.getNombre(), g3);
        impG.create(g4.getNombre(), g4);
        impG.create(g5.getNombre(), g5);
        impG.create(g6.getNombre(), g6);
        impG.create(g7.getNombre(), g7);
        
        //Mostrar
        impG.read();
        
        //Buscar
        auxG = (Gatos) impG.search(8);
        System.out.println("Encontrado: " + auxG);
        
        //Eliminar
        impG.delete(1);
        impG.read();
        
        //Contar
        impG.contar();
    }
}
