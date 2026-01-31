# RelatedTermsRelatedTermsListInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**related_terms** | **List[str]** |  | [optional] 
**term** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.related_terms_related_terms_list_inner import RelatedTermsRelatedTermsListInner

# TODO update the JSON string below
json = "{}"
# create an instance of RelatedTermsRelatedTermsListInner from a JSON string
related_terms_related_terms_list_inner_instance = RelatedTermsRelatedTermsListInner.from_json(json)
# print the JSON string representation of the object
print(RelatedTermsRelatedTermsListInner.to_json())

# convert the object into a dict
related_terms_related_terms_list_inner_dict = related_terms_related_terms_list_inner_instance.to_dict()
# create an instance of RelatedTermsRelatedTermsListInner from a dict
related_terms_related_terms_list_inner_from_dict = RelatedTermsRelatedTermsListInner.from_dict(related_terms_related_terms_list_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


