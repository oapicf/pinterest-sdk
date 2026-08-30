namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOperationMaximumAge 
{
    
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    public enum FieldEnum
    {
        
        /// <summary>
        /// Enum MAXIMUMAGEEnum for MAXIMUM_AGE
        /// </summary>
        MAXIMUMAGEEnum = 1
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
    public string Value { get; set; }
}


