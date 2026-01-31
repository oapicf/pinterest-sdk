
# Table `RelatedTerms_related_terms_list_inner`
(mapped from: RelatedTermsRelatedTermsListInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**relatedTerms** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**term** | term | text |  | **kotlin.String** |  |  [optional]


# **Table `RelatedTermsRelatedTermsListInnerRelatedTerms`**
(mapped from: RelatedTermsRelatedTermsListInnerRelatedTerms)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
relatedTermsRelatedTermsListInner | relatedTermsRelatedTermsListInner | long | | kotlin.Long | Primary Key | *one*
relatedTerms | relatedTerms | text | | kotlin.String | Foreign Key | *many*




