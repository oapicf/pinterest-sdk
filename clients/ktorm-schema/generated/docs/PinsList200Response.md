
# Table `pins_list_200_response`
(mapped from: PinsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Pin&gt;**](Pin.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `PinsList200ResponsePin`**
(mapped from: PinsList200ResponsePin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinsList200Response | pinsList200Response | long | | kotlin.Long | Primary Key | *one*
pin | pin | long | | kotlin.Long | Foreign Key | *many*




