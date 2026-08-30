
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class OauthConversionTokenRequest
{
}
public class OauthTokenRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("code")]
    public string? Code { get; set; }
    /// <summary>
    ///   If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.
    /// </summary>
    [FastEndpoints.BindFrom("continuous_refresh")]
    public string? ContinuousRefresh { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("grant_type")]
    public TokenGrantType GrantType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("redirect_uri")]
    public string? RedirectUri { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("refresh_token")]
    public string? RefreshToken { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("scope")]
    public string? Scope { get; set; }
}
public class TokenRevokeRequest
{
    /// <summary>
    /// The token to revoke.
    /// </summary>
    [FastEndpoints.BindFrom("token")]
    public string Token { get; set; }
    /// <summary>
    /// The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
    /// </summary>
    [FastEndpoints.BindFrom("token_type_hint")]
    public TokenTypeHint TokenTypeHint { get; set; }
}


