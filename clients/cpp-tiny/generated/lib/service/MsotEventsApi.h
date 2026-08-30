#ifndef TINY_CPP_CLIENT_MsotEventsApi_H_
#define TINY_CPP_CLIENT_MsotEventsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ConversionMSOTEventsCreate.h"
#include "Object.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class MsotEventsApi : public Service {
public:
    MsotEventsApi() = default;

    virtual ~MsotEventsApi();

    /**
    * Send Measurement Source Of Truth (MSOT) attributed conversion events.
    *
    * **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param conversionMSOTEventsCreate  *Required*
    */
    Response<
            String
        >
    msotEvents_create(
            
            std::string adAccountId
            , 
            
            ConversionMSOTEventsCreate conversionMSOTEventsCreate
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_MsotEventsApi_H_ */