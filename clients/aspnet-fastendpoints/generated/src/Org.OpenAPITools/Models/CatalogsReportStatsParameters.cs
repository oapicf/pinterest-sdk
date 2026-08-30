namespace Org.OpenAPITools.Models;


/// <summary>
/// Report stats parameters
/// </summary>
public class CatalogsReportStatsParameters 
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
    public CatalogsHotelReportStatsParametersReport Report { get; set; }
}


