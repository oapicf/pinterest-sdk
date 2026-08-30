/*
 * CustomConversionEventMetrics.h
 *
 * 
 */

#ifndef _CustomConversionEventMetrics_H_
#define _CustomConversionEventMetrics_H_


#include <string>
#include "AdeColumnType.h"
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

class CustomConversionEventMetrics : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomConversionEventMetrics();
	CustomConversionEventMetrics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomConversionEventMetrics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AdeColumnType getCustomEventMetricsType();

	/*! \brief Set 
	 */
	void setCustomEventMetricsType(AdeColumnType  custom_event_metrics_type);
	/*! \brief Get Name of the advertiser-defined custom conversion event
	 */
	std::string getCustomEventName();

	/*! \brief Set Name of the advertiser-defined custom conversion event
	 */
	void setCustomEventName(std::string  custom_event_name);

private:
	AdeColumnType custom_event_metrics_type;
	std::string custom_event_name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomConversionEventMetrics_H_ */
