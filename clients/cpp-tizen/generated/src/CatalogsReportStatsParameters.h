/*
 * CatalogsReportStatsParameters.h
 *
 * Report stats parameters
 */

#ifndef _CatalogsReportStatsParameters_H_
#define _CatalogsReportStatsParameters_H_


#include <string>
#include "CatalogsHotelReportStatsParameters.h"
#include "CatalogsHotelReportStatsParametersReport.h"
#include "CatalogsRetailReportStatsParameters.h"
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

class CatalogsReportStatsParameters : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsReportStatsParameters();
	CatalogsReportStatsParameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsReportStatsParameters();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	CatalogsHotelReportStatsParametersReport getReport();

	/*! \brief Set 
	 */
	void setReport(CatalogsHotelReportStatsParametersReport  report);

private:
	std::string catalog_type;
	CatalogsHotelReportStatsParametersReport report;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsReportStatsParameters_H_ */
