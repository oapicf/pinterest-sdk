
# Table `TargetingTemplateCreate`
(mapped from: TargetingTemplateCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Name of targeting template. | 
**targetingAttributes** | targeting_attributes | long NOT NULL |  | [**TargetingSpec**](TargetingSpec.md) |  |  [foreignkey]
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional]
**placementGroup** | placement_group | long |  | [**PlacementGroupType**](PlacementGroupType.md) |  |  [optional] [foreignkey]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  |  [optional]
**trackingUrls** | tracking_urls | long |  | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] [foreignkey]






# **Table `TargetingTemplateCreateTargetingTemplateKeyword`**
(mapped from: TargetingTemplateCreateTargetingTemplateKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingTemplateCreate | targetingTemplateCreate | long | | kotlin.Long | Primary Key | *one*
targetingTemplateKeyword | targetingTemplateKeyword | long | | kotlin.Long | Foreign Key | *many*




