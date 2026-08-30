namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOperationInterest 
{
    
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    public enum FieldEnum
    {
        
        /// <summary>
        /// Enum INTERESTEnum for INTEREST
        /// </summary>
        INTERESTEnum = 1
    }

    public FieldEnum Field { get; set; }
    
    public TargetingSpecListOperation Operation { get; set; }
    public List<string> Values { get; set; }
}


