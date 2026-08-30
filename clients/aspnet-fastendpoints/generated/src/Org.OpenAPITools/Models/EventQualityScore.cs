namespace Org.OpenAPITools.Models;


/// <summary>
/// Schema for GET Conversion EQS response.
/// </summary>
public class EventQualityScore 
{
    
    public IngestionSourceOptions IngestionSource { get; set; }
    
    public LookbackPeriodOptions LookbackPeriod { get; set; }
    
    public OverallStatusOptions OverallStatus { get; set; }
    public QualityComponents QualityComponents { get; set; }
    
    public SourcePlatformOptions SourcePlatform { get; set; }
}


