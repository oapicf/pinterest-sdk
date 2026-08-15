
/*
 * AdAccountAnalyticsResponse_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccountAnalyticsResponse_inner_H_
#define TINY_CPP_CLIENT_AdAccountAnalyticsResponse_inner_H_


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

class AdAccountAnalyticsResponse_inner{
public:

    /*! \brief Constructor.
	 */
    AdAccountAnalyticsResponse_inner();
    AdAccountAnalyticsResponse_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountAnalyticsResponse_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string aD_ACCOUNT_ID{};
    Date dATE;
};
}

#endif /* TINY_CPP_CLIENT_AdAccountAnalyticsResponse_inner_H_ */
