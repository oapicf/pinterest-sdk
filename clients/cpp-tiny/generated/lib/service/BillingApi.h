#ifndef TINY_CPP_CLIENT_BillingApi_H_
#define TINY_CPP_CLIENT_BillingApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdsCreditRedeemRequest.h"
#include "AdsCreditRedeemResponse.h"
#include "Ads_credits_discounts_get_200_response.h"
#include "BillingInvoiceDownloadResponse.h"
#include "Billing_invoices_get_200_response.h"
#include "Billing_profiles_get_200_response.h"
#include "Date.h"
#include "Error.h"
#include "SSIOAccountResponse.h"
#include "SSIOCreateInsertionOrderRequest.h"
#include "SSIOCreateInsertionOrderResponse.h"
#include "SSIOEditInsertionOrderRequest.h"
#include "SSIOEditInsertionOrderResponse.h"
#include "SSIOInsertionOrderStatusResponse.h"
#include "Ssio_insertion_orders_status_get_by_ad_account_200_response.h"
#include "Ssio_order_lines_get_by_ad_account_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BillingApi : public Service {
public:
    BillingApi() = default;

    virtual ~BillingApi() = default;

    /**
    * Redeem ad credits.
    *
    * Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adsCreditRedeemRequest Redeem ad credits request. *Required*
    */
    Response<
                AdsCreditRedeemResponse
        >
    adsCredit_redeem(
            
            std::string adAccountId
            , 
            
            AdsCreditRedeemRequest adsCreditRedeemRequest
            
    );
    /**
    * Get ads credit discounts.
    *
    * Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Ads_credits_discounts_get_200_response
        >
    adsCreditsDiscounts_get(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Get download url for a billing invoice.
    *
    * Get download url for a billing invoice.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param billingInvoiceId Unique identifier of a billing invoice. *Required*
    */
    Response<
                BillingInvoiceDownloadResponse
        >
    billingInvoiceDownload_get(
            
            std::string adAccountId
            , 
            
            std::string billingInvoiceId
            
    );
    /**
    * Get billing invoices.
    *
    * Get billing invoices in the advertiser account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param sort Field of which to sort billing invoices
    * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param status Status of billing invoices to filter by
    * \param documentType Document type of billing invoices to filter by
    * \param startDueDate Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
    * \param endDueDate Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
    */
    Response<
                Billing_invoices_get_200_response
        >
    billingInvoices_get(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string sort
            , 
            
            std::string order
            , 
            
            std::string status
            , 
            
            std::string documentType
            , 
            
            Date startDueDate
            , 
            
            Date endDueDate
            
    );
    /**
    * Get billing profiles.
    *
    * Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param isActive Return active billing profiles, if false return all billing profiles. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Billing_profiles_get_200_response
        >
    billingProfiles_get(
            
            std::string adAccountId
            , 
            
            bool isActive
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Get Salesforce account details including bill-to information..
    *
    * Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                SSIOAccountResponse
        >
    ssioAccounts_get(
            
            std::string adAccountId
            
    );
    /**
    * Create insertion order through SSIO..
    *
    * Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param sSIOCreateInsertionOrderRequest Order line to create. *Required*
    */
    Response<
                SSIOCreateInsertionOrderResponse
        >
    ssioInsertionOrder_create(
            
            std::string adAccountId
            , 
            
            SSIOCreateInsertionOrderRequest sSIOCreateInsertionOrderRequest
            
    );
    /**
    * Edit insertion order through SSIO..
    *
    * Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param sSIOEditInsertionOrderRequest Order line to create. *Required*
    */
    Response<
                SSIOEditInsertionOrderResponse
        >
    ssioInsertionOrder_edit(
            
            std::string adAccountId
            , 
            
            SSIOEditInsertionOrderRequest sSIOEditInsertionOrderRequest
            
    );
    /**
    * Get insertion order status by ad account id..
    *
    * Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Ssio_insertion_orders_status_get_by_ad_account_200_response
        >
    ssioInsertionOrdersStatus_getByAdAccount(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Get insertion order status by pin order id..
    *
    * Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param pinOrderId The pin order id associated with the ssio insertion order *Required*
    */
    Response<
                SSIOInsertionOrderStatusResponse
        >
    ssioInsertionOrdersStatus_getByPinOrderId(
            
            std::string adAccountId
            , 
            
            std::string pinOrderId
            
    );
    /**
    * Get Salesforce order lines by ad account id..
    *
    * Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param pinOrderId The pin order id associated with the ssio insertino order
    */
    Response<
                Ssio_order_lines_get_by_ad_account_200_response
        >
    ssioOrderLines_getByAdAccount(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            std::string pinOrderId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BillingApi_H_ */