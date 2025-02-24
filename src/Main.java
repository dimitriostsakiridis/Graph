public class Main {
    public static void main(String[] args) throws Exception {
        DipaeGram s = new DipaeGram(3, 3);
        s.follow(1);
        s.follow(2);
        s.follow(2,1);
        s.printNetwork();
        System.out.println(s.getFollowers(1));
        s.unfollow(1);
        s.printNetwork();
        System.out.println(s.getFollowers(1));
    }
}
