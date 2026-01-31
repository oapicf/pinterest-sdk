# Board

Board

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] [readonly] [default to undefined]
**created_at** | **string** | Date and time of board creation. | [optional] [readonly] [default to undefined]
**board_pins_modified_at** | **string** | Date and time of last board pins modified. | [optional] [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**collaborator_count** | **number** | Count of collaborators on the board. | [optional] [readonly] [default to undefined]
**pin_count** | **number** | Count of pins on the board. | [optional] [readonly] [default to undefined]
**follower_count** | **number** | Board follower count. | [optional] [readonly] [default to undefined]
**media** | [**BoardMedia**](BoardMedia.md) |  | [optional] [default to undefined]
**owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] [default to undefined]
**privacy** | **string** | Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt; | [optional] [default to PrivacyEnum_Public]

## Example

```typescript
import { Board } from './api';

const instance: Board = {
    id,
    created_at,
    board_pins_modified_at,
    name,
    description,
    collaborator_count,
    pin_count,
    follower_count,
    media,
    owner,
    privacy,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
