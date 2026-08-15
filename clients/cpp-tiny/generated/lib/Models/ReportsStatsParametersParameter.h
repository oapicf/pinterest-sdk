
/*
 * Reports_stats_parameters_parameter.h
 *
 * Report stats parameters
 */

#ifndef TINY_CPP_CLIENT_Reports_stats_parameters_parameter_H_
#define TINY_CPP_CLIENT_Reports_stats_parameters_parameter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelReportStatsParameters.h"
#include "CatalogsHotelReportStatsParameters_report.h"
#include "CatalogsRetailReportStatsParameters.h"
#include "CatalogsType.h"

namespace Tiny {


/*! \brief Report stats parameters
 *
 *  \ingroup Models
 *
 */

class Reports_stats_parameters_parameter{
public:

    /*! \brief Constructor.
	 */
    Reports_stats_parameters_parameter();
    Reports_stats_parameters_parameter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Reports_stats_parameters_parameter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get 
	 */
	CatalogsHotelReportStatsParameters_report getReport();

	/*! \brief Set 
	 */
	void setReport(CatalogsHotelReportStatsParameters_report  report);


    private:
    CatalogsType catalog_type;
    CatalogsHotelReportStatsParameters_report report;
};
}

#endif /* TINY_CPP_CLIENT_Reports_stats_parameters_parameter_H_ */
