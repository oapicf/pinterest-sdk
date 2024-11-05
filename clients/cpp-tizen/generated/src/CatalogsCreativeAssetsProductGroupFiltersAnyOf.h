/*
 * CatalogsCreativeAssetsProductGroupFiltersAnyOf.h
 *
 * 
 */

#ifndef _CatalogsCreativeAssetsProductGroupFiltersAnyOf_H_
#define _CatalogsCreativeAssetsProductGroupFiltersAnyOf_H_


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

class CatalogsCreativeAssetsProductGroupFiltersAnyOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsProductGroupFiltersAnyOf();
	CatalogsCreativeAssetsProductGroupFiltersAnyOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsProductGroupFiltersAnyOf();

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

private:
	std::list <CatalogsCreativeAssetsProductGroupFilterKeys>any_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsProductGroupFiltersAnyOf_H_ */
