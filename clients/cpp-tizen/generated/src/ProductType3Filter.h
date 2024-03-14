/*
 * ProductType3Filter.h
 *
 * 
 */

#ifndef _ProductType3Filter_H_
#define _ProductType3Filter_H_


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

class ProductType3Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductType3Filter();
	ProductType3Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductType3Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE3();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_3);

private:
	CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_3;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductType3Filter_H_ */
