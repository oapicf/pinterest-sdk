
# Table `TargetingTemplate`
(mapped from: TargetingTemplate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | targeting template name | 
**targetingAttributes** | targeting_attributes | long NOT NULL |  | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes |  [foreignkey]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The ID of the advertiser that this targeting template belongs to. |  [optional] [readonly]
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Targeting template created time. Unix timestamp in seconds. |  [optional] [readonly]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Targeting template ID. |  [optional] [readonly]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  |  [optional]
**placementGroup** | placement_group | long |  | [**PlacementGroupType**](PlacementGroupType.md) |  |  [optional] [foreignkey]
**sizing** | sizing | long |  | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  |  [optional] [readonly] [foreignkey]
**status** | status | long |  | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted |  [optional] [readonly] [foreignkey]
**trackingUrls** | tracking_urls | long |  | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] [foreignkey]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Targeting template updated time.Unix timestamp in seconds. |  [optional] [readonly]
**valid** | valid | boolean |  | **kotlin.Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) |  [optional] [readonly]








# **Table `TargetingTemplateTargetingTemplateKeyword`**
(mapped from: TargetingTemplateTargetingTemplateKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingTemplate | targetingTemplate | long | | kotlin.Long | Primary Key | *one*
targetingTemplateKeyword | targetingTemplateKeyword | long | | kotlin.Long | Foreign Key | *many*









