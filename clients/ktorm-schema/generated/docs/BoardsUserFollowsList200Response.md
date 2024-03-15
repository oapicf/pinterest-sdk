
# Table `boards_user_follows_list_200_response`
(mapped from: BoardsUserFollowsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Board&gt;**](Board.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BoardsUserFollowsList200ResponseBoard`**
(mapped from: BoardsUserFollowsList200ResponseBoard)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
boardsUserFollowsList200Response | boardsUserFollowsList200Response | long | | kotlin.Long | Primary Key | *one*
board | board | long | | kotlin.Long | Foreign Key | *many*




