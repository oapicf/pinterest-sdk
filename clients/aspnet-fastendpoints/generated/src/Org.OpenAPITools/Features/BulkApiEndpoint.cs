using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get advertiser entities in bulk
/// </summary>

public class BulkDownloadCreateEndpoint : FastEndpoints.Endpoint<BulkDownloadCreateRequest, BulkDownload>
{
    public override void Configure()
    {
        Post("/v5/ad_accounts/{ad_account_id}/bulk/download");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("bulk");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get advertiser entities in bulk";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.bulkDownloadCreate, "");
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

    public override async Task HandleAsync(BulkDownloadCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Download advertiser entities in bulk
/// </summary>

public class BulkRequestGetEndpoint : FastEndpoints.Endpoint<BulkRequestGetRequest, BulkJobData>
{
    public override void Configure()
    {
        Get("/v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("bulk");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Download advertiser entities in bulk";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.BulkRequestId, "Bulk request ID that is from one of the entities bulk endpoints");
            s.RequestParam(r => r.IncludeDetails, "If set to True then attach the errors/details to all the requests");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(BulkRequestGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create/update ad entities in bulk
/// </summary>

public class BulkUpsertCreateEndpoint : FastEndpoints.Endpoint<BulkUpsertCreateRequest, BulkUpsertResponse>
{
    public override void Configure()
    {
        Post("/v5/ad_accounts/{ad_account_id}/bulk/upsert");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("bulk");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Create/update ad entities in bulk";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.bulkUpsertRequest, "Parameters to get create/update ad entities in bulk");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[0] = "Unexpected error";
        });
    }

    public override async Task HandleAsync(BulkUpsertCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

