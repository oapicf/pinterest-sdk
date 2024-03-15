
# Table `feed_processing_results_list_200_response`
(mapped from: FeedProcessingResultsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsFeedProcessingResult&gt;**](CatalogsFeedProcessingResult.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `FeedProcessingResultsList200ResponseCatalogsFeedProcessingResult`**
(mapped from: FeedProcessingResultsList200ResponseCatalogsFeedProcessingResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
feedProcessingResultsList200Response | feedProcessingResultsList200Response | long | | kotlin.Long | Primary Key | *one*
catalogsFeedProcessingResult | catalogsFeedProcessingResult | long | | kotlin.Long | Foreign Key | *many*




