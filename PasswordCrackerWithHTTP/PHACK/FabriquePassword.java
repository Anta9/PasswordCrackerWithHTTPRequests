
public class FabriquePassword{
    public static CrackPassword testPassword( Integer var)
    { 
        CrackPassword crack;
    
    if (var ==1)
    {
       crack = new BruteForce();
    }
    else
    {
        
        
       crack = new GetDico();
    }

    return crack;
}
}