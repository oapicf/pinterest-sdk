# audience_sharing_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountsAudiencesSharedAccountsList**](audience_sharing_api.md#AdAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**BusinessAccountAudiencesSharedAccountsList**](audience_sharing_api.md#BusinessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**SharedAudiencesForBusinessList**](audience_sharing_api.md#SharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**UpdateAdAccountToAdAccountSharedAudience**](audience_sharing_api.md#UpdateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**UpdateAdAccountToBusinessSharedAudience**](audience_sharing_api.md#UpdateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**UpdateBusinessToAdAccountSharedAudience**](audience_sharing_api.md#UpdateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**UpdateBusinessToBusinessSharedAudience**](audience_sharing_api.md#UpdateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


<a name="AdAccountsAudiencesSharedAccountsList"></a>
# **AdAccountsAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response AdAccountsAudiencesSharedAccountsList(adAccountId, audienceId, accountType, pageSize, bookmark)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
<a name="BusinessAccountAudiencesSharedAccountsList"></a>
# **BusinessAccountAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response BusinessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
<a name="SharedAudiencesForBusinessList"></a>
# **SharedAudiencesForBusinessList**
> AudiencesList200Response SharedAudiencesForBusinessList(businessId, bookmark, order, pageSize)

List received audiences for a business

Get a list of received audiences for the given business.
<a name="UpdateAdAccountToAdAccountSharedAudience"></a>
# **UpdateAdAccountToAdAccountSharedAudience**
> SharedAudienceResponse UpdateAdAccountToAdAccountSharedAudience(adAccountId, sharedAudience)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
<a name="UpdateAdAccountToBusinessSharedAudience"></a>
# **UpdateAdAccountToBusinessSharedAudience**
> BusinessSharedAudienceResponse UpdateAdAccountToBusinessSharedAudience(adAccountId, businessSharedAudience)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
<a name="UpdateBusinessToAdAccountSharedAudience"></a>
# **UpdateBusinessToAdAccountSharedAudience**
> SharedAudienceResponse UpdateBusinessToAdAccountSharedAudience(businessId, sharedAudience)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
<a name="UpdateBusinessToBusinessSharedAudience"></a>
# **UpdateBusinessToBusinessSharedAudience**
> BusinessSharedAudienceResponse UpdateBusinessToBusinessSharedAudience(businessId, businessSharedAudience)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
