#ifndef _MsotEventsManager_H_
#define _MsotEventsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "ConversionMSOTEvents.h"
#include "Error.h"
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
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionMSOTEvents Attributed MSOT conversion events *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool msotEventsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionMSOTEvents> conversionMSOTEvents, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Send Measurement Source Of Truth (MSOT) attributed conversion events. *Asynchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionMSOTEvents Attributed MSOT conversion events *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool msotEventsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionMSOTEvents> conversionMSOTEvents, 
	
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
