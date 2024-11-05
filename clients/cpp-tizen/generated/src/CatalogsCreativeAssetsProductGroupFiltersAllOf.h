/*
 * CatalogsCreativeAssetsProductGroupFiltersAllOf.h
 *
 * 
 */

#ifndef _CatalogsCreativeAssetsProductGroupFiltersAllOf_H_
#define _CatalogsCreativeAssetsProductGroupFiltersAllOf_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroupFilterKeys.h"
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

class CatalogsCreativeAssetsProductGroupFiltersAllOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsProductGroupFiltersAllOf();
	CatalogsCreativeAssetsProductGroupFiltersAllOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsProductGroupFiltersAllOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsCreativeAssetsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsCreativeAssetsProductGroupFilterKeys> all_of);

private:
	std::list <CatalogsCreativeAssetsProductGroupFilterKeys>all_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsProductGroupFiltersAllOf_H_ */
