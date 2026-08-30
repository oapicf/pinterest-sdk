#ifndef TINY_CPP_CLIENT_TargetingTemplateApi_H_
#define TINY_CPP_CLIENT_TargetingTemplateApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "TargetingTemplate.h"
#include "TargetingTemplateCreate.h"
#include "TargetingTemplateUpdateRequestReadOrUpdate.h"
#include "Targeting_template_list_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class TargetingTemplateApi : public Service {
public:
    TargetingTemplateApi() = default;

    virtual ~TargetingTemplateApi();

    /**
    * Create targeting templates.
    *
    * Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param targetingTemplateCreate  *Required*
    */
    Response<
                TargetingTemplate
        >
    targetingTemplate_create(
            
            std::string adAccountId
            , 
            
            TargetingTemplateCreate targetingTemplateCreate
            
    );
    /**
    * List targeting templates.
    *
    * Get a list of the targeting templates in the specified `ad_account_id`
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param includeSizing Include audience sizing in result or not
    * \param searchQuery Search query. Can contain pin description keywords or comma-separated pin IDs.
    */
    Response<
                Targeting_template_list_200_response
        >
    targetingTemplate_list(
            
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
    * Update targeting templates.
    *
    * Update the targeting template given advertiser ID and targeting template ID
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param targetingTemplateUpdateRequestReadOrUpdate  *Required*
    */
    Response<
            String
        >
    targetingTemplate_update(
            
            std::string adAccountId
            , 
            
            TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_TargetingTemplateApi_H_ */