/*
 * GoogleProductCategory0Filter.h
 *
 * 
 */

#ifndef _GoogleProductCategory0Filter_H_
#define _GoogleProductCategory0Filter_H_


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

class GoogleProductCategory0Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	GoogleProductCategory0Filter();
	GoogleProductCategory0Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoogleProductCategory0Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0();

	/*! \brief Set 
	 */
	void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_0);

private:
	CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoogleProductCategory0Filter_H_ */
