# conversion_tags_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionTagsCreate**](conversion_tags_api.md#ConversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**ConversionTagsGet**](conversion_tags_api.md#ConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**ConversionTagsList**](conversion_tags_api.md#ConversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
[**OcpmEligibleConversionTagsGet**](conversion_tags_api.md#OcpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**PageVisitConversionTagsGet**](conversion_tags_api.md#PageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags


<a name="ConversionTagsCreate"></a>
# **ConversionTagsCreate**
> ConversionTagResponse ConversionTagsCreate(adAccountId, conversionTagCreate)

Create conversion tag

Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/#enhanced-match\&quot;&gt;Enhanced match&lt;/a&gt;
<a name="ConversionTagsGet"></a>
# **ConversionTagsGet**
> ConversionTagResponse ConversionTagsGet(adAccountId, conversionTagId)

Get conversion tag

Get information about an existing conversion tag.
<a name="ConversionTagsList"></a>
# **ConversionTagsList**
> ConversionTagListResponse ConversionTagsList(adAccountId, filterDeleted)

Get conversion tags

List conversion tags associated with an ad account.
<a name="OcpmEligibleConversionTagsGet"></a>
# **OcpmEligibleConversionTagsGet**
> ConversionEventResponse OcpmEligibleConversionTagsGet(adAccountId)

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.
<a name="PageVisitConversionTagsGet"></a>
# **PageVisitConversionTagsGet**
> PageVisitConversionTagsGet200Response PageVisitConversionTagsGet(adAccountId, pageSize, order, bookmark)

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.
