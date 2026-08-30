using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get item bid options (POST)
/// </summary>

public class AdvancedAuctionItemsGetPostEndpoint : FastEndpoints.Endpoint<AdvancedAuctionItemsGetPostRequest, AdvancedAuctionItems>
{
    public override void Configure()
    {
        Post("/v5/advanced_auction/items/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("advanced_auction");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 500);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get item bid options (POST)";
            s.RequestParam(r => r.advancedAuctionItemsGetRequest, "");
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[500] = "The server encountered an unexpected condition that prevented it from fulfilling the request.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(AdvancedAuctionItemsGetPostRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Operate on item level bid options
/// </summary>

public class AdvancedAuctionItemsSubmitPostEndpoint : FastEndpoints.Endpoint<AdvancedAuctionItemsSubmitPostRequest, AdvancedAuctionProcessedItems>
{
    public override void Configure()
    {
        Post("/v5/advanced_auction/items/submit");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("advanced_auction");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 500);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Operate on item level bid options";
            s.RequestParam(r => r.advancedAuctionItemsSubmitRequest, "");
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[206] = "Successful";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[500] = "The server encountered an unexpected condition that prevented it from fulfilling the request.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(AdvancedAuctionItemsSubmitPostRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

