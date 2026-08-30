
# Table `ConversionDeletionRequestTargets`
(mapped from: ConversionDeletionRequestTargets)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**userEmails** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Array of plain text user emails. | 
**epiks** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). | 


# **Table `ConversionDeletionRequestTargetsUserEmails`**
(mapped from: ConversionDeletionRequestTargetsUserEmails)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionDeletionRequestTargets | conversionDeletionRequestTargets | long | | kotlin.Long | Primary Key | *one*
userEmails | userEmails | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionDeletionRequestTargetsEpiks`**
(mapped from: ConversionDeletionRequestTargetsEpiks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionDeletionRequestTargets | conversionDeletionRequestTargets | long | | kotlin.Long | Primary Key | *one*
epiks | epiks | text | | kotlin.String | Foreign Key | *many*



