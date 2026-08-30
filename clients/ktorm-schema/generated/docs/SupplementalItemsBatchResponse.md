
# Table `SupplementalItemsBatchResponse`
(mapped from: SupplementalItemsBatchResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**batchId** | batch_id | text NOT NULL |  | **kotlin.String** | Id of the batch operation |  [readonly]
**createdTime** | created_time | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [readonly]
**operationResults** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SupplementalOperationResult&gt;**](SupplementalOperationResult.md) | Array of operation results |  [readonly]
**status** | status | long NOT NULL |  | [**SupplementalItemBatchOperationStatus**](SupplementalItemBatchOperationStatus.md) | Status of the batch: PROCESSING, COMPLETED, FAILED |  [readonly] [foreignkey]
**completedTime** | completed_time | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] [readonly]




# **Table `SupplementalItemsBatchResponseSupplementalOperationResult`**
(mapped from: SupplementalItemsBatchResponseSupplementalOperationResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
supplementalItemsBatchResponse | supplementalItemsBatchResponse | long | | kotlin.Long | Primary Key | *one*
supplementalOperationResult | supplementalOperationResult | long | | kotlin.Long | Foreign Key | *many*





