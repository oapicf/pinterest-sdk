namespace Org.OpenAPITools.Models;


/// <summary>
/// Describes the valid schema for possible OAuth access token requests.
/// </summary>
public class OauthAccessToken 
{
    public string AccessToken { get; set; }
    public int ExpiresIn { get; set; }
    public string RefreshToken { get; set; }
    public int RefreshTokenExpiresAt { get; set; }
    public int RefreshTokenExpiresIn { get; set; }
    
    public TokenGrantType ResponseType { get; set; }
    public string Scope { get; set; }
    public string TokenType { get; set; } = "bearer";
}


