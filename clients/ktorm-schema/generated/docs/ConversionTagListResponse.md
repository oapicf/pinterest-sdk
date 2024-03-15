
# Table `ConversionTagListResponse`
(mapped from: ConversionTagListResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionTagResponse&gt;**](ConversionTagResponse.md) |  |  [optional]


# **Table `ConversionTagListResponseConversionTagResponse`**
(mapped from: ConversionTagListResponseConversionTagResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionTagListResponse | conversionTagListResponse | long | | kotlin.Long | Primary Key | *one*
conversionTagResponse | conversionTagResponse | long | | kotlin.Long | Foreign Key | *many*



