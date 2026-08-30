/*
 * NotificationPostRequest.h
 *
 * Notification request body. Can be either a batch of notification objects or a single notification object.
 */

#ifndef _NotificationPostRequest_H_
#define _NotificationPostRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Notification request body. Can be either a batch of notification objects or a single notification object.
 *
 *  \ingroup Models
 *
 */

class NotificationPostRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	NotificationPostRequest();
	NotificationPostRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NotificationPostRequest();

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

#endif /* _NotificationPostRequest_H_ */
