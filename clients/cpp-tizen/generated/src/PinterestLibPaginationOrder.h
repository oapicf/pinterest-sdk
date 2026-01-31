/*
 * Pinterest.Lib.PaginationOrder.h
 *
 * 
 */

#ifndef _Pinterest.Lib.PaginationOrder_H_
#define _Pinterest.Lib.PaginationOrder_H_


#include <string>
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

class Pinterest.Lib.PaginationOrder : public Object {
public:
	/*! \brief Constructor.
	 */
	Pinterest.Lib.PaginationOrder();
	Pinterest.Lib.PaginationOrder(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pinterest.Lib.PaginationOrder();

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

#endif /* _Pinterest.Lib.PaginationOrder_H_ */
