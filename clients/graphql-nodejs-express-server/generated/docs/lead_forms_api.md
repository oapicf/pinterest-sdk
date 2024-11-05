# lead_forms_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadFormGet**](lead_forms_api.md#LeadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**LeadFormTestCreate**](lead_forms_api.md#LeadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**LeadFormsCreate**](lead_forms_api.md#LeadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**LeadFormsList**](lead_forms_api.md#LeadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**LeadFormsUpdate**](lead_forms_api.md#LeadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


<a name="LeadFormGet"></a>
# **LeadFormGet**
> LeadFormResponse LeadFormGet(adAccountId, leadFormId)

Get lead form by id

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
<a name="LeadFormTestCreate"></a>
# **LeadFormTestCreate**
> LeadFormTestResponse LeadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
<a name="LeadFormsCreate"></a>
# **LeadFormsCreate**
> LeadFormArrayResponse LeadFormsCreate(adAccountId, leadFormCreateRequest)

Create lead forms

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
<a name="LeadFormsList"></a>
# **LeadFormsList**
> LeadFormsList200Response LeadFormsList(adAccountId, pageSize, order, bookmark)

List lead forms

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
<a name="LeadFormsUpdate"></a>
# **LeadFormsUpdate**
> LeadFormArrayResponse LeadFormsUpdate(adAccountId, leadFormUpdateRequest)

Update lead forms

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
