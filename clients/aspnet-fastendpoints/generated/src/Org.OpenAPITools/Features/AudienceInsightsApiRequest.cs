
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AudienceInsightsGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Type of audience insights.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audience_insight_type")]
    public AudienceInsightType AudienceInsightType { get; set; }
}
public class AudienceInsightsScopeAndTypeGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
}


