# PSOpenAPITools.PSOpenAPITools\Api.SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-SchedulesCreate**](SchedulesApi.md#Invoke-SchedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**Invoke-SchedulesList**](SchedulesApi.md#Invoke-SchedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**Invoke-SchedulesUpdate**](SchedulesApi.md#Invoke-SchedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


<a id="Invoke-SchedulesCreate"></a>
# **Invoke-SchedulesCreate**
> SchedulesCreate200ResponseInner[] Invoke-SchedulesCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ScheduleCreate] <PSCustomObject[]><br>

Create schedules

Batch create schedules

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$BidOptionsAgeBucketMultipliers = Initialize-BidOptionsAgeBucketMultipliers -Var1824 0 -Var2534 0 -Var3544 0 -Var4549 0 -Var5054 0 -Var5564 0 -Var65 0
$BidOptionsAppTypeMultipliers = Initialize-BidOptionsAppTypeMultipliers -AndroidMobile 0 -AndroidTablet 0 -Ipad 0 -Iphone 0 -Web 0 -WebMobile 0
$BidOptionsAudienceMultipliers = Initialize-BidOptionsAudienceMultipliers -AudienceId "MyAudienceId" -Multiplier 0
$BidOptionsGenderMultipliers = Initialize-BidOptionsGenderMultipliers -Female 0 -Male 0
$BidOptionsPlacementMultipliers = Initialize-BidOptionsPlacementMultipliers -Browse 0 -RelatedPins 0 -Search 0
$ScheduleDeltaValue = Initialize-ScheduleDeltaValue -AgeBucketMultipliers $BidOptionsAgeBucketMultipliers -AppTypeMultipliers $BidOptionsAppTypeMultipliers -AudienceMultipliers $BidOptionsAudienceMultipliers -GenderMultipliers $BidOptionsGenderMultipliers -PlacementMultipliers $BidOptionsPlacementMultipliers

$ScheduleCreate = Initialize-ScheduleCreate -DeltaValue $ScheduleDeltaValue -EndTimestamp 0 -EntityId "MyEntityId" -EntityType "ADVERTISER" -Name "MyName" -ScheduleAction "INCREASE_BY_VALUE" -ScheduleStatus "DRAFT" -ScheduleType "CAMPAIGN_BUDGET_CHANGE" -StartTimestamp 0 # ScheduleCreate[] | 

# Create schedules
try {
    $Result = Invoke-SchedulesCreate -AdAccountId $AdAccountId -ScheduleCreate $ScheduleCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-SchedulesCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**|  | 
 **ScheduleCreate** | [**ScheduleCreate[]**](ScheduleCreate.md)|  | 

### Return type

[**SchedulesCreate200ResponseInner[]**](SchedulesCreate200ResponseInner.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-SchedulesList"></a>
# **Invoke-SchedulesList**
> SchedulesList200Response Invoke-SchedulesList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EntityIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ScheduleStatuses] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ScheduleType] <PSCustomObject><br>

Get Schedules

Get schedules for a specific advertiser

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$EntityIds = "MyEntityIds" # String[] | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
$Order = "ASCENDING" # PinterestLibPaginationOrder | The order in which to sort the items returned: ""ASCENDING"" or ""DESCENDING"" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$ScheduleStatuses = "DRAFT" # ScheduleStatus[] | Filter schedules by status (one or more) (optional)
$ScheduleType = "CAMPAIGN_BUDGET_CHANGE" # ScheduleType | Filter schedules by a type (optional)

# Get Schedules
try {
    $Result = Invoke-SchedulesList -AdAccountId $AdAccountId -EntityIds $EntityIds -Bookmark $Bookmark -PageSize $PageSize -Order $Order -ScheduleStatuses $ScheduleStatuses -ScheduleType $ScheduleType
} catch {
    Write-Host ("Exception occurred when calling Invoke-SchedulesList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**|  | 
 **EntityIds** | [**String[]**](String.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **Order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)| The order in which to sort the items returned: &quot;&quot;ASCENDING&quot;&quot; or &quot;&quot;DESCENDING&quot;&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **ScheduleStatuses** | [**ScheduleStatus[]**](ScheduleStatus.md)| Filter schedules by status (one or more) | [optional] 
 **ScheduleType** | [**ScheduleType**](ScheduleType.md)| Filter schedules by a type | [optional] 

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-SchedulesUpdate"></a>
# **Invoke-SchedulesUpdate**
> SchedulesCreate200ResponseInner[] Invoke-SchedulesUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ScheduleBatchUpdate] <PSCustomObject[]><br>

Update schedules

Update one or more schedules

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$BidOptionsAgeBucketMultipliers = Initialize-BidOptionsAgeBucketMultipliers -Var1824 0 -Var2534 0 -Var3544 0 -Var4549 0 -Var5054 0 -Var5564 0 -Var65 0
$BidOptionsAppTypeMultipliers = Initialize-BidOptionsAppTypeMultipliers -AndroidMobile 0 -AndroidTablet 0 -Ipad 0 -Iphone 0 -Web 0 -WebMobile 0
$BidOptionsAudienceMultipliers = Initialize-BidOptionsAudienceMultipliers -AudienceId "MyAudienceId" -Multiplier 0
$BidOptionsGenderMultipliers = Initialize-BidOptionsGenderMultipliers -Female 0 -Male 0
$BidOptionsPlacementMultipliers = Initialize-BidOptionsPlacementMultipliers -Browse 0 -RelatedPins 0 -Search 0
$ScheduleDeltaValue = Initialize-ScheduleDeltaValue -AgeBucketMultipliers $BidOptionsAgeBucketMultipliers -AppTypeMultipliers $BidOptionsAppTypeMultipliers -AudienceMultipliers $BidOptionsAudienceMultipliers -GenderMultipliers $BidOptionsGenderMultipliers -PlacementMultipliers $BidOptionsPlacementMultipliers

$ScheduleBatchUpdate = Initialize-ScheduleBatchUpdate -DeltaValue $ScheduleDeltaValue -EndTimestamp 0 -EntityId "MyEntityId" -EntityType "ADVERTISER" -Id "MyId" -Name "MyName" -ScheduleAction "INCREASE_BY_VALUE" -ScheduleId "MyScheduleId" -ScheduleStatus "DRAFT" -ScheduleType "CAMPAIGN_BUDGET_CHANGE" -StartTimestamp 0 # ScheduleBatchUpdate[] | 

# Update schedules
try {
    $Result = Invoke-SchedulesUpdate -AdAccountId $AdAccountId -ScheduleBatchUpdate $ScheduleBatchUpdate
} catch {
    Write-Host ("Exception occurred when calling Invoke-SchedulesUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**|  | 
 **ScheduleBatchUpdate** | [**ScheduleBatchUpdate[]**](ScheduleBatchUpdate.md)|  | 

### Return type

[**SchedulesCreate200ResponseInner[]**](SchedulesCreate200ResponseInner.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

