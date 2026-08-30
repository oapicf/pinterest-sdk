using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Send conversions
/// </summary>

public class EventsCreateEndpoint : FastEndpoints.Endpoint<EventsCreateRequest, ConversionEvents>
{
    public override void Configure()
    {
        Post("/v5/ad_accounts/{ad_account_id}/events");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("conversion_events");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 422);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 503);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Send conversions";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.conversionEventsCreate, "");
            s.RequestParam(r => r.Test, "Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[422] = "The request was well-formed but was unable to be followed due to semantic errors.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[503] = "The server is currently unable to handle the request due to a temporary overload or scheduled maintenance.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(EventsCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

