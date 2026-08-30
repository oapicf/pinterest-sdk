namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOperations 
{
    
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    public enum FieldEnum
    {
        
        /// <summary>
        /// Enum MINIMUMAGEEnum for MINIMUM_AGE
        /// </summary>
        MINIMUMAGEEnum = 1
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
    public List<TargetingSpecShoppingRetargeting> Values { get; set; }
    public string Value { get; set; }
}


