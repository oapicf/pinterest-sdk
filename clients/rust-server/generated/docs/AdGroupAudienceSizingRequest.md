# AdGroupAudienceSizingRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. | [optional] [default to Some(true)]
**placement_group** | [***models::PlacementGroupType**](PlacementGroupType.md) | <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. | [optional] [default to Some("ALL".to_string())]
**creative_types** | **Vec<String>** | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to None]
**targeting_spec** | [***models::TargetingSpec**](TargetingSpec.md) |  | [optional] [default to None]
**product_group_ids** | **Vec<String>** | Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] [default to None]
**keywords** | [**Vec<models::AdGroupAudienceSizingRequestKeywordsInner>**](AdGroupAudienceSizingRequest_keywords_inner.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


