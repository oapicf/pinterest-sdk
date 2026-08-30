/*
 * PinterestProductCategoriesFilter.h
 *
 * 
 */

#ifndef _PinterestProductCategoriesFilter_H_
#define _PinterestProductCategoriesFilter_H_


#include <string>
#include "CatalogsProductGroupMultiplePinterestProductCategoryCriteria.h"
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

class PinterestProductCategoriesFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	PinterestProductCategoriesFilter();
	PinterestProductCategoriesFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinterestProductCategoriesFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultiplePinterestProductCategoryCriteria getPINTERESTPRODUCTCATEGORIES();

	/*! \brief Set 
	 */
	void setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria  pINTEREST_PRODUCT_CATEGORIES);

private:
	CatalogsProductGroupMultiplePinterestProductCategoryCriteria pINTEREST_PRODUCT_CATEGORIES;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinterestProductCategoriesFilter_H_ */
