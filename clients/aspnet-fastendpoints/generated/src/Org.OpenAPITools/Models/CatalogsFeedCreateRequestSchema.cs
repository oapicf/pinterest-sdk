namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsFeedCreateRequestSchema 
{
    public CatalogsFeedCredentials Credentials { get; set; }
    
    public ProductAvailabilityType? DefaultAvailability { get; set; }
    
    public Country DefaultCountry { get; set; }
    
    public NullableCurrency? DefaultCurrency { get; set; }
    public CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale DefaultLocale { get; set; }
    
    public CatalogsFormat Format { get; set; }
    public string Location { get; set; }
    public string Name { get; set; }
    public CatalogsFeedProcessingSchedule PreferredProcessingSchedule { get; set; }
    
    public CatalogsStatus Status { get; set; }
}


