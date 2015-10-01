package ejercicio2.dsa.edu.upc;

public abstract class AbstractShape implements Shape {

        private String type;

        public AbstractShape(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "I'm a " + type;
        }
}

