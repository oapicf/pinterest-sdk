
# Table `TargetingTemplateGetResponseData`
(mapped from: TargetingTemplateGetResponseData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** | targeting template name |  [optional]
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional]
**targetingAttributes** | targeting_attributes | long |  | [**TargetingSpec**](TargetingSpec.md) |  |  [optional] [foreignkey]
**placementGroup** | placement_group | long |  | [**PlacementGroupType**](PlacementGroupType.md) |  |  [optional] [foreignkey]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  |  [optional]
**trackingUrls** | tracking_urls | long |  | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] [foreignkey]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Targeting template ID. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Targeting template created time. Unix timestamp in seconds. |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Targeting template updated time.Unix timestamp in seconds. |  [optional]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The ID of the advertiser that this targeting template belongs to. |  [optional]
**status** | status | text |  | [**status**](#Status) | Indicate targeting template is active or Deleted |  [optional]
**sizing** | sizing | long |  | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  |  [optional] [foreignkey]
**valid** | valid | boolean |  | **kotlin.Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) |  [optional]






# **Table `TargetingTemplateGetResponseDataTargetingTemplateKeyword`**
(mapped from: TargetingTemplateGetResponseDataTargetingTemplateKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingTemplateGetResponseData | targetingTemplateGetResponseData | long | | kotlin.Long | Primary Key | *one*
targetingTemplateKeyword | targetingTemplateKeyword | long | | kotlin.Long | Foreign Key | *many*











