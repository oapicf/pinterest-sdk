# PinUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AltText** | **String** | Pin&#39;s alternative text. | [optional] 
**BoardId** | **String** | The id of the board to move the Pin onto. | [optional] 
**BoardSectionId** | **String** | &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/article/create-a-board-section&quot;&quot;&gt;Board section&lt;/a&gt; ID. | [optional] 
**Description** | **String** | Pin description - 800 characters maximum. | [optional] 
**Link** | **String** | URL viewer is taken to when they click pin. | [optional] 
**Title** | **String** | The native pin title that creators explicitly prefer to display. | [optional] 
**CarouselSlots** | [**PinUpdateCarouselSlotsInner[]**](PinUpdateCarouselSlotsInner.md) | Carousel Pin slots data. | [optional] 
**Note** | **String** | Private note for this Pin. &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins&quot;&quot;&gt;Learn more&lt;/a&gt;. | [optional] 

## Examples

- Prepare the resource
```powershell
$PinUpdate = Initialize-PSOpenAPIToolsPinUpdate  -AltText null `
 -BoardId null `
 -BoardSectionId null `
 -Description null `
 -Link https://www.pinterest.com/ `
 -Title null `
 -CarouselSlots null `
 -Note null
```

- Convert the resource to JSON
```powershell
$PinUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

