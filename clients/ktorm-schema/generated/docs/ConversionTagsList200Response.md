
# Table `conversion_tags_list_200_response`
(mapped from: ConversionTagsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionTag&gt;**](ConversionTag.md) |  | 


# **Table `ConversionTagsList200ResponseConversionTag`**
(mapped from: ConversionTagsList200ResponseConversionTag)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionTagsList200Response | conversionTagsList200Response | long | | kotlin.Long | Primary Key | *one*
conversionTag | conversionTag | long | | kotlin.Long | Foreign Key | *many*



