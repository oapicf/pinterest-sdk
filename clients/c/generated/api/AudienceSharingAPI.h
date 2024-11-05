#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/ad_accounts_audiences_shared_accounts_list_200_response.h"
#include "../model/audience_account_type.h"
#include "../model/audiences_list_200_response.h"
#include "../model/business_shared_audience.h"
#include "../model/business_shared_audience_response.h"
#include "../model/error.h"
#include "../model/shared_audience.h"
#include "../model/shared_audience_response.h"

// Enum  for AudienceSharingAPI_adAccountsAudiencesSharedAccountsList
typedef enum  { pinterest_rest_api_adAccountsAudiencesSharedAccountsList__NULL = 0, pinterest_rest_api_adAccountsAudiencesSharedAccountsList__AD_ACCOUNT, pinterest_rest_api_adAccountsAudiencesSharedAccountsList__BUSINESS_ACCOUNT } pinterest_rest_api_adAccountsAudiencesSharedAccountsList_account_type_e;

// Enum  for AudienceSharingAPI_businessAccountAudiencesSharedAccountsList
typedef enum  { pinterest_rest_api_businessAccountAudiencesSharedAccountsList__NULL = 0, pinterest_rest_api_businessAccountAudiencesSharedAccountsList__AD_ACCOUNT, pinterest_rest_api_businessAccountAudiencesSharedAccountsList__BUSINESS_ACCOUNT } pinterest_rest_api_businessAccountAudiencesSharedAccountsList_account_type_e;

// Enum ORDER for AudienceSharingAPI_sharedAudiencesForBusinessList
typedef enum  { pinterest_rest_api_sharedAudiencesForBusinessList_ORDER_NULL = 0, pinterest_rest_api_sharedAudiencesForBusinessList_ORDER_ASCENDING, pinterest_rest_api_sharedAudiencesForBusinessList_ORDER_DESCENDING } pinterest_rest_api_sharedAudiencesForBusinessList_order_e;


// List accounts with access to an audience owned by an ad account
//
// List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
//
ad_accounts_audiences_shared_accounts_list_200_response_t*
AudienceSharingAPI_adAccountsAudiencesSharedAccountsList(apiClient_t *apiClient, char *ad_account_id, char *audience_id, audience_account_type_e account_type, int *page_size, char *bookmark);


// List accounts with access to an audience owned by a business
//
// List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
//
ad_accounts_audiences_shared_accounts_list_200_response_t*
AudienceSharingAPI_businessAccountAudiencesSharedAccountsList(apiClient_t *apiClient, char *business_id, char *audience_id, audience_account_type_e account_type, int *page_size, char *bookmark);


// List received audiences for a business
//
// Get a list of received audiences for the given business.
//
audiences_list_200_response_t*
AudienceSharingAPI_sharedAudiencesForBusinessList(apiClient_t *apiClient, char *business_id, char *bookmark, pinterest_rest_api_sharedAudiencesForBusinessList_order_e order, int *page_size);


// Update audience sharing between ad accounts
//
// From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
//
shared_audience_response_t*
AudienceSharingAPI_updateAdAccountToAdAccountSharedAudience(apiClient_t *apiClient, char *ad_account_id, shared_audience_t *shared_audience);


// Update audience sharing from an ad account to businesses
//
// From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
//
business_shared_audience_response_t*
AudienceSharingAPI_updateAdAccountToBusinessSharedAudience(apiClient_t *apiClient, char *ad_account_id, business_shared_audience_t *business_shared_audience);


// Update audience sharing from a business to ad accounts
//
// From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
//
shared_audience_response_t*
AudienceSharingAPI_updateBusinessToAdAccountSharedAudience(apiClient_t *apiClient, char *business_id, shared_audience_t *shared_audience);


// Update audience sharing between businesses
//
// From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.
//
business_shared_audience_response_t*
AudienceSharingAPI_updateBusinessToBusinessSharedAudience(apiClient_t *apiClient, char *business_id, business_shared_audience_t *business_shared_audience);


