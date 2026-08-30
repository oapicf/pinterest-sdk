namespace Org.OpenAPITools.Models;


/// <summary>
/// This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
/// </summary>
public class BidOptionsAgeBucketMultipliers 
{
    public decimal Var1824 { get; set; }
    public decimal Var2534 { get; set; }
    public decimal Var3544 { get; set; }
    public decimal Var4549 { get; set; }
    public decimal Var5054 { get; set; }
    public decimal Var5564 { get; set; }
    public decimal Var65 { get; set; }
}


