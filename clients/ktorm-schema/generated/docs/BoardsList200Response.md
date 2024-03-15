
# Table `boards_list_200_response`
(mapped from: BoardsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Board&gt;**](Board.md) | Boards | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BoardsList200ResponseBoard`**
(mapped from: BoardsList200ResponseBoard)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
boardsList200Response | boardsList200Response | long | | kotlin.Long | Primary Key | *one*
board | board | long | | kotlin.Long | Foreign Key | *many*




