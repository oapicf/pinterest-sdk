namespace Org.OpenAPITools.Models;


/// <summary>
/// Request model for creating an AppsFlyer audience
/// </summary>
public class AppsflyerAudience 
{
    public string ContainerId { get; set; }
    public string Name { get; set; }
    
    public AppsflyerPlatform Platform { get; set; }
}


