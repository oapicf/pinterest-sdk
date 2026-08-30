{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Billing where

import           Import


-- | Redeem ad credits
--
-- Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
-- operationId: adsCredit/redeem
postAdAccountsByTextAdsCreditRedeemR :: Text -- ^ Unique identifier of an ad account.
                                     -> Handler Value
postAdAccountsByTextAdsCreditRedeemR adAccountId = notImplemented

-- | Get ads credit discounts
--
-- Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
-- operationId: adsCreditsDiscounts/get
getAdAccountsByTextAdsCreditDiscountsR :: Text -- ^ Unique identifier of an ad account.
                                       -> Handler Value
getAdAccountsByTextAdsCreditDiscountsR adAccountId = notImplemented

-- | Get download url for a billing invoice
--
-- Get download url for a billing invoice.
-- operationId: billingInvoiceDownload/get
getAdAccountsByTextBillingInvoiceByTextDownloadR :: Text -- ^ Unique identifier of an ad account.
                                                 -> Text -- ^ Unique identifier of a billing invoice.
                                                 -> Handler Value
getAdAccountsByTextBillingInvoiceByTextDownloadR adAccountId billingInvoiceId = notImplemented

-- | Get billing invoices
--
-- Get billing invoices in the advertiser account.
-- operationId: billingInvoices/get
getAdAccountsByTextBillingInvoicesR :: Text -- ^ Unique identifier of an ad account.
                                    -> Handler Value
getAdAccountsByTextBillingInvoicesR adAccountId = notImplemented

-- | Get billing profiles
--
-- Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
-- operationId: billingProfiles/get
getAdAccountsByTextBillingProfilesR :: Text -- ^ Unique identifier of an ad account.
                                    -> Handler Value
getAdAccountsByTextBillingProfilesR adAccountId = notImplemented

-- | Get Salesforce account details including bill-to information.
--
--   Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
-- operationId: ssioAccounts/get
getAdAccountsByTextSsioAccountsR :: Text -- ^ Unique identifier of an ad account.
                                 -> Handler Value
getAdAccountsByTextSsioAccountsR adAccountId = notImplemented

-- | Create insertion order through SSIO.
--
--   Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
-- operationId: ssioInsertionOrder/create
postAdAccountsByTextSsioInsertionOrdersR :: Text -- ^ Unique identifier of an ad account.
                                         -> Handler Value
postAdAccountsByTextSsioInsertionOrdersR adAccountId = notImplemented

-- | Edit insertion order through SSIO.
--
--   Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
-- operationId: ssioInsertionOrder/edit
patchAdAccountsByTextSsioInsertionOrdersR :: Text -- ^ Unique identifier of an ad account.
                                          -> Handler Value
patchAdAccountsByTextSsioInsertionOrdersR adAccountId = notImplemented

-- | Get insertion order status by ad account id.
--
--   Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
-- operationId: ssioInsertionOrdersStatus/getByAdAccount
getAdAccountsByTextSsioInsertionOrdersStatusR :: Text -- ^ Unique identifier of an ad account.
                                              -> Handler Value
getAdAccountsByTextSsioInsertionOrdersStatusR adAccountId = notImplemented

-- | Get insertion order status by pin order id.
--
--   Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
-- operationId: ssioInsertionOrdersStatus/getByPinOrderId
getAdAccountsByTextSsioInsertionOrdersByTextStatusR :: Text -- ^ Unique identifier of an ad account.
                                                    -> Text -- ^ The pin order id associated with the ssio insertion order
                                                    -> Handler Value
getAdAccountsByTextSsioInsertionOrdersByTextStatusR adAccountId pinOrderId = notImplemented

-- | Get Salesforce order lines by ad account id.
--
--   Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
-- operationId: ssioOrderLines/getByAdAccount
getAdAccountsByTextSsioOrderLinesR :: Text -- ^ Unique identifier of an ad account.
                                   -> Handler Value
getAdAccountsByTextSsioOrderLinesR adAccountId = notImplemented
