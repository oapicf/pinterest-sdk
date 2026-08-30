namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CustomerList 
{
    public string AdAccountId { get; set; }
    public decimal CreatedTime { get; set; }
    public Object Exceptions { get; set; }
    public string Id { get; set; }
    public bool IsNca { get; set; }
    public string Name { get; set; }
    public decimal NumBatches { get; set; }
    public decimal NumRemovedUserRecords { get; set; }
    public decimal NumUploadedUserRecords { get; set; }
    
    public CustomerListStatus Status { get; set; }
    public string Type { get; set; }
    public decimal UpdatedTime { get; set; }
}


