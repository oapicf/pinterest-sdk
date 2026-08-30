
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ConversionEqsListRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Lookback window (number of days).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lookback_period")]
    public LookbackPeriodOptions LookbackPeriod { get; set; }
    /// <summary>
    /// Source platform of event.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("source_platform")]
    public SourcePlatformOptions SourcePlatform { get; set; }
    /// <summary>
    /// Ingestion source of event.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ingestion_source")]
    public IngestionSourceOptions IngestionSource { get; set; }
}


