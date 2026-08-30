/*
 * CatalogsRetailAvailableFilterValues.h
 *
 * 
 */

#ifndef _CatalogsRetailAvailableFilterValues_H_
#define _CatalogsRetailAvailableFilterValues_H_


#include <string>
#include "CatalogsRetailFilterValuesMap.h"
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

class CatalogsRetailAvailableFilterValues : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailAvailableFilterValues();
	CatalogsRetailAvailableFilterValues(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailAvailableFilterValues();

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
	CatalogsRetailFilterValuesMap getFilterValues();

	/*! \brief Set 
	 */
	void setFilterValues(CatalogsRetailFilterValuesMap  filter_values);

private:
	std::string catalog_type;
	CatalogsRetailFilterValuesMap filter_values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailAvailableFilterValues_H_ */
