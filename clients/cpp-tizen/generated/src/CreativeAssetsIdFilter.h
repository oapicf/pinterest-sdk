/*
 * CreativeAssetsIdFilter.h
 *
 * 
 */

#ifndef _CreativeAssetsIdFilter_H_
#define _CreativeAssetsIdFilter_H_


#include <string>
#include "CatalogsProductGroupMultipleStringCriteria.h"
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

class CreativeAssetsIdFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CreativeAssetsIdFilter();
	CreativeAssetsIdFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreativeAssetsIdFilter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCREATIVEASSETSID();

	/*! \brief Set 
	 */
	void setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria  cREATIVE_ASSETS_ID);

private:
	CatalogsProductGroupMultipleStringCriteria cREATIVE_ASSETS_ID;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreativeAssetsIdFilter_H_ */
