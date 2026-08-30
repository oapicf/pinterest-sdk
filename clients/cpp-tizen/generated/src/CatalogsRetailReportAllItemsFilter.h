/*
 * CatalogsRetailReportAllItemsFilter.h
 *
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 */

#ifndef _CatalogsRetailReportAllItemsFilter_H_
#define _CatalogsRetailReportAllItemsFilter_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailReportAllItemsFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailReportAllItemsFilter();
	CatalogsRetailReportAllItemsFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailReportAllItemsFilter();

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
	/*! \brief Get Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
	 */
	std::string getProductGroupId();

	/*! \brief Set Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
	 */
	void setProductGroupId(std::string  product_group_id);
	/*! \brief Get 
	 */
	std::string getReportType();

	/*! \brief Set 
	 */
	void setReportType(std::string  report_type);

private:
	std::string catalog_id;
	std::string product_group_id;
	std::string report_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailReportAllItemsFilter_H_ */
