#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/ads_credit_redeem.h"
#include "../model/ads_credit_redeem_create.h"
#include "../model/ads_credits_discounts_get_200_response.h"
#include "../model/billing_invoice_document_type.h"
#include "../model/billing_invoice_download_response.h"
#include "../model/billing_invoice_sort_field.h"
#include "../model/billing_invoice_status.h"
#include "../model/billing_invoices_get_200_response.h"
#include "../model/billing_profiles_get_200_response.h"
#include "../model/pinterest_lib_error.h"
#include "../model/pinterest_lib_pagination_order.h"
#include "../model/ssio_account.h"
#include "../model/ssio_insertion_order.h"
#include "../model/ssio_insertion_order_create.h"
#include "../model/ssio_insertion_order_status_response.h"
#include "../model/ssio_insertion_order_update.h"
#include "../model/ssio_insertion_orders_status_get_by_ad_account_200_response.h"
#include "../model/ssio_order_lines_get_by_ad_account_200_response.h"

// Enum  for BillingAPI_billingInvoicesGet
typedef enum  { pinterest_rest_api_billingInvoicesGet__NULL = 0, pinterest_rest_api_billingInvoicesGet__ASCENDING, pinterest_rest_api_billingInvoicesGet__DESCENDING } pinterest_rest_api_billingInvoicesGet_order_e;

// Enum  for BillingAPI_billingInvoicesGet
typedef enum  { pinterest_rest_api_billingInvoicesGet__NULL = 0, pinterest_rest_api_billingInvoicesGet__DUE_DATE, pinterest_rest_api_billingInvoicesGet__BILLING_PERIOD, pinterest_rest_api_billingInvoicesGet__DOCUMENT_TYPE, pinterest_rest_api_billingInvoicesGet__TOTAL_AMOUNT, pinterest_rest_api_billingInvoicesGet__INVOICE_NUMBER } pinterest_rest_api_billingInvoicesGet_sort_e;

// Enum  for BillingAPI_billingInvoicesGet
typedef enum  { pinterest_rest_api_billingInvoicesGet__NULL = 0, pinterest_rest_api_billingInvoicesGet__OPEN, pinterest_rest_api_billingInvoicesGet__CLOSED } pinterest_rest_api_billingInvoicesGet_status_e;

// Enum  for BillingAPI_billingInvoicesGet
typedef enum  { pinterest_rest_api_billingInvoicesGet__NULL = 0, pinterest_rest_api_billingInvoicesGet__INVOICE, pinterest_rest_api_billingInvoicesGet__CREDIT_MEMO } pinterest_rest_api_billingInvoicesGet_document_type_e;


// Redeem ad credits
//
// Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
//
ads_credit_redeem_t*
BillingAPI_adsCreditRedeem(apiClient_t *apiClient, char *ad_account_id, ads_credit_redeem_create_t *ads_credit_redeem_create);


// Get ads credit discounts
//
// Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
//
ads_credits_discounts_get_200_response_t*
BillingAPI_adsCreditsDiscountsGet(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size);


// Get download url for a billing invoice
//
// Get download url for a billing invoice.
//
billing_invoice_download_response_t*
BillingAPI_billingInvoiceDownloadGet(apiClient_t *apiClient, char *ad_account_id, char *billing_invoice_id);


// Get billing invoices
//
// Get billing invoices in the advertiser account.
//
billing_invoices_get_200_response_t*
BillingAPI_billingInvoicesGet(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, billing_invoice_sort_field_e sort, billing_invoice_status_e status, billing_invoice_document_type_e document_type, char start_due_date, char end_due_date);


// Get billing profiles
//
// Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
//
billing_profiles_get_200_response_t*
BillingAPI_billingProfilesGet(apiClient_t *apiClient, int *is_active, char *ad_account_id, char *bookmark, int *page_size);


// Get Salesforce account details including bill-to information.
//
//   Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_account_t*
BillingAPI_ssioAccountsGet(apiClient_t *apiClient, char *ad_account_id);


// Create insertion order through SSIO.
//
//   Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_insertion_order_t*
BillingAPI_ssioInsertionOrderCreate(apiClient_t *apiClient, char *ad_account_id, ssio_insertion_order_create_t *ssio_insertion_order_create);


// Edit insertion order through SSIO.
//
//   Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_insertion_order_t*
BillingAPI_ssioInsertionOrderEdit(apiClient_t *apiClient, char *ad_account_id, ssio_insertion_order_update_t *ssio_insertion_order_update);


// Get insertion order status by ad account id.
//
//   Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_insertion_orders_status_get_by_ad_account_200_response_t*
BillingAPI_ssioInsertionOrdersStatusGetByAdAccount(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size);


// Get insertion order status by pin order id.
//
//   Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_insertion_order_status_response_t*
BillingAPI_ssioInsertionOrdersStatusGetByPinOrderId(apiClient_t *apiClient, char *ad_account_id, char *pin_order_id);


// Get Salesforce order lines by ad account id.
//
//   Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
//
ssio_order_lines_get_by_ad_account_200_response_t*
BillingAPI_ssioOrderLinesGetByAdAccount(apiClient_t *apiClient, char *ad_account_id, char *pin_order_id, char *bookmark, int *page_size);


