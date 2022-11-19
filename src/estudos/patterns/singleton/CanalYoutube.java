package estudos.patterns.singleton;

public class CanalYoutube {
    String nome;
    String username;

    public CanalYoutube(String nome, String username){
        this.nome = nome;
        this.username = username;
    }

    @Override
    public String toString() {
        return "\n{Nome:  " + nome +
        ", Username: " + username +
        "}";
    }
}
