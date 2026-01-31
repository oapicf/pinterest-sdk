#ifndef _ConversionEqsManager_H_
#define _ConversionEqsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "EventQualityScore.h"
#include "IngestionSourceOptions.h"
#include "LookbackPeriodOptions.h"
#include "Pinterest.Lib.Error.h"
#include "SourcePlatformOptions.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ConversionEqs ConversionEqs
 * \ingroup Operations
 *  @{
 */
class ConversionEqsManager {
public:
	ConversionEqsManager();
	virtual ~ConversionEqsManager();

/*! \brief Get event quality score (EQS). *Synchronous*
 *
 * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
 * \param lookbackPeriod Lookback window (number of days). *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sourcePlatform Source platform of event.
 * \param ingestionSource Ingestion source of event.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionEqsListSync(char * accessToken,
	LookbackPeriodOptions lookbackPeriod, std::string adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource, 
	void(* handler)(std::list<EventQualityScore>, Error, void* )
	, void* userData);

/*! \brief Get event quality score (EQS). *Asynchronous*
 *
 * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
 * \param lookbackPeriod Lookback window (number of days). *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sourcePlatform Source platform of event.
 * \param ingestionSource Ingestion source of event.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool conversionEqsListAsync(char * accessToken,
	LookbackPeriodOptions lookbackPeriod, std::string adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource, 
	void(* handler)(std::list<EventQualityScore>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* ConversionEqsManager_H_ */
