
# Table `BulkUpsertRequestUpdate`
(mapped from: BulkUpsertRequestUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupUpdateRequest&gt;**](AdGroupUpdateRequest.md) |  |  [optional]
**ads** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdUpdateRequest&gt;**](AdUpdateRequest.md) |  |  [optional]
**campaigns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignUpdateRequest&gt;**](CampaignUpdateRequest.md) |  |  [optional]
**catalogProductGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsProductGroupsUpdateRequest&gt;**](CatalogsProductGroupsUpdateRequest.md) |  |  [optional]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordUpdate&gt;**](KeywordUpdate.md) |  |  [optional]
**labels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LabelBulkUpdateRequest&gt;**](LabelBulkUpdateRequest.md) |  |  [optional]
**productGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupPromotionUpdateRequest&gt;**](ProductGroupPromotionUpdateRequest.md) |  |  [optional]


# **Table `BulkUpsertRequestUpdateAdGroupUpdateRequest`**
(mapped from: BulkUpsertRequestUpdateAdGroupUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
adGroupUpdateRequest | adGroupUpdateRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestUpdateAdUpdateRequest`**
(mapped from: BulkUpsertRequestUpdateAdUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
adUpdateRequest | adUpdateRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestUpdateCampaignUpdateRequest`**
(mapped from: BulkUpsertRequestUpdateCampaignUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
campaignUpdateRequest | campaignUpdateRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestUpdateCatalogsProductGroupsUpdateRequest`**
(mapped from: BulkUpsertRequestUpdateCatalogsProductGroupsUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
catalogsProductGroupsUpdateRequest | catalogsProductGroupsUpdateRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestUpdateKeywordUpdate`**
(mapped from: BulkUpsertRequestUpdateKeywordUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
keywordUpdate | keywordUpdate | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestUpdateLabelBulkUpdateRequest`**
(mapped from: BulkUpsertRequestUpdateLabelBulkUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
labelBulkUpdateRequest | labelBulkUpdateRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestUpdateProductGroupPromotionUpdateRequest`**
(mapped from: BulkUpsertRequestUpdateProductGroupPromotionUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
productGroupPromotionUpdateRequest | productGroupPromotionUpdateRequest | long | | kotlin.Long | Foreign Key | *many*



