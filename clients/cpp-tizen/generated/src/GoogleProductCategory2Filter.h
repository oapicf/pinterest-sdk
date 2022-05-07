/*
 * GoogleProductCategory2Filter.h
 *
 * 
 */

#ifndef _GoogleProductCategory2Filter_H_
#define _GoogleProductCategory2Filter_H_


#include <string>
#include "CatalogsProductGroupMultipleStringListCriteria.h"
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

class GoogleProductCategory2Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	GoogleProductCategory2Filter();
	GoogleProductCategory2Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoogleProductCategory2Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_2);

private:
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_2;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoogleProductCategory2Filter_H_ */
