/*
 * GoogleProductCategory1Filter.h
 *
 * 
 */

#ifndef _GoogleProductCategory1Filter_H_
#define _GoogleProductCategory1Filter_H_


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

class GoogleProductCategory1Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	GoogleProductCategory1Filter();
	GoogleProductCategory1Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoogleProductCategory1Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_1);

private:
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_1;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoogleProductCategory1Filter_H_ */
