namespace Org.OpenAPITools.Models;


/// <summary>
/// Bid floor request and response model.
/// </summary>
public class BidFloor 
{
    public List<int> BidFloors { get; set; }
    public string Type { get; set; } = "bidfloor";
}


