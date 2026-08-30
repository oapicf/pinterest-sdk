namespace Org.OpenAPITools.Models;


/// <summary>
/// Report parameters
/// </summary>
public class CatalogsReportParameters 
{
    
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
    public CatalogsHotelReportParametersReport Report { get; set; }
}


