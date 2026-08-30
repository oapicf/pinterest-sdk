#ifndef _MsotEventsManager_H_
#define _MsotEventsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "ConversionMSOTEventsCreate.h"
#include "Pinterest.Lib.Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup MsotEvents MsotEvents
 * \ingroup Operations
 *  @{
 */
class MsotEventsManager {
public:
	MsotEventsManager();
	virtual ~MsotEventsManager();

/*! \brief Send Measurement Source Of Truth (MSOT) attributed conversion events. *Synchronous*
 *
 * **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionMSOTEventsCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool msotEventsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionMSOTEventsCreate> conversionMSOTEventsCreate, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Send Measurement Source Of Truth (MSOT) attributed conversion events. *Asynchronous*
 *
 * **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionMSOTEventsCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool msotEventsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionMSOTEventsCreate> conversionMSOTEventsCreate, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* MsotEventsManager_H_ */
