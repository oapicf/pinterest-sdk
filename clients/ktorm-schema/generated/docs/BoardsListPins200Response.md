
# Table `boards_list_pins_200_response`
(mapped from: BoardsListPins200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinRead&gt;**](PinRead.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BoardsListPins200ResponsePinRead`**
(mapped from: BoardsListPins200ResponsePinRead)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
boardsListPins200Response | boardsListPins200Response | long | | kotlin.Long | Primary Key | *one*
pinRead | pinRead | long | | kotlin.Long | Foreign Key | *many*




