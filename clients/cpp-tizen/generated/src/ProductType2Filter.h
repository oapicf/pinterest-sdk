/*
 * ProductType2Filter.h
 *
 * 
 */

#ifndef _ProductType2Filter_H_
#define _ProductType2Filter_H_


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

class ProductType2Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductType2Filter();
	ProductType2Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductType2Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_2);

private:
	CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_2;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductType2Filter_H_ */
