public class AmeerikaMäed {
    public boolean vanusedSobivad(IDKaart[] idKaardid, Õpilaspilet[] õpilaspiletid, Juhiluba[] juhiload){
        for(IDKaart id : idKaardid){
            if(!id.onVähemalt12Aastane())
                return false;
        }
        for (Õpilaspilet pilet : õpilaspiletid){
            if(!pilet.onVähemalt12Aastane())
                return false;
        }
        for (Juhiluba juhiluba : juhiload){
            if(!juhiluba.onVähemalt12Aastane())
                return false;
       }
        return true;

    }

}
