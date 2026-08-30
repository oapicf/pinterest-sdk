# TargetingTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String!** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] [default to null]
**autoTargetingEnabled** | **Boolean!** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**createdTime** | **Int!** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] [default to null]
**Id_** | **String!** | Targeting template ID. | [optional] [readonly] [default to null]
**keywords** | [**TargetingTemplateKeyword**](TargetingTemplateKeyword.md) |  | [optional] [default to null]
**name** | **String!** | targeting template name | [default to null]
**placementGroup** | [***PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to null]
**sizing** | [***TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] [default to null]
**status** | [***TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] [default to null]
**targetingAttributes** | [***TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | [default to null]
**trackingUrls** | [***TrackingUrls**](TrackingUrls.md) |  | [optional] [default to null]
**updatedTime** | **Int!** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] [default to null]
**valid** | **Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


