# PSOpenAPITools.PSOpenAPITools\Api.TermsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-TermsRelatedList**](TermsApi.md#Invoke-TermsRelatedList) | **GET** /terms/related | List related terms
[**Invoke-TermsSuggestedList**](TermsApi.md#Invoke-TermsSuggestedList) | **GET** /terms/suggested | List suggested terms


<a id="Invoke-TermsRelatedList"></a>
# **Invoke-TermsRelatedList**
> RelatedTerms Invoke-TermsRelatedList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Terms] <String[]><br>

List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Terms = "workout" # String[] | List of input terms.

# List related terms
try {
    $Result = Invoke-TermsRelatedList -Terms $Terms
} catch {
    Write-Host ("Exception occurred when calling Invoke-TermsRelatedList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Terms** | [**String[]**](String.md)| List of input terms. | 

### Return type

[**RelatedTerms**](RelatedTerms.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-TermsSuggestedList"></a>
# **Invoke-TermsSuggestedList**
> String[] Invoke-TermsSuggestedList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Term] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>

List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Term = "sports" # String | Input term.
$Limit = 4 # Int32 | Max suggested terms to return. (optional) (default to 4)

# List suggested terms
try {
    $Result = Invoke-TermsSuggestedList -Term $Term -Limit $Limit
} catch {
    Write-Host ("Exception occurred when calling Invoke-TermsSuggestedList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Term** | **String**| Input term. | 
 **Limit** | **Int32**| Max suggested terms to return. | [optional] [default to 4]

### Return type

**String[]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

