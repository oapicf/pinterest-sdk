
# Table `TargetingTemplateCommon`
(mapped from: TargetingTemplateCommon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** | targeting template name |  [optional]
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional]
**targetingAttributes** | targeting_attributes | long |  | [**TargetingSpec**](TargetingSpec.md) |  |  [optional] [foreignkey]
**placementGroup** | placement_group | long |  | [**PlacementGroupType**](PlacementGroupType.md) |  |  [optional] [foreignkey]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  |  [optional]
**trackingUrls** | tracking_urls | long |  | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] [foreignkey]






# **Table `TargetingTemplateCommonTargetingTemplateKeyword`**
(mapped from: TargetingTemplateCommonTargetingTemplateKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingTemplateCommon | targetingTemplateCommon | long | | kotlin.Long | Primary Key | *one*
targetingTemplateKeyword | targetingTemplateKeyword | long | | kotlin.Long | Foreign Key | *many*




