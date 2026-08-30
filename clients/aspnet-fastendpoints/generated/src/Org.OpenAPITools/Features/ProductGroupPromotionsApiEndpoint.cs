using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create product group promotions
/// </summary>

public class ProductGroupPromotionsCreateEndpoint : FastEndpoints.Endpoint<ProductGroupPromotionsCreateRequest, ProductGroupPromotions>
{
    public override void Configure()
    {
        Post("/v5/ad_accounts/{ad_account_id}/product_group_promotions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("product_group_promotions");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Create product group promotions";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.productGroupPromotionsCreate, "");
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

    public override async Task HandleAsync(ProductGroupPromotionsCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get a product group promotion by id
/// </summary>

public class ProductGroupPromotionsGetEndpoint : FastEndpoints.Endpoint<ProductGroupPromotionsGetRequest, ProductGroupPromotion>
{
    public override void Configure()
    {
        Get("/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("product_group_promotions");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get a product group promotion by id";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.ProductGroupPromotionId, "Unique identifier of a product group promotion");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ProductGroupPromotionsGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get product group promotions
/// </summary>

public class ProductGroupPromotionsListEndpoint : FastEndpoints.Endpoint<ProductGroupPromotionsListRequest, ProductGroupPromotionsList200Response>
{
    public override void Configure()
    {
        Get("/v5/ad_accounts/{ad_account_id}/product_group_promotions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("product_group_promotions");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get product group promotions";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.Bookmark, "Cursor used to fetch the next page of items");
            s.RequestParam(r => r.PageSize, "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.");
            s.RequestParam(r => r.Order, "The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.");
            s.RequestParam(r => r.ProductGroupPromotionIds, "List of Product group promotion Ids.");
            s.RequestParam(r => r.EntityStatuses, "Entity status");
            s.RequestParam(r => r.AdGroupId, "Ad group Id.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ProductGroupPromotionsListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update product group promotions
/// </summary>

public class ProductGroupPromotionsUpdateEndpoint : FastEndpoints.Endpoint<ProductGroupPromotionsUpdateRequest, ProductGroupPromotions>
{
    public override void Configure()
    {
        Patch("/v5/ad_accounts/{ad_account_id}/product_group_promotions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("product_group_promotions");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update product group promotions";
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.productGroupPromotionsUpdateWithRequiredBody, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ProductGroupPromotionsUpdateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get product group analytics
/// </summary>

public class ProductGroupsAnalyticsEndpoint : FastEndpoints.Endpoint<ProductGroupsAnalyticsRequest, List<ProductGroupAnalyticsItems>>
{
    public override void Configure()
    {
        Get("/v5/ad_accounts/{ad_account_id}/product_groups/analytics");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("product_group_promotions");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get product group analytics";
            s.RequestParam(r => r.StartDate, "Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.");
            s.RequestParam(r => r.EndDate, "Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.");
            s.RequestParam(r => r.ProductGroupIds, "List of Product group Ids to use to filter the results.");
            s.RequestParam(r => r.Columns, "Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.");
            s.RequestParam(r => r.Granularity, "  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly");
            s.RequestParam(r => r.AdAccountId, "Unique identifier of an ad account.");
            s.RequestParam(r => r.ClickWindowDays, "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.");
            s.RequestParam(r => r.EngagementWindowDays, "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.");
            s.RequestParam(r => r.ViewWindowDays, "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.");
            s.RequestParam(r => r.ConversionReportTime, "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.");
            s.RequestParam(r => r.ReportingTimezone, "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(ProductGroupsAnalyticsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

