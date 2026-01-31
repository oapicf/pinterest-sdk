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
> Audience AudiencesCreate(adAccountId, audienceCreateRequest)

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific &#x60;audience_ids&#x60; when you create an ad group. &lt;p/&gt; Learn about &lt;a href&#x3D;\&quot;/docs/work-with-targets-and-audiences/create-audiences/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;creating different kinds of audiences&lt;/a&gt;.
<a name="AudiencesGet"></a>
# **AudiencesGet**
> Audience AudiencesGet(adAccountId, audienceId)

Get audience

Get a specific audience given the audience ID.
<a name="AudiencesList"></a>
# **AudiencesList**
> AudiencesList200Response AudiencesList(adAccountId, bookmark, order, pageSize, ownershipType)

List audiences

Get list of audiences for the ad account.
<a name="AudiencesUpdate"></a>
# **AudiencesUpdate**
> Audience AudiencesUpdate(adAccountId, audienceId, audienceUpdateRequest)

Update audience

Update (edit or remove) an existing targeting audience.
