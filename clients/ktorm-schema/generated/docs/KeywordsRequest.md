
# Table `KeywordsRequest`
(mapped from: KeywordsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordsCommon&gt;**](KeywordsCommon.md) | Keyword JSON array. Each array element has 3 fields | 
**parentId** | parent_id | text NOT NULL |  | **kotlin.String** | Keyword parent entity ID (advertiser, campaign, ad group). | 


# **Table `KeywordsRequestKeywordsCommon`**
(mapped from: KeywordsRequestKeywordsCommon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywordsRequest | keywordsRequest | long | | kotlin.Long | Primary Key | *one*
keywordsCommon | keywordsCommon | long | | kotlin.Long | Foreign Key | *many*




