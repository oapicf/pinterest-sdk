namespace Org.OpenAPITools.Models;


/// <summary>
/// Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;MINIMUM_AGE\&quot;:\&quot;18\&quot;, \&quot;MAXIMUM_AGE\&quot;:\&quot;65+\&quot;}&#x60;
/// </summary>
public class TargetingSpec 
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
    public List<TargetingSpec.TARGETINGSTRATEGYEnum> TARGETING_STRATEGY { get; set; }
}


