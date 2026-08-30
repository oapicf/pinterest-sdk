namespace Org.OpenAPITools.Models;


/// <summary>
/// Bid floor specification for a given campaign configuration.
/// </summary>
public class BidFloorSpec 
{
    
    public ActionType BillableEvent { get; set; }
    public List<Country> Countries { get; set; }
    
    public CreativeType CreativeType { get; set; }
    
    public Currency Currency { get; set; }
    
    public BidFloorObjectiveType ObjectiveType { get; set; }
    public OptimizationGoalMetadata OptimizationGoalMetadata { get; set; }
}


