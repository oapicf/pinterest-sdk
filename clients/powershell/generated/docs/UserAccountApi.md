# PSOpenAPITools.PSOpenAPITools\Api.UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-BoardsUserFollowsList**](UserAccountApi.md#Invoke-BoardsUserFollowsList) | **GET** /user_account/following/boards | List following boards
[**Trace-UserUpdate**](UserAccountApi.md#Trace-UserUpdate) | **POST** /user_account/following/{username} | Follow user
[**Trace-ersList**](UserAccountApi.md#Trace-ersList) | **GET** /user_account/followers | List followers
[**Invoke-LinkedBusinessAccountsGet**](UserAccountApi.md#Invoke-LinkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses
[**Invoke-UnverifyWebsiteDelete**](UserAccountApi.md#Invoke-UnverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website
[**Use-rAccountAnalytics**](UserAccountApi.md#Use-rAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**Use-rAccountAnalyticsTopPins**](UserAccountApi.md#Use-rAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**Use-rAccountAnalyticsTopVideoPins**](UserAccountApi.md#Use-rAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**Use-rAccountFollowedInterests**](UserAccountApi.md#Use-rAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests
[**Use-rAccountGet**](UserAccountApi.md#Use-rAccountGet) | **GET** /user_account | Get user account
[**Use-rFollowingGet**](UserAccountApi.md#Use-rFollowingGet) | **GET** /user_account/following | List following
[**Use-rWebsitesGet**](UserAccountApi.md#Use-rWebsitesGet) | **GET** /user_account/websites | Get user websites
[**Test-WebsiteUpdate**](UserAccountApi.md#Test-WebsiteUpdate) | **POST** /user_account/websites | Verify website
[**Invoke-WebsiteVerificationGet**](UserAccountApi.md#Invoke-WebsiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming


<a id="Invoke-BoardsUserFollowsList"></a>
# **Invoke-BoardsUserFollowsList**
> BoardsUserFollowsList200Response Invoke-BoardsUserFollowsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ExplicitFollowing] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$ExplicitFollowing = $true # Boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to $false)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List following boards
try {
    $Result = Invoke-BoardsUserFollowsList -Bookmark $Bookmark -PageSize $PageSize -ExplicitFollowing $ExplicitFollowing -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardsUserFollowsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ExplicitFollowing** | **Boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to $false]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**BoardsUserFollowsList200Response**](BoardsUserFollowsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Trace-UserUpdate"></a>
# **Trace-UserUpdate**
> UserSummary Trace-UserUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Username] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FollowUserRequest] <PSCustomObject><br>

Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Username = "username" # String | A valid username
$FollowUserRequest = Initialize-FollowUserRequest -AutoFollow $false # FollowUserRequest | Follow a user.

# Follow user
try {
    $Result = Trace-UserUpdate -Username $Username -FollowUserRequest $FollowUserRequest
} catch {
    Write-Host ("Exception occurred when calling Trace-UserUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Username** | **String**| A valid username | 
 **FollowUserRequest** | [**FollowUserRequest**](FollowUserRequest.md)| Follow a user. | 

### Return type

[**UserSummary**](UserSummary.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Trace-ersList"></a>
# **Trace-ersList**
> FollowersList200Response Trace-ersList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List followers

Get a list of your followers.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# List followers
try {
    $Result = Trace-ersList -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Trace-ersList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**FollowersList200Response**](FollowersList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LinkedBusinessAccountsGet"></a>
# **Invoke-LinkedBusinessAccountsGet**
> LinkedBusiness[] Invoke-LinkedBusinessAccountsGet<br>

List linked businesses

Get a list of your linked business accounts.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"


# List linked businesses
try {
    $Result = Invoke-LinkedBusinessAccountsGet
} catch {
    Write-Host ("Exception occurred when calling Invoke-LinkedBusinessAccountsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LinkedBusiness[]**](LinkedBusiness.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-UnverifyWebsiteDelete"></a>
# **Invoke-UnverifyWebsiteDelete**
> void Invoke-UnverifyWebsiteDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Website] <String><br>

Unverify website

Unverifu a website verified by the signed-in user.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Website = "mysite.test" # String | Website with path or domain only

# Unverify website
try {
    $Result = Invoke-UnverifyWebsiteDelete -Website $Website
} catch {
    Write-Host ("Exception occurred when calling Invoke-UnverifyWebsiteDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Website** | **String**| Website with path or domain only | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Use-rAccountAnalytics"></a>
# **Use-rAccountAnalytics**
> System.Collections.Hashtable Use-rAccountAnalytics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FromClaimedContent] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AppTypes] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ContentType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Source] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MetricTypes] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SplitField] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get user account analytics

Get analytics for the ""operation user_account"" - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"".

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$FromClaimedContent = "OTHER" # String | Filter on Pins that match your claimed domain. (optional) (default to "BOTH")
$PinFormat = "ALL" # String | Pin formats to get data for, default is all. (optional) (default to "ALL")
$AppTypes = "ALL" # String | Apps or devices to get data for, default is all. (optional) (default to "ALL")
$ContentType = "ALL" # String | Filter to paid or organic data. Default is all. (optional) (default to "ALL")
$Source = "ALL" # String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to "ALL")
$MetricTypes = "ENGAGEMENT" # String[] | Metric types to get data for, default is all.  (optional)
$SplitField = "NO_SPLIT" # String | How to split the data into groups. Not including this param means data won't be split. (optional) (default to "NO_SPLIT")
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get user account analytics
try {
    $Result = Use-rAccountAnalytics -StartDate $StartDate -EndDate $EndDate -FromClaimedContent $FromClaimedContent -PinFormat $PinFormat -AppTypes $AppTypes -ContentType $ContentType -Source $Source -MetricTypes $MetricTypes -SplitField $SplitField -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Use-rAccountAnalytics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **FromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to &quot;BOTH&quot;]
 **PinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **AppTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **ContentType** | **String**| Filter to paid or organic data. Default is all. | [optional] [default to &quot;ALL&quot;]
 **Source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &quot;ALL&quot;]
 **MetricTypes** | [**String[]**](String.md)| Metric types to get data for, default is all.  | [optional] 
 **SplitField** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &quot;NO_SPLIT&quot;]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**System.Collections.Hashtable**](AnalyticsMetricsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Use-rAccountAnalyticsTopPins"></a>
# **Use-rAccountAnalyticsTopPins**
> TopPinsAnalyticsResponse Use-rAccountAnalyticsTopPins<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortBy] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FromClaimedContent] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AppTypes] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ContentType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Source] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MetricTypes] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NumOfPins] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreatedInLastNDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"".

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$SortBy = "ENGAGEMENT" # String | Specify sorting order for metrics
$FromClaimedContent = "OTHER" # String | Filter on Pins that match your claimed domain. (optional) (default to "BOTH")
$PinFormat = "ALL" # String | Pin formats to get data for, default is all. (optional) (default to "ALL")
$AppTypes = "ALL" # String | Apps or devices to get data for, default is all. (optional) (default to "ALL")
$ContentType = "ALL" # String | Filter to paid or organic data. Default is all. (optional) (default to "ALL")
$Source = "ALL" # String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to "ALL")
$MetricTypes = "ENGAGEMENT" # String[] | Metric types to get data for, default is all.  (optional)
$NumOfPins = 25 # Int32 | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
$CreatedInLastNDays = "30" # Int32 | Get metrics for pins created in the last ""n"" days. (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get user account top pins analytics
try {
    $Result = Use-rAccountAnalyticsTopPins -StartDate $StartDate -EndDate $EndDate -SortBy $SortBy -FromClaimedContent $FromClaimedContent -PinFormat $PinFormat -AppTypes $AppTypes -ContentType $ContentType -Source $Source -MetricTypes $MetricTypes -NumOfPins $NumOfPins -CreatedInLastNDays $CreatedInLastNDays -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Use-rAccountAnalyticsTopPins: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **SortBy** | **String**| Specify sorting order for metrics | 
 **FromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to &quot;BOTH&quot;]
 **PinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **AppTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **ContentType** | **String**| Filter to paid or organic data. Default is all. | [optional] [default to &quot;ALL&quot;]
 **Source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &quot;ALL&quot;]
 **MetricTypes** | [**String[]**](String.md)| Metric types to get data for, default is all.  | [optional] 
 **NumOfPins** | **Int32**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **CreatedInLastNDays** | **Int32**| Get metrics for pins created in the last &quot;&quot;n&quot;&quot; days. | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Use-rAccountAnalyticsTopVideoPins"></a>
# **Use-rAccountAnalyticsTopVideoPins**
> TopVideoPinsAnalyticsResponse Use-rAccountAnalyticsTopVideoPins<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortBy] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FromClaimedContent] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinFormat] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AppTypes] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ContentType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Source] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MetricTypes] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NumOfPins] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreatedInLastNDays] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"".

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$SortBy = "IMPRESSION" # String | Specify sorting order for video metrics
$FromClaimedContent = "OTHER" # String | Filter on Pins that match your claimed domain. (optional) (default to "BOTH")
$PinFormat = "ALL" # String | Pin formats to get data for, default is all. (optional) (default to "ALL")
$AppTypes = "ALL" # String | Apps or devices to get data for, default is all. (optional) (default to "ALL")
$ContentType = "ALL" # String | Filter to paid or organic data. Default is all. (optional) (default to "ALL")
$Source = "ALL" # String | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to "ALL")
$MetricTypes = "IMPRESSION" # String[] | Metric types to get video data for, default is all.  (optional)
$NumOfPins = 25 # Int32 | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
$CreatedInLastNDays = "30" # Int32 | Get metrics for pins created in the last ""n"" days. (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get user account top video pins analytics
try {
    $Result = Use-rAccountAnalyticsTopVideoPins -StartDate $StartDate -EndDate $EndDate -SortBy $SortBy -FromClaimedContent $FromClaimedContent -PinFormat $PinFormat -AppTypes $AppTypes -ContentType $ContentType -Source $Source -MetricTypes $MetricTypes -NumOfPins $NumOfPins -CreatedInLastNDays $CreatedInLastNDays -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Use-rAccountAnalyticsTopVideoPins: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **SortBy** | **String**| Specify sorting order for video metrics | 
 **FromClaimedContent** | **String**| Filter on Pins that match your claimed domain. | [optional] [default to &quot;BOTH&quot;]
 **PinFormat** | **String**| Pin formats to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **AppTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **ContentType** | **String**| Filter to paid or organic data. Default is all. | [optional] [default to &quot;ALL&quot;]
 **Source** | **String**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &quot;ALL&quot;]
 **MetricTypes** | [**String[]**](String.md)| Metric types to get video data for, default is all.  | [optional] 
 **NumOfPins** | **Int32**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **CreatedInLastNDays** | **Int32**| Get metrics for pins created in the last &quot;&quot;n&quot;&quot; days. | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Use-rAccountFollowedInterests"></a>
# **Use-rAccountFollowedInterests**
> UserAccountFollowedInterests200Response Use-rAccountFollowedInterests<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Username] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List following interests

Get a list of a user's following interests in one place.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Username = "username" # String | A valid username
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# List following interests
try {
    $Result = Use-rAccountFollowedInterests -Username $Username -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Use-rAccountFollowedInterests: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Username** | **String**| A valid username | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Use-rAccountGet"></a>
# **Use-rAccountGet**
> Account Use-rAccountGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get user account

Get account information for the ""operation user_account"" - By default, the ""operation user_account"" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get user account
try {
    $Result = Use-rAccountGet -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Use-rAccountGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Account**](Account.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Use-rFollowingGet"></a>
# **Use-rFollowingGet**
> UserFollowingGet200Response Use-rFollowingGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedType] <UserFollowingFeedType><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ExplicitFollowing] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List following

Get a list of who a certain user follows.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$FeedType = "ALL" # UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
$ExplicitFollowing = $true # Boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to $false)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List following
try {
    $Result = Use-rFollowingGet -Bookmark $Bookmark -PageSize $PageSize -FeedType $FeedType -ExplicitFollowing $ExplicitFollowing -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Use-rFollowingGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **FeedType** | **UserFollowingFeedType**| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] 
 **ExplicitFollowing** | **Boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to $false]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**UserFollowingGet200Response**](UserFollowingGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Use-rWebsitesGet"></a>
# **Use-rWebsitesGet**
> UserWebsitesGet200Response Use-rWebsitesGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get user websites

Get user websites, claimed or not

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# Get user websites
try {
    $Result = Use-rWebsitesGet -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Use-rWebsitesGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Test-WebsiteUpdate"></a>
# **Test-WebsiteUpdate**
> UserWebsiteSummary Test-WebsiteUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UserWebsiteVerifyRequest] <PSCustomObject><br>

Verify website

Verify a website as a signed-in user.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$UserWebsiteVerifyRequest = Initialize-UserWebsiteVerifyRequest -Website "pintest-website-12345678.test/test_1" -VerificationMethod "FILENAME" # UserWebsiteVerifyRequest | Verify a website.

# Verify website
try {
    $Result = Test-WebsiteUpdate -UserWebsiteVerifyRequest $UserWebsiteVerifyRequest
} catch {
    Write-Host ("Exception occurred when calling Test-WebsiteUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UserWebsiteVerifyRequest** | [**UserWebsiteVerifyRequest**](UserWebsiteVerifyRequest.md)| Verify a website. | 

### Return type

[**UserWebsiteSummary**](UserWebsiteSummary.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-WebsiteVerificationGet"></a>
# **Invoke-WebsiteVerificationGet**
> UserWebsiteVerificationCode Invoke-WebsiteVerificationGet<br>

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"


# Get user verification code for website claiming
try {
    $Result = Invoke-WebsiteVerificationGet
} catch {
    Write-Host ("Exception occurred when calling Invoke-WebsiteVerificationGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

