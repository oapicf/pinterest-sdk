
# Table `SSIOAccountItem`
(mapped from: SSIOAccountItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Salesforce id for billto_info |  [optional]
**ioTermsId** | io_terms_id | text |  | **kotlin.String** | Salesforce id for IO Terms and Conditions |  [optional]
**ioTerms** | io_terms | text |  | **kotlin.String** | Salesforce text for IO Terms and Conditions |  [optional]
**usTermsId** | us_terms_id | text |  | **kotlin.String** | Salesforce id for US Terms and Conditions |  [optional]
**usTerms** | us_terms | text |  | **kotlin.String** | Salesforce text for US Terms and Conditions |  [optional]
**rowTermsId** | row_terms_id | text |  | **kotlin.String** | Salesforce id for Rest of the World Terms and Conditions |  [optional]
**rowTerms** | row_terms | text |  | **kotlin.String** | Salesforce text for Rest of the World Terms and Conditions |  [optional]
**ioType** | io_type | text |  | **kotlin.String** | Insertion Order Type - Pinterest Paper or Agency Paper |  [optional]
**addresses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SSIOAccountAddress&gt;**](SSIOAccountAddress.md) | Address information that is associated with this account. |  [optional]










# **Table `SSIOAccountItemSSIOAccountAddress`**
(mapped from: SSIOAccountItemSSIOAccountAddress)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
sSIOAccountItem | sSIOAccountItem | long | | kotlin.Long | Primary Key | *one*
sSIOAccountAddress | sSIOAccountAddress | long | | kotlin.Long | Foreign Key | *many*



