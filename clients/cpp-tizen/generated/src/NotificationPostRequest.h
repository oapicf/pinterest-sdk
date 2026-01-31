/*
 * Notification_post_request.h
 *
 * Any valid JSON object
 */

#ifndef _Notification_post_request_H_
#define _Notification_post_request_H_


#include <string>
#include "AnyType.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Any valid JSON object
 *
 *  \ingroup Models
 *
 */

class Notification_post_request : public Object {
public:
	/*! \brief Constructor.
	 */
	Notification_post_request();
	Notification_post_request(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Notification_post_request();

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

#endif /* _Notification_post_request_H_ */
