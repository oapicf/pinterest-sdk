namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrderLineMutationResult 
{
    public List<OrderLineMutationError> Errors { get; set; }
    public List<OrderLine> OrderLine { get; set; }
}


