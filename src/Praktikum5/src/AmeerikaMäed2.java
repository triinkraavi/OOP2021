public class AmeerikaMäed2 {
    public boolean vanusedSobivad2(Dokument[] dokumendid){
        for (Dokument dokument:dokumendid){
            if(!dokument.onVähemalt12Aastane())
                return false;
        }
        return true;
    }
}
