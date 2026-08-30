namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create or update operation model with required body fields (no OptionalProperties).
/// </summary>
public class CustomerListUpdateWithRequiredBody 
{
    
    public UserListOperationType OperationType { get; set; }
    public string Records { get; set; }
    public List<CustomerListRecordRow> RecordsV2 { get; set; }
}


