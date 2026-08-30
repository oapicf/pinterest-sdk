/*
 * CustomerListStatus.h
 *
 * Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
 */

#ifndef _CustomerListStatus_H_
#define _CustomerListStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
 *
 *  \ingroup Models
 *
 */

class CustomerListStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerListStatus();
	CustomerListStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerListStatus();

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

#endif /* _CustomerListStatus_H_ */
