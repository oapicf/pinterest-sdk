/*
 * VerticalProductCategory.h
 *
 * List of verticals for product categories.
 */

#ifndef _VerticalProductCategory_H_
#define _VerticalProductCategory_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief List of verticals for product categories.
 *
 *  \ingroup Models
 *
 */

class VerticalProductCategory : public Object {
public:
	/*! \brief Constructor.
	 */
	VerticalProductCategory();
	VerticalProductCategory(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VerticalProductCategory();

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

#endif /* _VerticalProductCategory_H_ */
