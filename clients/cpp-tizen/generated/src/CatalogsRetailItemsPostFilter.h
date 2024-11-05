/*
 * CatalogsRetailItemsPostFilter.h
 *
 * 
 */

#ifndef _CatalogsRetailItemsPostFilter_H_
#define _CatalogsRetailItemsPostFilter_H_


#include <string>
#include <list>
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

class CatalogsRetailItemsPostFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailItemsPostFilter();
	CatalogsRetailItemsPostFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailItemsPostFilter();

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
	std::list<std::string> getItemIds();

	/*! \brief Set 
	 */
	void setItemIds(std::list <std::string> item_ids);
	/*! \brief Get Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
	 */
	void setCatalogId(std::string  catalog_id);

private:
	std::string catalog_type;
	std::list <std::string>item_ids;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailItemsPostFilter_H_ */
