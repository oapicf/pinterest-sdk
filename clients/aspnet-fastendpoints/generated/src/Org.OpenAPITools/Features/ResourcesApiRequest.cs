
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AdAccountCountriesGetRequest
{
}
public class DeliveryMetricsGetRequest
{
    /// <summary>
    /// Report type.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("report_type")]
    public ReportType ReportType { get; set; }
}
public class InterestTargetingOptionsGetRequest
{
    /// <summary>
    /// Unique identifier of an interest.
    /// </summary>
    [FastEndpoints.BindFrom("interest_id")]
    public string InterestId { get; set; }
}
public class LeadFormQuestionsGetRequest
{
}
public class MetricsReadyStateGetRequest
{
    /// <summary>
    /// Analytics reports request date (UTC). Format: YYYY-MM-DD
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("date")]
    public string Date { get; set; }
}
public class TargetingOptionsGetRequest
{
    /// <summary>
    /// Public targeting type
    /// </summary>
    [FastEndpoints.BindFrom("targeting_type")]
    public PublicTargetingType TargetingType { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Client ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("client_id")]
    public string? ClientId { get; set; }
    /// <summary>
    /// Oauth signature
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("oauth_signature")]
    public string? OauthSignature { get; set; }
    /// <summary>
    /// Timestamp.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("timestamp")]
    public string? Timestamp { get; set; }
}


