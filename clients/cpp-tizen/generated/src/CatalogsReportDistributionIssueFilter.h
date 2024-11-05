/*
 * CatalogsReportDistributionIssueFilter.h
 *
 * 
 */

#ifndef _CatalogsReportDistributionIssueFilter_H_
#define _CatalogsReportDistributionIssueFilter_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsReportDistributionIssueFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsReportDistributionIssueFilter();
	CatalogsReportDistributionIssueFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsReportDistributionIssueFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getReportType();

	/*! \brief Set 
	 */
	void setReportType(std::string  report_type);
	/*! \brief Get Unique identifier of a catalog. If not given, oldest catalog will be used
	 */
	std::string getCatalogId();

	/*! \brief Set Unique identifier of a catalog. If not given, oldest catalog will be used
	 */
	void setCatalogId(std::string  catalog_id);

private:
	std::string report_type;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsReportDistributionIssueFilter_H_ */
