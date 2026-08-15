#ifndef TINY_CPP_CLIENT_ConversionsApi_H_
#define TINY_CPP_CLIENT_ConversionsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdvertiserDefinedEventsResponse.h"
#include "Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ConversionsApi : public Service {
public:
    ConversionsApi() = default;

    virtual ~ConversionsApi() = default;

    /**
    * Get advertiser defined events.
    *
    * <p>Get advertiser defined events for the given ad account.</p>
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                AdvertiserDefinedEventsResponse
        >
    advertiserDefinedEvents_get(
            
            std::string adAccountId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ConversionsApi_H_ */