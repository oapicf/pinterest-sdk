namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
/// </summary>
public class CatalogsFeedsCreateRequest 
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


