# PSOpenAPITools.PSOpenAPITools\Api.MediaApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-MediaCreate**](MediaApi.md#Invoke-MediaCreate) | **POST** /media | Register media upload
[**Invoke-MediaGet**](MediaApi.md#Invoke-MediaGet) | **GET** /media/{media_id} | Get media upload details
[**Invoke-MediaList**](MediaApi.md#Invoke-MediaList) | **GET** /media | List media uploads


<a id="Invoke-MediaCreate"></a>
# **Invoke-MediaCreate**
> MediaUpload Invoke-MediaCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MediaUploadRequest] <PSCustomObject><br>

Register media upload

Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$MediaUploadRequest = Initialize-MediaUploadRequest -MediaType "video" # MediaUploadRequest | Create a media upload request

# Register media upload
try {
    $Result = Invoke-MediaCreate -MediaUploadRequest $MediaUploadRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-MediaCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MediaUploadRequest** | [**MediaUploadRequest**](MediaUploadRequest.md)| Create a media upload request | 

### Return type

[**MediaUpload**](MediaUpload.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-MediaGet"></a>
# **Invoke-MediaGet**
> MediaUploadDetails Invoke-MediaGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MediaId] <String><br>

Get media upload details

Get details for a registered media upload, including its current status.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$MediaId = "MyMediaId" # String | Media identifier

# Get media upload details
try {
    $Result = Invoke-MediaGet -MediaId $MediaId
} catch {
    Write-Host ("Exception occurred when calling Invoke-MediaGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MediaId** | **String**| Media identifier | 

### Return type

[**MediaUploadDetails**](MediaUploadDetails.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-MediaList"></a>
# **Invoke-MediaList**
> MediaList200Response Invoke-MediaList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List media uploads

List media uploads filtered by given parameters.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# List media uploads
try {
    $Result = Invoke-MediaList -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-MediaList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**MediaList200Response**](MediaList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

