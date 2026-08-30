namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConversionEventResponse 
{
    public string AdAccountId { get; set; }
    
    public ConversionTagType ConversionEvent { get; set; }
    public string ConversionTagId { get; set; }
    public int CreatedTime { get; set; }
    public string ReportingConversionEvent { get; set; }
}


