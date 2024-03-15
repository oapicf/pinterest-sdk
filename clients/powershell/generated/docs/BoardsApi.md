# PSOpenAPITools.PSOpenAPITools\Api.BoardsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-BoardSectionsCreate**](BoardsApi.md#Invoke-BoardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
[**Invoke-BoardSectionsDelete**](BoardsApi.md#Invoke-BoardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**Invoke-BoardSectionsList**](BoardsApi.md#Invoke-BoardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
[**Invoke-BoardSectionsListPins**](BoardsApi.md#Invoke-BoardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**Invoke-BoardSectionsUpdate**](BoardsApi.md#Invoke-BoardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**Invoke-BoardsCreate**](BoardsApi.md#Invoke-BoardsCreate) | **POST** /boards | Create board
[**Invoke-BoardsDelete**](BoardsApi.md#Invoke-BoardsDelete) | **DELETE** /boards/{board_id} | Delete board
[**Invoke-BoardsGet**](BoardsApi.md#Invoke-BoardsGet) | **GET** /boards/{board_id} | Get board
[**Invoke-BoardsList**](BoardsApi.md#Invoke-BoardsList) | **GET** /boards | List boards
[**Invoke-BoardsListPins**](BoardsApi.md#Invoke-BoardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
[**Invoke-BoardsUpdate**](BoardsApi.md#Invoke-BoardsUpdate) | **PATCH** /boards/{board_id} | Update board


<a id="Invoke-BoardSectionsCreate"></a>
# **Invoke-BoardSectionsCreate**
> BoardSection Invoke-BoardSectionsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardSection] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Create board section

Create a board section on a board owned by the ""operation user_account"" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardId = "MyBoardId" # String | Unique identifier of a board.
$BoardSection = Initialize-BoardSection -Id "549755885175" -Name "Salads" # BoardSection | Create a board section.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Create board section
try {
    $Result = Invoke-BoardSectionsCreate -BoardId $BoardId -BoardSection $BoardSection -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardSectionsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BoardId** | **String**| Unique identifier of a board. | 
 **BoardSection** | [**BoardSection**](BoardSection.md)| Create a board section. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**BoardSection**](BoardSection.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BoardSectionsDelete"></a>
# **Invoke-BoardSectionsDelete**
> void Invoke-BoardSectionsDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SectionId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Delete board section

Delete a board section on a board owned by the ""operation user_account"" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardId = "MyBoardId" # String | Unique identifier of a board.
$SectionId = "MySectionId" # String | Unique identifier of a board section.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Delete board section
try {
    $Result = Invoke-BoardSectionsDelete -BoardId $BoardId -SectionId $SectionId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardSectionsDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BoardId** | **String**| Unique identifier of a board. | 
 **SectionId** | **String**| Unique identifier of a board section. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BoardSectionsList"></a>
# **Invoke-BoardSectionsList**
> BoardSectionsList200Response Invoke-BoardSectionsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List board sections

Get a list of all board sections from a board owned by the ""operation user_account"" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardId = "MyBoardId" # String | Unique identifier of a board.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# List board sections
try {
    $Result = Invoke-BoardSectionsList -BoardId $BoardId -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardSectionsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BoardId** | **String**| Unique identifier of a board. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BoardSectionsList200Response**](BoardSectionsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BoardSectionsListPins"></a>
# **Invoke-BoardSectionsListPins**
> BoardsListPins200Response Invoke-BoardSectionsListPins<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SectionId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List Pins on board section

Get a list of the Pins on a board section of a board owned by the ""operation user_account"" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardId = "MyBoardId" # String | Unique identifier of a board.
$SectionId = "MySectionId" # String | Unique identifier of a board section.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# List Pins on board section
try {
    $Result = Invoke-BoardSectionsListPins -BoardId $BoardId -SectionId $SectionId -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardSectionsListPins: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BoardId** | **String**| Unique identifier of a board. | 
 **SectionId** | **String**| Unique identifier of a board section. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BoardSectionsUpdate"></a>
# **Invoke-BoardSectionsUpdate**
> BoardSection Invoke-BoardSectionsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SectionId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardSection] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Update board section

Update a board section on a board owned by the ""operation user_account"" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardId = "MyBoardId" # String | Unique identifier of a board.
$SectionId = "MySectionId" # String | Unique identifier of a board section.
$BoardSection = Initialize-BoardSection -Id "549755885175" -Name "Salads" # BoardSection | Update a board section.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Update board section
try {
    $Result = Invoke-BoardSectionsUpdate -BoardId $BoardId -SectionId $SectionId -BoardSection $BoardSection -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardSectionsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BoardId** | **String**| Unique identifier of a board. | 
 **SectionId** | **String**| Unique identifier of a board section. | 
 **BoardSection** | [**BoardSection**](BoardSection.md)| Update a board section. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**BoardSection**](BoardSection.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BoardsCreate"></a>
# **Invoke-BoardsCreate**
> Board Invoke-BoardsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Board] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Create board

Create a board owned by the ""operation user_account"". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardMedia = Initialize-BoardMedia -ImageCoverUrl "https://i.pinimg.com/400x300/fd/cd/d5/fdcdd5a6d8a80824add0d054125cd957.jpg" -PinThumbnailUrls "MyPinThumbnailUrls"
$BoardOwner = Initialize-BoardOwner -Username "MyUsername"
$Board = Initialize-Board -Id "549755885175" -CreatedAt (Get-Date) -BoardPinsModifiedAt (Get-Date) -Name "Summer Recipes" -Description "My favorite summer recipes" -CollaboratorCount 17 -PinCount 5 -FollowerCount 13 -Media $BoardMedia -Owner $BoardOwner -Privacy "PUBLIC" # Board | Create a board using a single board json object.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Create board
try {
    $Result = Invoke-BoardsCreate -Board $Board -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Board** | [**Board**](Board.md)| Create a board using a single board json object. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BoardsDelete"></a>
# **Invoke-BoardsDelete**
> void Invoke-BoardsDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Delete board

Delete a board owned by the ""operation user_account"". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardId = "MyBoardId" # String | Unique identifier of a board.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Delete board
try {
    $Result = Invoke-BoardsDelete -BoardId $BoardId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardsDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BoardId** | **String**| Unique identifier of a board. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BoardsGet"></a>
# **Invoke-BoardsGet**
> Board Invoke-BoardsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardId = "MyBoardId" # String | Unique identifier of a board.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get board
try {
    $Result = Invoke-BoardsGet -BoardId $BoardId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BoardId** | **String**| Unique identifier of a board. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BoardsList"></a>
# **Invoke-BoardsList**
> BoardsList200Response Invoke-BoardsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Privacy] <String><br>

List boards

Get a list of the boards owned by the ""operation user_account"" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Privacy = "ALL" # String | Privacy setting for a board. (optional)

# List boards
try {
    $Result = Invoke-BoardsList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Privacy $Privacy
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Privacy** | **String**| Privacy setting for a board. | [optional] 

### Return type

[**BoardsList200Response**](BoardsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BoardsListPins"></a>
# **Invoke-BoardsListPins**
> BoardsListPins200Response Invoke-BoardsListPins<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreativeTypes] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinMetrics] <System.Nullable[Boolean]><br>

List Pins on board

Get a list of the Pins on a board owned by the ""operation user_account"" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardId = "MyBoardId" # String | Unique identifier of a board.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$CreativeTypes = "REGULAR" # String[] | Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$PinMetrics = $true # Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to $false)

# List Pins on board
try {
    $Result = Invoke-BoardsListPins -BoardId $BoardId -Bookmark $Bookmark -PageSize $PageSize -CreativeTypes $CreativeTypes -AdAccountId $AdAccountId -PinMetrics $PinMetrics
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardsListPins: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BoardId** | **String**| Unique identifier of a board. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **CreativeTypes** | [**String[]**](String.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **PinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to $false]

### Return type

[**BoardsListPins200Response**](BoardsListPins200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BoardsUpdate"></a>
# **Invoke-BoardsUpdate**
> Board Invoke-BoardsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BoardUpdate] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Update board

Update a board owned by the ""operating user_account"". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BoardId = "MyBoardId" # String | Unique identifier of a board.
$BoardUpdate = Initialize-BoardUpdate -Name "Summer Recipes" -Description "My favorite summer recipes" -Privacy "PUBLIC" # BoardUpdate | Update a board.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Update board
try {
    $Result = Invoke-BoardsUpdate -BoardId $BoardId -BoardUpdate $BoardUpdate -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-BoardsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BoardId** | **String**| Unique identifier of a board. | 
 **BoardUpdate** | [**BoardUpdate**](BoardUpdate.md)| Update a board. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Board**](Board.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

