
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class IntegrationsCommerceDelRequest
{
    /// <summary>
    /// External business ID for the integration.
    /// </summary>
    [FastEndpoints.BindFrom("external_business_id")]
    public string ExternalBusinessId { get; set; }
}
public class IntegrationsCommerceGetRequest
{
    /// <summary>
    /// External business ID for the integration.
    /// </summary>
    [FastEndpoints.BindFrom("external_business_id")]
    public string ExternalBusinessId { get; set; }
}
public class IntegrationsCommercePatchRequest
{
    /// <summary>
    /// External business ID for the integration.
    /// </summary>
    [FastEndpoints.BindFrom("external_business_id")]
    public string ExternalBusinessId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public IntegrationMetadataUpdate integrationMetadataUpdate { get; set; }
}
public class IntegrationsCommercePostRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public IntegrationMetadataCreate integrationMetadataCreate { get; set; }
}
public class IntegrationsGetByIdRequest
{
    /// <summary>
    /// Integration record ID.
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public string Id { get; set; }
}
public class IntegrationsGetListRequest
{
    /// <summary>
    /// Cursor used to fetch the next page of items
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bookmark")]
    public string? Bookmark { get; set; }
    /// <summary>
    /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page_size")]
    public int? PageSize { get; set; }
}
public class IntegrationsLogsPostRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public IntegrationLogsRequestCreate integrationLogsRequestCreate { get; set; }
}


