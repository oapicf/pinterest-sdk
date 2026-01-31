
# Table `ConversionEventsUserDataProperties`
(mapped from: ConversionEventsUserDataProperties)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**clickId** | click_id | text |  | **kotlin.String** | The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. |  [optional]
**clientIpAddress** | client_ip_address | text |  | **kotlin.String** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. |  [optional]
**clientUserAgent** | client_user_agent | text |  | **kotlin.String** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. |  [optional]
**country** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format. |  [optional]
**ct** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format. |  [optional]
**db** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format. |  [optional]
**em** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. |  [optional]
**externalId** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. |  [optional]
**fn** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. |  [optional]
**ge** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format. |  [optional]
**hashedMaids** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. |  [optional]
**ln** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. |  [optional]
**partnerId** | partner_id | text |  | **kotlin.String** | A unique identifier of visitors&#39; information defined by third party partners. e.g RampID |  [optional]
**ph** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. |  [optional]
**st** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format. |  [optional]
**zp** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format. |  [optional]





# **Table `ConversionEventsUserDataPropertiesCountry`**
(mapped from: ConversionEventsUserDataPropertiesCountry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
country | country | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataPropertiesCt`**
(mapped from: ConversionEventsUserDataPropertiesCt)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
ct | ct | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataPropertiesDb`**
(mapped from: ConversionEventsUserDataPropertiesDb)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
db | db | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataPropertiesEm`**
(mapped from: ConversionEventsUserDataPropertiesEm)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
em | em | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataPropertiesExternalId`**
(mapped from: ConversionEventsUserDataPropertiesExternalId)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
externalId | externalId | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataPropertiesFn`**
(mapped from: ConversionEventsUserDataPropertiesFn)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
fn | fn | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataPropertiesGe`**
(mapped from: ConversionEventsUserDataPropertiesGe)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
ge | ge | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataPropertiesHashedMaids`**
(mapped from: ConversionEventsUserDataPropertiesHashedMaids)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
hashedMaids | hashedMaids | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataPropertiesLn`**
(mapped from: ConversionEventsUserDataPropertiesLn)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
ln | ln | text | | kotlin.String | Foreign Key | *many*




# **Table `ConversionEventsUserDataPropertiesPh`**
(mapped from: ConversionEventsUserDataPropertiesPh)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
ph | ph | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataPropertiesSt`**
(mapped from: ConversionEventsUserDataPropertiesSt)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
st | st | text | | kotlin.String | Foreign Key | *many*



# **Table `ConversionEventsUserDataPropertiesZp`**
(mapped from: ConversionEventsUserDataPropertiesZp)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsUserDataProperties | conversionEventsUserDataProperties | long | | kotlin.Long | Primary Key | *one*
zp | zp | text | | kotlin.String | Foreign Key | *many*



