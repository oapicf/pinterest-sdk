
# Table `keywords_get_200_response`
(mapped from: KeywordsGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Keyword&gt;**](Keyword.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `KeywordsGet200ResponseKeyword`**
(mapped from: KeywordsGet200ResponseKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywordsGet200Response | keywordsGet200Response | long | | kotlin.Long | Primary Key | *one*
keyword | keyword | long | | kotlin.Long | Foreign Key | *many*




