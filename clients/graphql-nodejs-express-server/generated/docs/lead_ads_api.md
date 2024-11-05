# lead_ads_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountsSubscriptionsDelById**](lead_ads_api.md#AdAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**AdAccountsSubscriptionsGetById**](lead_ads_api.md#AdAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
[**AdAccountsSubscriptionsGetList**](lead_ads_api.md#AdAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**AdAccountsSubscriptionsPost**](lead_ads_api.md#AdAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


<a name="AdAccountsSubscriptionsDelById"></a>
# **AdAccountsSubscriptionsDelById**
> AdAccountsSubscriptionsDelById(adAccountId, subscriptionId)

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
<a name="AdAccountsSubscriptionsGetById"></a>
# **AdAccountsSubscriptionsGetById**
> AdAccountGetSubscriptionResponse AdAccountsSubscriptionsGetById(adAccountId, subscriptionId)

Get lead ads subscription

Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
<a name="AdAccountsSubscriptionsGetList"></a>
# **AdAccountsSubscriptionsGetList**
> AdAccountsSubscriptionsGetList200Response AdAccountsSubscriptionsGetList(adAccountId, pageSize, bookmark)

Get lead ads subscriptions

Get the advertiser&#39;s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
<a name="AdAccountsSubscriptionsPost"></a>
# **AdAccountsSubscriptionsPost**
> AdAccountCreateSubscriptionResponse AdAccountsSubscriptionsPost(adAccountId, adAccountCreateSubscriptionRequest)

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records. - For data security, egress lead data is encrypted with AES-256-GCM.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
