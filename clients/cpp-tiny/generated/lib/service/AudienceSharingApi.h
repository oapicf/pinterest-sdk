#ifndef TINY_CPP_CLIENT_AudienceSharingApi_H_
#define TINY_CPP_CLIENT_AudienceSharingApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Ad_accounts_audiences_shared_accounts_list_200_response.h"
#include "AudienceAccountType.h"
#include "Audiences_list_200_response.h"
#include "BusinessSharedAudience.h"
#include "BusinessSharedAudienceResponse.h"
#include "Error.h"
#include "SharedAudience.h"
#include "SharedAudienceResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class AudienceSharingApi : public Service {
public:
    AudienceSharingApi() = default;

    virtual ~AudienceSharingApi() = default;

    /**
    * List accounts with access to an audience owned by an ad account.
    *
    * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param audienceId Unique identifier of the audience to use to filter the results. *Required*
    * \param accountType Filter accounts by account type. *Required*
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Ad_accounts_audiences_shared_accounts_list_200_response
        >
    adAccountsAudiencesSharedAccounts_list(
            
            std::string adAccountId
            , 
            
            std::string audienceId
            , 
            
            AudienceAccountType accountType
            , 
            
            int pageSize
            , 
            
            std::string bookmark
            
    );
    /**
    * List accounts with access to an audience owned by a business.
    *
    * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param audienceId Unique identifier of the audience to use to filter the results. *Required*
    * \param accountType Filter accounts by account type. *Required*
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param bookmark Cursor used to fetch the next page of items
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
            
            int pageSize
            , 
            
            std::string bookmark
            
    );
    /**
    * List received audiences for a business.
    *
    * Get a list of received audiences for the given business.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Audiences_list_200_response
        >
    sharedAudiencesForBusiness_list(
            
            std::string businessId
            , 
            
            std::string bookmark
            , 
            
            std::string order
            , 
            
            int pageSize
            
    );
    /**
    * Update audience sharing between ad accounts.
    *
    * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param sharedAudience  *Required*
    */
    Response<
                SharedAudienceResponse
        >
    updateAdAccountToAdAccountSharedAudience(
            
            std::string adAccountId
            , 
            
            SharedAudience sharedAudience
            
    );
    /**
    * Update audience sharing from an ad account to businesses.
    *
    * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param businessSharedAudience  *Required*
    */
    Response<
                BusinessSharedAudienceResponse
        >
    updateAdAccountToBusinessSharedAudience(
            
            std::string adAccountId
            , 
            
            BusinessSharedAudience businessSharedAudience
            
    );
    /**
    * Update audience sharing from a business to ad accounts.
    *
    * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param sharedAudience  *Required*
    */
    Response<
                SharedAudienceResponse
        >
    updateBusinessToAdAccountSharedAudience(
            
            std::string businessId
            , 
            
            SharedAudience sharedAudience
            
    );
    /**
    * Update audience sharing between businesses.
    *
    * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param businessSharedAudience  *Required*
    */
    Response<
                BusinessSharedAudienceResponse
        >
    updateBusinessToBusinessSharedAudience(
            
            std::string businessId
            , 
            
            BusinessSharedAudience businessSharedAudience
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AudienceSharingApi_H_ */