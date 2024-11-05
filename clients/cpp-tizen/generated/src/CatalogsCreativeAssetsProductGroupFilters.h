/*
 * CatalogsCreativeAssetsProductGroupFilters.h
 *
 * Object holding a group of filters for a creative assets product group
 */

#ifndef _CatalogsCreativeAssetsProductGroupFilters_H_
#define _CatalogsCreativeAssetsProductGroupFilters_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroupFilterKeys.h"
#include "CatalogsCreativeAssetsProductGroupFiltersAllOf.h"
#include "CatalogsCreativeAssetsProductGroupFiltersAnyOf.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object holding a group of filters for a creative assets product group
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductGroupFilters : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsProductGroupFilters();
	CatalogsCreativeAssetsProductGroupFilters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsProductGroupFilters();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsCreativeAssetsProductGroupFilterKeys> getAnyOf();

	/*! \brief Set 
	 */
	void setAnyOf(std::list <CatalogsCreativeAssetsProductGroupFilterKeys> any_of);
	/*! \brief Get 
	 */
	std::list<CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsCreativeAssetsProductGroupFilterKeys> all_of);

private:
	std::list <CatalogsCreativeAssetsProductGroupFilterKeys>any_of;
	std::list <CatalogsCreativeAssetsProductGroupFilterKeys>all_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsProductGroupFilters_H_ */
