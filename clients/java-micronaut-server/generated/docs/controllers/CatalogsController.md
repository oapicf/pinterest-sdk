# CatalogsController

All URIs are relative to `"/v5"`

The controller class is defined in **[CatalogsController.java](../../src/main/java/org/openapitools/controller/CatalogsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsAvailableFilterValues**](#catalogsAvailableFilterValues) | **GET** /catalogs/available_filter_values | List available filter values
[**catalogsCreate**](#catalogsCreate) | **POST** /catalogs | Create catalog
[**catalogsList**](#catalogsList) | **GET** /catalogs | List catalogs

<a id="catalogsAvailableFilterValues"></a>
# **catalogsAvailableFilterValues**
```java
Mono<CatalogsAvailableFilterValues> CatalogsController.catalogsAvailableFilterValues(catalogIdfeedIdcountrylanguageadAccountId)
```

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - &#x60;country&#x60;, &#x60;language&#x60;, and &#x60;feed_id&#x60; are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogId** | `String` | Filter entities for a given catalog_id. |
**feedId** | `String` | Filter entities for a given feed_id. If not given, all feeds are considered. | [optional parameter]
**country** | [**Country**](../../docs/models/.md) | Country for the Catalogs Items | [optional parameter] [enum: `AD`, `AE`, `AF`, `AG`, `AI`, `AL`, `AM`, `AO`, `AQ`, `AR`, `AS`, `AT`, `AU`, `AW`, `AX`, `AZ`, `BA`, `BB`, `BD`, `BE`, `BF`, `BG`, `BH`, `BI`, `BJ`, `BL`, `BM`, `BN`, `BO`, `BQ`, `BR`, `BS`, `BT`, `BV`, `BW`, `BY`, `BZ`, `CA`, `CC`, `CD`, `CF`, `CG`, `CH`, `CI`, `CK`, `CL`, `CM`, `CN`, `CO`, `CR`, `CU`, `CV`, `CW`, `CX`, `CY`, `CZ`, `DE`, `DJ`, `DK`, `DM`, `DO`, `DZ`, `EC`, `EE`, `EG`, `EH`, `ER`, `ES`, `ET`, `FI`, `FJ`, `FK`, `FM`, `FO`, `FR`, `GA`, `GB`, `GD`, `GE`, `GF`, `GG`, `GH`, `GI`, `GL`, `GM`, `GN`, `GP`, `GQ`, `GR`, `GS`, `GT`, `GU`, `GW`, `GY`, `HK`, `HM`, `HN`, `HR`, `HT`, `HU`, `ID`, `IE`, `IL`, `IM`, `IN`, `IO`, `IQ`, `IR`, `IS`, `IT`, `JE`, `JM`, `JO`, `JP`, `KE`, `KG`, `KH`, `KI`, `KM`, `KN`, `KR`, `KW`, `KY`, `KZ`, `LA`, `LB`, `LC`, `LI`, `LK`, `LR`, `LS`, `LT`, `LU`, `LV`, `LY`, `MA`, `MC`, `MD`, `ME`, `MF`, `MG`, `MH`, `MK`, `ML`, `MM`, `MN`, `MO`, `MP`, `MQ`, `MR`, `MS`, `MT`, `MU`, `MV`, `MW`, `MX`, `MY`, `MZ`, `NA`, `NC`, `NE`, `NF`, `NG`, `NI`, `NL`, `false`, `NP`, `NR`, `NU`, `NZ`, `OM`, `PA`, `PE`, `PF`, `PG`, `PH`, `PK`, `PL`, `PM`, `PN`, `PR`, `PS`, `PT`, `PW`, `PY`, `QA`, `RE`, `RO`, `RS`, `RU`, `RW`, `SA`, `SB`, `SC`, `SD`, `SE`, `SG`, `SH`, `SI`, `SJ`, `SK`, `SL`, `SM`, `SN`, `SO`, `SR`, `SS`, `ST`, `SV`, `SX`, `SY`, `SZ`, `TC`, `TD`, `TF`, `TG`, `TH`, `TJ`, `TK`, `TL`, `TM`, `TN`, `TO`, `TR`, `TT`, `TV`, `TW`, `TZ`, `UA`, `UG`, `UM`, `US`, `UY`, `UZ`, `VA`, `VC`, `VE`, `VG`, `VI`, `VN`, `VU`, `WF`, `WS`, `YE`, `YT`, `ZA`, `ZM`, `ZW`]
**language** | [**CatalogsLocale**](../../docs/models/.md) | Language for the Catalogs Items | [optional parameter] [enum: `af-ZA`, `ar-SA`, `bg-BG`, `bn-IN`, `cs-CZ`, `da-DK`, `de`, `el-GR`, `en-AU`, `en-CA`, `en-GB`, `en-IN`, `en-US`, `es-419`, `es-AR`, `es-ES`, `es-MX`, `fi-FI`, `fr`, `fr-CA`, `he-IL`, `hi-IN`, `hr-HR`, `hu-HU`, `id-ID`, `it`, `ja`, `ko-KR`, `ms-MY`, `nb-NO`, `nl`, `pl-PL`, `pt-BR`, `pt-PT`, `ro-RO`, `ru-RU`, `sk-SK`, `sv-SE`, `te-IN`, `th-TH`, `tl-PH`, `tr`, `uk-UA`, `vi-VN`, `zh-CN`, `zh-TW`]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**CatalogsAvailableFilterValues**](../../docs/models/CatalogsAvailableFilterValues.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="catalogsCreate"></a>
# **catalogsCreate**
```java
Mono<Catalog> CatalogsController.catalogsCreate(catalogCreateadAccountId)
```

Create catalog

Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**catalogCreate** | [**CatalogCreate**](../../docs/models/CatalogCreate.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Catalog**](../../docs/models/Catalog.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="catalogsList"></a>
# **catalogsList**
```java
Mono<CatalogsList200Response> CatalogsController.catalogsList(adAccountIdbookmarkpageSize)
```

List catalogs

Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**CatalogsList200Response**](../../docs/models/CatalogsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `catalogs:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

