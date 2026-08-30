
# Table `UserWebsiteCreate`
(mapped from: UserWebsiteCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**verificationMethod** | verification_method | long |  | [**WebsiteVerificationMethod**](WebsiteVerificationMethod.md) | Method used to verify website ownership. |  [optional] [foreignkey]
**website** | website | text |  | **kotlin.String** | Website with path or domain only |  [optional]




