using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create a conversion deletion request
/// </summary>

public class ConversionDeletionRequestCreateEndpoint : FastEndpoints.Endpoint<ConversionDeletionRequestCreateRequest, ConversionDeletionRequest>
{
    public override void Configure()
    {
        Post("/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("conversion_deletion_requests");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Create a conversion deletion request";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.conversionDeletionRequestCreate, "");
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

    public override async Task HandleAsync(ConversionDeletionRequestCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete a conversion deletion request
/// </summary>

public class ConversionDeletionRequestDeleteEndpoint : FastEndpoints.Endpoint<ConversionDeletionRequestDeleteRequest, ConversionDeletionRequest>
{
    public override void Configure()
    {
        Delete("/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("conversion_deletion_requests");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete a conversion deletion request";
            s.RequestParam(r => r.RequestId, "Unique identifier of the conversion deletion request");
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[204] = "Resource deleted successfully.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ConversionDeletionRequestDeleteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get a single conversion deletion request
/// </summary>

public class ConversionDeletionRequestGetEndpoint : FastEndpoints.Endpoint<ConversionDeletionRequestGetRequest, ConversionDeletionRequest>
{
    public override void Configure()
    {
        Get("/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("conversion_deletion_requests");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get a single conversion deletion request";
            s.RequestParam(r => r.RequestId, "Unique identifier of the conversion deletion request");
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ConversionDeletionRequestGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List conversion deletion requests
/// </summary>

public class ConversionDeletionRequestListEndpoint : FastEndpoints.Endpoint<ConversionDeletionRequestListRequest, ConversionDeletionRequestList200Response>
{
    public override void Configure()
    {
        Get("/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("conversion_deletion_requests");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List conversion deletion requests";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.Bookmark, "Cursor used to fetch the next page of items");
            s.RequestParam(r => r.PageSize, "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.");
            s.RequestParam(r => r.Order, "The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ConversionDeletionRequestListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

