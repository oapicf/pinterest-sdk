#ifndef TINY_CPP_CLIENT_ConversionsApi_H_
#define TINY_CPP_CLIENT_ConversionsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdvertiserDefinedEventsCreateRequest.h"
#include "Advertiser_defined_events_create_200_response.h"
#include "Advertiser_defined_events_get_200_response.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ConversionsApi : public Service {
public:
    ConversionsApi() = default;

    virtual ~ConversionsApi();

    /**
    * Create advertiser defined events.
    *
    * Map advertiser defined events to standard events for the given ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param advertiserDefinedEventsCreateRequest  *Required*
    */
    Response<
                Advertiser_defined_events_create_200_response
        >
    advertiserDefinedEvents_create(
            
            std::string adAccountId
            , 
            
            AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest
            
    );
    /**
    * Delete advertiser defined events.
    *
    * Untrack advertiser defined events for the given ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param eventNames List of event names to delete *Required*
    */
    Response<
                Advertiser_defined_events_create_200_response
        >
    advertiserDefinedEvents_delete(
            
            std::string adAccountId
            , 
            std::list<std::string> eventNames
            
            
    );
    /**
    * Get advertiser defined events.
    *
    * Get advertiser defined events for the given ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                Advertiser_defined_events_get_200_response
        >
    advertiserDefinedEvents_get(
            
            std::string adAccountId
            
    );
    /**
    * Update advertiser defined events.
    *
    * Update advertiser defined event names or mappings for the given ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param advertiserDefinedEventsCreateRequest  *Required*
    */
    Response<
                Advertiser_defined_events_create_200_response
        >
    advertiserDefinedEvents_update(
            
            std::string adAccountId
            , 
            
            AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ConversionsApi_H_ */