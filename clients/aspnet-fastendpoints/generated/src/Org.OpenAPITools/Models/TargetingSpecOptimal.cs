namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingSpecOptimal 
{
    public List<TargetingSpecAgeBucket> AGE_BUCKET { get; set; }
    public List<TargetingSpecAppType> APPTYPE { get; set; }
    public List<string> AUDIENCE_EXCLUDE { get; set; }
    public List<string> AUDIENCE_INCLUDE { get; set; }
    public List<TargetingSpecGender> GENDER { get; set; }
    public List<string> GEO { get; set; }
    public List<string> GEO_EXCLUDE { get; set; }
    public List<string> INTEREST { get; set; }
    public List<string> LOCALE { get; set; }
    public List<string> LOCATION { get; set; }
    public List<string> LOCATION_EXCLUDE { get; set; }
    public string MAXIMUM_AGE { get; set; }
    public string MINIMUM_AGE { get; set; }
    public List<TargetingSpecShoppingRetargeting> SHOPPING_RETARGETING { get; set; }
    public List<TargetingStrategy> TARGETING_STRATEGY { get; set; }
}


