/*
 * CatalogsProductGroupMultipleCountriesCriteria.h
 *
 * 
 */

#ifndef _CatalogsProductGroupMultipleCountriesCriteria_H_
#define _CatalogsProductGroupMultipleCountriesCriteria_H_


#include <string>
#include "Country.h"
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

class CatalogsProductGroupMultipleCountriesCriteria : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupMultipleCountriesCriteria();
	CatalogsProductGroupMultipleCountriesCriteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupMultipleCountriesCriteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Country> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <Country> values);
	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);

private:
	std::list <Country>values;
	bool negated;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupMultipleCountriesCriteria_H_ */
