using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// List following boards
/// </summary>

public class BoardsUserFollowsListEndpoint : FastEndpoints.Endpoint<BoardsUserFollowsListRequest, BoardsList200Response>
{
    public override void Configure()
    {
        Get("/v5/user_account/following/boards");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List following boards";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.ExplicitFollowing, "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.");
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

    public override async Task HandleAsync(BoardsUserFollowsListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Follow user
/// </summary>

public class FollowUserUpdateEndpoint : FastEndpoints.Endpoint<FollowUserUpdateRequest, FollowUser>
{
    public override void Configure()
    {
        Post("/v5/user_account/following/{username}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Follow user";
            s.RequestParam(r => r.Username, "A valid username");
            s.RequestParam(r => r.followUserCreate, "");
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

    public override async Task HandleAsync(FollowUserUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List followers
/// </summary>

public class FollowersListEndpoint : FastEndpoints.Endpoint<FollowersListRequest, FollowersList200Response>
{
    public override void Configure()
    {
        Get("/v5/user_account/followers");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List followers";
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

    public override async Task HandleAsync(FollowersListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List linked businesses
/// </summary>

public class LinkedBusinessAccountsGetEndpoint : FastEndpoints.EndpointWithoutRequest<List<LinkedBusiness>>
{
    public override void Configure()
    {
        Get("/v5/user_account/businesses");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List linked businesses";
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Unverify website
/// </summary>

public class UnverifyWebsiteDeleteEndpoint : FastEndpoints.Endpoint<UnverifyWebsiteDeleteRequest, UserWebsite>
{
    public override void Configure()
    {
        Delete("/v5/user_account/websites");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Unverify website";
            s.RequestParam(r => r.Website, "Website with path or domain only");
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

    public override async Task HandleAsync(UnverifyWebsiteDeleteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get user account analytics
/// </summary>

public class UserAccountAnalyticsEndpoint : FastEndpoints.Endpoint<UserAccountAnalyticsRequest, Dictionary<string, AnalyticsMetricsResponse>>
{
    public override void Configure()
    {
        Get("/v5/user_account/analytics");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get user account analytics";
            s.RequestParam(r => r.StartDate, "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.");
            s.RequestParam(r => r.EndDate, "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.");
            s.RequestParam(r => r.FromClaimedContent, "Filter on Pins that match your claimed domain.");
            s.RequestParam(r => r.PinFormat, "Pin formats to get data for, default is all.");
            s.RequestParam(r => r.AppTypes, "Apps or devices to get data for, default is all.");
            s.RequestParam(r => r.ContentType, "Filter to paid or organic data. Default is all.");
            s.RequestParam(r => r.Source, "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts");
            s.RequestParam(r => r.MetricTypes, "Metric types to get data for, default is all.");
            s.RequestParam(r => r.SplitField, "How to split the data into groups. Not including this param means data won&#39;t be split.");
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

    public override async Task HandleAsync(UserAccountAnalyticsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get user account top pins analytics
/// </summary>

public class UserAccountAnalyticsTopPinsEndpoint : FastEndpoints.Endpoint<UserAccountAnalyticsTopPinsRequest, TopPinsAnalyticsResponse>
{
    public override void Configure()
    {
        Get("/v5/user_account/analytics/top_pins");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get user account top pins analytics";
            s.RequestParam(r => r.StartDate, "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.");
            s.RequestParam(r => r.EndDate, "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.");
            s.RequestParam(r => r.SortBy, "Specify sorting order for metrics");
            s.RequestParam(r => r.FromClaimedContent, "Filter on Pins that match your claimed domain.");
            s.RequestParam(r => r.PinFormat, "Pin formats to get data for, default is all.");
            s.RequestParam(r => r.AppTypes, "Apps or devices to get data for, default is all.");
            s.RequestParam(r => r.ContentType, "Filter to paid or organic data. Default is all.");
            s.RequestParam(r => r.Source, "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts");
            s.RequestParam(r => r.MetricTypes, "Metric types to get data for, default is all.");
            s.RequestParam(r => r.NumOfPins, "Number of pins to include, default is 10. Max is 50.");
            s.RequestParam(r => r.CreatedInLastNDays, "Get metrics for pins created in the last \&quot;n\&quot; days.");
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

    public override async Task HandleAsync(UserAccountAnalyticsTopPinsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get user account top video pins analytics
/// </summary>

public class UserAccountAnalyticsTopVideoPinsEndpoint : FastEndpoints.Endpoint<UserAccountAnalyticsTopVideoPinsRequest, TopVideoPinsAnalyticsResponse>
{
    public override void Configure()
    {
        Get("/v5/user_account/analytics/top_video_pins");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get user account top video pins analytics";
            s.RequestParam(r => r.StartDate, "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.");
            s.RequestParam(r => r.EndDate, "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.");
            s.RequestParam(r => r.SortBy, "Specify sorting order for video metrics");
            s.RequestParam(r => r.FromClaimedContent, "Filter on Pins that match your claimed domain.");
            s.RequestParam(r => r.PinFormat, "Pin formats to get data for, default is all.");
            s.RequestParam(r => r.AppTypes, "Apps or devices to get data for, default is all.");
            s.RequestParam(r => r.ContentType, "Filter to paid or organic data. Default is all.");
            s.RequestParam(r => r.Source, "Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts");
            s.RequestParam(r => r.MetricTypes, "Metric types to get video data for, default is all.");
            s.RequestParam(r => r.NumOfPins, "Number of pins to include, default is 10. Max is 50.");
            s.RequestParam(r => r.CreatedInLastNDays, "Get metrics for pins created in the last \&quot;n\&quot; days.");
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

    public override async Task HandleAsync(UserAccountAnalyticsTopVideoPinsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List following interests
/// </summary>

public class UserAccountFollowedInterestsEndpoint : FastEndpoints.Endpoint<UserAccountFollowedInterestsRequest, UserAccountFollowedInterests200Response>
{
    public override void Configure()
    {
        Get("/v5/users/{username}/interests/follow");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List following interests";
            s.RequestParam(r => r.Username, "A valid username");
            s.RequestParam(r => r.Bookmark, "Cursor used to fetch the next page of items");
            s.RequestParam(r => r.PageSize, "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The server could not understand the request due to invalid syntax.";
            s.Responses[401] = "Access is unauthorized.";
            s.Responses[404] = "The server cannot find the requested resource.";
            s.Responses[0] = "Unexpected error";
        });
    }

    public override async Task HandleAsync(UserAccountFollowedInterestsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get user account
/// </summary>

public class UserAccountGetEndpoint : FastEndpoints.Endpoint<UserAccountGetRequest, Account>
{
    public override void Configure()
    {
        Get("/v5/user_account");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get user account";
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

    public override async Task HandleAsync(UserAccountGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List following
/// </summary>

public class UserFollowingGetEndpoint : FastEndpoints.Endpoint<UserFollowingGetRequest, FollowersList200Response>
{
    public override void Configure()
    {
        Get("/v5/user_account/following");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "List following";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.ExplicitFollowing, "Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.");
            s.RequestParam(r => r.FeedType, "Thrift param specifying what type of followees will be kept. Default to include all followees.");
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

    public override async Task HandleAsync(UserFollowingGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get user websites
/// </summary>

public class UserWebsitesGetEndpoint : FastEndpoints.Endpoint<UserWebsitesGetRequest, UserWebsitesGet200Response>
{
    public override void Configure()
    {
        Get("/v5/user_account/websites");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get user websites";
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

    public override async Task HandleAsync(UserWebsitesGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Verify website
/// </summary>

public class VerifyWebsiteUpdateEndpoint : FastEndpoints.Endpoint<VerifyWebsiteUpdateRequest, UserWebsite>
{
    public override void Configure()
    {
        Post("/v5/user_account/websites");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Verify website";
            s.RequestParam(r => r.userWebsiteCreate, "");
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
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

    public override async Task HandleAsync(VerifyWebsiteUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get user verification code for website claiming
/// </summary>

public class WebsiteVerificationGetEndpoint : FastEndpoints.Endpoint<WebsiteVerificationGetRequest, UserWebsiteVerification>
{
    public override void Configure()
    {
        Get("/v5/user_account/websites/verification");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("user_account");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get user verification code for website claiming";
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

    public override async Task HandleAsync(WebsiteVerificationGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

