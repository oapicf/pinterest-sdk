/*
 * ProductType0Filter.h
 *
 * 
 */

#ifndef _ProductType0Filter_H_
#define _ProductType0Filter_H_


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

class ProductType0Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductType0Filter();
	ProductType0Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductType0Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE0();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_0);

private:
	CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_0;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductType0Filter_H_ */
