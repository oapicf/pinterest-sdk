using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create customer segments
/// </summary>

public class CustomerSegmentCreateEndpoint : FastEndpoints.Endpoint<CustomerSegmentCreateRequest, CustomerSegment>
{
    public override void Configure()
    {
        Post("/v5/ad_accounts/{ad_account_id}/customer_segments");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("customer_segment");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Create customer segments";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.customerSegmentCreate, "");
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

    public override async Task HandleAsync(CustomerSegmentCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List customer segments
/// </summary>

public class CustomerSegmentListEndpoint : FastEndpoints.Endpoint<CustomerSegmentListRequest, CustomerSegmentList200Response>
{
    public override void Configure()
    {
        Get("/v5/ad_accounts/{ad_account_id}/customer_segments");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("customer_segment");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List customer segments";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.Bookmark, "Cursor used to fetch the next page of items");
            s.RequestParam(r => r.PageSize, "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.");
            s.RequestParam(r => r.Order, "The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.");
            s.RequestParam(r => r.IncludeSizing, "Include audience sizing in result or not");
            s.RequestParam(r => r.SearchQuery, "Search query. Can contain pin description keywords or comma-separated pin IDs.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(CustomerSegmentListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update customer segments
/// </summary>

public class CustomerSegmentUpdateEndpoint : FastEndpoints.Endpoint<CustomerSegmentUpdateRequest>
{
    public override void Configure()
    {
        Patch("/v5/ad_accounts/{ad_account_id}/customer_segments");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("customer_segment");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update customer segments";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.customerSegmentUpdateRequestUpdateWithRequiredBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(CustomerSegmentUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

