/*
 * TopPinsAnalyticsResponseDateAvailability.h
 *
 * 
 */

#ifndef _TopPinsAnalyticsResponseDateAvailability_H_
#define _TopPinsAnalyticsResponseDateAvailability_H_


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

class TopPinsAnalyticsResponseDateAvailability : public Object {
public:
	/*! \brief Constructor.
	 */
	TopPinsAnalyticsResponseDateAvailability();
	TopPinsAnalyticsResponseDateAvailability(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TopPinsAnalyticsResponseDateAvailability();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	bool getIsRealtime();

	/*! \brief Set 
	 */
	void setIsRealtime(bool  is_realtime);
	/*! \brief Get 
	 */
	long long getLatestAvailableTimestamp();

	/*! \brief Set 
	 */
	void setLatestAvailableTimestamp(long long  latest_available_timestamp);

private:
	bool is_realtime;
	long long latest_available_timestamp;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TopPinsAnalyticsResponseDateAvailability_H_ */
