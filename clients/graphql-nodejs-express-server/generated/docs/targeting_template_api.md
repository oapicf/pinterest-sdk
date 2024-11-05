# targeting_template_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TargetingTemplateCreate**](targeting_template_api.md#TargetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**TargetingTemplateList**](targeting_template_api.md#TargetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**TargetingTemplateUpdate**](targeting_template_api.md#TargetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


<a name="TargetingTemplateCreate"></a>
# **TargetingTemplateCreate**
> TargetingTemplateGetResponseData TargetingTemplateCreate(adAccountId, targetingTemplateCreate)

Create targeting templates

&lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;
<a name="TargetingTemplateList"></a>
# **TargetingTemplateList**
> TargetingTemplateList200Response TargetingTemplateList(adAccountId, order, includeSizing, searchQuery, pageSize, bookmark)

List targeting templates

Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;
<a name="TargetingTemplateUpdate"></a>
# **TargetingTemplateUpdate**
> TargetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequest)

Update targeting templates

&lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;
