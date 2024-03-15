
# Table `AdAccountCreateSubscriptionRequest`
(mapped from: AdAccountCreateSubscriptionRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**webhookUrl** | webhook_url | text NOT NULL |  | **kotlin.String** | Standard HTTPS webhook URL. | 
**leadFormId** | lead_form_id | text |  | **kotlin.String** | Lead form ID. |  [optional]
**partnerAccessToken** | partner_access_token | text |  | **kotlin.String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. |  [optional]
**partnerRefreshToken** | partner_refresh_token | text |  | **kotlin.String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. |  [optional]






