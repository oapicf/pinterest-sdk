# targeting_template_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TargetingTemplateCreate**](targeting_template_api.md#TargetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**TargetingTemplateList**](targeting_template_api.md#TargetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**TargetingTemplateUpdate**](targeting_template_api.md#TargetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


<a name="TargetingTemplateCreate"></a>
# **TargetingTemplateCreate**
> TargetingTemplate TargetingTemplateCreate(adAccountId, targetingTemplateCreate)

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
<a name="TargetingTemplateList"></a>
# **TargetingTemplateList**
> TargetingTemplateList200Response TargetingTemplateList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)

List targeting templates

Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;
<a name="TargetingTemplateUpdate"></a>
# **TargetingTemplateUpdate**
> TargetingTemplateUpdate(adAccountId, targetingTemplateUpdateRequestReadOrUpdate)

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID
