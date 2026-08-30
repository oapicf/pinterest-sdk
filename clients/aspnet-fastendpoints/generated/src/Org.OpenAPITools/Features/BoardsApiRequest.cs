
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class BoardSectionsCreateRequest
{
    /// <summary>
    /// Unique identifier of a board.
    /// </summary>
    [FastEndpoints.BindFrom("board_id")]
    public string BoardId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public BoardSectionCreate boardSectionCreate { get; set; }
}
public class BoardSectionsDeleteRequest
{
    /// <summary>
    /// Unique identifier of a board.
    /// </summary>
    [FastEndpoints.BindFrom("board_id")]
    public string BoardId { get; set; }
    /// <summary>
    /// Unique identifier of a board section.
    /// </summary>
    [FastEndpoints.BindFrom("section_id")]
    public string SectionId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class BoardSectionsListRequest
{
    /// <summary>
    /// Unique identifier of a board.
    /// </summary>
    [FastEndpoints.BindFrom("board_id")]
    public string BoardId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
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
public class BoardSectionsListPinsRequest
{
    /// <summary>
    /// Unique identifier of a board.
    /// </summary>
    [FastEndpoints.BindFrom("board_id")]
    public string BoardId { get; set; }
    /// <summary>
    /// Unique identifier of a board section.
    /// </summary>
    [FastEndpoints.BindFrom("section_id")]
    public string SectionId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
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
public class BoardSectionsUpdateRequest
{
    /// <summary>
    /// Unique identifier of a board.
    /// </summary>
    [FastEndpoints.BindFrom("board_id")]
    public string BoardId { get; set; }
    /// <summary>
    /// Unique identifier of a board section.
    /// </summary>
    [FastEndpoints.BindFrom("section_id")]
    public string SectionId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public BoardSectionUpdateWithRequiredBody boardSectionUpdateWithRequiredBody { get; set; }
}
public class BoardsCreateRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public BoardCreate boardCreate { get; set; }
}
public class BoardsDeleteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("board_id")]
    public string BoardId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class BoardsGetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("board_id")]
    public string BoardId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class BoardsListRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// The privacy level of the board
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("privacy")]
    public BoardPrivacyFilter Privacy { get; set; }
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
public class BoardsListPinsRequest
{
    /// <summary>
    /// Unique identifier of a board.
    /// </summary>
    [FastEndpoints.BindFrom("board_id")]
    public string BoardId { get; set; }
    /// <summary>
    /// Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creative_types")]
    public List<CreativeType>? CreativeTypes { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_metrics")]
    public bool? PinMetrics { get; set; }
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
public class BoardsUpdateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("board_id")]
    public string BoardId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate { get; set; }
}


