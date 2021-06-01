public class CombinacionConTablero {
    
    private String combinacion;
    private char letraEspecial;

    public CombinacionConTablero(String comb, char letra){
        this.combinacion = comb;
        this.letraEspecial = letra;
    }

    public String getCombinacion(){
        return this.combinacion;
    }

    
    public char getLetraEspecial(){
        return this.letraEspecial;
    }


}
