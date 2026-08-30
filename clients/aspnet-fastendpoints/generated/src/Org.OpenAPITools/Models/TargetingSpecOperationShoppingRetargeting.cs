namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOperationShoppingRetargeting 
{
    
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    public enum FieldEnum
    {
        
        /// <summary>
        /// Enum SHOPPINGRETARGETINGEnum for SHOPPING_RETARGETING
        /// </summary>
        SHOPPINGRETARGETINGEnum = 1
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
}


