/*
 * GoogleProductCategory4Filter.h
 *
 * 
 */

#ifndef _GoogleProductCategory4Filter_H_
#define _GoogleProductCategory4Filter_H_


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

class GoogleProductCategory4Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	GoogleProductCategory4Filter();
	GoogleProductCategory4Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoogleProductCategory4Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_4);

private:
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_4;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoogleProductCategory4Filter_H_ */
