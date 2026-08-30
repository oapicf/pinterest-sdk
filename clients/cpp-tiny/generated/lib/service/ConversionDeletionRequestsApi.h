#ifndef TINY_CPP_CLIENT_ConversionDeletionRequestsApi_H_
#define TINY_CPP_CLIENT_ConversionDeletionRequestsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ConversionDeletionRequest.h"
#include "ConversionDeletionRequestCreate.h"
#include "Conversion_deletion_request_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ConversionDeletionRequestsApi : public Service {
public:
    ConversionDeletionRequestsApi() = default;

    virtual ~ConversionDeletionRequestsApi();

    /**
    * Create a conversion deletion request.
    *
    * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param conversionDeletionRequestCreate  *Required*
    */
    Response<
                ConversionDeletionRequest
        >
    conversionDeletionRequest_create(
            
            std::string adAccountId
            , 
            
            ConversionDeletionRequestCreate conversionDeletionRequestCreate
            
    );
    /**
    * Delete a conversion deletion request.
    *
    * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.
    * \param requestId Unique identifier of the conversion deletion request *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                ConversionDeletionRequest
        >
    conversionDeletionRequest_delete(
            
            std::string requestId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get a single conversion deletion request.
    *
    * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.
    * \param requestId Unique identifier of the conversion deletion request *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                ConversionDeletionRequest
        >
    conversionDeletionRequest_get(
            
            std::string requestId
            , 
            
            std::string adAccountId
            
    );
    /**
    * List conversion deletion requests.
    *
    * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    */
    Response<
                Conversion_deletion_request_list_200_response
        >
    conversionDeletionRequest_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ConversionDeletionRequestsApi_H_ */