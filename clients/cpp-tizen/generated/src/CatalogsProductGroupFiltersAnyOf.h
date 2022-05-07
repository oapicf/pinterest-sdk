/*
 * CatalogsProductGroupFiltersAnyOf.h
 *
 * 
 */

#ifndef _CatalogsProductGroupFiltersAnyOf_H_
#define _CatalogsProductGroupFiltersAnyOf_H_


#include <string>
#include "CatalogsProductGroupFilterKeys.h"
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

class CatalogsProductGroupFiltersAnyOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupFiltersAnyOf();
	CatalogsProductGroupFiltersAnyOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupFiltersAnyOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAnyOf();

	/*! \brief Set 
	 */
	void setAnyOf(std::list <CatalogsProductGroupFilterKeys> any_of);

private:
	std::list <CatalogsProductGroupFilterKeys>any_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupFiltersAnyOf_H_ */
