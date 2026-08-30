
# Table `RelatedTerms`
(mapped from: RelatedTerms)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot; |  [optional]
**relatedTermCount** | related_term_count | int |  | **kotlin.Int** | Total number of related terms returned |  [optional]
**relatedTermsList** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RelatedTermsRelatedTermsListItems&gt;**](RelatedTermsRelatedTermsListItems.md) | The id of the advertiser. |  [optional]




# **Table `RelatedTermsRelatedTermsRelatedTermsListItems`**
(mapped from: RelatedTermsRelatedTermsRelatedTermsListItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
relatedTerms | relatedTerms | long | | kotlin.Long | Primary Key | *one*
relatedTermsRelatedTermsListItems | relatedTermsRelatedTermsListItems | long | | kotlin.Long | Foreign Key | *many*



