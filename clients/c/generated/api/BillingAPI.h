#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/ads_credit_redeem_request.h"
#include "../model/ads_credit_redeem_response.h"
#include "../model/ads_credits_discounts_get_200_response.h"
#include "../model/billing_profiles_get_200_response.h"
#include "../model/error.h"
#include "../model/ssio_account_response.h"
#include "../model/ssio_create_insertion_order_request.h"
#include "../model/ssio_create_insertion_order_response.h"
#include "../model/ssio_edit_insertion_order_request.h"
#include "../model/ssio_edit_insertion_order_response.h"
#include "../model/ssio_insertion_order_status_response.h"
#include "../model/ssio_insertion_orders_status_get_by_ad_account_200_response.h"
#include "../model/ssio_order_lines_get_by_ad_account_200_response.h"


// Redeem ad credits
//
// Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
//
ads_credit_redeem_response_t*
BillingAPI_adsCreditRedeem(apiClient_t *apiClient, char *ad_account_id, ads_credit_redeem_request_t *ads_credit_redeem_request);


// Get ads credit discounts
//
// Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
//
ads_credits_discounts_get_200_response_t*
BillingAPI_adsCreditsDiscountsGet(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size);


// Get billing profiles
//
// Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
//
billing_profiles_get_200_response_t*
BillingAPI_billingProfilesGet(apiClient_t *apiClient, char *ad_account_id, int *is_active, char *bookmark, int *page_size);


// Get Salesforce account details including bill-to information.
//
// Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
//
ssio_account_response_t*
BillingAPI_ssioAccountsGet(apiClient_t *apiClient, char *ad_account_id);


// Create insertion order through SSIO.
//
// Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
//
ssio_create_insertion_order_response_t*
BillingAPI_ssioInsertionOrderCreate(apiClient_t *apiClient, char *ad_account_id, ssio_create_insertion_order_request_t *ssio_create_insertion_order_request);


// Edit insertion order through SSIO.
//
// Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
//
ssio_edit_insertion_order_response_t*
BillingAPI_ssioInsertionOrderEdit(apiClient_t *apiClient, char *ad_account_id, ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request);


// Get insertion order status by ad account id.
//
// Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
//
ssio_insertion_orders_status_get_by_ad_account_200_response_t*
BillingAPI_ssioInsertionOrdersStatusGetByAdAccount(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size);


// Get insertion order status by pin order id.
//
// Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
//
ssio_insertion_order_status_response_t*
BillingAPI_ssioInsertionOrdersStatusGetByPinOrderId(apiClient_t *apiClient, char *ad_account_id, char *pin_order_id);


// Get Salesforce order lines by ad account id.
//
// Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
//
ssio_order_lines_get_by_ad_account_200_response_t*
BillingAPI_ssioOrderLinesGetByAdAccount(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, char *pin_order_id);


