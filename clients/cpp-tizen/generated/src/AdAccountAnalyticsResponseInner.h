/*
 * AdAccountAnalyticsResponse_inner.h
 *
 * 
 */

#ifndef _AdAccountAnalyticsResponse_inner_H_
#define _AdAccountAnalyticsResponse_inner_H_


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

class AdAccountAnalyticsResponse_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountAnalyticsResponse_inner();
	AdAccountAnalyticsResponse_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountAnalyticsResponse_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the advertiser that this metrics belongs to.
	 */
	std::string getADACCOUNTID();

	/*! \brief Set The ID of the advertiser that this metrics belongs to.
	 */
	void setADACCOUNTID(std::string  aD_ACCOUNT_ID);
	/*! \brief Get Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	Date getDATE();

	/*! \brief Set Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	void setDATE(Date  dATE);

private:
	std::string aD_ACCOUNT_ID;
	Date dATE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountAnalyticsResponse_inner_H_ */
