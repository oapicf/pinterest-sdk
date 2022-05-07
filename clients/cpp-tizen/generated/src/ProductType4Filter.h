/*
 * ProductType4Filter.h
 *
 * 
 */

#ifndef _ProductType4Filter_H_
#define _ProductType4Filter_H_


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

class ProductType4Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductType4Filter();
	ProductType4Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductType4Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4();

	/*! \brief Set 
	 */
	void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_4);

private:
	CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_4;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductType4Filter_H_ */
