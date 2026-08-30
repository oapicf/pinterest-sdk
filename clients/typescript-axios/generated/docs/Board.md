# Board


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_pins_modified_at** | **string** | Date and time of last board pins modified. | [optional] [readonly] [default to undefined]
**collaborator_count** | **number** | Count of collaborators on the board. | [optional] [readonly] [default to undefined]
**created_at** | **string** | Date and time of board creation. | [optional] [readonly] [default to undefined]
**description** | **string** |  | [optional] [default to undefined]
**follower_count** | **number** | Board follower count. | [optional] [readonly] [default to undefined]
**id** | **string** |  | [readonly] [default to undefined]
**is_ads_only** | **boolean** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**media** | [**BoardMedia**](BoardMedia.md) | Board media. | [optional] [readonly] [default to undefined]
**name** | **string** |     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | [default to undefined]
**owner** | [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] [default to undefined]
**pin_count** | **number** | Count of Pins on the board. | [optional] [readonly] [default to undefined]
**privacy** | [**BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] [default to undefined]

## Example

```typescript
import { Board } from './api';

const instance: Board = {
    board_pins_modified_at,
    collaborator_count,
    created_at,
    description,
    follower_count,
    id,
    is_ads_only,
    media,
    name,
    owner,
    pin_count,
    privacy,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
