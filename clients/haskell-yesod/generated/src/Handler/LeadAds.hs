{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.LeadAds where

import           Import


-- | Delete lead ads subscription
--
-- Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
-- operationId: adAccountsSubscriptions/delById
deleteAdAccountsByTextLeadsSubscriptionsByTextR :: Text -- ^ Unique identifier of an ad account.
                                                -> Text -- ^ Unique identifier of a subscription.
                                                -> Handler Value
deleteAdAccountsByTextLeadsSubscriptionsByTextR adAccountId subscriptionId = notImplemented

-- | Get lead ads subscription
--
-- Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
-- operationId: adAccountsSubscriptions/getById
getAdAccountsByTextLeadsSubscriptionsByTextR :: Text -- ^ Unique identifier of an ad account.
                                             -> Text -- ^ Unique identifier of a subscription.
                                             -> Handler Value
getAdAccountsByTextLeadsSubscriptionsByTextR adAccountId subscriptionId = notImplemented

-- | Get lead ads subscriptions
--
-- Get the advertiser&#39;s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
-- operationId: adAccountsSubscriptions/getList
getAdAccountsByTextLeadsSubscriptionsR :: Text -- ^ Unique identifier of an ad account.
                                       -> Handler Value
getAdAccountsByTextLeadsSubscriptionsR adAccountId = notImplemented

-- | Create lead ads subscription
--
-- Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records. - For data security, egress lead data is encrypted with AES-256-GCM.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
-- operationId: adAccountsSubscriptions/post
postAdAccountsByTextLeadsSubscriptionsR :: Text -- ^ Unique identifier of an ad account.
                                        -> Handler Value
postAdAccountsByTextLeadsSubscriptionsR adAccountId = notImplemented
