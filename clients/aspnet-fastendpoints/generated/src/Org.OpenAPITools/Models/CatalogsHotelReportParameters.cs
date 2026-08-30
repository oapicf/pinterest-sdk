namespace Org.OpenAPITools.Models;


/// <summary>
/// Parameters for hotel report
/// </summary>
public class CatalogsHotelReportParameters 
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


