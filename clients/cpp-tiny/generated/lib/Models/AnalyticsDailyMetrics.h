
/*
 * AnalyticsDailyMetrics.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AnalyticsDailyMetrics_H_
#define TINY_CPP_CLIENT_AnalyticsDailyMetrics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DataStatus.h"
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AnalyticsDailyMetrics{
public:

    /*! \brief Constructor.
	 */
    AnalyticsDailyMetrics();
    AnalyticsDailyMetrics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AnalyticsDailyMetrics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	DataStatus getDataStatus();

	/*! \brief Set 
	 */
	void setDataStatus(DataStatus  data_status);
	/*! \brief Get Metrics date (UTC): YYYY-MM-DD.
	 */
	std::string getDate();

	/*! \brief Set Metrics date (UTC): YYYY-MM-DD.
	 */
	void setDate(std::string  date);
	/*! \brief Get The metric name and daily value for each requested metric
	 */
	Map<std::string, std::string> getMetrics();

	/*! \brief Set The metric name and daily value for each requested metric
	 */
	void setMetrics(Map <std::string, std::string> metrics);


    private:
    DataStatus data_status;
    std::string date{};
    Map<std::string, std::string> metrics;
};
}

#endif /* TINY_CPP_CLIENT_AnalyticsDailyMetrics_H_ */
