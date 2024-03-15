
# Table `boards_list_pins_200_response`
(mapped from: BoardsListPins200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Pin&gt;**](Pin.md) | Pins | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BoardsListPins200ResponsePin`**
(mapped from: BoardsListPins200ResponsePin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
boardsListPins200Response | boardsListPins200Response | long | | kotlin.Long | Primary Key | *one*
pin | pin | long | | kotlin.Long | Foreign Key | *many*




