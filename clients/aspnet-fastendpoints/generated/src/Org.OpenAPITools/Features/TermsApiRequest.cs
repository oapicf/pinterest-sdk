
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class TermsRelatedListRequest
{
    /// <summary>
    /// List of input terms.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("terms")]
    public List<string> Terms { get; set; }
}
public class TermsSuggestedListRequest
{
    /// <summary>
    /// Input term.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("term")]
    public string Term { get; set; }
    /// <summary>
    /// Max suggested terms to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}


