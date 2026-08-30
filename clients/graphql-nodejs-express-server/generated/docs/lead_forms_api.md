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
> LeadForm LeadFormGet(leadFormId, adAccountId)

Get lead form by id

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
<a name="LeadFormTestCreate"></a>
# **LeadFormTestCreate**
> LeadFormTest LeadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
<a name="LeadFormsCreate"></a>
# **LeadFormsCreate**
> LeadFormsCreate200Response LeadFormsCreate(adAccountId, leadFormCreate)

Create lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
<a name="LeadFormsList"></a>
# **LeadFormsList**
> LeadFormsList200Response LeadFormsList(adAccountId, bookmark, pageSize, order)

List lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
<a name="LeadFormsUpdate"></a>
# **LeadFormsUpdate**
> LeadFormsCreate200Response LeadFormsUpdate(adAccountId, leadFormBatchUpdate)

Update lead forms

**This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
