
# Table `BulkUpsertRequestUpdate`
(mapped from: BulkUpsertRequestUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupUpdateRequest&gt;**](AdGroupUpdateRequest.md) |  |  [optional]
**ads** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdUpdateRequest&gt;**](AdUpdateRequest.md) |  |  [optional]
**campaigns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignUpdateRequest&gt;**](CampaignUpdateRequest.md) |  |  [optional]
**catalogProductGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BulkUpsertRequestUpdateCatalogProductGroupsItems&gt;**](BulkUpsertRequestUpdateCatalogProductGroupsItems.md) |  |  [optional]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordUpdateGenerated&gt;**](KeywordUpdateGenerated.md) |  |  [optional]
**labels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LabelBulkUpdateRequest&gt;**](LabelBulkUpdateRequest.md) |  |  [optional]
**productGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductGroupPromotionUpdateRequest&gt;**](ProductGroupPromotionUpdateRequest.md) |  |  [optional]
**schedules** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ScheduleUpdateRequest&gt;**](ScheduleUpdateRequest.md) |  |  [optional]


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



# **Table `BulkUpsertRequestUpdateBulkUpsertRequestUpdateCatalogProductGroupsItems`**
(mapped from: BulkUpsertRequestUpdateBulkUpsertRequestUpdateCatalogProductGroupsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
bulkUpsertRequestUpdateCatalogProductGroupsItems | bulkUpsertRequestUpdateCatalogProductGroupsItems | long | | kotlin.Long | Foreign Key | *many*



# **Table `BulkUpsertRequestUpdateKeywordUpdateGenerated`**
(mapped from: BulkUpsertRequestUpdateKeywordUpdateGenerated)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
keywordUpdateGenerated | keywordUpdateGenerated | long | | kotlin.Long | Foreign Key | *many*



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



# **Table `BulkUpsertRequestUpdateScheduleUpdateRequest`**
(mapped from: BulkUpsertRequestUpdateScheduleUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bulkUpsertRequestUpdate | bulkUpsertRequestUpdate | long | | kotlin.Long | Primary Key | *one*
scheduleUpdateRequest | scheduleUpdateRequest | long | | kotlin.Long | Foreign Key | *many*



