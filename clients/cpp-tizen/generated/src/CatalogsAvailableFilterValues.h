/*
 * CatalogsAvailableFilterValues.h
 *
 * Object holding available filter values for each filter key
 */

#ifndef _CatalogsAvailableFilterValues_H_
#define _CatalogsAvailableFilterValues_H_


#include <string>
#include "CatalogsCreativeAssetsAvailableFilterValues.h"
#include "CatalogsHotelAvailableFilterValues.h"
#include "CatalogsRetailAvailableFilterValues.h"
#include "Catalogs_creative_assets_filter_values_map.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object holding available filter values for each filter key
 *
 *  \ingroup Models
 *
 */

class CatalogsAvailableFilterValues : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsAvailableFilterValues();
	CatalogsAvailableFilterValues(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsAvailableFilterValues();

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
	Catalogs_creative_assets_filter_values_map getFilterValues();

	/*! \brief Set 
	 */
	void setFilterValues(Catalogs_creative_assets_filter_values_map  filter_values);

private:
	std::string catalog_type;
	Catalogs_creative_assets_filter_values_map filter_values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsAvailableFilterValues_H_ */
