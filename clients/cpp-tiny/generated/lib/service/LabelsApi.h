#ifndef TINY_CPP_CLIENT_LabelsApi_H_
#define TINY_CPP_CLIENT_LabelsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "LabelCreateRequest.h"
#include "LabelUpdateRequest.h"
#include "LabeledEntities.h"
#include "LabeledEntitiesCreate.h"
#include "LabelsResponse.h"
#include "Labels_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "QueryLabelEntityStatusesItems.h"
#include "QueryLabelTypesItems.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class LabelsApi : public Service {
public:
    LabelsApi() = default;

    virtual ~LabelsApi();

    /**
    * Apply label to entity.
    *
    *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
    * \param adAccountId  *Required*
    * \param labelId Label ID. *Required*
    * \param labeledEntitiesCreate  *Required*
    */
    Response<
                LabeledEntities
        >
    labels_apply(
            
            std::string adAccountId
            , 
            
            std::string labelId
            , 
            
            LabeledEntitiesCreate labeledEntitiesCreate
            
    );
    /**
    * Create labels.
    *
    * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param labelCreateRequest  *Required*
    */
    Response<
                LabelsResponse
        >
    labels_create(
            
            std::string adAccountId
            , 
            
            LabelCreateRequest labelCreateRequest
            
    );
    /**
    * List labels.
    *
    * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param campaignIds List of Campaign Ids to use to filter the results.
    * \param labelIds List of Label Ids to use to filter the results.
    * \param entityStatuses Label entity status
    * \param labelTypes Label type.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Labels_list_200_response
        >
    labels_list(
            
            std::string adAccountId
            , 
            std::list<std::string> campaignIds
            
            , 
            std::list<std::string> labelIds
            
            , 
            std::list<QueryLabelEntityStatusesItems> entityStatuses
            
            , 
            std::list<QueryLabelTypesItems> labelTypes
            
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Remove label from entities.
    *
    *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
    * \param adAccountId  *Required*
    * \param labelId Label ID. *Required*
    * \param labeledEntitiesCreate  *Required*
    */
    Response<
                LabeledEntities
        >
    labels_remove(
            
            std::string adAccountId
            , 
            
            std::string labelId
            , 
            
            LabeledEntitiesCreate labeledEntitiesCreate
            
    );
    /**
    * Update labels.
    *
    * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param labelUpdateRequest  *Required*
    */
    Response<
                LabelsResponse
        >
    labels_update(
            
            std::string adAccountId
            , 
            
            LabelUpdateRequest labelUpdateRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_LabelsApi_H_ */