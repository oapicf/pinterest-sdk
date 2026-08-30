#ifndef _NotificationManager_H_
#define _NotificationManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "NotificationPostRequest.h"
#include "NotificationResponse.h"
#include "Pinterest.Lib.Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Notification Notification
 * \ingroup Operations
 *  @{
 */
class NotificationManager {
public:
	NotificationManager();
	virtual ~NotificationManager();

/*! \brief Receive notifications from external partners.. *Synchronous*
 *
 * Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.
 * \param notificationPostRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool notificationPostSync(char * accessToken,
	std::shared_ptr<NotificationPostRequest> notificationPostRequest, 
	void(* handler)(NotificationResponse, Error, void* )
	, void* userData);

/*! \brief Receive notifications from external partners.. *Asynchronous*
 *
 * Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.
 * \param notificationPostRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool notificationPostAsync(char * accessToken,
	std::shared_ptr<NotificationPostRequest> notificationPostRequest, 
	void(* handler)(NotificationResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* NotificationManager_H_ */
