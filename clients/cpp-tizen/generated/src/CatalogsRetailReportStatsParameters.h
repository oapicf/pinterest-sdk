/*
 * CatalogsRetailReportStatsParameters.h
 *
 * Parameters for retail report
 */

#ifndef _CatalogsRetailReportStatsParameters_H_
#define _CatalogsRetailReportStatsParameters_H_


#include <string>
#include "CatalogsHotelReportStatsParameters_report.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Parameters for retail report
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailReportStatsParameters : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailReportStatsParameters();
	CatalogsRetailReportStatsParameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailReportStatsParameters();

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
	CatalogsHotelReportStatsParameters_report getReport();

	/*! \brief Set 
	 */
	void setReport(CatalogsHotelReportStatsParameters_report  report);

private:
	std::string catalog_type;
	CatalogsHotelReportStatsParameters_report report;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailReportStatsParameters_H_ */
