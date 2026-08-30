namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object for creating a feed.
/// </summary>
public class CatalogsCreativeAssetsFeedsCreateRequest 
{
    public string CatalogId { get; set; }
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum CREATIVEASSETSEnum for CREATIVE_ASSETS
        /// </summary>
        CREATIVEASSETSEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public CatalogsFeedCredentials Credentials { get; set; }
    
    public Country DefaultCountry { get; set; }
    
    public NullableCurrency? DefaultCurrency { get; set; }
    public CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale DefaultLocale { get; set; }
    
    public CatalogsFormat Format { get; set; }
    public string Location { get; set; }
    public string Name { get; set; }
    public CatalogsFeedProcessingSchedule PreferredProcessingSchedule { get; set; }
    
    public CatalogsStatus Status { get; set; }
}


