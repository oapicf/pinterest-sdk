using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Returns editorial articles for a given region
/// </summary>

public class TrendsEditorialArticlesListEndpoint : FastEndpoints.Endpoint<TrendsEditorialArticlesListRequest, List<TrendsEditorial>>
{
    public override void Configure()
    {
        Get("/v5/trends/editorial_articles");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("trends");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Returns editorial articles for a given region";
            s.RequestParam(r => r.Region, "     The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(TrendsEditorialArticlesListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get featured topics
/// </summary>

public class TrendsFeaturedTopicsListEndpoint : FastEndpoints.Endpoint<TrendsFeaturedTopicsListRequest, List<FeaturedTrend>>
{
    public override void Configure()
    {
        Get("/v5/trends/topics/featured");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("trends");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get featured topics";
            s.RequestParam(r => r.Region, "     The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada");
            s.RequestParam(r => r.Interest, "Interest to filter by");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(TrendsFeaturedTopicsListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get product category details
/// </summary>

public class TrendsProductCategoriesDetailsListEndpoint : FastEndpoints.Endpoint<TrendsProductCategoriesDetailsListRequest, List<ProductCategoryDetails>>
{
    public override void Configure()
    {
        Get("/v5/trends/product_categories/details");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("trends");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get product category details";
            s.RequestParam(r => r.ProductCategories, "List of product categories");
            s.RequestParam(r => r.Region, "     The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada");
            s.RequestParam(r => r.LookbackWindow, "  Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years)");
            s.RequestParam(r => r.EngagementType, "    Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(TrendsProductCategoriesDetailsListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get a list of growing Shopping Product Categories
/// </summary>

public class TrendsProductCategoriesTrendingListEndpoint : FastEndpoints.Endpoint<TrendsProductCategoriesTrendingListRequest, List<TrendingProductCategory>>
{
    public override void Configure()
    {
        Get("/v5/trends/product_categories/trending");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("trends");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 401);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 403);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 429);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Get a list of growing Shopping Product Categories";
            s.RequestParam(r => r.Region, "     The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada");
            s.RequestParam(r => r.Verticals, "List of verticals to filter by");
            s.RequestParam(r => r.Ages, "Age to filter by. If not provided, the results will be filtered by all ages.");
            s.RequestParam(r => r.Genders, "Gender to filter by, If not provided, the results will be filtered by all genders.");
            s.RequestParam(r => r.EngagementType, "    Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[401] = "Authentication is required and has either failed or not been provided.";
            s.Responses[403] = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.";
            s.Responses[404] = "The requested resource could not be found on this server.";
            s.Responses[429] = "The user has sent too many requests in a given amount of time and is being rate limited.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(TrendsProductCategoriesTrendingListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

