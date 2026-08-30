using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Add product tags to pin
/// </summary>

public class ProductTagsBulkAddEndpoint : FastEndpoints.Endpoint<ProductTagsBulkAddRequest, ProductTagsResponse>
{
    public override void Configure()
    {
        Post("/v5/pins/{pin_id}/product_tags");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("product_tags");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Add product tags to pin";
            s.RequestParam(r => r.PinId, "Unique identifier of the hero pin that will receive product tags.");
            s.RequestParam(r => r.productTagsBulkAddRequest, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request contains ineligible product tags.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ProductTagsBulkAddRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete product tags from pin
/// </summary>

public class ProductTagsBulkDeleteEndpoint : FastEndpoints.Endpoint<ProductTagsBulkDeleteRequest>
{
    public override void Configure()
    {
        Post("/v5/pins/{pin_id}/product_tags/bulk-delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("product_tags");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete product tags from pin";
            s.RequestParam(r => r.PinId, "Unique identifier of the hero pin that will receive product tags.");
            s.RequestParam(r => r.productTagsBulkDeleteRequest, "");
            s.Responses[204] = "Resource deleted successfully.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ProductTagsBulkDeleteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get product tags for pin
/// </summary>

public class ProductTagsListEndpoint : FastEndpoints.Endpoint<ProductTagsListRequest, ProductTagsResponse>
{
    public override void Configure()
    {
        Get("/v5/pins/{pin_id}/product_tags");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("product_tags");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get product tags for pin";
            s.RequestParam(r => r.PinId, "Unique identifier of the hero pin that will receive product tags.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ProductTagsListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

