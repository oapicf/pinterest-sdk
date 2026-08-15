
/*
 * TopVideoPinsAnalyticsResponse_pins_inner.h
 *
 * Array with metrics, status, and pin id for the requested metric
 */

#ifndef TINY_CPP_CLIENT_TopVideoPinsAnalyticsResponse_pins_inner_H_
#define TINY_CPP_CLIENT_TopVideoPinsAnalyticsResponse_pins_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DataStatus.h"
#include <map>

namespace Tiny {


/*! \brief Array with metrics, status, and pin id for the requested metric
 *
 *  \ingroup Models
 *
 */

class TopVideoPinsAnalyticsResponse_pins_inner{
public:

    /*! \brief Constructor.
	 */
    TopVideoPinsAnalyticsResponse_pins_inner();
    TopVideoPinsAnalyticsResponse_pins_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TopVideoPinsAnalyticsResponse_pins_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Map<std::string, std::string> getDataStatus();

	/*! \brief Set 
	 */
	void setDataStatus(Map <std::string, std::string> data_status);
	/*! \brief Get The metric name and daily value for each requested metric
	 */
	Map<std::string, std::string> getMetrics();

	/*! \brief Set The metric name and daily value for each requested metric
	 */
	void setMetrics(Map <std::string, std::string> metrics);
	/*! \brief Get The pin id
	 */
	std::string getPinId();

	/*! \brief Set The pin id
	 */
	void setPinId(std::string  pin_id);


    private:
    Map<std::string, std::string> data_status;
    Map<std::string, std::string> metrics;
    std::string pin_id{};
};
}

#endif /* TINY_CPP_CLIENT_TopVideoPinsAnalyticsResponse_pins_inner_H_ */
