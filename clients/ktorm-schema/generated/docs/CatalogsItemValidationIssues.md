
# Table `CatalogsItemValidationIssues`
(mapped from: CatalogsItemValidationIssues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemNumber** | item_number | int NOT NULL |  | **kotlin.Int** | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | 
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The merchant-created unique ID that represents the product. | 
**errors** | errors | long NOT NULL |  | [**CatalogsItemValidationErrors**](CatalogsItemValidationErrors.md) |  |  [foreignkey]
**warnings** | warnings | long NOT NULL |  | [**CatalogsItemValidationWarnings**](CatalogsItemValidationWarnings.md) |  |  [foreignkey]






