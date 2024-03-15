# # Board

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] [readonly]
**created_at** | **\DateTime** | Date and time of board creation. | [optional] [readonly]
**board_pins_modified_at** | **\DateTime** | Date and time of last board pins modified. | [optional] [readonly]
**name** | **string** |  |
**description** | **string** |  | [optional]
**collaborator_count** | **int** | Count of collaborators on the board. | [optional] [readonly]
**pin_count** | **int** | Count of pins on the board. | [optional] [readonly]
**follower_count** | **int** | Board follower count. | [optional] [readonly]
**media** | [**\OpenAPI\Client\Model\BoardMedia**](BoardMedia.md) |  | [optional]
**owner** | [**\OpenAPI\Client\Model\BoardOwner**](BoardOwner.md) |  | [optional]
**privacy** | **string** | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to 'PUBLIC']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
