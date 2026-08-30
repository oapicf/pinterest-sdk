namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdsAnalyticsCreateAsyncRequest 
{
    public List<string> AdGroupIds { get; set; }
    public List<AdGroupSummaryStatus> AdGroupStatuses { get; set; }
    public List<string> AdIds { get; set; }
    public List<PinPromotionSummaryStatus> AdStatuses { get; set; }
    public List<ConversionReportAttributionType> AttributionTypes { get; set; }
    public string CampaignBrandLabel { get; set; }
    public string CampaignCustomLabel { get; set; }
    public List<string> CampaignIds { get; set; }
    public List<CampaignObjectiveType> CampaignObjectiveTypes { get; set; }
    public List<CampaignSummaryStatus> CampaignStatuses { get; set; }
    
    public ConversionAttributionWindowDays ClickWindowDays { get; set; }
    public List<ReportingColumnAsync> Columns { get; set; }
    public bool CombineTargetingTypes { get; set; } = false;
    
    public ConversionReportTimeType ConversionReportTime { get; set; }
    public List<CustomConversionEventMetrics> CustomConversionEventMetrics { get; set; }
    public string EndDate { get; set; }
    public int EndHour { get; set; }
    
    public ConversionAttributionWindowDays EngagementWindowDays { get; set; }
    
    public Granularity Granularity { get; set; }
    
    public MetricsReportingLevel Level { get; set; }
    public List<AdsAnalyticsMetricsFilter> MetricsFilters { get; set; }
    
    public PrimarySort PrimarySort { get; set; }
    public List<string> ProductGroupIds { get; set; }
    public List<ProductGroupSummaryStatus> ProductGroupStatuses { get; set; }
    public List<string> ProductItemIds { get; set; }
    
    public DataOutputFormat ReportFormat { get; set; }
    
    public ReportingTimeZone ReportingTimezone { get; set; }
    public string StartDate { get; set; }
    public int StartHour { get; set; }
    public List<AdAdsAnalyticsAsyncTargetingTypes> TargetingTypes { get; set; }
    
    public ConversionAttributionWindowDays ViewWindowDays { get; set; }
}


