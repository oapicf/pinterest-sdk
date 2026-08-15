#ifndef TINY_CPP_CLIENT_LabelsApi_H_
#define TINY_CPP_CLIENT_LabelsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Error.h"
#include "LabelCreateRequest.h"
#include "LabelUpdateRequest.h"
#include "LabelsResponse.h"
#include "Labels_list_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class LabelsApi : public Service {
public:
    LabelsApi() = default;

    virtual ~LabelsApi() = default;

    /**
    * Create labels.
    *
    * <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
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
    * <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param campaignIds List of Campaign Ids to use to filter the results.
    * \param labelIds List of Label Ids to use to filter the results.
    * \param entityStatuses Label entity status
    * \param labelTypes Label type.
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param bookmark Cursor used to fetch the next page of items
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
            std::list<std::string> entityStatuses
            
            , 
            std::list<std::string> labelTypes
            
            , 
            
            int pageSize
            , 
            
            std::string bookmark
            
    );
    /**
    * Update labels.
    *
    * <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
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