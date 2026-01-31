/*
 * AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics.h
 *
 * 
 */

#ifndef _AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics_H_
#define _AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics_H_


#include <string>
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

class AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics();
	AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Metrics for custom defined conversion event.
	 */
	std::string getCustomEventMetricsType();

	/*! \brief Set Metrics for custom defined conversion event.
	 */
	void setCustomEventMetricsType(std::string  custom_event_metrics_type);
	/*! \brief Get Name of the advertiser-defined custom conversion event
	 */
	std::string getCustomEventName();

	/*! \brief Set Name of the advertiser-defined custom conversion event
	 */
	void setCustomEventName(std::string  custom_event_name);

private:
	std::string custom_event_metrics_type;
	std::string custom_event_name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics_H_ */
