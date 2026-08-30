/*
 * MetricsResponseDataItems.h
 *
 * 
 */

#ifndef _MetricsResponseDataItems_H_
#define _MetricsResponseDataItems_H_


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

class MetricsResponseDataItems : public Object {
public:
	/*! \brief Constructor.
	 */
	MetricsResponseDataItems();
	MetricsResponseDataItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MetricsResponseDataItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
	 */
	std::string getMetrics();

	/*! \brief Set Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
	 */
	void setMetrics(std::string  metrics);
	/*! \brief Get The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
	 */
	std::string getTargetingType();

	/*! \brief Set The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
	 */
	void setTargetingType(std::string  targeting_type);
	/*! \brief Get The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
	 */
	std::string getTargetingValue();

	/*! \brief Set The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
	 */
	void setTargetingValue(std::string  targeting_value);

private:
	std::string metrics;
	std::string targeting_type;
	std::string targeting_value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MetricsResponseDataItems_H_ */
