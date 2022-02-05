public class SkillDemo {
    public static String songRecommender(String catalog, int index) {
        
        String[] minecraft = {"Living Mice", "Dreiton", "Sweden"};
        String[] vSauce = {"Moon Men", "145(Poodles)", "It's Good to be D"};


        if (catalog.equals("minecraft")) {
            return minecraft[index];
        } else if(catalog.equals("vSauce")) {
            return vSauce[index];
        } else {
            return "This catalog isn't available yet :(";
        }
    }
}