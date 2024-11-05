
# Table `ConversionEventsUserData`
(mapped from: ConversionEventsUserData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**em** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | 
**hashedMaids** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | 
**clientIpAddress** | client_ip_address | text NOT NULL |  | **kotlin.String** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | 
**clientUserAgent** | client_user_agent | text NOT NULL |  | **kotlin.String** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | 


# **Table `ConversionEventsUserDataEm`**
(mapped from: ConversionEventsUserDataEm)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserData | conversionEventsUserData | long | | kotlin.Long | Primary Key | *one*
em | em | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataHashedMaids`**
(mapped from: ConversionEventsUserDataHashedMaids)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserData | conversionEventsUserData | long | | kotlin.Long | Primary Key | *one*
hashedMaids | hashedMaids | text | | kotlin.String | Foreign Key | *many*





