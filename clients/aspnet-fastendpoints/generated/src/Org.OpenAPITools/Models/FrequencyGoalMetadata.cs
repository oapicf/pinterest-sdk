namespace Org.OpenAPITools.Models;


/// <summary>
/// Frequency target can only be between 2 and 20
/// </summary>
public class FrequencyGoalMetadata 
{
    public int Frequency { get; set; }
    
    public FrequencyGoalMetadataTimerange Timerange { get; set; }
}


