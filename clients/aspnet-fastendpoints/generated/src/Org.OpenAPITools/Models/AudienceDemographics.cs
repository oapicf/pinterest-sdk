namespace Org.OpenAPITools.Models;


/// <summary>
/// Audience demographics
/// </summary>
public class AudienceDemographics 
{
    public List<AudienceDemographicValue> Ages { get; set; }
    public List<AudienceDemographicValue> Countries { get; set; }
    public List<AudienceDemographicValue> Devices { get; set; }
    public List<AudienceDemographicValue> Genders { get; set; }
    public List<AudienceDemographicValue> Metros { get; set; }
}


