
/*
 * ConversionProductReportRequest.h
 *
 * Request for a brand, category, SKU report
 */

#ifndef TINY_CPP_CLIENT_ConversionProductReportRequest_H_
#define TINY_CPP_CLIENT_ConversionProductReportRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionAttributionWindowDays.h"
#include "ConversionProductReportingColumn.h"
#include "ConversionReportTimeType.h"
#include "ObjectiveType.h"
#include <list>

namespace Tiny {


/*! \brief Request for a brand, category, SKU report
 *
 *  \ingroup Models
 *
 */

class ConversionProductReportRequest{
public:

    /*! \brief Constructor.
	 */
    ConversionProductReportRequest();
    ConversionProductReportRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionProductReportRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
	 */
	std::list<std::string> getAdGroupIds();

	/*! \brief Set List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
	 */
	void setAdGroupIds(std::list <std::string> ad_group_ids);
	/*! \brief Get List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
	 */
	std::list<std::string> getCampaignIds();

	/*! \brief Set List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
	 */
	void setCampaignIds(std::list <std::string> campaign_ids);
	/*! \brief Get List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
	 */
	std::list<ObjectiveType> getCampaignObjectiveTypes();

	/*! \brief Set List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
	 */
	void setCampaignObjectiveTypes(std::list <ObjectiveType> campaign_objective_types);
	/*! \brief Get Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	 */
	ConversionAttributionWindowDays getClickWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	 */
	void setClickWindowDays(ConversionAttributionWindowDays  click_window_days);
	/*! \brief Get Metric and entity columns
	 */
	std::list<ConversionProductReportingColumn> getColumns();

	/*! \brief Set Metric and entity columns
	 */
	void setColumns(std::list <ConversionProductReportingColumn> columns);
	/*! \brief Get 
	 */
	std::string getConversionProductAttributionType();

	/*! \brief Set 
	 */
	void setConversionProductAttributionType(std::string  conversion_product_attribution_type);
	/*! \brief Get 
	 */
	std::string getConversionProductBreakdown();

	/*! \brief Set 
	 */
	void setConversionProductBreakdown(std::string  conversion_product_breakdown);
	/*! \brief Get The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
	 */
	ConversionReportTimeType getConversionReportTime();

	/*! \brief Set The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
	 */
	void setConversionReportTime(ConversionReportTimeType  conversion_report_time);
	/*! \brief Get Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
	 */
	std::string getEndDate();

	/*! \brief Set Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
	 */
	void setEndDate(std::string  end_date);
	/*! \brief Get TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
	 */
	std::string getGranularity();

	/*! \brief Set TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
	 */
	void setGranularity(std::string  granularity);
	/*! \brief Get Level of the report
	 */
	std::string getLevel();

	/*! \brief Set Level of the report
	 */
	void setLevel(std::string  level);
	/*! \brief Get List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
	 */
	std::list<std::string> getProductSkuIds();

	/*! \brief Set List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
	 */
	void setProductSkuIds(std::list <std::string> product_sku_ids);
	/*! \brief Get Name of the conversion product report.
	 */
	std::string getReportName();

	/*! \brief Set Name of the conversion product report.
	 */
	void setReportName(std::string  report_name);
	/*! \brief Get Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
	 */
	std::string getStartDate();

	/*! \brief Set Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
	 */
	void setStartDate(std::string  start_date);
	/*! \brief Get Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
	 */
	ConversionAttributionWindowDays getViewWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
	 */
	void setViewWindowDays(ConversionAttributionWindowDays  view_window_days);


    private:
    std::list<std::string> ad_group_ids;
    std::list<std::string> campaign_ids;
    std::list<ObjectiveType> campaign_objective_types;
    ConversionAttributionWindowDays click_window_days;
    std::list<ConversionProductReportingColumn> columns;
    std::string conversion_product_attribution_type{};
    std::string conversion_product_breakdown{};
    ConversionReportTimeType conversion_report_time;
    std::string end_date{};
    std::string granularity{};
    std::string level{};
    std::list<std::string> product_sku_ids;
    std::string report_name{};
    std::string start_date{};
    ConversionAttributionWindowDays view_window_days;
};
}

#endif /* TINY_CPP_CLIENT_ConversionProductReportRequest_H_ */
