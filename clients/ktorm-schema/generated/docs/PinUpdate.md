
# Table `PinUpdate`
(mapped from: PinUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**altText** | alt_text | text |  | **kotlin.String** | Pin&#39;s alternative text. |  [optional]
**boardId** | board_id | text |  | **kotlin.String** | The id of the board to move the Pin onto. |  [optional]
**boardSectionId** | board_section_id | text |  | **kotlin.String** | &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID. |  [optional]
**description** | description | text |  | **kotlin.String** | Pin description - 800 characters maximum. |  [optional]
**link** | link | text |  | **kotlin.String** | URL viewer is taken to when they click pin. |  [optional]
**title** | title | text |  | **kotlin.String** | The native pin title that creators explicitly prefer to display. |  [optional]
**carouselSlots** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinUpdateCarouselSlotsInner&gt;**](PinUpdateCarouselSlotsInner.md) | Carousel Pin slots data. |  [optional]
**note** | note | text |  | **kotlin.String** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. |  [optional]








# **Table `PinUpdatePinUpdateCarouselSlotsInner`**
(mapped from: PinUpdatePinUpdateCarouselSlotsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinUpdate | pinUpdate | long | | kotlin.Long | Primary Key | *one*
pinUpdateCarouselSlotsInner | pinUpdateCarouselSlotsInner | long | | kotlin.Long | Foreign Key | *many*




