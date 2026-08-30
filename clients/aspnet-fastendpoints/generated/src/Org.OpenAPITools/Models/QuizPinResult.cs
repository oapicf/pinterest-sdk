namespace Org.OpenAPITools.Models;


/// <summary>
/// The result, and link out, based on the user’s choice.
/// </summary>
public class QuizPinResult 
{
    public string AndroidDeepLink { get; set; }
    public string DestinationUrl { get; set; }
    public string IosDeepLink { get; set; }
    public string OrganicPinId { get; set; }
    public decimal ResultId { get; set; }
}


