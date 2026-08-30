
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class TermsOfServiceGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Return HTML in TOS text.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include_html")]
    public bool? IncludeHtml { get; set; }
    /// <summary>
    /// Request type.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tos_type")]
    public string? TosType { get; set; }
}


