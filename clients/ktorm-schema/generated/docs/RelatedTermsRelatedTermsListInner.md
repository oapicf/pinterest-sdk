
# Table `RelatedTerms_related_terms_list_inner`
(mapped from: RelatedTermsRelatedTermsListInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**term** | term | text |  | **kotlin.String** |  |  [optional]
**relatedTerms** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]



# **Table `RelatedTermsRelatedTermsListInnerRelatedTerms`**
(mapped from: RelatedTermsRelatedTermsListInnerRelatedTerms)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
relatedTermsRelatedTermsListInner | relatedTermsRelatedTermsListInner | long | | kotlin.Long | Primary Key | *one*
relatedTerms | relatedTerms | text | | kotlin.String | Foreign Key | *many*



