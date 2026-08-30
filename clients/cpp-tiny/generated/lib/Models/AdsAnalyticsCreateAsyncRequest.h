
/*
 * AdsAnalyticsCreateAsyncRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdsAnalyticsCreateAsyncRequest_H_
#define TINY_CPP_CLIENT_AdsAnalyticsCreateAsyncRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdAdsAnalyticsAsyncTargetingTypes.h"
#include "AdGroupSummaryStatus.h"
#include "AdsAnalyticsMetricsFilter.h"
#include "CampaignObjectiveType.h"
#include "CampaignSummaryStatus.h"
#include "ConversionAttributionWindowDays.h"
#include "ConversionReportAttributionType.h"
#include "ConversionReportTimeType.h"
#include "CustomConversionEventMetrics.h"
#include "DataOutputFormat.h"
#include "Granularity.h"
#include "MetricsReportingLevel.h"
#include "PinPromotionSummaryStatus.h"
#include "PrimarySort.h"
#include "ProductGroupSummaryStatus.h"
#include "ReportingColumnAsync.h"
#include "ReportingTimeZone.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsCreateAsyncRequest{
public:

    /*! \brief Constructor.
	 */
    AdsAnalyticsCreateAsyncRequest();
    AdsAnalyticsCreateAsyncRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsAnalyticsCreateAsyncRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of ad group ids
	 */
	std::list<std::string> getAdGroupIds();

	/*! \brief Set List of ad group ids
	 */
	void setAdGroupIds(std::list<std::string> ad_group_ids);
	/*! \brief Get List of values for filtering
	 */
	std::list<AdGroupSummaryStatus> getAdGroupStatuses();

	/*! \brief Set List of values for filtering
	 */
	void setAdGroupStatuses(std::list<AdGroupSummaryStatus> ad_group_statuses);
	/*! \brief Get List of ad ids. This parameter is not supported for Product Item level reports.
	 */
	std::list<std::string> getAdIds();

	/*! \brief Set List of ad ids. This parameter is not supported for Product Item level reports.
	 */
	void setAdIds(std::list<std::string> ad_ids);
	/*! \brief Get List of values for filtering. This parameter is not supported for Product Item level reports.
	 */
	std::list<PinPromotionSummaryStatus> getAdStatuses();

	/*! \brief Set List of values for filtering. This parameter is not supported for Product Item level reports.
	 */
	void setAdStatuses(std::list<PinPromotionSummaryStatus> ad_statuses);
	/*! \brief Get List of attribution types for the conversion report.
	 */
	std::list<ConversionReportAttributionType> getAttributionTypes();

	/*! \brief Set List of attribution types for the conversion report.
	 */
	void setAttributionTypes(std::list<ConversionReportAttributionType> attribution_types);
	/*! \brief Get Campaign brand label for filtering.
	 */
	std::string getCampaignBrandLabel();

	/*! \brief Set Campaign brand label for filtering.
	 */
	void setCampaignBrandLabel(std::string campaign_brand_label);
	/*! \brief Get Campaign custom label for filtering.
	 */
	std::string getCampaignCustomLabel();

	/*! \brief Set Campaign custom label for filtering.
	 */
	void setCampaignCustomLabel(std::string campaign_custom_label);
	/*! \brief Get List of campaign ids
	 */
	std::list<std::string> getCampaignIds();

	/*! \brief Set List of campaign ids
	 */
	void setCampaignIds(std::list<std::string> campaign_ids);
	/*! \brief Get List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
	 */
	std::list<CampaignObjectiveType> getCampaignObjectiveTypes();

	/*! \brief Set List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
	 */
	void setCampaignObjectiveTypes(std::list<CampaignObjectiveType> campaign_objective_types);
	/*! \brief Get List of status values for filtering
	 */
	std::list<CampaignSummaryStatus> getCampaignStatuses();

	/*! \brief Set List of status values for filtering
	 */
	void setCampaignStatuses(std::list<CampaignSummaryStatus> campaign_statuses);
	/*! \brief Get Number of days to use as the conversion attribution window for a pin click action.
	 */
	ConversionAttributionWindowDays getClickWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a pin click action.
	 */
	void setClickWindowDays(ConversionAttributionWindowDays click_window_days);
	/*! \brief Get Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
	 */
	std::list<ReportingColumnAsync> getColumns();

	/*! \brief Set Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
	 */
	void setColumns(std::list<ReportingColumnAsync> columns);
	/*! \brief Get Determines if the targeting types included in the request should be consolidated into a single breakdown.
	 */
	bool isCombineTargetingTypes();

	/*! \brief Set Determines if the targeting types included in the request should be consolidated into a single breakdown.
	 */
	void setCombineTargetingTypes(bool combine_targeting_types);
	/*! \brief Get Date dimension for conversion metrics.
	 */
	ConversionReportTimeType getConversionReportTime();

	/*! \brief Set Date dimension for conversion metrics.
	 */
	void setConversionReportTime(ConversionReportTimeType conversion_report_time);
	/*! \brief Get List of advertiser-defined custom conversion event metrics to include in the report
	 */
	std::list<CustomConversionEventMetrics> getCustomConversionEventMetrics();

	/*! \brief Set List of advertiser-defined custom conversion event metrics to include in the report
	 */
	void setCustomConversionEventMetrics(std::list<CustomConversionEventMetrics> custom_conversion_event_metrics);
	/*! \brief Get Metric report end date (UTC). Format: YYYY-MM-DD
	 */
	std::string getEndDate();

	/*! \brief Set Metric report end date (UTC). Format: YYYY-MM-DD
	 */
	void setEndDate(std::string end_date);
	/*! \brief Get Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
	 */
	int getEndHour();

	/*! \brief Set Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
	 */
	void setEndHour(int end_hour);
	/*! \brief Get Number of days to use as the conversion attribution window for an engagement action.
	 */
	ConversionAttributionWindowDays getEngagementWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for an engagement action.
	 */
	void setEngagementWindowDays(ConversionAttributionWindowDays engagement_window_days);
	/*! \brief Get   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
	 */
	Granularity getGranularity();

	/*! \brief Set   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
	 */
	void setGranularity(Granularity granularity);
	/*! \brief Get Level of the report
	 */
	MetricsReportingLevel getLevel();

	/*! \brief Set Level of the report
	 */
	void setLevel(MetricsReportingLevel level);
	/*! \brief Get List of metrics filters
	 */
	std::list<AdsAnalyticsMetricsFilter> getMetricsFilters();

	/*! \brief Set List of metrics filters
	 */
	void setMetricsFilters(std::list<AdsAnalyticsMetricsFilter> metrics_filters);
	/*! \brief Get 
	 */
	PrimarySort getPrimarySort();

	/*! \brief Set 
	 */
	void setPrimarySort(PrimarySort primary_sort);
	/*! \brief Get List of product group ids
	 */
	std::list<std::string> getProductGroupIds();

	/*! \brief Set List of product group ids
	 */
	void setProductGroupIds(std::list<std::string> product_group_ids);
	/*! \brief Get List of values for filtering
	 */
	std::list<ProductGroupSummaryStatus> getProductGroupStatuses();

	/*! \brief Set List of values for filtering
	 */
	void setProductGroupStatuses(std::list<ProductGroupSummaryStatus> product_group_statuses);
	/*! \brief Get List of product item ids
	 */
	std::list<std::string> getProductItemIds();

	/*! \brief Set List of product item ids
	 */
	void setProductItemIds(std::list<std::string> product_item_ids);
	/*! \brief Get 
	 */
	DataOutputFormat getReportFormat();

	/*! \brief Set 
	 */
	void setReportFormat(DataOutputFormat report_format);
	/*! \brief Get Specify the timezone to be applied for the reporting.
	 */
	ReportingTimeZone getReportingTimezone();

	/*! \brief Set Specify the timezone to be applied for the reporting.
	 */
	void setReportingTimezone(ReportingTimeZone reporting_timezone);
	/*! \brief Get Metric report start date (UTC). Format: YYYY-MM-DD
	 */
	std::string getStartDate();

	/*! \brief Set Metric report start date (UTC). Format: YYYY-MM-DD
	 */
	void setStartDate(std::string start_date);
	/*! \brief Get Which hour of the start date to begin the report. Only allowed for hourly reports.
	 */
	int getStartHour();

	/*! \brief Set Which hour of the start date to begin the report. Only allowed for hourly reports.
	 */
	void setStartHour(int start_hour);
	/*! \brief Get List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
	 */
	std::list<AdAdsAnalyticsAsyncTargetingTypes> getTargetingTypes();

	/*! \brief Set List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
	 */
	void setTargetingTypes(std::list<AdAdsAnalyticsAsyncTargetingTypes> targeting_types);
	/*! \brief Get Number of days to use as the conversion attribution window for a view action.
	 */
	ConversionAttributionWindowDays getViewWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a view action.
	 */
	void setViewWindowDays(ConversionAttributionWindowDays view_window_days);


    private:
    std::list<std::string> ad_group_ids;
    std::list<AdGroupSummaryStatus> ad_group_statuses;
    std::list<std::string> ad_ids;
    std::list<PinPromotionSummaryStatus> ad_statuses;
    std::list<ConversionReportAttributionType> attribution_types;
    std::string campaign_brand_label{};
    std::string campaign_custom_label{};
    std::list<std::string> campaign_ids;
    std::list<CampaignObjectiveType> campaign_objective_types;
    std::list<CampaignSummaryStatus> campaign_statuses;
    ConversionAttributionWindowDays click_window_days;
    std::list<ReportingColumnAsync> columns;
    bool combine_targeting_types{};
    ConversionReportTimeType conversion_report_time;
    std::list<CustomConversionEventMetrics> custom_conversion_event_metrics;
    std::string end_date{};
    int end_hour{};
    ConversionAttributionWindowDays engagement_window_days;
    Granularity granularity;
    MetricsReportingLevel level;
    std::list<AdsAnalyticsMetricsFilter> metrics_filters;
    PrimarySort primary_sort;
    std::list<std::string> product_group_ids;
    std::list<ProductGroupSummaryStatus> product_group_statuses;
    std::list<std::string> product_item_ids;
    DataOutputFormat report_format;
    ReportingTimeZone reporting_timezone;
    std::string start_date{};
    int start_hour{};
    std::list<AdAdsAnalyticsAsyncTargetingTypes> targeting_types;
    ConversionAttributionWindowDays view_window_days;
};
}

#endif /* TINY_CPP_CLIENT_AdsAnalyticsCreateAsyncRequest_H_ */
