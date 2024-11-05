/*
 * CatalogsRetailReportParameters.h
 *
 * Parameters for retail report
 */

#ifndef _CatalogsRetailReportParameters_H_
#define _CatalogsRetailReportParameters_H_


#include <string>
#include "CatalogsHotelReportParameters_report.h"
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

class CatalogsRetailReportParameters : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailReportParameters();
	CatalogsRetailReportParameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailReportParameters();

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
	CatalogsHotelReportParameters_report getReport();

	/*! \brief Set 
	 */
	void setReport(CatalogsHotelReportParameters_report  report);

private:
	std::string catalog_type;
	CatalogsHotelReportParameters_report report;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailReportParameters_H_ */
