
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class MediaCreateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public MediaUploadCreate mediaUploadCreate { get; set; }
}
public class MediaGetRequest
{
    /// <summary>
    /// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
    /// </summary>
    [FastEndpoints.BindFrom("media_id")]
    public string MediaId { get; set; }
}
public class MediaListRequest
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


