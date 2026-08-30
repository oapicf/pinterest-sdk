
/*
 * TopVideoPinsAnalyticsResponsePinsItems.h
 *
 * Array with metrics, status, and pin id for the requested metric
 */

#ifndef TINY_CPP_CLIENT_TopVideoPinsAnalyticsResponsePinsItems_H_
#define TINY_CPP_CLIENT_TopVideoPinsAnalyticsResponsePinsItems_H_


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

class TopVideoPinsAnalyticsResponsePinsItems{
public:

    /*! \brief Constructor.
	 */
    TopVideoPinsAnalyticsResponsePinsItems();
    TopVideoPinsAnalyticsResponsePinsItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TopVideoPinsAnalyticsResponsePinsItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::map<std::string, DataStatus> getDataStatus();

	/*! \brief Set 
	 */
	void setDataStatus(std::map<std::string, DataStatus> data_status);
	/*! \brief Get 
	 */
	std::map<std::string, long> getMetrics();

	/*! \brief Set 
	 */
	void setMetrics(std::map<std::string, long> metrics);
	/*! \brief Get The pin id
	 */
	std::string getPinId();

	/*! \brief Set The pin id
	 */
	void setPinId(std::string pin_id);


    private:
    std::map<std::string, DataStatus> data_status;
    std::map<std::string, long> metrics;
    std::string pin_id{};
};
}

#endif /* TINY_CPP_CLIENT_TopVideoPinsAnalyticsResponsePinsItems_H_ */
