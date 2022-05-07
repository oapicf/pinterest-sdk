/*
 * ProductType1Filter.h
 *
 * 
 */

#ifndef _ProductType1Filter_H_
#define _ProductType1Filter_H_


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

class ProductType1Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductType1Filter();
	ProductType1Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductType1Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_1);

private:
	CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_1;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductType1Filter_H_ */
