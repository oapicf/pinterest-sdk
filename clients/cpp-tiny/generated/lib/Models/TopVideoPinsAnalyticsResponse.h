
/*
 * TopVideoPinsAnalyticsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TopVideoPinsAnalyticsResponse_H_
#define TINY_CPP_CLIENT_TopVideoPinsAnalyticsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TopVideoPinsAnalyticsResponseDateAvailability.h"
#include "TopVideoPinsAnalyticsResponsePinsItems.h"
#include "TopVideoPinsSortBy.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TopVideoPinsAnalyticsResponse{
public:

    /*! \brief Constructor.
	 */
    TopVideoPinsAnalyticsResponse();
    TopVideoPinsAnalyticsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TopVideoPinsAnalyticsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TopVideoPinsAnalyticsResponseDateAvailability getDateAvailability();

	/*! \brief Set 
	 */
	void setDateAvailability(TopVideoPinsAnalyticsResponseDateAvailability date_availability);
	/*! \brief Get 
	 */
	std::list<TopVideoPinsAnalyticsResponsePinsItems> getPins();

	/*! \brief Set 
	 */
	void setPins(std::list<TopVideoPinsAnalyticsResponsePinsItems> pins);
	/*! \brief Get 
	 */
	TopVideoPinsSortBy getSortBy();

	/*! \brief Set 
	 */
	void setSortBy(TopVideoPinsSortBy sort_by);


    private:
    TopVideoPinsAnalyticsResponseDateAvailability date_availability;
    std::list<TopVideoPinsAnalyticsResponsePinsItems> pins;
    TopVideoPinsSortBy sort_by;
};
}

#endif /* TINY_CPP_CLIENT_TopVideoPinsAnalyticsResponse_H_ */
