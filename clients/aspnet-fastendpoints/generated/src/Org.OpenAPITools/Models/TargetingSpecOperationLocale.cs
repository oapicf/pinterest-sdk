namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOperationLocale 
{
    
    /// <summary>
    /// Gets or Sets Field
    /// </summary>
    public enum FieldEnum
    {
        
        /// <summary>
        /// Enum LOCALEEnum for LOCALE
        /// </summary>
        LOCALEEnum = 1
    }

    public FieldEnum Field { get; set; }
    
    public TargetingSpecListOperation Operation { get; set; }
    public List<string> Values { get; set; }
}


