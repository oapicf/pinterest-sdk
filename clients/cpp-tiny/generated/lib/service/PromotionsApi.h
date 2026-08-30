#ifndef TINY_CPP_CLIENT_PromotionsApi_H_
#define TINY_CPP_CLIENT_PromotionsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "Promotion.h"
#include "PromotionBatchUpdate.h"
#include "PromotionCreate.h"
#include "PromotionsResponse.h"
#include "Promotions_list_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class PromotionsApi : public Service {
public:
    PromotionsApi() = default;

    virtual ~PromotionsApi();

    /**
    * Create promotions.
    *
    * Create multiple new promotions.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param promotionCreate  *Required*
    */
    Response<
                PromotionsResponse
        >
    promotions_create(
            
            std::string adAccountId
            , 
            std::list<PromotionCreate> promotionCreate
            
            
    );
    /**
    * Delete promotion by id.
    *
    * Delete a promotion within Pinterest.
    * \param promotionId Promotion ID *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                Promotion
        >
    promotions_delete(
            
            std::string promotionId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get promotion by id.
    *
    * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
    * \param promotionId Promotion ID *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                Promotion
        >
    promotions_get(
            
            std::string promotionId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get promotions.
    *
    * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    */
    Response<
                Promotions_list_200_response
        >
    promotions_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
    );
    /**
    * Update promotions.
    *
    * Update multiple promotions.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param promotionBatchUpdate  *Required*
    */
    Response<
                PromotionsResponse
        >
    promotions_update(
            
            std::string adAccountId
            , 
            std::list<PromotionBatchUpdate> promotionBatchUpdate
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_PromotionsApi_H_ */