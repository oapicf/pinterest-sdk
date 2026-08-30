namespace Org.OpenAPITools.Models;


/// <summary>
/// A successful conversion access token response.
/// </summary>
public class ConversionAccessToken 
{
    public string AccessToken { get; set; }
    public string TokenType { get; set; } = "conversion";
}


