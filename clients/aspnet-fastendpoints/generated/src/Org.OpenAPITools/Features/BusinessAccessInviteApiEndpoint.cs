using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create a request to access an existing partner&#39;s assets.
/// </summary>

public class AssetAccessRequestsCreateEndpoint : FastEndpoints.Endpoint<AssetAccessRequestsCreateRequest, CreateAssetAccessRequestResponse>
{
    public override void Configure()
    {
        Post("/v5/businesses/{business_id}/requests/assets/access");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_invite");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Create a request to access an existing partner&#39;s assets.";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.createAssetAccessRequestBody, "");
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

    public override async Task HandleAsync(AssetAccessRequestsCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Cancel invites/requests
/// </summary>

public class CancelInvitesOrRequestsEndpoint : FastEndpoints.Endpoint<CancelInvitesOrRequestsRequest, CancelInvitesResponse>
{
    public override void Configure()
    {
        Delete("/v5/businesses/{business_id}/invites");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_invite");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Cancel invites/requests";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.cancelInvitesRequest, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(CancelInvitesOrRequestsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update invite/request with an asset permission
/// </summary>

public class CreateAssetInvitesEndpoint : FastEndpoints.Endpoint<CreateAssetInvitesRequest, UpdateInvitesResultsResponseArray>
{
    public override void Configure()
    {
        Post("/v5/businesses/{business_id}/invites/assets/access");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_invite");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update invite/request with an asset permission";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.createAssetInvitesRequest, "");
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

    public override async Task HandleAsync(CreateAssetInvitesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create invites or requests
/// </summary>

public class CreateMembershipOrPartnershipInvitesEndpoint : FastEndpoints.Endpoint<CreateMembershipOrPartnershipInvitesRequest, CreateInvitesResultsResponseArray>
{
    public override void Configure()
    {
        Post("/v5/businesses/{business_id}/invites");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_invite");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Create invites or requests";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.createMembershipOrPartnershipInvitesBody, "");
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

    public override async Task HandleAsync(CreateMembershipOrPartnershipInvitesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get invites/requests
/// </summary>

public class GetInvitesEndpoint : FastEndpoints.Endpoint<GetInvitesRequest, GetInvites200Response>
{
    public override void Configure()
    {
        Get("/v5/businesses/{business_id}/invites");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_invite");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get invites/requests";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.IsMember, "A boolean field to indicate whether the invite is to create a partnership or a membership.");
            s.RequestParam(r => r.InviteStatus, "A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.");
            s.RequestParam(r => r.InviteType, "Invite type to filter invites by. Only invites of the specified type will be returned.");
            s.RequestParam(r => r.Bookmark, "Cursor used to fetch the next page of items");
            s.RequestParam(r => r.PageSize, "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(GetInvitesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Accept or decline an invite/request
/// </summary>

public class RespondBusinessAccessInvitesEndpoint : FastEndpoints.Endpoint<RespondBusinessAccessInvitesRequest, RespondToInvitesResponseArray>
{
    public override void Configure()
    {
        Patch("/v5/businesses/invites");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_invite");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Accept or decline an invite/request";
            s.RequestParam(r => r.authRespondInvitesBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(RespondBusinessAccessInvitesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

