#ifndef _ConversionsManager_H_
#define _ConversionsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdvertiserDefinedEventsCreateRequest.h"
#include "Advertiser_defined_events_create_200_response.h"
#include "Advertiser_defined_events_get_200_response.h"
#include "Pinterest.Lib.Error.h"
#include <list>
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

/*! \brief Create advertiser defined events. *Synchronous*
 *
 * Map advertiser defined events to standard events for the given ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param advertiserDefinedEventsCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advertiserDefinedEventsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdvertiserDefinedEventsCreateRequest> advertiserDefinedEventsCreateRequest, 
	void(* handler)(Advertiser_defined_events_create_200_response, Error, void* )
	, void* userData);

/*! \brief Create advertiser defined events. *Asynchronous*
 *
 * Map advertiser defined events to standard events for the given ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param advertiserDefinedEventsCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advertiserDefinedEventsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdvertiserDefinedEventsCreateRequest> advertiserDefinedEventsCreateRequest, 
	void(* handler)(Advertiser_defined_events_create_200_response, Error, void* )
	, void* userData);


/*! \brief Delete advertiser defined events. *Synchronous*
 *
 * Untrack advertiser defined events for the given ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param eventNames List of event names to delete *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advertiserDefinedEventsDeleteSync(char * accessToken,
	std::string adAccountId, std::list<std::string> eventNames, 
	void(* handler)(Advertiser_defined_events_create_200_response, Error, void* )
	, void* userData);

/*! \brief Delete advertiser defined events. *Asynchronous*
 *
 * Untrack advertiser defined events for the given ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param eventNames List of event names to delete *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advertiserDefinedEventsDeleteAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> eventNames, 
	void(* handler)(Advertiser_defined_events_create_200_response, Error, void* )
	, void* userData);


/*! \brief Get advertiser defined events. *Synchronous*
 *
 * Get advertiser defined events for the given ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advertiserDefinedEventsGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(Advertiser_defined_events_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get advertiser defined events. *Asynchronous*
 *
 * Get advertiser defined events for the given ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advertiserDefinedEventsGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(Advertiser_defined_events_get_200_response, Error, void* )
	, void* userData);


/*! \brief Update advertiser defined events. *Synchronous*
 *
 * Update advertiser defined event names or mappings for the given ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param advertiserDefinedEventsCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advertiserDefinedEventsUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdvertiserDefinedEventsCreateRequest> advertiserDefinedEventsCreateRequest, 
	void(* handler)(Advertiser_defined_events_create_200_response, Error, void* )
	, void* userData);

/*! \brief Update advertiser defined events. *Asynchronous*
 *
 * Update advertiser defined event names or mappings for the given ad account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param advertiserDefinedEventsCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advertiserDefinedEventsUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdvertiserDefinedEventsCreateRequest> advertiserDefinedEventsCreateRequest, 
	void(* handler)(Advertiser_defined_events_create_200_response, Error, void* )
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
