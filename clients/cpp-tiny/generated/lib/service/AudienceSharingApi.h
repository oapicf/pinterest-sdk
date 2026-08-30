#ifndef TINY_CPP_CLIENT_AudienceSharingApi_H_
#define TINY_CPP_CLIENT_AudienceSharingApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdAccountToAdAccountSharedAudience.h"
#include "AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.h"
#include "AdAccountToBusinessSharedAudience.h"
#include "AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.h"
#include "Ad_accounts_audiences_shared_accounts_list_200_response.h"
#include "AudienceAccountType.h"
#include "BusinessToAdAccountSharedAudience.h"
#include "BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.h"
#include "BusinessToBusinessSharedAudience.h"
#include "BusinessToBusinessSharedAudienceUpdateWithRequiredBody.h"
#include "Order.h"
#include "Pinterest.Lib.Error.h"
#include "Shared_audiences_for_business_list_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class AudienceSharingApi : public Service {
public:
    AudienceSharingApi() = default;

    virtual ~AudienceSharingApi();

    /**
    * List accounts with access to an audience owned by an ad account.
    *
    * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
    * \param audienceId Unique identifier of the audience to use to filter the results. *Required*
    * \param accountType Filter accounts by account type. *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Ad_accounts_audiences_shared_accounts_list_200_response
        >
    adAccountsAudiencesSharedAccounts_list(
            
            std::string audienceId
            , 
            
            AudienceAccountType accountType
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * List accounts with access to an audience owned by a business.
    *
    * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param audienceId Unique identifier of the audience to use to filter the results. *Required*
    * \param accountType Filter accounts by account type. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Ad_accounts_audiences_shared_accounts_list_200_response
        >
    businessAccountAudiencesSharedAccounts_list(
            
            std::string businessId
            , 
            
            std::string audienceId
            , 
            
            AudienceAccountType accountType
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * List received audiences for a business.
    *
    * Get a list of received audiences for the given business.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Shared_audiences_for_business_list_200_response
        >
    sharedAudiencesForBusiness_list(
            
            std::string businessId
            , 
            
            Order order
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Update audience sharing between ad accounts.
    *
    * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adAccountToAdAccountSharedAudienceUpdateWithRequiredBody  *Required*
    */
    Response<
                AdAccountToAdAccountSharedAudience
        >
    updateAdAccountToAdAccountSharedAudience(
            
            std::string adAccountId
            , 
            
            AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody
            
    );
    /**
    * Update audience sharing from an ad account to businesses.
    *
    * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adAccountToBusinessSharedAudienceUpdateWithRequiredBody  *Required*
    */
    Response<
                AdAccountToBusinessSharedAudience
        >
    updateAdAccountToBusinessSharedAudience(
            
            std::string adAccountId
            , 
            
            AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody
            
    );
    /**
    * Update audience sharing from a business to ad accounts.
    *
    * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param businessToAdAccountSharedAudienceUpdateWithRequiredBody  *Required*
    */
    Response<
                BusinessToAdAccountSharedAudience
        >
    updateBusinessToAdAccountSharedAudience(
            
            std::string businessId
            , 
            
            BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody
            
    );
    /**
    * Update audience sharing between businesses.
    *
    * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param businessToBusinessSharedAudienceUpdateWithRequiredBody  *Required*
    */
    Response<
                BusinessToBusinessSharedAudience
        >
    updateBusinessToBusinessSharedAudience(
            
            std::string businessId
            , 
            
            BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AudienceSharingApi_H_ */