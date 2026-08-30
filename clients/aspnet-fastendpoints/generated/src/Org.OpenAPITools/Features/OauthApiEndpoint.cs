using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Generate OAuth access token for conversion API
/// </summary>

public class OauthConversionTokenEndpoint : FastEndpoints.EndpointWithoutRequest<ConversionAccessToken>
{
    public override void Configure()
    {
        Post("/v5/oauth/conversion_token");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("oauth");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Generate OAuth access token for conversion API";
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Generate OAuth access token
/// </summary>

public class OauthTokenEndpoint : FastEndpoints.Endpoint<OauthTokenRequest, OauthAccessToken>
{
    public override void Configure()
    {
        Post("/v5/oauth/token");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("oauth");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Generate OAuth access token";
            s.RequestParam(r => r.GrantType, "");
            s.RequestParam(r => r.Code, "");
            s.RequestParam(r => r.ContinuousRefresh, "  If your app was created before **September 25, 2025**, set to &#x60;true&#x60; to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.");
            s.RequestParam(r => r.RedirectUri, "");
            s.RequestParam(r => r.RefreshToken, "");
            s.RequestParam(r => r.Scope, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[201] = "Resource create operation completed successfully.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(OauthTokenRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Revoke a token
/// </summary>

public class TokenRevokeEndpoint : FastEndpoints.Endpoint<TokenRevokeRequest>
{
    public override void Configure()
    {
        Post("/v5/oauth/token/revoke");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("oauth");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Revoke a token";
            s.RequestParam(r => r.Token, "The token to revoke.");
            s.RequestParam(r => r.TokenTypeHint, "The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(TokenRevokeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

