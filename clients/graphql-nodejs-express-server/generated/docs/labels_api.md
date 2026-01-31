# labels_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LabelsCreate**](labels_api.md#LabelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**LabelsList**](labels_api.md#LabelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**LabelsUpdate**](labels_api.md#LabelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


<a name="LabelsCreate"></a>
# **LabelsCreate**
> LabelsResponse LabelsCreate(adAccountId, labelCreateRequest)

Create labels

&lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;
<a name="LabelsList"></a>
# **LabelsList**
> LabelsList200Response LabelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark)

List labels

&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;
<a name="LabelsUpdate"></a>
# **LabelsUpdate**
> LabelsResponse LabelsUpdate(adAccountId, labelUpdateRequest)

Update labels

&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;
