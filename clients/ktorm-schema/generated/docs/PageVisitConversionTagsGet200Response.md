
# Table `page_visit_conversion_tags_get_200_response`
(mapped from: PageVisitConversionTagsGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionEventResponse&gt;**](ConversionEventResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `PageVisitConversionTagsGet200ResponseConversionEventResponse`**
(mapped from: PageVisitConversionTagsGet200ResponseConversionEventResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pageVisitConversionTagsGet200Response | pageVisitConversionTagsGet200Response | long | | kotlin.Long | Primary Key | *one*
conversionEventResponse | conversionEventResponse | long | | kotlin.Long | Foreign Key | *many*




