namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOperationGender 
{
    
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    public enum FieldEnum
    {
        
        /// <summary>
        /// Enum GENDEREnum for GENDER
        /// </summary>
        GENDEREnum = 1
    }

    public FieldEnum Field { get; set; }
    
    public TargetingSpecListOperation Operation { get; set; }
    public List<TargetingSpecGender> Values { get; set; }
}


