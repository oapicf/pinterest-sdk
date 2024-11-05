# PSOpenAPITools.PSOpenAPITools\Api.LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-LeadFormTestCreate**](LeadFormsApi.md#Invoke-LeadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**Invoke-LeadFormGet**](LeadFormsApi.md#Invoke-LeadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**Invoke-LeadFormsCreate**](LeadFormsApi.md#Invoke-LeadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**Invoke-LeadFormsList**](LeadFormsApi.md#Invoke-LeadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**Invoke-LeadFormsUpdate**](LeadFormsApi.md#Invoke-LeadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


<a id="Invoke-LeadFormTestCreate"></a>
# **Invoke-LeadFormTestCreate**
> LeadFormTestResponse Invoke-LeadFormTestCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadFormId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadFormTestRequest] <PSCustomObject><br>

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LeadFormId = "1234567890123" # String | Unique identifier of a lead form.
$LeadFormTestRequest = Initialize-LeadFormTestRequest -Answers "MyAnswers" # LeadFormTestRequest | Subscription to create.

# Create lead form test data
try {
    $Result = Invoke-LeadFormTestCreate -AdAccountId $AdAccountId -LeadFormId $LeadFormId -LeadFormTestRequest $LeadFormTestRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormTestCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **LeadFormId** | **String**| Unique identifier of a lead form. | 
 **LeadFormTestRequest** | [**LeadFormTestRequest**](LeadFormTestRequest.md)| Subscription to create. | 

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LeadFormGet"></a>
# **Invoke-LeadFormGet**
> LeadFormResponse Invoke-LeadFormGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadFormId] <String><br>

Get lead form by id

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=""reference external"" href=""https://help.pinterest.com/en/business/article/lead-ads"">Lead ads</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LeadFormId = "1234567890123" # String | Unique identifier of a lead form.

# Get lead form by id
try {
    $Result = Invoke-LeadFormGet -AdAccountId $AdAccountId -LeadFormId $LeadFormId
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **LeadFormId** | **String**| Unique identifier of a lead form. | 

### Return type

[**LeadFormResponse**](LeadFormResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LeadFormsCreate"></a>
# **Invoke-LeadFormsCreate**
> LeadFormArrayResponse Invoke-LeadFormsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadFormCreateRequest] <PSCustomObject[]><br>

Create lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=""reference external"" href=""https://help.pinterest.com/en/business/article/lead-ads"">Lead ads</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LeadFormQuestion = Initialize-LeadFormQuestion -QuestionType "CUSTOM" -CustomQuestionFieldType "TEXT_FIELD" -CustomQuestionLabel "MyCustomQuestionLabel" -CustomQuestionOptions "MyCustomQuestionOptions"
$LeadFormCommonPolicyLinksInner = Initialize-LeadFormCommonPolicyLinksInner -Label "MyLabel" -Link "MyLink"
$LeadFormCreateRequest = Initialize-LeadFormCreateRequest -Name "Lead Form 3/14/2023" -PrivacyPolicyLink "https://www.advertisername.com/privacy-policy" -HasAcceptedTerms $false -CompletionMessage "Thank you for submitting. We will contact you soon." -Status "DRAFT" -DisclosureLanguage "By entering your personal information, you agree that your data will be collected and used." -Questions $LeadFormQuestion -PolicyLinks $LeadFormCommonPolicyLinksInner # LeadFormCreateRequest[] | List of lead forms to create, size limit [1, 30].

# Create lead forms
try {
    $Result = Invoke-LeadFormsCreate -AdAccountId $AdAccountId -LeadFormCreateRequest $LeadFormCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **LeadFormCreateRequest** | [**LeadFormCreateRequest[]**](LeadFormCreateRequest.md)| List of lead forms to create, size limit [1, 30]. | 

### Return type

[**LeadFormArrayResponse**](LeadFormArrayResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LeadFormsList"></a>
# **Invoke-LeadFormsList**
> LeadFormsList200Response Invoke-LeadFormsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

List lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=""reference external"" href=""https://help.pinterest.com/en/business/article/lead-ads"">Lead ads</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Order = "ASCENDING" # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# List lead forms
try {
    $Result = Invoke-LeadFormsList -AdAccountId $AdAccountId -PageSize $PageSize -Order $Order -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LeadFormsUpdate"></a>
# **Invoke-LeadFormsUpdate**
> LeadFormArrayResponse Invoke-LeadFormsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadFormUpdateRequest] <PSCustomObject[]><br>

Update lead forms

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=""reference external"" href=""https://help.pinterest.com/en/business/article/lead-ads"">Lead ads</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LeadFormQuestion = Initialize-LeadFormQuestion -QuestionType "CUSTOM" -CustomQuestionFieldType "TEXT_FIELD" -CustomQuestionLabel "MyCustomQuestionLabel" -CustomQuestionOptions "MyCustomQuestionOptions"
$LeadFormCommonPolicyLinksInner = Initialize-LeadFormCommonPolicyLinksInner -Label "MyLabel" -Link "MyLink"
$LeadFormUpdateRequest = Initialize-LeadFormUpdateRequest -Name "Lead Form 3/14/2023" -PrivacyPolicyLink "https://www.advertisername.com/privacy-policy" -HasAcceptedTerms $false -CompletionMessage "Thank you for submitting. We will contact you soon." -Status "DRAFT" -DisclosureLanguage "By entering your personal information, you agree that your data will be collected and used." -Questions $LeadFormQuestion -PolicyLinks $LeadFormCommonPolicyLinksInner -Id "7765300871171" # LeadFormUpdateRequest[] | List of lead forms to update, size limit [1, 30].

# Update lead forms
try {
    $Result = Invoke-LeadFormsUpdate -AdAccountId $AdAccountId -LeadFormUpdateRequest $LeadFormUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **LeadFormUpdateRequest** | [**LeadFormUpdateRequest[]**](LeadFormUpdateRequest.md)| List of lead forms to update, size limit [1, 30]. | 

### Return type

[**LeadFormArrayResponse**](LeadFormArrayResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

