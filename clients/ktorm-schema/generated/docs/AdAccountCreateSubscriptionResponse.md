
# Table `AdAccountCreateSubscriptionResponse`
(mapped from: AdAccountCreateSubscriptionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Subscription ID. |  [optional]
**cryptographicKey** | cryptographic_key | text |  | **kotlin.String** | Base64 encoded key for client to decrypt lead data. |  [optional]
**cryptographicAlgorithm** | cryptographic_algorithm | text |  | **kotlin.String** | Lead data encryption algorithm. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Subscription creation time. Unix timestamp in milliseconds. |  [optional]






