namespace Org.OpenAPITools.Models;


/// <summary>
/// Parameters for retail report
/// </summary>
public class CatalogsRetailReportStatsParameters 
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
    public CatalogsRetailReportStatsParametersReport Report { get; set; }
}


