namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOperationGeoExclude 
{
    
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    public enum FieldEnum
    {
        
        /// <summary>
        /// Enum GEOEXCLUDEEnum for GEO_EXCLUDE
        /// </summary>
        GEOEXCLUDEEnum = 1
    }

    public FieldEnum Field { get; set; }
    
    public TargetingSpecListOperation Operation { get; set; }
    public List<string> Values { get; set; }
}


