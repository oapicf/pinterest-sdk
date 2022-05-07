/*
 * CurrencyFilter.h
 *
 * 
 */

#ifndef _CurrencyFilter_H_
#define _CurrencyFilter_H_


#include <string>
#include "CatalogsProductGroupCurrencyCriteria.h"
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

class CurrencyFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CurrencyFilter();
	CurrencyFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CurrencyFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupCurrencyCriteria getCURRENCY();

	/*! \brief Set 
	 */
	void setCURRENCY(CatalogsProductGroupCurrencyCriteria  cURRENCY);

private:
	CatalogsProductGroupCurrencyCriteria cURRENCY;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CurrencyFilter_H_ */
