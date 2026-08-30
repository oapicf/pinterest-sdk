namespace Org.OpenAPITools.Models;


/// <summary>
/// A hotel item to be created.
/// </summary>
public class CatalogsCreateHotelItem 
{
    public CatalogsHotelAttributes Attributes { get; set; }
    public string HotelId { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum CREATEEnum for CREATE
        /// </summary>
        CREATEEnum = 1
    }

    public OperationEnum Operation { get; set; }
}


