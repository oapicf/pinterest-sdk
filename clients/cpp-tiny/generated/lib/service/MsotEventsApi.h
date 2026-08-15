#ifndef TINY_CPP_CLIENT_MsotEventsApi_H_
#define TINY_CPP_CLIENT_MsotEventsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ConversionMSOTEvents.h"
#include "Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class MsotEventsApi : public Service {
public:
    MsotEventsApi() = default;

    virtual ~MsotEventsApi() = default;

    /**
    * Send Measurement Source Of Truth (MSOT) attributed conversion events.
    *
    * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param conversionMSOTEvents Attributed MSOT conversion events *Required*
    */
    Response<
            String
        >
    msotEvents_create(
            
            std::string adAccountId
            , 
            
            ConversionMSOTEvents conversionMSOTEvents
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_MsotEventsApi_H_ */