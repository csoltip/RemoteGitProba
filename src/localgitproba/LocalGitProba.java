package localgitproba;

public class LocalGitProba {

    public static void main(String[] args) {
        LocalGitProba lgp = new LocalGitProba();
        int osszeg = lgp.osszead("3", "5");
    }

    private int osszead(String a, String b) {
        int szam1 = Integer.parseInt(a);
        int szam2 = Integer.parseInt(b);
        return szam1 + szam2;
    }
    
}
