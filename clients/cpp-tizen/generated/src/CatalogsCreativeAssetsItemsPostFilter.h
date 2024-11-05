/*
 * CatalogsCreativeAssetsItemsPostFilter.h
 *
 * 
 */

#ifndef _CatalogsCreativeAssetsItemsPostFilter_H_
#define _CatalogsCreativeAssetsItemsPostFilter_H_


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

class CatalogsCreativeAssetsItemsPostFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsItemsPostFilter();
	CatalogsCreativeAssetsItemsPostFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsItemsPostFilter();

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
	std::list<std::string> getCreativeAssetsIds();

	/*! \brief Set 
	 */
	void setCreativeAssetsIds(std::list <std::string> creative_assets_ids);
	/*! \brief Get Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	void setCatalogId(std::string  catalog_id);

private:
	std::string catalog_type;
	std::list <std::string>creative_assets_ids;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsItemsPostFilter_H_ */
