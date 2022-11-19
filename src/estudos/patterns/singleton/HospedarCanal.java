package estudos.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class HospedarCanal {
    
    private static HospedarCanal instance;
    private List<CanalYoutube> canais = new ArrayList<CanalYoutube>();

    private HospedarCanal(){
        super();
    }

    public static HospedarCanal getInstancia(){
        if(instance == null){
            instance = new HospedarCanal(); 
        }
        return instance;
    }
    
    public void setCanais(CanalYoutube canal){
        this.canais.add(canal);
    }
    
    public List<CanalYoutube> getCanais(){
        return canais;
    }
}
