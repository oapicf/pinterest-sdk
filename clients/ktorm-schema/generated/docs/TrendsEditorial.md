
# Table `TrendsEditorial`
(mapped from: TrendsEditorial)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**boardUrl** | board_url | text NOT NULL |  | **kotlin.String** | URL of the editorial board | 
**description** | description | text NOT NULL |  | **kotlin.String** | Description of the editorial article | 
**interests** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of interests related to the editorial article | 
**pinsUrl** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | URL of the pins related to the editorial article | 
**relatedKeywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordInfo&gt;**](KeywordInfo.md) | List of keywords related to the editorial article | 
**title** | title | text NOT NULL |  | **kotlin.String** | Title of the editorial article | 




# **Table `TrendsEditorialInterests`**
(mapped from: TrendsEditorialInterests)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trendsEditorial | trendsEditorial | long | | kotlin.Long | Primary Key | *one*
interests | interests | text | | kotlin.String | Foreign Key | *many*



# **Table `TrendsEditorialPinsUrl`**
(mapped from: TrendsEditorialPinsUrl)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trendsEditorial | trendsEditorial | long | | kotlin.Long | Primary Key | *one*
pinsUrl | pinsUrl | text | | kotlin.String | Foreign Key | *many*



# **Table `TrendsEditorialKeywordInfo`**
(mapped from: TrendsEditorialKeywordInfo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trendsEditorial | trendsEditorial | long | | kotlin.Long | Primary Key | *one*
keywordInfo | keywordInfo | long | | kotlin.Long | Foreign Key | *many*




