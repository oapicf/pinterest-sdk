
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
#include "TopPinsAnalyticsResponse_date_availability.h"
#include "TopVideoPinsAnalyticsResponse_pins_inner.h"
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
	TopPinsAnalyticsResponse_date_availability getDateAvailability();

	/*! \brief Set 
	 */
	void setDateAvailability(TopPinsAnalyticsResponse_date_availability  date_availability);
	/*! \brief Get 
	 */
	std::list<TopVideoPinsAnalyticsResponse_pins_inner> getPins();

	/*! \brief Set 
	 */
	void setPins(std::list <TopVideoPinsAnalyticsResponse_pins_inner> pins);
	/*! \brief Get 
	 */
	std::string getSortBy();

	/*! \brief Set 
	 */
	void setSortBy(std::string  sort_by);


    private:
    TopPinsAnalyticsResponse_date_availability date_availability;
    std::list<TopVideoPinsAnalyticsResponse_pins_inner> pins;
    std::string sort_by{};
};
}

#endif /* TINY_CPP_CLIENT_TopVideoPinsAnalyticsResponse_H_ */
