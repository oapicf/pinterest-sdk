# RelatedTerms


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot; | [optional] 
**related_term_count** | **int** | Total number of related terms returned | [optional] 
**related_terms_list** | [**List[RelatedTermsRelatedTermsListItems]**](RelatedTermsRelatedTermsListItems.md) | The id of the advertiser. | [optional] 

## Example

```python
from pinterestsdk.models.related_terms import RelatedTerms

# TODO update the JSON string below
json = "{}"
# create an instance of RelatedTerms from a JSON string
related_terms_instance = RelatedTerms.from_json(json)
# print the JSON string representation of the object
print(RelatedTerms.to_json())

# convert the object into a dict
related_terms_dict = related_terms_instance.to_dict()
# create an instance of RelatedTerms from a dict
related_terms_from_dict = RelatedTerms.from_dict(related_terms_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


