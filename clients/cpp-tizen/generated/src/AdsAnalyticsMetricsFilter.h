/*
 * AdsAnalyticsMetricsFilter.h
 *
 * 
 */

#ifndef _AdsAnalyticsMetricsFilter_H_
#define _AdsAnalyticsMetricsFilter_H_


#include <string>
#include "AdsAnalyticsFilterColumn.h"
#include "AdsAnalyticsFilterOperator.h"
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

class AdsAnalyticsMetricsFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsMetricsFilter();
	AdsAnalyticsMetricsFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsMetricsFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AdsAnalyticsFilterColumn getField();

	/*! \brief Set 
	 */
	void setField(AdsAnalyticsFilterColumn  field);
	/*! \brief Get 
	 */
	AdsAnalyticsFilterOperator getROperator();

	/*! \brief Set 
	 */
	void setROperator(AdsAnalyticsFilterOperator  r_operator);
	/*! \brief Get List of values for filtering
	 */
	std::list<long long> getValues();

	/*! \brief Set List of values for filtering
	 */
	void setValues(std::list <long long> values);

private:
	AdsAnalyticsFilterColumn field;
	AdsAnalyticsFilterOperator r_operator;
	std::list <long long>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsAnalyticsMetricsFilter_H_ */
