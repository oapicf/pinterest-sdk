
# Table `UserWebsiteVerificationCode`
(mapped from: UserWebsiteVerificationCode)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**verificationCode** | verification_code | text |  | **kotlin.String** | Code to check against the user claiming the website |  [optional]
**dnsTxtRecord** | dns_txt_record | text |  | **kotlin.String** | DNS TXT record to check against for the website to be claimed |  [optional]
**metatag** | metatag | text |  | **kotlin.String** | Metatag the verification process searchs for the website to be claimed |  [optional]
**filename** | filename | text |  | **kotlin.String** | File expected to find on the website being claimed |  [optional]
**fileContent** | file_content | text |  | **kotlin.String** | A full html file to upload to the website in order for it to be claimed |  [optional]







