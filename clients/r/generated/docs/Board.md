# openapi::Board


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_pins_modified_at** | **character** | Date and time of last board pins modified. | [optional] [readonly] 
**collaborator_count** | **integer** | Count of collaborators on the board. | [optional] [readonly] [Min: 0] 
**created_at** | **character** | Date and time of board creation. | [optional] [readonly] 
**description** | **character** |  | [optional] 
**follower_count** | **integer** | Board follower count. | [optional] [readonly] [Min: 0] 
**id** | **character** |  | [readonly] [Pattern: ^\\d+$] 
**is_ads_only** | **character** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to FALSE] 
**media** | [**BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] 
**name** | **character** |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**pin_count** | **integer** | Count of Pins on the board. | [optional] [readonly] [Min: 0] 
**privacy** | [**BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] [Enum: ] 


