namespace Org.OpenAPITools.Models;


/// <summary>
/// Catalogs Retail Feed object
/// </summary>
public class CatalogsRetailFeed 
{
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum RETAILEnum for RETAIL
        /// </summary>
        RETAILEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public DateTime CreatedAt { get; set; }
    public CatalogsFeedCredentials Credentials { get; set; }
    
    public ProductAvailabilityType? DefaultAvailability { get; set; }
    
    public Country DefaultCountry { get; set; }
    
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


