#ifndef TINY_CPP_CLIENT_CustomerSegmentApi_H_
#define TINY_CPP_CLIENT_CustomerSegmentApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CustomerSegment.h"
#include "CustomerSegmentCreate.h"
#include "CustomerSegmentUpdateRequestUpdateWithRequiredBody.h"
#include "Customer_segment_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CustomerSegmentApi : public Service {
public:
    CustomerSegmentApi() = default;

    virtual ~CustomerSegmentApi();

    /**
    * Create customer segments.
    *
    * Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param customerSegmentCreate  *Required*
    */
    Response<
                CustomerSegment
        >
    customerSegment_create(
            
            std::string adAccountId
            , 
            
            CustomerSegmentCreate customerSegmentCreate
            
    );
    /**
    * List customer segments.
    *
    * Get a list of the customer segments in the specified `ad_account_id`.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param includeSizing Include audience sizing in result or not
    * \param searchQuery Search query. Can contain pin description keywords or comma-separated pin IDs.
    */
    Response<
                Customer_segment_list_200_response
        >
    customerSegment_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            
            bool includeSizing
            , 
            
            std::string searchQuery
            
    );
    /**
    * Update customer segments.
    *
    * Update the customer segment given advertiser ID and customer segment ID
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param customerSegmentUpdateRequestUpdateWithRequiredBody  *Required*
    */
    Response<
            String
        >
    customerSegment_update(
            
            std::string adAccountId
            , 
            
            CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CustomerSegmentApi_H_ */