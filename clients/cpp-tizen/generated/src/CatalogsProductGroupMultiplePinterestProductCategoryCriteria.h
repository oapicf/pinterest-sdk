/*
 * CatalogsProductGroupMultiplePinterestProductCategoryCriteria.h
 *
 * 
 */

#ifndef _CatalogsProductGroupMultiplePinterestProductCategoryCriteria_H_
#define _CatalogsProductGroupMultiplePinterestProductCategoryCriteria_H_


#include <string>
#include "ProductCategoryEnum.h"
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

class CatalogsProductGroupMultiplePinterestProductCategoryCriteria : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupMultiplePinterestProductCategoryCriteria();
	CatalogsProductGroupMultiplePinterestProductCategoryCriteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupMultiplePinterestProductCategoryCriteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);
	/*! \brief Get 
	 */
	std::list<ProductCategoryEnum> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <ProductCategoryEnum> values);

private:
	bool negated;
	std::list <ProductCategoryEnum>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupMultiplePinterestProductCategoryCriteria_H_ */
