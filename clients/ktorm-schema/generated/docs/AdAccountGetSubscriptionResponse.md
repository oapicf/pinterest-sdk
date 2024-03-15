
# Table `AdAccountGetSubscriptionResponse`
(mapped from: AdAccountGetSubscriptionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**leadFormId** | lead_form_id | text |  | **kotlin.String** | Lead form ID. |  [optional]
**webhookUrl** | webhook_url | text |  | **kotlin.String** | Standard HTTPS webhook URL. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Subscription ID. |  [optional]
**userAccountId** | user_account_id | text |  | **kotlin.String** | User account used to subscribe lead data. |  [optional]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The Ad Account ID that this lead form belongs to. |  [optional]
**apiVersion** | api_version | text |  | **kotlin.String** | API version. |  [optional]
**cryptographicKey** | cryptographic_key | text |  | **kotlin.String** | Base64 encoded key for client to decrypt lead data. |  [optional]
**cryptographicAlgorithm** | cryptographic_algorithm | text |  | **kotlin.String** | Lead data encryption algorithm. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Lead form creation time. Unix timestamp in milliseconds. |  [optional]











