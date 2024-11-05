# PSOpenAPITools.PSOpenAPITools\Api.PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-MultiPinsAnalytics**](PinsApi.md#Invoke-MultiPinsAnalytics) | **GET** /pins/analytics | Get multiple Pin analytics
[**Invoke-PinsAnalytics**](PinsApi.md#Invoke-PinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**Invoke-PinsCreate**](PinsApi.md#Invoke-PinsCreate) | **POST** /pins | Create Pin
[**Invoke-PinsDelete**](PinsApi.md#Invoke-PinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**Invoke-PinsGet**](PinsApi.md#Invoke-PinsGet) | **GET** /pins/{pin_id} | Get Pin
[**Invoke-PinsList**](PinsApi.md#Invoke-PinsList) | **GET** /pins | List Pins
[**Invoke-PinsSave**](PinsApi.md#Invoke-PinsSave) | **POST** /pins/{pin_id}/save | Save Pin
[**Invoke-PinsUpdate**](PinsApi.md#Invoke-PinsUpdate) | **PATCH** /pins/{pin_id} | Update Pin


<a id="Invoke-MultiPinsAnalytics"></a>
# **Invoke-MultiPinsAnalytics**
> System.Collections.Hashtable Invoke-MultiPinsAnalytics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MetricTypes] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AppTypes] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get multiple Pin analytics

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the ""operation user_account"" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=""/docs/api/v5/#operation/ad_accounts/list"">List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PinIds = "MyPinIds" # String[] | List of Pin IDs.
$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$PinsAnalyticsMetricTypesParameterInner = Initialize-PinsAnalyticsMetricTypesParameterInner # PinsAnalyticsMetricTypesParameterInner[] | Pin metric types to get data for.
$AppTypes = "ALL" # String | Apps or devices to get data for, default is all. (optional) (default to "ALL")
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get multiple Pin analytics
try {
    $Result = Invoke-MultiPinsAnalytics -PinIds $PinIds -StartDate $StartDate -EndDate $EndDate -MetricTypes $MetricTypes -AppTypes $AppTypes -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-MultiPinsAnalytics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PinIds** | [**String[]**](String.md)| List of Pin IDs. | 
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **MetricTypes** | [**PinsAnalyticsMetricTypesParameterInner[]**](PinsAnalyticsMetricTypesParameterInner.md)| Pin metric types to get data for. | 
 **AppTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**System.Collections.Hashtable**](Map.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PinsAnalytics"></a>
# **Invoke-PinsAnalytics**
> System.Collections.Hashtable Invoke-PinsAnalytics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MetricTypes] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AppTypes] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SplitField] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get Pin analytics

Get analytics for a Pin owned by the ""operation user_account"" - or on a group board that has been shared with this account. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=""/docs/api/v5/#operation/ad_accounts/list"">List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PinId = "MyPinId" # String | Unique identifier of a Pin.
$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$PinsAnalyticsMetricTypesParameterInner = Initialize-PinsAnalyticsMetricTypesParameterInner # PinsAnalyticsMetricTypesParameterInner[] | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before <code>2023-03-20</code>, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than <code>NO_SPLIT</code>.
$AppTypes = "ALL" # String | Apps or devices to get data for, default is all. (optional) (default to "ALL")
$SplitField = "NO_SPLIT" # String | How to split the data into groups. Not including this param means data won't be split. (optional) (default to "NO_SPLIT")
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get Pin analytics
try {
    $Result = Invoke-PinsAnalytics -PinId $PinId -StartDate $StartDate -EndDate $EndDate -MetricTypes $MetricTypes -AppTypes $AppTypes -SplitField $SplitField -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PinsAnalytics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PinId** | **String**| Unique identifier of a Pin. | 
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **MetricTypes** | [**PinsAnalyticsMetricTypesParameterInner[]**](PinsAnalyticsMetricTypesParameterInner.md)| Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;. | 
 **AppTypes** | **String**| Apps or devices to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **SplitField** | **String**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &quot;NO_SPLIT&quot;]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**System.Collections.Hashtable**](PinAnalyticsMetricsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PinsCreate"></a>
# **Invoke-PinsCreate**
> Pin Invoke-PinsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinCreate] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Create Pin

Create a Pin on a board or board section owned by the ""operation user_account"".  Note: If the current ""operation user_account"" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/web-features/add-ons-overview/'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/api-features/content-overview/'>Content App Solutions Guide</a>.  <strong><a href='/docs/api-features/creating-boards-and-pins/#creating-video-pins'>Learn more</a></strong> about video Pin creation.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardOwner = Initialize-BoardOwner -Username "MyUsername"
$PinMedia = Initialize-PinMedia -MediaType "MyMediaType"

$PinMediaSourceImagesURLItemsInner = Initialize-PinMediaSourceImagesURLItemsInner -Title "MyTitle" -Description "MyDescription" -Link "MyLink" -Url "MyUrl"
$PinMediaSource = Initialize-PinMediaSource -SourceType "pin_url" -ContentType "image/jpeg" -VarData "MyVarData" -IsStandard $false -Url "MyUrl" -CoverImageUrl "MyCoverImageUrl" -CoverImageContentType "image/jpeg" -CoverImageData "MyCoverImageData" -MediaId "MyMediaId" -Items $PinMediaSourceImagesURLItemsInner -Index 0 -IsAffiliateLink $false

$PinCreate = Initialize-PinCreate -Id "813744226420795884" -CreatedAt (Get-Date) -Link "https://www.pinterest.com/" -Title "MyTitle" -Description "MyDescription" -DominantColor "#6E7874" -AltText "MyAltText" -BoardId "MyBoardId" -BoardSectionId "MyBoardSectionId" -BoardOwner $BoardOwner -Media $PinMedia -MediaSource $PinMediaSource -ParentPinId "MyParentPinId" -Note "MyNote" # PinCreate | Create a new Pin.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Create Pin
try {
    $Result = Invoke-PinsCreate -PinCreate $PinCreate -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PinsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PinCreate** | [**PinCreate**](PinCreate.md)| Create a new Pin. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PinsDelete"></a>
# **Invoke-PinsDelete**
> void Invoke-PinsDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Delete Pin

Delete a Pins owned by the ""operation user_account"" - or on a group board that has been shared with this account. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PinId = "MyPinId" # String | Unique identifier of a Pin.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Delete Pin
try {
    $Result = Invoke-PinsDelete -PinId $PinId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PinsDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PinId** | **String**| Unique identifier of a Pin. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PinsGet"></a>
# **Invoke-PinsGet**
> Pin Invoke-PinsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinMetrics] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get Pin

Get a Pin owned by the ""operation user_account"" - or on a group board that has been shared with this account. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PinId = "MyPinId" # String | Unique identifier of a Pin.
$PinMetrics = $true # Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to $false)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get Pin
try {
    $Result = Invoke-PinsGet -PinId $PinId -PinMetrics $PinMetrics -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PinsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PinId** | **String**| Unique identifier of a Pin. | 
 **PinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to $false]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PinsList"></a>
# **Invoke-PinsList**
> PinsList200Response Invoke-PinsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinFilter] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeProtectedPins] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreativeTypes] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinMetrics] <System.Nullable[Boolean]><br>

List Pins

Get a list of the Pins owned by the ""operation user_account"".   - By default, the ""operation user_account"" is the token user_account.   - All Pins owned by the ""operation user_account"" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"".  Disclaimer: there are known performance issues when filtering by field <code>creative_type</code> and including protected pins. If your request is timing out in this scenario we encourage you to use <a href='/docs/api/v5/#operation/boards/list_pins'>GET List Pins on Board</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$PinFilter = "exclude_native" # String | Pin filter. (optional)
$IncludeProtectedPins = $true # Boolean | Specify if return pins from protected boards (optional) (default to $false)
$PinType = "PRIVATE" # String | The type of pins to return, currently only enabled for private pins (optional)
$CreativeTypes = "REGULAR" # String[] | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$PinMetrics = $true # Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to $false)

# List Pins
try {
    $Result = Invoke-PinsList -Bookmark $Bookmark -PageSize $PageSize -PinFilter $PinFilter -IncludeProtectedPins $IncludeProtectedPins -PinType $PinType -CreativeTypes $CreativeTypes -AdAccountId $AdAccountId -PinMetrics $PinMetrics
} catch {
    Write-Host ("Exception occurred when calling Invoke-PinsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **PinFilter** | **String**| Pin filter. | [optional] 
 **IncludeProtectedPins** | **Boolean**| Specify if return pins from protected boards | [optional] [default to $false]
 **PinType** | **String**| The type of pins to return, currently only enabled for private pins | [optional] 
 **CreativeTypes** | [**String[]**](String.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **PinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to $false]

### Return type

[**PinsList200Response**](PinsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PinsSave"></a>
# **Invoke-PinsSave**
> Pin Invoke-PinsSave<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinsSaveRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Save Pin

Save a Pin on a board or board section owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PinId = "MyPinId" # String | Unique identifier of a Pin.
$PinsSaveRequest = Initialize-PinsSaveRequest -BoardId "MyBoardId" -BoardSectionId "MyBoardSectionId" # PinsSaveRequest | Request object used to save an existing pin
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Save Pin
try {
    $Result = Invoke-PinsSave -PinId $PinId -PinsSaveRequest $PinsSaveRequest -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PinsSave: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PinId** | **String**| Unique identifier of a Pin. | 
 **PinsSaveRequest** | [**PinsSaveRequest**](PinsSaveRequest.md)| Request object used to save an existing pin | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PinsUpdate"></a>
# **Invoke-PinsUpdate**
> Pin Invoke-PinsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinUpdate] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Update Pin

Update a pin owned by the ""operating user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PinId = "MyPinId" # String | Unique identifier of a Pin.
$PinUpdateCarouselSlotsInner = Initialize-PinUpdateCarouselSlotsInner -Title "MyTitle" -Description "MyDescription" -Link "MyLink"
$PinUpdate = Initialize-PinUpdate -AltText "MyAltText" -BoardId "MyBoardId" -BoardSectionId "MyBoardSectionId" -Description "MyDescription" -Link "https://www.pinterest.com/" -Title "MyTitle" -CarouselSlots $PinUpdateCarouselSlotsInner -Note "MyNote" # PinUpdate | 
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Update Pin
try {
    $Result = Invoke-PinsUpdate -PinId $PinId -PinUpdate $PinUpdate -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PinsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PinId** | **String**| Unique identifier of a Pin. | 
 **PinUpdate** | [**PinUpdate**](PinUpdate.md)|  | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

