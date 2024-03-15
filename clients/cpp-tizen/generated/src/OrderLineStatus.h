/*
 * OrderLineStatus.h
 *
 * Order Line Status
 */

#ifndef _OrderLineStatus_H_
#define _OrderLineStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Order Line Status
 *
 *  \ingroup Models
 *
 */

class OrderLineStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderLineStatus();
	OrderLineStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderLineStatus();

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

#endif /* _OrderLineStatus_H_ */
