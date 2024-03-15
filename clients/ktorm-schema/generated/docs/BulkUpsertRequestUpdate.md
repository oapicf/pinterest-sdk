
# Table `BulkUpsertRequestUpdate`
(mapped from: BulkUpsertRequestUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaigns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignUpdateRequest&gt;**](CampaignUpdateRequest.md) |  |  [optional]
**adGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupUpdateRequest&gt;**](AdGroupUpdateRequest.md) |  |  [optional]
**ads** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdUpdateRequest&gt;**](AdUpdateRequest.md) |  |  [optional]
**productGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupPromotionUpdateRequest&gt;**](ProductGroupPromotionUpdateRequest.md) |  |  [optional]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordUpdate&gt;**](KeywordUpdate.md) |  |  [optional]


# **Table `BulkUpsertRequestUpdateCampaignUpdateRequest`**
(mapped from: BulkUpsertRequestUpdateCampaignUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
campaignUpdateRequest | campaignUpdateRequest | long | | kotlin.Long | Foreign Key | *many*



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



# **Table `BulkUpsertRequestUpdateProductGroupPromotionUpdateRequest`**
(mapped from: BulkUpsertRequestUpdateProductGroupPromotionUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
productGroupPromotionUpdateRequest | productGroupPromotionUpdateRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestUpdateKeywordUpdate`**
(mapped from: BulkUpsertRequestUpdateKeywordUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
keywordUpdate | keywordUpdate | long | | kotlin.Long | Foreign Key | *many*



