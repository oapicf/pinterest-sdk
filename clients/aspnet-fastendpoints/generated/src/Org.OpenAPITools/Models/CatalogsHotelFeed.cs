namespace Org.OpenAPITools.Models;


/// <summary>
/// Catalogs Hotel Feed object
/// </summary>
public class CatalogsHotelFeed 
{
    public string CatalogId { get; set; }
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum HOTELEnum for HOTEL
        /// </summary>
        HOTELEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public DateTime CreatedAt { get; set; }
    public CatalogsFeedCredentials Credentials { get; set; }
    
    public NullableCurrency? DefaultCurrency { get; set; }
    public string DefaultLocale { get; set; }
    
    public CatalogsFormat Format { get; set; }
    public string Id { get; set; }
    public string Location { get; set; }
    public string Name { get; set; }
    public CatalogsFeedProcessingSchedule PreferredProcessingSchedule { get; set; }
    
    public CatalogsStatus Status { get; set; }
    public DateTime UpdatedAt { get; set; }
}


