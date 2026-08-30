namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CustomerListUpload 
{
    public string AdAccountId { get; set; }
    public int CreationTime { get; set; }
    public string CustomerListId { get; set; }
    public List<ErrorDetail> ErrorCounts { get; set; }
    public string Id { get; set; }
    
    public UserListOperationType Operation { get; set; }
    public RecordCounts RecordCounts { get; set; }
    
    public WorkloadState State { get; set; }
    public int UpdatedTime { get; set; }
}


