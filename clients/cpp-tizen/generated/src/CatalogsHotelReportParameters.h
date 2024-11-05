/*
 * CatalogsHotelReportParameters.h
 *
 * Parameters for hotel report
 */

#ifndef _CatalogsHotelReportParameters_H_
#define _CatalogsHotelReportParameters_H_


#include <string>
#include "CatalogsHotelReportParameters_report.h"
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

class CatalogsHotelReportParameters : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelReportParameters();
	CatalogsHotelReportParameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelReportParameters();

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

#endif /* _CatalogsHotelReportParameters_H_ */
