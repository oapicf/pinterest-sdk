namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DeliveryMetricsResponseItemsItems 
{
    
    /// <summary>
    /// Category name
    /// </summary>
    /// <value>Category name</value>
    public enum CategoryEnum
    {
        
        /// <summary>
        /// Enum ADSEnum for ADS
        /// </summary>
        ADSEnum = 1,
        
        /// <summary>
        /// Enum ORGANICEnum for ORGANIC
        /// </summary>
        ORGANICEnum = 2
    }

    public CategoryEnum Category { get; set; }
    public string Definition { get; set; }
    public string DisplayName { get; set; }
    public string Name { get; set; }
}


