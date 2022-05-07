/*
 * CatalogsProductGroupCurrencyCriteria.h
 *
 * 
 */

#ifndef _CatalogsProductGroupCurrencyCriteria_H_
#define _CatalogsProductGroupCurrencyCriteria_H_


#include <string>
#include "NonNullableCatalogsCurrency.h"
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

class CatalogsProductGroupCurrencyCriteria : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupCurrencyCriteria();
	CatalogsProductGroupCurrencyCriteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupCurrencyCriteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	NonNullableCatalogsCurrency getValues();

	/*! \brief Set 
	 */
	void setValues(NonNullableCatalogsCurrency  values);
	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);

private:
	NonNullableCatalogsCurrency values;
	bool negated;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupCurrencyCriteria_H_ */
