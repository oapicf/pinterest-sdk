namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrderLine 
{
    public string AdAccountId { get; set; }
    public decimal Budget { get; set; }
    public List<string> CampaignIds { get; set; }
    public decimal EndTime { get; set; }
    public string Id { get; set; }
    public string Name { get; set; }
    public decimal PaidBudget { get; set; }
    
    public OrderLinePaidType? PaidType { get; set; }
    public string PurchaseOrderId { get; set; }
    public decimal StartTime { get; set; }
    
    public OrderLineStatus Status { get; set; }
    public string Type { get; set; }
}


