namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOperationAgeBucket 
{
    
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    public enum FieldEnum
    {
        
        /// <summary>
        /// Enum AGEBUCKETEnum for AGE_BUCKET
        /// </summary>
        AGEBUCKETEnum = 1
    }

    public FieldEnum Field { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum SETEnum for SET
        /// </summary>
        SETEnum = 1
    }

    public OperationEnum Operation { get; set; }
    public List<TargetingSpecAgeBucket> Values { get; set; }
}


