public class Testy {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain(4);
        blockchain.addBlock(blockchain.newBlock("Hi, I am Lil Smith"));
        blockchain.addBlock(blockchain.newBlock("XRP is better than bitcoin"));
        blockchain.addBlock(blockchain.newBlock(":) Geaux Tigers"));

        System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
        System.out.println(blockchain);


        blockchain.addBlock(new Block(15, System.currentTimeMillis(), "fake hash", "This is a bad block"));

        System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
        System.out.println(blockchain);
    }
}
