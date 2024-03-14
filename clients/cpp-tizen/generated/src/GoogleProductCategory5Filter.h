/*
 * GoogleProductCategory5Filter.h
 *
 * 
 */

#ifndef _GoogleProductCategory5Filter_H_
#define _GoogleProductCategory5Filter_H_


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

class GoogleProductCategory5Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	GoogleProductCategory5Filter();
	GoogleProductCategory5Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoogleProductCategory5Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_5);

private:
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_5;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoogleProductCategory5Filter_H_ */
