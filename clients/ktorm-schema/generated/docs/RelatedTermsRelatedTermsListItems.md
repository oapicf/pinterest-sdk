
# Table `RelatedTermsRelatedTermsListItems`
(mapped from: RelatedTermsRelatedTermsListItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**relatedTerms** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**term** | term | text |  | **kotlin.String** |  |  [optional]


# **Table `RelatedTermsRelatedTermsListItemsRelatedTerms`**
(mapped from: RelatedTermsRelatedTermsListItemsRelatedTerms)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
relatedTermsRelatedTermsListItems | relatedTermsRelatedTermsListItems | long | | kotlin.Long | Primary Key | *one*
relatedTerms | relatedTerms | text | | kotlin.String | Foreign Key | *many*




