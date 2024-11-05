
# Table `ConversionEventsUserData_anyOf_1`
(mapped from: ConversionEventsUserDataAnyOf1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**hashedMaids** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | 
**em** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. |  [optional]
**clientIpAddress** | client_ip_address | text |  | **kotlin.String** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. |  [optional]
**clientUserAgent** | client_user_agent | text |  | **kotlin.String** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. |  [optional]


# **Table `ConversionEventsUserDataAnyOf1HashedMaids`**
(mapped from: ConversionEventsUserDataAnyOf1HashedMaids)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataAnyOf1 | conversionEventsUserDataAnyOf1 | long | | kotlin.Long | Primary Key | *one*
hashedMaids | hashedMaids | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataAnyOf1Em`**
(mapped from: ConversionEventsUserDataAnyOf1Em)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataAnyOf1 | conversionEventsUserDataAnyOf1 | long | | kotlin.Long | Primary Key | *one*
em | em | text | | kotlin.String | Foreign Key | *many*





