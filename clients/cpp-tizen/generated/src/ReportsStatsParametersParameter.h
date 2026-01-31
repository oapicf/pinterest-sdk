/*
 * Reports_stats_parameters_parameter.h
 *
 * Report stats parameters
 */

#ifndef _Reports_stats_parameters_parameter_H_
#define _Reports_stats_parameters_parameter_H_


#include <string>
#include "CatalogsHotelReportStatsParameters.h"
#include "CatalogsHotelReportStatsParameters_report.h"
#include "CatalogsRetailReportStatsParameters.h"
#include "CatalogsType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Report stats parameters
 *
 *  \ingroup Models
 *
 */

class Reports_stats_parameters_parameter : public Object {
public:
	/*! \brief Constructor.
	 */
	Reports_stats_parameters_parameter();
	Reports_stats_parameters_parameter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Reports_stats_parameters_parameter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _Reports_stats_parameters_parameter_H_ */
