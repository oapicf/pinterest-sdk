/*
 * AdsAnalyticsResponse_inner.h
 *
 * 
 */

#ifndef _AdsAnalyticsResponse_inner_H_
#define _AdsAnalyticsResponse_inner_H_


#include <string>
#include "AnyType.h"
#include "Date.h"
#include <map>
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

class AdsAnalyticsResponse_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsResponse_inner();
	AdsAnalyticsResponse_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsResponse_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the ad that this metrics belongs to.
	 */
	std::string getADID();

	/*! \brief Set The ID of the ad that this metrics belongs to.
	 */
	void setADID(std::string  aD_ID);
	/*! \brief Get Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	Date getDATE();

	/*! \brief Set Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	void setDATE(Date  dATE);

private:
	std::string aD_ID;
	Date dATE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsAnalyticsResponse_inner_H_ */
