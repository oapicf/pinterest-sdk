
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
	void setDataStatus(DataStatus data_status);
	/*! \brief Get Metrics date (UTC): YYYY-MM-DD.
	 */
	std::string getDate();

	/*! \brief Set Metrics date (UTC): YYYY-MM-DD.
	 */
	void setDate(std::string date);
	/*! \brief Get 
	 */
	std::map<std::string, long> getMetrics();

	/*! \brief Set 
	 */
	void setMetrics(std::map<std::string, long> metrics);


    private:
    DataStatus data_status;
    std::string date{};
    std::map<std::string, long> metrics;
};
}

#endif /* TINY_CPP_CLIENT_AnalyticsDailyMetrics_H_ */
