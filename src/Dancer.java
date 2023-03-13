public class Dancer extends Performer{
    private int shoeSize;

    public Dancer (String name, int age, Agent agent, int shoe){
        super(name, age, agent);
        shoeSize = shoe;
    }

    public int getShoeSize(){
        return shoeSize;
    }

    public String getName(){
        return super.getName() + " is a dancer!";
    }

    public void pirouette(int spins){
        System.out.println("I am spinning " + spins + " times!");
    }

    public void rehearse(){
        pirouette(3);
        super.rehearse();
    }

    public void perform(boolean warmUp){
        if (warmUp){
            rehearse();
        }
        super.perform();
    }

    public void callAgent(){
        super.callAgent();
        System.out.println("My shoes don't fit! Please pick me up a new pair.");
    }

    public void callAgent(int correctSize){
        this.callAgent();
        System.out.println("I wear size " + shoeSize + " by the way!");
    }
}
