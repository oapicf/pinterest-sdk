
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ProductTagsBulkAddRequest
{
    /// <summary>
    /// Unique identifier of the hero pin that will receive product tags.
    /// </summary>
    [FastEndpoints.BindFrom("pin_id")]
    public string PinId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public ProductTagsBulkAddRequest productTagsBulkAddRequest { get; set; }
}
public class ProductTagsBulkDeleteRequest
{
    /// <summary>
    /// Unique identifier of the hero pin that will receive product tags.
    /// </summary>
    [FastEndpoints.BindFrom("pin_id")]
    public string PinId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest { get; set; }
}
public class ProductTagsListRequest
{
    /// <summary>
    /// Unique identifier of the hero pin that will receive product tags.
    /// </summary>
    [FastEndpoints.BindFrom("pin_id")]
    public string PinId { get; set; }
}


