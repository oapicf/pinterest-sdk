/*
 * CatalogsProductGroupFiltersRequest.h
 *
 * Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 */

#ifndef _CatalogsProductGroupFiltersRequest_H_
#define _CatalogsProductGroupFiltersRequest_H_


#include <string>
#include "CatalogsProductGroupFilterKeys.h"
#include "CatalogsProductGroupFiltersRequest_anyOf.h"
#include "CatalogsProductGroupFiltersRequest_anyOf_1.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupFiltersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupFiltersRequest();
	CatalogsProductGroupFiltersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupFiltersRequest();

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
	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsProductGroupFilterKeys> all_of);

private:
	std::list <CatalogsProductGroupFilterKeys>any_of;
	std::list <CatalogsProductGroupFilterKeys>all_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupFiltersRequest_H_ */
