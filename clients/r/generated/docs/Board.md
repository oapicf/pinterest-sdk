# openapi::Board

Board

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** |  | [optional] [readonly] 
**created_at** | **character** | Date and time of board creation. | [optional] [readonly] 
**board_pins_modified_at** | **character** | Date and time of last board pins modified. | [optional] [readonly] 
**name** | **character** |  | 
**description** | **character** |  | [optional] 
**collaborator_count** | **integer** | Count of collaborators on the board. | [optional] [readonly] [Min: 0] 
**pin_count** | **integer** | Count of pins on the board. | [optional] [readonly] [Min: 0] 
**follower_count** | **integer** | Board follower count. | [optional] [readonly] [Min: 0] 
**media** | [**BoardMedia**](Board_media.md) |  | [optional] 
**owner** | [**BoardOwner**](Board_owner.md) |  | [optional] 
**privacy** | **character** | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to &quot;PUBLIC&quot;] [Enum: [PUBLIC, PROTECTED, SECRET]] 


