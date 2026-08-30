/*
 * CatalogsHotelReportStatsParameters.h
 *
 * Parameters for hotel report
 */

#ifndef _CatalogsHotelReportStatsParameters_H_
#define _CatalogsHotelReportStatsParameters_H_


#include <string>
#include "CatalogsHotelReportStatsParametersReport.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Parameters for hotel report
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelReportStatsParameters : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelReportStatsParameters();
	CatalogsHotelReportStatsParameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelReportStatsParameters();

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

#endif /* _CatalogsHotelReportStatsParameters_H_ */
