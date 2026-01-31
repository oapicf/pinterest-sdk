
# Table `ConversionTagListResponse`
(mapped from: ConversionTagListResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionTag&gt;**](ConversionTag.md) |  |  [optional]


# **Table `ConversionTagListResponseConversionTag`**
(mapped from: ConversionTagListResponseConversionTag)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionTagListResponse | conversionTagListResponse | long | | kotlin.Long | Primary Key | *one*
conversionTag | conversionTag | long | | kotlin.Long | Foreign Key | *many*



