# PSOpenAPITools.PSOpenAPITools\Api.ProductCategoriesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-TrendsFeaturedTopicsList**](ProductCategoriesApi.md#Invoke-TrendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
[**Invoke-TrendsProductCategoriesDetailsList**](ProductCategoriesApi.md#Invoke-TrendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
[**Invoke-TrendsProductCategoriesTrendingList**](ProductCategoriesApi.md#Invoke-TrendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


<a id="Invoke-TrendsFeaturedTopicsList"></a>
# **Invoke-TrendsFeaturedTopicsList**
> FeaturedTrend[] Invoke-TrendsFeaturedTopicsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Region] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Interest] <PSCustomObject><br>

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Region = "US" # ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
$Interest = "ALL" # InterestsEnum | Interest to filter by (optional)

# Get featured topics
try {
    $Result = Invoke-TrendsFeaturedTopicsList -Region $Region -Interest $Interest
} catch {
    Write-Host ("Exception occurred when calling Invoke-TrendsFeaturedTopicsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Region** | [**ProductCategoryRegion**](ProductCategoryRegion.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **Interest** | [**InterestsEnum**](InterestsEnum.md)| Interest to filter by | [optional] 

### Return type

[**FeaturedTrend[]**](FeaturedTrend.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-TrendsProductCategoriesDetailsList"></a>
# **Invoke-TrendsProductCategoriesDetailsList**
> ProductCategoryDetails[] Invoke-TrendsProductCategoriesDetailsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductCategories] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Region] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LookbackWindow] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementType] <PSCustomObject><br>

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProductCategories = "ACCENT_TABLES" # ProductCategoryEnum[] | List of product categories
$Region = "US" # ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
$LookbackWindow = "90" # ProductCategoryDetailLookbackWindow |    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) (optional)
$EngagementType = "ENGAGEMENT" # ProductCategoriesEngagementType |      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)

# Get product category details
try {
    $Result = Invoke-TrendsProductCategoriesDetailsList -ProductCategories $ProductCategories -Region $Region -LookbackWindow $LookbackWindow -EngagementType $EngagementType
} catch {
    Write-Host ("Exception occurred when calling Invoke-TrendsProductCategoriesDetailsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProductCategories** | [**ProductCategoryEnum[]**](ProductCategoryEnum.md)| List of product categories | 
 **Region** | [**ProductCategoryRegion**](ProductCategoryRegion.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **LookbackWindow** | [**ProductCategoryDetailLookbackWindow**](ProductCategoryDetailLookbackWindow.md)|    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] 
 **EngagementType** | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md)|      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**ProductCategoryDetails[]**](ProductCategoryDetails.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-TrendsProductCategoriesTrendingList"></a>
# **Invoke-TrendsProductCategoriesTrendingList**
> TrendingProductCategory[] Invoke-TrendsProductCategoriesTrendingList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Region] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Verticals] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Ages] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Genders] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementType] <PSCustomObject><br>

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Region = "US" # ProductCategoryRegion |       The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
$Verticals = "FASHION" # VerticalProductCategory[] | List of verticals to filter by (optional)
$Ages = "18-24" # AgeTrendsBucket[] | Age to filter by. If not provided, the results will be filtered by all ages. (optional)
$Genders = "MALE" # GenderBucket[] | Gender to filter by, If not provided, the results will be filtered by all genders. (optional)
$EngagementType = "ENGAGEMENT" # ProductCategoriesEngagementType |      Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)

# Get a list of growing Shopping Product Categories
try {
    $Result = Invoke-TrendsProductCategoriesTrendingList -Region $Region -Verticals $Verticals -Ages $Ages -Genders $Genders -EngagementType $EngagementType
} catch {
    Write-Host ("Exception occurred when calling Invoke-TrendsProductCategoriesTrendingList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Region** | [**ProductCategoryRegion**](ProductCategoryRegion.md)|       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **Verticals** | [**VerticalProductCategory[]**](VerticalProductCategory.md)| List of verticals to filter by | [optional] 
 **Ages** | [**AgeTrendsBucket[]**](AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] 
 **Genders** | [**GenderBucket[]**](GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] 
 **EngagementType** | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md)|      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**TrendingProductCategory[]**](TrendingProductCategory.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

