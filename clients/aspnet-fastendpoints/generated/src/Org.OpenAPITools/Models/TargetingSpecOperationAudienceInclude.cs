namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOperationAudienceInclude 
{
    
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    public enum FieldEnum
    {
        
        /// <summary>
        /// Enum AUDIENCEINCLUDEEnum for AUDIENCE_INCLUDE
        /// </summary>
        AUDIENCEINCLUDEEnum = 1
    }

    public FieldEnum Field { get; set; }
    
    public TargetingSpecListOperation Operation { get; set; }
    public List<string> Values { get; set; }
}


