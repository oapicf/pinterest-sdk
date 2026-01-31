#ifndef _ConversionsManager_H_
#define _ConversionsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdvertiserDefinedEventsResponse.h"
#include "Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Conversions Conversions
 * \ingroup Operations
 *  @{
 */
class ConversionsManager {
public:
	ConversionsManager();
	virtual ~ConversionsManager();

/*! \brief Get advertiser defined events. *Synchronous*
 *
 * <p>Get advertiser defined events for the given ad account.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advertiserDefinedEventsGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(AdvertiserDefinedEventsResponse, Error, void* )
	, void* userData);

/*! \brief Get advertiser defined events. *Asynchronous*
 *
 * <p>Get advertiser defined events for the given ad account.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advertiserDefinedEventsGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(AdvertiserDefinedEventsResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* ConversionsManager_H_ */
