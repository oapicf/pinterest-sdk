namespace Org.OpenAPITools.Models;


/// <summary>
/// Store metadata for a specific store location
/// </summary>
public class StoreMetadata 
{
    public string Geohash { get; set; }
    public double Latitude { get; set; }
    public double Longitude { get; set; }
    public string StoreCode { get; set; }
    public string StoreId { get; set; }
    public string StoreName { get; set; }
}


