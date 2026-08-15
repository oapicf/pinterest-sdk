#ifndef TINY_CPP_CLIENT_TargetingTemplateApi_H_
#define TINY_CPP_CLIENT_TargetingTemplateApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Error.h"
#include "TargetingTemplateCreate.h"
#include "TargetingTemplateGetResponseData.h"
#include "TargetingTemplateUpdateRequest.h"
#include "Targeting_template_list_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class TargetingTemplateApi : public Service {
public:
    TargetingTemplateApi() = default;

    virtual ~TargetingTemplateApi() = default;

    /**
    * Create targeting templates.
    *
    * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param targetingTemplateCreate targeting template creation entity *Required*
    */
    Response<
                TargetingTemplateGetResponseData
        >
    targetingTemplate_create(
            
            std::string adAccountId
            , 
            
            TargetingTemplateCreate targetingTemplateCreate
            
    );
    /**
    * List targeting templates.
    *
    * Get a list of the targeting templates in the specified <code>ad_account_id</code>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param includeSizing Include audience sizing in result or not
    * \param searchQuery Search keyword for targeting templates
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Targeting_template_list_200_response
        >
    targetingTemplate_list(
            
            std::string adAccountId
            , 
            
            std::string order
            , 
            
            bool includeSizing
            , 
            
            std::string searchQuery
            , 
            
            int pageSize
            , 
            
            std::string bookmark
            
    );
    /**
    * Update targeting templates.
    *
    * <p>Update the targeting template given advertiser ID and targeting template ID</p>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param targetingTemplateUpdateRequest Operation type and targeting template ID *Required*
    */
    Response<
            String
        >
    targetingTemplate_update(
            
            std::string adAccountId
            , 
            
            TargetingTemplateUpdateRequest targetingTemplateUpdateRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_TargetingTemplateApi_H_ */