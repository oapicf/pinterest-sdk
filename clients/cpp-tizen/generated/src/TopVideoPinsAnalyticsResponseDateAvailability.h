/*
 * TopVideoPinsAnalyticsResponseDateAvailability.h
 *
 * 
 */

#ifndef _TopVideoPinsAnalyticsResponseDateAvailability_H_
#define _TopVideoPinsAnalyticsResponseDateAvailability_H_


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

class TopVideoPinsAnalyticsResponseDateAvailability : public Object {
public:
	/*! \brief Constructor.
	 */
	TopVideoPinsAnalyticsResponseDateAvailability();
	TopVideoPinsAnalyticsResponseDateAvailability(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TopVideoPinsAnalyticsResponseDateAvailability();

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

#endif /* _TopVideoPinsAnalyticsResponseDateAvailability_H_ */
