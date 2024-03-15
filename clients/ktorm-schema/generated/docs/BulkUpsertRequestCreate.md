
# Table `BulkUpsertRequestCreate`
(mapped from: BulkUpsertRequestCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaigns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignCreateRequest&gt;**](CampaignCreateRequest.md) |  |  [optional]
**adGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupCreateRequest&gt;**](AdGroupCreateRequest.md) |  |  [optional]
**ads** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdCreateRequest&gt;**](AdCreateRequest.md) |  |  [optional]
**productGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupPromotionCreateRequest&gt;**](ProductGroupPromotionCreateRequest.md) |  |  [optional]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordsRequest&gt;**](KeywordsRequest.md) |  |  [optional]


# **Table `BulkUpsertRequestCreateCampaignCreateRequest`**
(mapped from: BulkUpsertRequestCreateCampaignCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestCreate | bulkUpsertRequestCreate | long | | kotlin.Long | Primary Key | *one*
campaignCreateRequest | campaignCreateRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestCreateAdGroupCreateRequest`**
(mapped from: BulkUpsertRequestCreateAdGroupCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestCreate | bulkUpsertRequestCreate | long | | kotlin.Long | Primary Key | *one*
adGroupCreateRequest | adGroupCreateRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestCreateAdCreateRequest`**
(mapped from: BulkUpsertRequestCreateAdCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestCreate | bulkUpsertRequestCreate | long | | kotlin.Long | Primary Key | *one*
adCreateRequest | adCreateRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestCreateProductGroupPromotionCreateRequest`**
(mapped from: BulkUpsertRequestCreateProductGroupPromotionCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestCreate | bulkUpsertRequestCreate | long | | kotlin.Long | Primary Key | *one*
productGroupPromotionCreateRequest | productGroupPromotionCreateRequest | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestCreateKeywordsRequest`**
(mapped from: BulkUpsertRequestCreateKeywordsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestCreate | bulkUpsertRequestCreate | long | | kotlin.Long | Primary Key | *one*
keywordsRequest | keywordsRequest | long | | kotlin.Long | Foreign Key | *many*



