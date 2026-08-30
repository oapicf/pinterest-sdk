namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOperationGeo 
{
    
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    public enum FieldEnum
    {
        
        /// <summary>
        /// Enum GEOEnum for GEO
        /// </summary>
        GEOEnum = 1
    }

    public FieldEnum Field { get; set; }
    
    public TargetingSpecListOperation Operation { get; set; }
    public List<string> Values { get; set; }
}


