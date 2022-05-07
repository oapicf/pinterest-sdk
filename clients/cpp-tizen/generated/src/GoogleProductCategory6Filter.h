/*
 * GoogleProductCategory6Filter.h
 *
 * 
 */

#ifndef _GoogleProductCategory6Filter_H_
#define _GoogleProductCategory6Filter_H_


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

class GoogleProductCategory6Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	GoogleProductCategory6Filter();
	GoogleProductCategory6Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoogleProductCategory6Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY6();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_6);

private:
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_6;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoogleProductCategory6Filter_H_ */
