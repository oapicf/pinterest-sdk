namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LocalStoreBatchUpdate 
{
    public string AddressPrimary { get; set; }
    public string AddressSecondary { get; set; }
    public string City { get; set; }
    
    public Country Country { get; set; }
    public string Id { get; set; }
    public float Latitude { get; set; }
    public float Longitude { get; set; }
    public string Name { get; set; }
    public string PostalCode { get; set; }
    public string Region { get; set; }
    public string StoreCode { get; set; }
}


