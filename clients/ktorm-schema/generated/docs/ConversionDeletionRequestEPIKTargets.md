
# Table `ConversionDeletionRequestEPIKTargets`
(mapped from: ConversionDeletionRequestEPIKTargets)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**epiks** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). | 


# **Table `ConversionDeletionRequestEPIKTargetsEpiks`**
(mapped from: ConversionDeletionRequestEPIKTargetsEpiks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionDeletionRequestEPIKTargets | conversionDeletionRequestEPIKTargets | long | | kotlin.Long | Primary Key | *one*
epiks | epiks | text | | kotlin.String | Foreign Key | *many*



