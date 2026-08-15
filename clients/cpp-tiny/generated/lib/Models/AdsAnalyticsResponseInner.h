
/*
 * AdsAnalyticsResponse_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdsAnalyticsResponse_inner_H_
#define TINY_CPP_CLIENT_AdsAnalyticsResponse_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "Date.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsResponse_inner{
public:

    /*! \brief Constructor.
	 */
    AdsAnalyticsResponse_inner();
    AdsAnalyticsResponse_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsAnalyticsResponse_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string aD_ID{};
    Date dATE;
};
}

#endif /* TINY_CPP_CLIENT_AdsAnalyticsResponse_inner_H_ */
