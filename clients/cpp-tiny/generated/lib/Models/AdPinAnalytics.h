
/*
 * AdPinAnalytics.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdPinAnalytics_H_
#define TINY_CPP_CLIENT_AdPinAnalytics_H_


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

class AdPinAnalytics{
public:

    /*! \brief Constructor.
	 */
    AdPinAnalytics();
    AdPinAnalytics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdPinAnalytics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	Date getDATE();

	/*! \brief Set Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	void setDATE(Date  dATE);
	/*! \brief Get The ID of the pin that the metric belongs to.
	 */
	std::string getPINID();

	/*! \brief Set The ID of the pin that the metric belongs to.
	 */
	void setPINID(std::string  pIN_ID);


    private:
    Date dATE;
    std::string pIN_ID{};
};
}

#endif /* TINY_CPP_CLIENT_AdPinAnalytics_H_ */
