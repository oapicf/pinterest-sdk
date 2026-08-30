
# Table `SSIOAccount`
(mapped from: SSIOAccount)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**billtoInfos** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SSIOAccountItem&gt;**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. |  [optional]
**canEdit** | can_edit | boolean |  | **kotlin.Boolean** | Advertiser eligible to update order lines |  [optional]
**currency** | currency | text |  | **kotlin.String** |  |  [optional]
**eligible** | eligible | boolean |  | **kotlin.Boolean** | Advertiser eligible to create order lines |  [optional]
**error** | error | text |  | **kotlin.String** | Error indicator from Salesforce which could be \&quot;No Error\&quot; |  [optional]
**pmpNames** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SSIOAccountPMPName&gt;**](SSIOAccountPMPName.md) |  |  [optional]


# **Table `SSIOAccountSSIOAccountItem`**
(mapped from: SSIOAccountSSIOAccountItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
sSIOAccount | sSIOAccount | long | | kotlin.Long | Primary Key | *one*
sSIOAccountItem | sSIOAccountItem | long | | kotlin.Long | Foreign Key | *many*







# **Table `SSIOAccountSSIOAccountPMPName`**
(mapped from: SSIOAccountSSIOAccountPMPName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
sSIOAccount | sSIOAccount | long | | kotlin.Long | Primary Key | *one*
sSIOAccountPMPName | sSIOAccountPMPName | long | | kotlin.Long | Foreign Key | *many*



