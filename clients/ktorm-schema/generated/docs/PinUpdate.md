
# Table `PinUpdate`
(mapped from: PinUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**aiDisclosures** | ai_disclosures | long |  | [**AiDisclosuresUpdate**](AiDisclosuresUpdate.md) | AI disclosure declarations the creator has made about this Pin. |  [optional] [foreignkey]
**altText** | alt_text | text |  | **kotlin.String** |  |  [optional]
**boardId** | board_id | text |  | **kotlin.String** | The board to which this Pin belongs. |  [optional]
**boardSectionId** | board_section_id | text |  | **kotlin.String** | The board section to which this Pin belongs. |  [optional]
**carouselSlots** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CarouselSlot&gt;**](CarouselSlot.md) | Carousel Pin slots data. |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**link** | link | text |  | **kotlin.String** |  |  [optional]
**title** | title | text |  | **kotlin.String** |  |  [optional]






# **Table `PinUpdateCarouselSlot`**
(mapped from: PinUpdateCarouselSlot)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinUpdate | pinUpdate | long | | kotlin.Long | Primary Key | *one*
carouselSlot | carouselSlot | long | | kotlin.Long | Foreign Key | *many*






