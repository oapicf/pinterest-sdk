namespace Org.OpenAPITools.Models;


/// <summary>
/// Parameters for retail report
/// </summary>
public class CatalogsRetailReportParameters 
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
    public CatalogsRetailReportParametersReport Report { get; set; }
}


