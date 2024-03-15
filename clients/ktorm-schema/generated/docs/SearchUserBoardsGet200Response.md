
# Table `search_user_boards_get_200_response`
(mapped from: SearchUserBoardsGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Board&gt;**](Board.md) | items | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `SearchUserBoardsGet200ResponseBoard`**
(mapped from: SearchUserBoardsGet200ResponseBoard)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
searchUserBoardsGet200Response | searchUserBoardsGet200Response | long | | kotlin.Long | Primary Key | *one*
board | board | long | | kotlin.Long | Foreign Key | *many*




