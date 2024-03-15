/*
 * CatalogsProductGroupFiltersRequest_anyOf_1.h
 *
 * 
 */

#ifndef _CatalogsProductGroupFiltersRequest_anyOf_1_H_
#define _CatalogsProductGroupFiltersRequest_anyOf_1_H_


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

class CatalogsProductGroupFiltersRequest_anyOf_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupFiltersRequest_anyOf_1();
	CatalogsProductGroupFiltersRequest_anyOf_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupFiltersRequest_anyOf_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsProductGroupFilterKeys> all_of);

private:
	std::list <CatalogsProductGroupFilterKeys>all_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupFiltersRequest_anyOf_1_H_ */
