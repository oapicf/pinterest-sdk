
# Table `conversion_deletion_request_list_200_response`
(mapped from: ConversionDeletionRequestList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionDeletionRequest&gt;**](ConversionDeletionRequest.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `ConversionDeletionRequestList200ResponseConversionDeletionRequest`**
(mapped from: ConversionDeletionRequestList200ResponseConversionDeletionRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionDeletionRequestList200Response | conversionDeletionRequestList200Response | long | | kotlin.Long | Primary Key | *one*
conversionDeletionRequest | conversionDeletionRequest | long | | kotlin.Long | Foreign Key | *many*




