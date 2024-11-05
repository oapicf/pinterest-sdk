/*
 * CatalogsReportParameters.h
 *
 * Report parameters
 */

#ifndef _CatalogsReportParameters_H_
#define _CatalogsReportParameters_H_


#include <string>
#include "CatalogsHotelReportParameters.h"
#include "CatalogsHotelReportParameters_report.h"
#include "CatalogsRetailReportParameters.h"
#include "CatalogsType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Report parameters
 *
 *  \ingroup Models
 *
 */

class CatalogsReportParameters : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsReportParameters();
	CatalogsReportParameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsReportParameters();

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
	CatalogsHotelReportParameters_report getReport();

	/*! \brief Set 
	 */
	void setReport(CatalogsHotelReportParameters_report  report);

private:
	CatalogsType catalog_type;
	CatalogsHotelReportParameters_report report;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsReportParameters_H_ */
