
# Table `board_sections_list_200_response`
(mapped from: BoardSectionsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BoardSection&gt;**](BoardSection.md) | Board sections | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BoardSectionsList200ResponseBoardSection`**
(mapped from: BoardSectionsList200ResponseBoardSection)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
boardSectionsList200Response | boardSectionsList200Response | long | | kotlin.Long | Primary Key | *one*
boardSection | boardSection | long | | kotlin.Long | Foreign Key | *many*




