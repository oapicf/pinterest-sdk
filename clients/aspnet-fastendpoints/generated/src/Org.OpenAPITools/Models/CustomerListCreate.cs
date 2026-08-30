namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class CustomerListCreate 
{
    public bool IsNca { get; set; }
    
    public UserListType ListType { get; set; }
    public string Name { get; set; }
    public string Records { get; set; }
    public List<CustomerListRecordRow> RecordsV2 { get; set; }
}


