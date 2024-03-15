/*
 * CountryFilter.h
 *
 * 
 */

#ifndef _CountryFilter_H_
#define _CountryFilter_H_


#include <string>
#include "CatalogsProductGroupMultipleCountriesCriteria.h"
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

class CountryFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CountryFilter();
	CountryFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CountryFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleCountriesCriteria getCOUNTRY();

	/*! \brief Set 
	 */
	void setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria  cOUNTRY);

private:
	CatalogsProductGroupMultipleCountriesCriteria cOUNTRY;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CountryFilter_H_ */
