#ifndef TINY_CPP_CLIENT_BillingApi_H_
#define TINY_CPP_CLIENT_BillingApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdsCreditRedeem.h"
#include "AdsCreditRedeemCreate.h"
#include "Ads_credits_discounts_get_200_response.h"
#include "BillingInvoiceDocumentType.h"
#include "BillingInvoiceDownloadResponse.h"
#include "BillingInvoiceSortField.h"
#include "BillingInvoiceStatus.h"
#include "Billing_invoices_get_200_response.h"
#include "Billing_profiles_get_200_response.h"
#include "Date.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "SSIOAccount.h"
#include "SSIOInsertionOrder.h"
#include "SSIOInsertionOrderCreate.h"
#include "SSIOInsertionOrderStatusResponse.h"
#include "SSIOInsertionOrderUpdate.h"
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

    virtual ~BillingApi();

    /**
    * Redeem ad credits.
    *
    * Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adsCreditRedeemCreate  *Required*
    */
    Response<
                AdsCreditRedeem
        >
    adsCredit_redeem(
            
            std::string adAccountId
            , 
            
            AdsCreditRedeemCreate adsCreditRedeemCreate
            
    );
    /**
    * Get ads credit discounts.
    *
    * Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param sort Field of which to sort billing invoices
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
            
            Pinterest.Lib.PaginationOrder order
            , 
            
            BillingInvoiceSortField sort
            , 
            
            BillingInvoiceStatus status
            , 
            
            BillingInvoiceDocumentType documentType
            , 
            
            Date startDueDate
            , 
            
            Date endDueDate
            
    );
    /**
    * Get billing profiles.
    *
    * Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    * \param isActive Return active billing profiles, if false return all billing profiles. *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Billing_profiles_get_200_response
        >
    billingProfiles_get(
            
            bool isActive
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Get Salesforce account details including bill-to information..
    *
    *   Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                SSIOAccount
        >
    ssioAccounts_get(
            
            std::string adAccountId
            
    );
    /**
    * Create insertion order through SSIO..
    *
    *   Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param sSIOInsertionOrderCreate  *Required*
    */
    Response<
                SSIOInsertionOrder
        >
    ssioInsertionOrder_create(
            
            std::string adAccountId
            , 
            
            SSIOInsertionOrderCreate sSIOInsertionOrderCreate
            
    );
    /**
    * Edit insertion order through SSIO..
    *
    *   Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param sSIOInsertionOrderUpdate  *Required*
    */
    Response<
                SSIOInsertionOrder
        >
    ssioInsertionOrder_edit(
            
            std::string adAccountId
            , 
            
            SSIOInsertionOrderUpdate sSIOInsertionOrderUpdate
            
    );
    /**
    * Get insertion order status by ad account id..
    *
    *   Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
    *   Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
    *   Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param pinOrderId The pin order id associated with the SSIO insertion order
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Ssio_order_lines_get_by_ad_account_200_response
        >
    ssioOrderLines_getByAdAccount(
            
            std::string adAccountId
            , 
            
            std::string pinOrderId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BillingApi_H_ */