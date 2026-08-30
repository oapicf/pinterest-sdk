#ifndef TINY_CPP_CLIENT_ConversionEventsApi_H_
#define TINY_CPP_CLIENT_ConversionEventsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ConversionEvents.h"
#include "ConversionEventsCreate.h"
#include "DetailedError.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ConversionEventsApi : public Service {
public:
    ConversionEventsApi() = default;

    virtual ~ConversionEventsApi();

    /**
    * Send conversions.
    *
    * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param conversionEventsCreate  *Required*
    * \param test Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
    */
    Response<
                ConversionEvents
        >
    events_create(
            
            std::string adAccountId
            , 
            
            ConversionEventsCreate conversionEventsCreate
            , 
            
            bool test
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ConversionEventsApi_H_ */