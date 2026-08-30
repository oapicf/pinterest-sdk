/*
 * ConversionProductReportCreate.h
 *
 * Resource create operation model.
 */

#ifndef _ConversionProductReportCreate_H_
#define _ConversionProductReportCreate_H_


#include <string>
#include "ConversionAttributionWindowDays.h"
#include "ConversionObjectiveType.h"
#include "ConversionProductAttributionType.h"
#include "ConversionProductReportBreakdownType.h"
#include "ConversionProductReportGranularity.h"
#include "ConversionProductReportLevel.h"
#include "ConversionProductReportingColumn.h"
#include "ConversionReportTimeType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class ConversionProductReportCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionProductReportCreate();
	ConversionProductReportCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionProductReportCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
	 */
	std::list<std::string> getAdGroupIds();

	/*! \brief Set   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
	 */
	void setAdGroupIds(std::list <std::string> ad_group_ids);
	/*! \brief Get   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
	 */
	std::list<std::string> getCampaignIds();

	/*! \brief Set   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
	 */
	void setCampaignIds(std::list <std::string> campaign_ids);
	/*! \brief Get List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
	 */
	std::list<ConversionObjectiveType> getCampaignObjectiveTypes();

	/*! \brief Set List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
	 */
	void setCampaignObjectiveTypes(std::list <ConversionObjectiveType> campaign_objective_types);
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
	/*! \brief Get   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
	 */
	ConversionProductAttributionType getConversionProductAttributionType();

	/*! \brief Set   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
	 */
	void setConversionProductAttributionType(ConversionProductAttributionType  conversion_product_attribution_type);
	/*! \brief Get Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
	 */
	ConversionProductReportBreakdownType getConversionProductBreakdown();

	/*! \brief Set Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
	 */
	void setConversionProductBreakdown(ConversionProductReportBreakdownType  conversion_product_breakdown);
	/*! \brief Get The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
	 */
	ConversionReportTimeType getConversionReportTime();

	/*! \brief Set The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
	 */
	void setConversionReportTime(ConversionReportTimeType  conversion_report_time);
	/*! \brief Get   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
	 */
	std::string getEndDate();

	/*! \brief Set   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
	 */
	void setEndDate(std::string  end_date);
	/*! \brief Get Report granularity for time-based metric aggregation
	 */
	ConversionProductReportGranularity getGranularity();

	/*! \brief Set Report granularity for time-based metric aggregation
	 */
	void setGranularity(ConversionProductReportGranularity  granularity);
	/*! \brief Get Level of the report
	 */
	ConversionProductReportLevel getLevel();

	/*! \brief Set Level of the report
	 */
	void setLevel(ConversionProductReportLevel  level);
	/*! \brief Get   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
	 */
	std::list<std::string> getProductSkuIds();

	/*! \brief Set   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
	 */
	void setProductSkuIds(std::list <std::string> product_sku_ids);
	/*! \brief Get Name of the conversion product report
	 */
	std::string getReportName();

	/*! \brief Set Name of the conversion product report
	 */
	void setReportName(std::string  report_name);
	/*! \brief Get   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
	 */
	std::string getStartDate();

	/*! \brief Set   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
	 */
	void setStartDate(std::string  start_date);
	/*! \brief Get Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
	 */
	ConversionAttributionWindowDays getViewWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
	 */
	void setViewWindowDays(ConversionAttributionWindowDays  view_window_days);

private:
	std::list <std::string>ad_group_ids;
	std::list <std::string>campaign_ids;
	std::list <ConversionObjectiveType>campaign_objective_types;
	ConversionAttributionWindowDays click_window_days;
	std::list <ConversionProductReportingColumn>columns;
	ConversionProductAttributionType conversion_product_attribution_type;
	ConversionProductReportBreakdownType conversion_product_breakdown;
	ConversionReportTimeType conversion_report_time;
	std::string end_date;
	ConversionProductReportGranularity granularity;
	ConversionProductReportLevel level;
	std::list <std::string>product_sku_ids;
	std::string report_name;
	std::string start_date;
	ConversionAttributionWindowDays view_window_days;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionProductReportCreate_H_ */
