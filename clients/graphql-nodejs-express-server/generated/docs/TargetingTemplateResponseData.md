# TargetingTemplateResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String!** | targeting template name | [optional] [default to null]
**autoTargetingEnabled** | **Boolean!** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**targetingAttributes** | [***TargetingSpec**](TargetingSpec.md) |  | [optional] [default to null]
**placementGroup** | [***PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to null]
**keywords** | [**TargetingTemplateKeyword**](TargetingTemplateKeyword.md) |  | [optional] [default to null]
**trackingUrls** | [***TrackingUrls**](TrackingUrls.md) |  | [optional] [default to null]
**Id_** | **String!** | Targeting template ID. | [optional] [default to null]
**createdTime** | **Int!** | Targeting template created time. Unix timestamp in seconds. | [optional] [default to null]
**updatedTime** | **Int!** | Targeting template updated time.Unix timestamp in seconds. | [optional] [default to null]
**adAccountId** | **String!** | The ID of the advertiser that this targeting template belongs to. | [optional] [default to null]
**status** | **String!** | Indicate targeting template is active or Deleted | [optional] [default to ACTIVE]
**sizing** | [***TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


