
# Table `ConversionDeletionRequestUserEmailTargets`
(mapped from: ConversionDeletionRequestUserEmailTargets)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**userEmails** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Array of plain text user emails. | 


# **Table `ConversionDeletionRequestUserEmailTargetsUserEmails`**
(mapped from: ConversionDeletionRequestUserEmailTargetsUserEmails)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionDeletionRequestUserEmailTargets | conversionDeletionRequestUserEmailTargets | long | | kotlin.Long | Primary Key | *one*
userEmails | userEmails | text | | kotlin.String | Foreign Key | *many*



