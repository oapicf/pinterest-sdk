/*
 * CatalogsReportAllItemsFilter.h
 *
 * 
 */

#ifndef _CatalogsReportAllItemsFilter_H_
#define _CatalogsReportAllItemsFilter_H_


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

class CatalogsReportAllItemsFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsReportAllItemsFilter();
	CatalogsReportAllItemsFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsReportAllItemsFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of a catalog. If not given, oldest catalog will be used
	 */
	std::string getCatalogId();

	/*! \brief Set Unique identifier of a catalog. If not given, oldest catalog will be used
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	std::string getReportType();

	/*! \brief Set 
	 */
	void setReportType(std::string  report_type);

private:
	std::string catalog_id;
	std::string report_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsReportAllItemsFilter_H_ */
