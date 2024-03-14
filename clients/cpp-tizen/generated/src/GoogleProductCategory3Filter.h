/*
 * GoogleProductCategory3Filter.h
 *
 * 
 */

#ifndef _GoogleProductCategory3Filter_H_
#define _GoogleProductCategory3Filter_H_


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

class GoogleProductCategory3Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	GoogleProductCategory3Filter();
	GoogleProductCategory3Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoogleProductCategory3Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_3);

private:
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_3;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoogleProductCategory3Filter_H_ */
