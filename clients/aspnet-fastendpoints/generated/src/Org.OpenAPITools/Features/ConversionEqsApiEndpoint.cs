using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get event quality score (EQS)
/// </summary>

public class ConversionEqsListEndpoint : FastEndpoints.Endpoint<ConversionEqsListRequest, List<EventQualityScore>>
{
    public override void Configure()
    {
        Get("/v5/ad_accounts/{ad_account_id}/conversion_eqs");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("conversion_eqs");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get event quality score (EQS)";
            s.RequestParam(r => r.LookbackPeriod, "Lookback window (number of days).");
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.SourcePlatform, "Source platform of event.");
            s.RequestParam(r => r.IngestionSource, "Ingestion source of event.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ConversionEqsListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

