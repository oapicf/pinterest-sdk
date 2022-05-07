/*
 * AdsAnalyticsCreateAsyncRequest_allOf.h
 *
 * 
 */

#ifndef _AdsAnalyticsCreateAsyncRequest_allOf_H_
#define _AdsAnalyticsCreateAsyncRequest_allOf_H_


#include <string>
#include "ConversionAttributionWindowDays.h"
#include "ConversionReportAttributionType.h"
#include "ConversionReportTimeType.h"
#include "Granularity.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsCreateAsyncRequest_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsCreateAsyncRequest_allOf();
	AdsAnalyticsCreateAsyncRequest_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsCreateAsyncRequest_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Metric report start date (UTC). Format: YYYY-MM-DD
	 */
	std::string getStartDate();

	/*! \brief Set Metric report start date (UTC). Format: YYYY-MM-DD
	 */
	void setStartDate(std::string  start_date);
	/*! \brief Get Metric report end date (UTC). Format: YYYY-MM-DD
	 */
	std::string getEndDate();

	/*! \brief Set Metric report end date (UTC). Format: YYYY-MM-DD
	 */
	void setEndDate(std::string  end_date);
	/*! \brief Get TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
	 */
	Granularity getGranularity();

	/*! \brief Set TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
	 */
	void setGranularity(Granularity  granularity);
	/*! \brief Get Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	 */
	ConversionAttributionWindowDays getClickWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	 */
	void setClickWindowDays(ConversionAttributionWindowDays  click_window_days);
	/*! \brief Get Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	 */
	ConversionAttributionWindowDays getEngagementWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	 */
	void setEngagementWindowDays(ConversionAttributionWindowDays  engagement_window_days);
	/*! \brief Get Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
	 */
	ConversionAttributionWindowDays getViewWindowDays();

	/*! \brief Set Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
	 */
	void setViewWindowDays(ConversionAttributionWindowDays  view_window_days);
	/*! \brief Get The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
	 */
	ConversionReportTimeType getConversionReportTime();

	/*! \brief Set The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
	 */
	void setConversionReportTime(ConversionReportTimeType  conversion_report_time);
	/*! \brief Get List of types of attribution for the conversion report
	 */
	std::list<ConversionReportAttributionType> getAttributionTypes();

	/*! \brief Set List of types of attribution for the conversion report
	 */
	void setAttributionTypes(std::list <ConversionReportAttributionType> attribution_types);

private:
	std::string start_date;
	std::string end_date;
	Granularity granularity;
	ConversionAttributionWindowDays click_window_days;
	ConversionAttributionWindowDays engagement_window_days;
	ConversionAttributionWindowDays view_window_days;
	ConversionReportTimeType conversion_report_time;
	std::list <ConversionReportAttributionType>attribution_types;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsAnalyticsCreateAsyncRequest_allOf_H_ */
