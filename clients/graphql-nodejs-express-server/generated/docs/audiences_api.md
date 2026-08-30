# audiences_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudiencesCreate**](audiences_api.md#AudiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**AudiencesGet**](audiences_api.md#AudiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**AudiencesList**](audiences_api.md#AudiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**AudiencesUpdate**](audiences_api.md#AudiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


<a name="AudiencesCreate"></a>
# **AudiencesCreate**
> AdAccountsAudience AudiencesCreate(adAccountId, adAccountsAudienceCreate)

Create audience

Create a new audience for the ad account.
<a name="AudiencesGet"></a>
# **AudiencesGet**
> AdAccountsAudience AudiencesGet(audienceId, adAccountId)

Get audience

Get a specific audience given the audience ID.
<a name="AudiencesList"></a>
# **AudiencesList**
> AudiencesList200Response AudiencesList(adAccountId, bookmark, pageSize, order, ownershipType, excludeNca)

List audiences

Get list of audiences for the ad account.
<a name="AudiencesUpdate"></a>
# **AudiencesUpdate**
> AdAccountsAudience AudiencesUpdate(audienceId, adAccountId, adAccountsAudienceUpdate)

Update audience

Update an existing audience for the ad account.
