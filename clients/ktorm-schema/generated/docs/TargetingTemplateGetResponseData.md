
# Table `TargetingTemplateGetResponseData`
(mapped from: TargetingTemplateGetResponseData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  |  [optional]
**name** | name | text |  | **kotlin.String** | targeting template name |  [optional]
**placementGroup** | placement_group | long |  | [**PlacementGroupType**](PlacementGroupType.md) |  |  [optional] [foreignkey]
**targetingAttributes** | targeting_attributes | long |  | [**TargetingSpec**](TargetingSpec.md) |  |  [optional] [foreignkey]
**trackingUrls** | tracking_urls | long |  | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] [foreignkey]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The ID of the advertiser that this targeting template belongs to. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Targeting template created time. Unix timestamp in seconds. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Targeting template ID. |  [optional]
**sizing** | sizing | long |  | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  |  [optional] [foreignkey]
**status** | status | text |  | [**status**](#Status) | Indicate targeting template is active or Deleted |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Targeting template updated time.Unix timestamp in seconds. |  [optional]
**valid** | valid | boolean |  | **kotlin.Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) |  [optional]



# **Table `TargetingTemplateGetResponseDataTargetingTemplateKeyword`**
(mapped from: TargetingTemplateGetResponseDataTargetingTemplateKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingTemplateGetResponseData | targetingTemplateGetResponseData | long | | kotlin.Long | Primary Key | *one*
targetingTemplateKeyword | targetingTemplateKeyword | long | | kotlin.Long | Foreign Key | *many*














