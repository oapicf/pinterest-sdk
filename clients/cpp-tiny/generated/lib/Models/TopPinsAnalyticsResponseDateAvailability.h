
/*
 * TopPinsAnalyticsResponseDateAvailability.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TopPinsAnalyticsResponseDateAvailability_H_
#define TINY_CPP_CLIENT_TopPinsAnalyticsResponseDateAvailability_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TopPinsAnalyticsResponseDateAvailability{
public:

    /*! \brief Constructor.
	 */
    TopPinsAnalyticsResponseDateAvailability();
    TopPinsAnalyticsResponseDateAvailability(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TopPinsAnalyticsResponseDateAvailability();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isIsRealtime();

	/*! \brief Set 
	 */
	void setIsRealtime(bool is_realtime);
	/*! \brief Get 
	 */
	long getLatestAvailableTimestamp();

	/*! \brief Set 
	 */
	void setLatestAvailableTimestamp(long latest_available_timestamp);


    private:
    bool is_realtime{};
    long latest_available_timestamp{};
};
}

#endif /* TINY_CPP_CLIENT_TopPinsAnalyticsResponseDateAvailability_H_ */
