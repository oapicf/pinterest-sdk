

# CatalogsCreateRetailItem

An item to be created

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemId** | **String** | The catalog item id in the merchant namespace |  |
|**operation** | [**OperationEnum**](#OperationEnum) |  |  |
|**attributes** | [**ItemAttributes**](ItemAttributes.md) |  |  |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| UPDATE | &quot;UPDATE&quot; |
| UPSERT | &quot;UPSERT&quot; |
| DELETE | &quot;DELETE&quot; |



