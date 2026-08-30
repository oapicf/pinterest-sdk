using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List accounts with access to an audience owned by an ad account
/// </summary>

public class AdAccountsAudiencesSharedAccountsListEndpoint : FastEndpoints.Endpoint<AdAccountsAudiencesSharedAccountsListRequest, AdAccountsAudiencesSharedAccountsList200Response>
{
    public override void Configure()
    {
        Get("/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("audience_sharing");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List accounts with access to an audience owned by an ad account";
            s.RequestParam(r => r.AudienceId, "Unique identifier of the audience to use to filter the results.");
            s.RequestParam(r => r.AccountType, "Filter accounts by account type.");
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
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

    public override async Task HandleAsync(AdAccountsAudiencesSharedAccountsListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List accounts with access to an audience owned by a business
/// </summary>

public class BusinessAccountAudiencesSharedAccountsListEndpoint : FastEndpoints.Endpoint<BusinessAccountAudiencesSharedAccountsListRequest, AdAccountsAudiencesSharedAccountsList200Response>
{
    public override void Configure()
    {
        Get("/v5/businesses/{business_id}/audiences/shared/accounts");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("audience_sharing");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List accounts with access to an audience owned by a business";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.AudienceId, "Unique identifier of the audience to use to filter the results.");
            s.RequestParam(r => r.AccountType, "Filter accounts by account type.");
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

    public override async Task HandleAsync(BusinessAccountAudiencesSharedAccountsListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List received audiences for a business
/// </summary>

public class SharedAudiencesForBusinessListEndpoint : FastEndpoints.Endpoint<SharedAudiencesForBusinessListRequest, SharedAudiencesForBusinessList200Response>
{
    public override void Configure()
    {
        Get("/v5/businesses/{business_id}/audiences");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("audience_sharing");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List received audiences for a business";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.Order, "The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.");
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

    public override async Task HandleAsync(SharedAudiencesForBusinessListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update audience sharing between ad accounts
/// </summary>

public class UpdateAdAccountToAdAccountSharedAudienceEndpoint : FastEndpoints.Endpoint<UpdateAdAccountToAdAccountSharedAudienceRequest, AdAccountToAdAccountSharedAudience>
{
    public override void Configure()
    {
        Patch("/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("audience_sharing");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update audience sharing between ad accounts";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.adAccountToAdAccountSharedAudienceUpdateWithRequiredBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(UpdateAdAccountToAdAccountSharedAudienceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update audience sharing from an ad account to businesses
/// </summary>

public class UpdateAdAccountToBusinessSharedAudienceEndpoint : FastEndpoints.Endpoint<UpdateAdAccountToBusinessSharedAudienceRequest, AdAccountToBusinessSharedAudience>
{
    public override void Configure()
    {
        Patch("/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("audience_sharing");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update audience sharing from an ad account to businesses";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.adAccountToBusinessSharedAudienceUpdateWithRequiredBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(UpdateAdAccountToBusinessSharedAudienceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update audience sharing from a business to ad accounts
/// </summary>

public class UpdateBusinessToAdAccountSharedAudienceEndpoint : FastEndpoints.Endpoint<UpdateBusinessToAdAccountSharedAudienceRequest, BusinessToAdAccountSharedAudience>
{
    public override void Configure()
    {
        Patch("/v5/businesses/{business_id}/audiences/ad_accounts/shared");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("audience_sharing");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update audience sharing from a business to ad accounts";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.businessToAdAccountSharedAudienceUpdateWithRequiredBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(UpdateBusinessToAdAccountSharedAudienceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update audience sharing between businesses
/// </summary>

public class UpdateBusinessToBusinessSharedAudienceEndpoint : FastEndpoints.Endpoint<UpdateBusinessToBusinessSharedAudienceRequest, BusinessToBusinessSharedAudience>
{
    public override void Configure()
    {
        Patch("/v5/businesses/{business_id}/audiences/businesses/shared");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("audience_sharing");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update audience sharing between businesses";
            s.RequestParam(r => r.BusinessId, "Unique identifier of the requesting business.");
            s.RequestParam(r => r.businessToBusinessSharedAudienceUpdateWithRequiredBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(UpdateBusinessToBusinessSharedAudienceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

