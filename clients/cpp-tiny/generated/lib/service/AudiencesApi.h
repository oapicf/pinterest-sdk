#ifndef TINY_CPP_CLIENT_AudiencesApi_H_
#define TINY_CPP_CLIENT_AudiencesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdAccountsAudience.h"
#include "AdAccountsAudienceCreate.h"
#include "AdAccountsAudienceUpdate.h"
#include "AudienceOwnershipType.h"
#include "Audiences_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class AudiencesApi : public Service {
public:
    AudiencesApi() = default;

    virtual ~AudiencesApi();

    /**
    * Create audience.
    *
    * Create a new audience for the ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adAccountsAudienceCreate  *Required*
    */
    Response<
                AdAccountsAudience
        >
    audiences_create(
            
            std::string adAccountId
            , 
            
            AdAccountsAudienceCreate adAccountsAudienceCreate
            
    );
    /**
    * Get audience.
    *
    * Get a specific audience given the audience ID.
    * \param audienceId Audience ID. *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                AdAccountsAudience
        >
    audiences_get(
            
            std::string audienceId
            , 
            
            std::string adAccountId
            
    );
    /**
    * List audiences.
    *
    * Get list of audiences for the ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param ownershipType 
    * \param excludeNca When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
    */
    Response<
                Audiences_list_200_response
        >
    audiences_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            
            AudienceOwnershipType ownershipType
            , 
            
            bool excludeNca
            
    );
    /**
    * Update audience.
    *
    * Update an existing audience for the ad account.
    * \param audienceId Audience ID. *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adAccountsAudienceUpdate  *Required*
    */
    Response<
                AdAccountsAudience
        >
    audiences_update(
            
            std::string audienceId
            , 
            
            std::string adAccountId
            , 
            
            AdAccountsAudienceUpdate adAccountsAudienceUpdate
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AudiencesApi_H_ */