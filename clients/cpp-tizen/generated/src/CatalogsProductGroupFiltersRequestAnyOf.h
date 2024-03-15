/*
 * CatalogsProductGroupFiltersRequest_anyOf.h
 *
 * 
 */

#ifndef _CatalogsProductGroupFiltersRequest_anyOf_H_
#define _CatalogsProductGroupFiltersRequest_anyOf_H_


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

class CatalogsProductGroupFiltersRequest_anyOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupFiltersRequest_anyOf();
	CatalogsProductGroupFiltersRequest_anyOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupFiltersRequest_anyOf();

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

#endif /* _CatalogsProductGroupFiltersRequest_anyOf_H_ */
