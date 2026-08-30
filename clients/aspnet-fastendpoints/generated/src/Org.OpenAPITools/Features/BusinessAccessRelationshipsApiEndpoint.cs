using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create a Brand Account
/// </summary>

public class BrandAccountsCreateEndpoint : FastEndpoints.Endpoint<BrandAccountsCreateRequest, BrandAccount>
{
    public override void Configure()
    {
        Post("/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_relationships");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Create a Brand Account";
            s.RequestParam(r => r.BusinessHierarchyId, "business hierarchy node id");
            s.RequestParam(r => r.brandAccountCreate, "");
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

    public override async Task HandleAsync(BrandAccountsCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update a Brand Account
/// </summary>

public class BrandAccountsUpdateEndpoint : FastEndpoints.Endpoint<BrandAccountsUpdateRequest, BrandAccount>
{
    public override void Configure()
    {
        Patch("/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_relationships");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 409);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update a Brand Account";
            s.RequestParam(r => r.BrandAccountId, "");
            s.RequestParam(r => r.BusinessHierarchyId, "business hierarchy node id");
            s.RequestParam(r => r.brandAccountUpdate, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[409] = "The request could not be processed because of a conflict in the current state of the resource.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(BrandAccountsUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Terminate business memberships
/// </summary>

public class DeleteBusinessMembershipEndpoint : FastEndpoints.Endpoint<DeleteBusinessMembershipRequest, DeleteBusinessMembership200Response>
{
    public override void Configure()
    {
        Delete("/v5/businesses/{business_id}/members");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_relationships");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Terminate business memberships";
            s.RequestParam(r => r.BusinessId, "Business id");
            s.RequestParam(r => r.deleteBusinessMembershipBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(DeleteBusinessMembershipRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Terminate business partnerships
/// </summary>

public class DeleteBusinessPartnersEndpoint : FastEndpoints.Endpoint<DeleteBusinessPartnersRequest, DeleteBusinessPartners>
{
    public override void Configure()
    {
        Delete("/v5/businesses/{business_id}/partners");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_relationships");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Terminate business partnerships";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.deleteBusinessPartnersDelete, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(DeleteBusinessPartnersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List business employers for user
/// </summary>

public class GetBusinessEmployersEndpoint : FastEndpoints.Endpoint<GetBusinessEmployersRequest, GetBusinessEmployers200Response>
{
    public override void Configure()
    {
        Get("/v5/businesses/employers");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_relationships");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List business employers for user";
            s.RequestParam(r => r.AssetsSummary, "Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are");
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

    public override async Task HandleAsync(GetBusinessEmployersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get business members
/// </summary>

public class GetBusinessMembersEndpoint : FastEndpoints.Endpoint<GetBusinessMembersRequest, GetBusinessEmployers200Response>
{
    public override void Configure()
    {
        Get("/v5/businesses/{business_id}/members");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_relationships");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get business members";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.FetchSystemUsers, "Fetches system users if True. Fetches regular user employees if False.");
            s.RequestParam(r => r.AssetsSummary, "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are");
            s.RequestParam(r => r.BusinessRoles, "A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.");
            s.RequestParam(r => r.MemberIds, "A list of business members ids separated by comma.");
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

    public override async Task HandleAsync(GetBusinessMembersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get business partners
/// </summary>

public class GetBusinessPartnersEndpoint : FastEndpoints.Endpoint<GetBusinessPartnersRequest, GetBusinessEmployers200Response>
{
    public override void Configure()
    {
        Get("/v5/businesses/{business_id}/partners");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_relationships");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get business partners";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.AssetsSummary, "Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are");
            s.RequestParam(r => r.PartnerType, "Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.");
            s.RequestParam(r => r.PartnerIds, "A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.");
            s.RequestParam(r => r.StartIndex, "An index to start fetching the results from. Only the results starting from this index will be returned.");
            s.RequestParam(r => r.SortAscending, "Sort ascending.");
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

    public override async Task HandleAsync(GetBusinessPartnersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update a system user information.
/// </summary>

public class SystemUserUpdateEndpoint : FastEndpoints.Endpoint<SystemUserUpdateRequest>
{
    public override void Configure()
    {
        Patch("/v5/businesses/{business_id}/system_users/{system_user_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_relationships");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update a system user information.";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.SystemUserId, "Unique identifier of a system user.");
            s.RequestParam(r => r.systemUserUpdateWithRequiredBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(SystemUserUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update member&#39;s business role
/// </summary>

public class UpdateBusinessMembershipsEndpoint : FastEndpoints.Endpoint<UpdateBusinessMembershipsRequest, UpdateBusinessMembershipsResponse>
{
    public override void Configure()
    {
        Patch("/v5/businesses/{business_id}/members");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("business_access_relationships");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update member&#39;s business role";
            s.RequestParam(r => r.BusinessId, "Business id");
            s.RequestParam(r => r.businessMembershipMember, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(UpdateBusinessMembershipsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

