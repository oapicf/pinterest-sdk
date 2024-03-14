/*
 * TopPinsAnalyticsResponse_date_availability.h
 *
 * 
 */

#ifndef _TopPinsAnalyticsResponse_date_availability_H_
#define _TopPinsAnalyticsResponse_date_availability_H_


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

class TopPinsAnalyticsResponse_date_availability : public Object {
public:
	/*! \brief Constructor.
	 */
	TopPinsAnalyticsResponse_date_availability();
	TopPinsAnalyticsResponse_date_availability(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TopPinsAnalyticsResponse_date_availability();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getLatestAvailableTimestamp();

	/*! \brief Set 
	 */
	void setLatestAvailableTimestamp(long long  latest_available_timestamp);
	/*! \brief Get 
	 */
	bool getIsRealtime();

	/*! \brief Set 
	 */
	void setIsRealtime(bool  is_realtime);

private:
	long long latest_available_timestamp;
	bool is_realtime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TopPinsAnalyticsResponse_date_availability_H_ */
