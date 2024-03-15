
# Table `items_issues_list_200_response`
(mapped from: ItemsIssuesList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsItemValidationIssues&gt;**](CatalogsItemValidationIssues.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `ItemsIssuesList200ResponseCatalogsItemValidationIssues`**
(mapped from: ItemsIssuesList200ResponseCatalogsItemValidationIssues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemsIssuesList200Response | itemsIssuesList200Response | long | | kotlin.Long | Primary Key | *one*
catalogsItemValidationIssues | catalogsItemValidationIssues | long | | kotlin.Long | Foreign Key | *many*




