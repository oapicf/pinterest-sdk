namespace Org.OpenAPITools.Models;


/// <summary>
/// ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
/// </summary>
public class CatalogsRetailReportAllItemsFilter 
{
    public string CatalogId { get; set; }
    public string ProductGroupId { get; set; }
    
    /// <summary>
    /// Gets or Sets ReportType
    /// </summary>
    public enum ReportTypeEnum
    {
        
        /// <summary>
        /// Enum ALLITEMSEnum for ALL_ITEMS
        /// </summary>
        ALLITEMSEnum = 1
    }

    public ReportTypeEnum ReportType { get; set; }
}


