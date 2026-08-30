# labels_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LabelsApply**](labels_api.md#LabelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**LabelsCreate**](labels_api.md#LabelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**LabelsList**](labels_api.md#LabelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**LabelsRemove**](labels_api.md#LabelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**LabelsUpdate**](labels_api.md#LabelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


<a name="LabelsApply"></a>
# **LabelsApply**
> LabeledEntities LabelsApply(adAccountId, labelId, labeledEntitiesCreate)

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
<a name="LabelsCreate"></a>
# **LabelsCreate**
> LabelsResponse LabelsCreate(adAccountId, labelCreateRequest)

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
<a name="LabelsList"></a>
# **LabelsList**
> LabelsList200Response LabelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize)

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
<a name="LabelsRemove"></a>
# **LabelsRemove**
> LabeledEntities LabelsRemove(adAccountId, labelId, labeledEntitiesCreate)

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
<a name="LabelsUpdate"></a>
# **LabelsUpdate**
> LabelsResponse LabelsUpdate(adAccountId, labelUpdateRequest)

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
