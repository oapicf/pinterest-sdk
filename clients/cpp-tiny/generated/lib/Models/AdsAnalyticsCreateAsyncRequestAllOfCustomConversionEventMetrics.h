
/*
 * AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics_H_
#define TINY_CPP_CLIENT_AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics{
public:

    /*! \brief Constructor.
	 */
    AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics();
    AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string custom_event_metrics_type{};
    std::string custom_event_name{};
};
}

#endif /* TINY_CPP_CLIENT_AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics_H_ */
