
# Table `AdvertiserDefinedEventProcessingRecord`
(mapped from: AdvertiserDefinedEventProcessingRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Name of the advertiser defined event | 
**status** | status | text NOT NULL |  | **kotlin.String** | Processing status (success or failure) | 
**exceptions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of exception messages if the operation failed |  [optional]




# **Table `AdvertiserDefinedEventProcessingRecordExceptions`**
(mapped from: AdvertiserDefinedEventProcessingRecordExceptions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advertiserDefinedEventProcessingRecord | advertiserDefinedEventProcessingRecord | long | | kotlin.Long | Primary Key | *one*
exceptions | exceptions | text | | kotlin.String | Foreign Key | *many*



