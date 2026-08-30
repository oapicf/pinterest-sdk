
/*
 * CustomConversionEventMetrics.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomConversionEventMetrics_H_
#define TINY_CPP_CLIENT_CustomConversionEventMetrics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdeColumnType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomConversionEventMetrics{
public:

    /*! \brief Constructor.
	 */
    CustomConversionEventMetrics();
    CustomConversionEventMetrics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomConversionEventMetrics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AdeColumnType getCustomEventMetricsType();

	/*! \brief Set 
	 */
	void setCustomEventMetricsType(AdeColumnType custom_event_metrics_type);
	/*! \brief Get Name of the advertiser-defined custom conversion event
	 */
	std::string getCustomEventName();

	/*! \brief Set Name of the advertiser-defined custom conversion event
	 */
	void setCustomEventName(std::string custom_event_name);


    private:
    AdeColumnType custom_event_metrics_type;
    std::string custom_event_name{};
};
}

#endif /* TINY_CPP_CLIENT_CustomConversionEventMetrics_H_ */
