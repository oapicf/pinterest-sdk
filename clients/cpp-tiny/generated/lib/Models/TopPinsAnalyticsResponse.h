
/*
 * TopPinsAnalyticsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TopPinsAnalyticsResponse_H_
#define TINY_CPP_CLIENT_TopPinsAnalyticsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TopPinsAnalyticsResponseDateAvailability.h"
#include "TopPinsAnalyticsResponsePinsItems.h"
#include "TopPinsSortBy.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TopPinsAnalyticsResponse{
public:

    /*! \brief Constructor.
	 */
    TopPinsAnalyticsResponse();
    TopPinsAnalyticsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TopPinsAnalyticsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TopPinsAnalyticsResponseDateAvailability getDateAvailability();

	/*! \brief Set 
	 */
	void setDateAvailability(TopPinsAnalyticsResponseDateAvailability date_availability);
	/*! \brief Get 
	 */
	std::list<TopPinsAnalyticsResponsePinsItems> getPins();

	/*! \brief Set 
	 */
	void setPins(std::list<TopPinsAnalyticsResponsePinsItems> pins);
	/*! \brief Get 
	 */
	TopPinsSortBy getSortBy();

	/*! \brief Set 
	 */
	void setSortBy(TopPinsSortBy sort_by);


    private:
    TopPinsAnalyticsResponseDateAvailability date_availability;
    std::list<TopPinsAnalyticsResponsePinsItems> pins;
    TopPinsSortBy sort_by;
};
}

#endif /* TINY_CPP_CLIENT_TopPinsAnalyticsResponse_H_ */
