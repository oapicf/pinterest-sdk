{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Billing where

import           Import


-- | Redeem ad credits
--
-- Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
-- operationId: adsCredit/redeem
postAdAccountsByTextAdsCreditRedeemR :: Text -- ^ Unique identifier of an ad account.
                                     -> Handler Value
postAdAccountsByTextAdsCreditRedeemR adAccountId = notImplemented

-- | Get ads credit discounts
--
-- Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
-- operationId: adsCreditsDiscounts/get
getAdAccountsByTextAdsCreditDiscountsR :: Text -- ^ Unique identifier of an ad account.
                                       -> Handler Value
getAdAccountsByTextAdsCreditDiscountsR adAccountId = notImplemented

-- | Get billing profiles
--
-- Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
-- operationId: billingProfiles/get
getAdAccountsByTextBillingProfilesR :: Text -- ^ Unique identifier of an ad account.
                                    -> Handler Value
getAdAccountsByTextBillingProfilesR adAccountId = notImplemented

-- | Get Salesforce account details including bill-to information.
--
-- Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
-- operationId: ssioAccounts/get
getAdAccountsByTextSsioAccountsR :: Text -- ^ Unique identifier of an ad account.
                                 -> Handler Value
getAdAccountsByTextSsioAccountsR adAccountId = notImplemented

-- | Create insertion order through SSIO.
--
-- Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
-- operationId: ssioInsertionOrder/create
postAdAccountsByTextSsioInsertionOrdersR :: Text -- ^ Unique identifier of an ad account.
                                         -> Handler Value
postAdAccountsByTextSsioInsertionOrdersR adAccountId = notImplemented

-- | Edit insertion order through SSIO.
--
-- Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
-- operationId: ssioInsertionOrder/edit
patchAdAccountsByTextSsioInsertionOrdersR :: Text -- ^ Unique identifier of an ad account.
                                          -> Handler Value
patchAdAccountsByTextSsioInsertionOrdersR adAccountId = notImplemented

-- | Get insertion order status by ad account id.
--
-- Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
-- operationId: ssioInsertionOrdersStatus/getByAdAccount
getAdAccountsByTextSsioInsertionOrdersStatusR :: Text -- ^ Unique identifier of an ad account.
                                              -> Handler Value
getAdAccountsByTextSsioInsertionOrdersStatusR adAccountId = notImplemented

-- | Get insertion order status by pin order id.
--
-- Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
-- operationId: ssioInsertionOrdersStatus/getByPinOrderId
getAdAccountsByTextSsioInsertionOrdersByTextStatusR :: Text -- ^ Unique identifier of an ad account.
                                                    -> Text -- ^ The pin order id associated with the ssio insertion order
                                                    -> Handler Value
getAdAccountsByTextSsioInsertionOrdersByTextStatusR adAccountId pinOrderId = notImplemented

-- | Get Salesforce order lines by ad account id.
--
-- Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
-- operationId: ssioOrderLines/getByAdAccount
getAdAccountsByTextSsioOrderLinesR :: Text -- ^ Unique identifier of an ad account.
                                   -> Handler Value
getAdAccountsByTextSsioOrderLinesR adAccountId = notImplemented
