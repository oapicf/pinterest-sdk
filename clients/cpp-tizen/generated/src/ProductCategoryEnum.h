/*
 * ProductCategoryEnum.h
 *
 * List of product category details
 */

#ifndef _ProductCategoryEnum_H_
#define _ProductCategoryEnum_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief List of product category details
 *
 *  \ingroup Models
 *
 */

class ProductCategoryEnum : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductCategoryEnum();
	ProductCategoryEnum(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductCategoryEnum();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductCategoryEnum_H_ */
