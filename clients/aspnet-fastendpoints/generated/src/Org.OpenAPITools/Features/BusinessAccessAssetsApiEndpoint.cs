using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create a new asset group.
/// </summary>

public class AssetGroupCreateEndpoint : FastEndpoints.Endpoint<AssetGroupCreateRequest, AssetGroupInput>
{
    public override void Configure()
    {
        Post("/v5/businesses/{business_id}/asset_groups");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Create a new asset group.";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.assetGroupInputCreate, "");
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

    public override async Task HandleAsync(AssetGroupCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete asset groups.
/// </summary>

public class AssetGroupDeleteEndpoint : FastEndpoints.Endpoint<AssetGroupDeleteRequest, AssetGroupDeletion>
{
    public override void Configure()
    {
        Delete("/v5/businesses/{business_id}/asset_groups");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete asset groups.";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.assetGroupDeletionDelete, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(AssetGroupDeleteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update asset groups.
/// </summary>

public class AssetGroupUpdateEndpoint : FastEndpoints.Endpoint<AssetGroupUpdateRequest, AssetGroupModification>
{
    public override void Configure()
    {
        Patch("/v5/businesses/{business_id}/asset_groups");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update asset groups.";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.assetGroupModificationReadOrUpdate, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(AssetGroupUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get members with access to asset
/// </summary>

public class BusinessAssetMembersGetEndpoint : FastEndpoints.Endpoint<BusinessAssetMembersGetRequest, BusinessAssetMembersGet200Response>
{
    public override void Configure()
    {
        Get("/v5/businesses/{business_id}/assets/{asset_id}/members");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get members with access to asset";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.AssetId, "Unique identifier of a business asset.");
            s.RequestParam(r => r.StartIndex, "An index to start fetching the results from. Only the results starting from this index will be returned.");
            s.RequestParam(r => r.FetchSystemUsers, "Fetches system users if True. Fetches regular user employees if False.");
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

    public override async Task HandleAsync(BusinessAssetMembersGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get partners with access to asset
/// </summary>

public class BusinessAssetPartnersGetEndpoint : FastEndpoints.Endpoint<BusinessAssetPartnersGetRequest, BusinessAssetMembersGet200Response>
{
    public override void Configure()
    {
        Get("/v5/businesses/{business_id}/assets/{asset_id}/partners");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get partners with access to asset";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.AssetId, "Unique identifier of a business asset.");
            s.RequestParam(r => r.StartIndex, "An index to start fetching the results from. Only the results starting from this index will be returned.");
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

    public override async Task HandleAsync(BusinessAssetPartnersGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List business assets
/// </summary>

public class BusinessAssetsGetEndpoint : FastEndpoints.Endpoint<BusinessAssetsGetRequest, BusinessAssetsGet200Response>
{
    public override void Configure()
    {
        Get("/v5/businesses/{business_id}/assets");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List business assets";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.Permissions, "A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.");
            s.RequestParam(r => r.ChildAssetId, "A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.");
            s.RequestParam(r => r.AssetGroupId, "An asset group unique identifier. Used to fetch assets contained within the specified asset group.");
            s.RequestParam(r => r.AssetType, "A resource type to filter the assets by. Only assets of the specified type will be returned.");
            s.RequestParam(r => r.StartIndex, "An index to start fetching the results from. Only the results starting from this index will be returned.");
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

    public override async Task HandleAsync(BusinessAssetsGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get assets assigned to a member
/// </summary>

public class BusinessMemberAssetsGetEndpoint : FastEndpoints.Endpoint<BusinessMemberAssetsGetRequest, BusinessMemberAssetsGetResponse>
{
    public override void Configure()
    {
        Get("/v5/businesses/{business_id}/members/{member_id}/assets");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get assets assigned to a member";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.MemberId, "The member id to fetch assets for.");
            s.RequestParam(r => r.AssetType, "A resource type to filter the assets by. Only assets of the specified type will be returned.");
            s.RequestParam(r => r.StartIndex, "An index to start fetching the results from. Only the results starting from this index will be returned.");
            s.RequestParam(r => r.SortBy, "The field to sort member assets by");
            s.RequestParam(r => r.SortAscending, "Sort assets in ascending order");
            s.RequestParam(r => r.SearchBy, "The field to search member assets by");
            s.RequestParam(r => r.SearchValue, "The value to search for");
            s.RequestParam(r => r.AssetPermissionType, "The type of asset permission to filter by");
            s.RequestParam(r => r.AdAccountStatuses, "A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.");
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

    public override async Task HandleAsync(BusinessMemberAssetsGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete member access to asset
/// </summary>

public class BusinessMembersAssetAccessDeleteEndpoint : FastEndpoints.Endpoint<BusinessMembersAssetAccessDeleteRequest, DeleteMemberAccessResultsResponseArray>
{
    public override void Configure()
    {
        Delete("/v5/businesses/{business_id}/members/assets/access");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete member access to asset";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.businessMembersAssetAccessDeleteBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(BusinessMembersAssetAccessDeleteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Assign/Update member asset permissions
/// </summary>

public class BusinessMembersAssetAccessUpdateEndpoint : FastEndpoints.Endpoint<BusinessMembersAssetAccessUpdateRequest, UpdateMemberAssetsResultsResponseArray>
{
    public override void Configure()
    {
        Patch("/v5/businesses/{business_id}/members/assets/access");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Assign/Update member asset permissions";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.updateMemberAssetAccessBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(BusinessMembersAssetAccessUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get assets assigned to a partner or assets assigned by a partner
/// </summary>

public class BusinessPartnerAssetAccessGetEndpoint : FastEndpoints.Endpoint<BusinessPartnerAssetAccessGetRequest, BusinessPartnerAssetAccessGet200Response>
{
    public override void Configure()
    {
        Get("/v5/businesses/{business_id}/partners/{partner_id}/assets");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get assets assigned to a partner or assets assigned by a partner";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.PartnerId, "The partner id to be bound to the Business");
            s.RequestParam(r => r.PartnerType, "Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.");
            s.RequestParam(r => r.AssetType, "A resource type to filter the assets by. Only assets of the specified type will be returned.");
            s.RequestParam(r => r.StartIndex, "An index to start fetching the results from. Only the results starting from this index will be returned.");
            s.RequestParam(r => r.SortBy, "The field to sort member assets by");
            s.RequestParam(r => r.SortAscending, "Sort assets in ascending order");
            s.RequestParam(r => r.SearchBy, "The field to search member assets by");
            s.RequestParam(r => r.SearchValue, "The value to search for");
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

    public override async Task HandleAsync(BusinessPartnerAssetAccessGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete partner access to asset
/// </summary>

public class DeletePartnerAssetAccessHandlerImplEndpoint : FastEndpoints.Endpoint<DeletePartnerAssetAccessHandlerImplRequest, DeletePartnerAssetAccessResultsResponseArray>
{
    public override void Configure()
    {
        Delete("/v5/businesses/{business_id}/partners/assets");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete partner access to asset";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.deletePartnerAssetAccessBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(DeletePartnerAssetAccessHandlerImplRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Assign/Update partner asset permissions
/// </summary>

public class UpdatePartnerAssetAccessHandlerImplEndpoint : FastEndpoints.Endpoint<UpdatePartnerAssetAccessHandlerImplRequest, UpdatePartnerAssetsResultsResponseArray>
{
    public override void Configure()
    {
        Patch("/v5/businesses/{business_id}/partners/assets");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_assets");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Assign/Update partner asset permissions";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.updatePartnerAssetAccessBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(UpdatePartnerAssetAccessHandlerImplRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

