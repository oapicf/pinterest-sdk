
# Table `SupplementalOperationResult`
(mapped from: SupplementalOperationResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | Catalog item id in the merchant namespace | 
**status** | status | long NOT NULL |  | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record |  [foreignkey]
**storeCode** | store_code | text NOT NULL |  | **kotlin.String** | Store code for the local inventory item | 
**supplementalType** | supplemental_type | text NOT NULL |  | [**supplemental_type**](#SupplementalType) |  | 
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. |  [optional]
**warnings** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record |  [optional]






# **Table `SupplementalOperationResultSupplementalItemValidationEvent`**
(mapped from: SupplementalOperationResultSupplementalItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
supplementalOperationResult | supplementalOperationResult | long | | kotlin.Long | Primary Key | *one*
supplementalItemValidationEvent | supplementalItemValidationEvent | long | | kotlin.Long | Foreign Key | *many*



# **Table `SupplementalOperationResultSupplementalItemValidationEvent`**
(mapped from: SupplementalOperationResultSupplementalItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
supplementalOperationResult | supplementalOperationResult | long | | kotlin.Long | Primary Key | *one*
supplementalItemValidationEvent | supplementalItemValidationEvent | long | | kotlin.Long | Foreign Key | *many*



