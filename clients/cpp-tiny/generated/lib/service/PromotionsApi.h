#ifndef TINY_CPP_CLIENT_PromotionsApi_H_
#define TINY_CPP_CLIENT_PromotionsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Error.h"
#include "PromotionCreateRequest.h"
#include "PromotionResponse.h"
#include "PromotionUpdateRequest.h"
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

    virtual ~PromotionsApi() = default;

    /**
    * Create promotions.
    *
    * Create multiple new promotions.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param promotionCreateRequest List of promotions to create, size limit [1, 30]. *Required*
    */
    Response<
                PromotionsResponse
        >
    promotions_create(
            
            std::string adAccountId
            , 
            std::list<PromotionCreateRequest> promotionCreateRequest
            
            
    );
    /**
    * Delete promotion by id.
    *
    * Delete a promotion within Pinterest.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param promotionId Unique identifier of a promotion *Required*
    */
    Response<
            String
        >
    promotions_delete(
            
            std::string adAccountId
            , 
            
            std::string promotionId
            
    );
    /**
    * Get promotion by id.
    *
    * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param promotionId Unique identifier of a promotion *Required*
    */
    Response<
                PromotionResponse
        >
    promotions_get(
            
            std::string adAccountId
            , 
            
            std::string promotionId
            
    );
    /**
    * Get promotions.
    *
    * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Promotions_list_200_response
        >
    promotions_list(
            
            std::string adAccountId
            , 
            
            int pageSize
            , 
            
            std::string order
            , 
            
            std::string bookmark
            
    );
    /**
    * Update promotions.
    *
    * Update multiple promotions.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param promotionUpdateRequest List of promotions to create, size limit [1, 30]. *Required*
    */
    Response<
                PromotionsResponse
        >
    promotions_update(
            
            std::string adAccountId
            , 
            std::list<PromotionUpdateRequest> promotionUpdateRequest
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_PromotionsApi_H_ */