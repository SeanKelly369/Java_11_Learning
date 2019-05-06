public class builderPattern {
    public static void main(String[] args) {
        System.out.println("Coca Cola:");
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8)
                .calories( 160 ).sodium( 35 ).carbohydrate( 27 ).build();
        System.out.println("\nCornflakes:");
        NutritionFacts cornFlakes = new NutritionFacts.Builder(150, 3)
                .calories( 120 ).sodium( 12 ).carbohydrate( 34 ).fat( 1 ).build();

    }
}

class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // Requires parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialised to default values
        private int calories        = 0;
        private int fat             = 0;
        private int sodium          = 0;
        private int carbohydrate    = 0;


        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            System.out.println("Serving Size: " + servingSize);
            this.servings = servings;
            System.out.println("Number of servings: " + servings);
        }

        public Builder calories(int val) {
            calories = val;
            System.out.println("Number of calories: " + calories);
            return this;
        }
        public Builder fat(int val) {
            fat = val;
            System.out.println("Fat content: " + fat);
            return this;
        }
        public Builder sodium(int val) {
            sodium = val;
            System.out.println("Sodium content: " + sodium);
            return this;
        }
        public Builder carbohydrate(int val) {
            carbohydrate = val;
            System.out.println("Carbohydrate content: " + carbohydrate);
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize     = builder.servingSize;
        servings        = builder.servings;
        calories        = builder.calories;
        fat             = builder.fat;
        sodium          = builder.sodium;
        carbohydrate    = builder.carbohydrate;
    }
}
