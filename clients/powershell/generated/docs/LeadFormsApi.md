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
> LeadFormTest Invoke-LeadFormTestCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadFormId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadFormTestCreate] <PSCustomObject><br>

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$LeadFormId = "MyLeadFormId" # String | Unique identifier of a lead form.
$LeadFormTestCreate = Initialize-LeadFormTestCreate -Answers "MyAnswers" # LeadFormTestCreate | 

# Create lead form test data
try {
    $Result = Invoke-LeadFormTestCreate -AdAccountId $AdAccountId -LeadFormId $LeadFormId -LeadFormTestCreate $LeadFormTestCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormTestCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**|  | 
 **LeadFormId** | **String**| Unique identifier of a lead form. | 
 **LeadFormTestCreate** | [**LeadFormTestCreate**](LeadFormTestCreate.md)|  | 

### Return type

[**LeadFormTest**](LeadFormTest.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LeadFormGet"></a>
# **Invoke-LeadFormGet**
> LeadForm Invoke-LeadFormGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadFormId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$LeadFormId = "MyLeadFormId" # String | The ID of this lead form
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Get lead form by id
try {
    $Result = Invoke-LeadFormGet -LeadFormId $LeadFormId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **LeadFormId** | **String**| The ID of this lead form | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**LeadForm**](LeadForm.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LeadFormsCreate"></a>
# **Invoke-LeadFormsCreate**
> LeadFormsCreate200Response Invoke-LeadFormsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadFormCreate] <PSCustomObject[]><br>

Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LeadFormPolicyLink = Initialize-LeadFormPolicyLink -Label "MyLabel" -Link "MyLink"
$LeadFormQuestion = Initialize-LeadFormQuestion -CustomQuestionFieldType "TEXT_FIELD" -CustomQuestionLabel "MyCustomQuestionLabel" -CustomQuestionOptions "MyCustomQuestionOptions" -QuestionType "CUSTOM"
$LeadFormCreate = Initialize-LeadFormCreate -CompletionMessage "Thank you for submitting. We will contact you soon." -DisclosureLanguage "By entering your personal information, you agree that your data will be collected and used." -HasAcceptedTerms $false -Name "Lead Form 3/14/2023" -PolicyLinks $LeadFormPolicyLink -PrivacyPolicyLink "https://www.advertisername.com/privacy-policy" -Questions $LeadFormQuestion -Status "DRAFT" # LeadFormCreate[] | 

# Create lead forms
try {
    $Result = Invoke-LeadFormsCreate -AdAccountId $AdAccountId -LeadFormCreate $LeadFormCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **LeadFormCreate** | [**LeadFormCreate[]**](LeadFormCreate.md)|  | 

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md) (PSCustomObject)

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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>

List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
$Order = "ASCENDING" # PinterestLibPaginationOrder | The order in which to sort the items returned: ""ASCENDING"" or ""DESCENDING"" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

# List lead forms
try {
    $Result = Invoke-LeadFormsList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Order $Order
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **Order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)| The order in which to sort the items returned: &quot;&quot;ASCENDING&quot;&quot; or &quot;&quot;DESCENDING&quot;&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

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
> LeadFormsCreate200Response Invoke-LeadFormsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadFormBatchUpdate] <PSCustomObject[]><br>

Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LeadFormPolicyLink = Initialize-LeadFormPolicyLink -Label "MyLabel" -Link "MyLink"
$LeadFormQuestion = Initialize-LeadFormQuestion -CustomQuestionFieldType "TEXT_FIELD" -CustomQuestionLabel "MyCustomQuestionLabel" -CustomQuestionOptions "MyCustomQuestionOptions" -QuestionType "CUSTOM"
$LeadFormBatchUpdate = Initialize-LeadFormBatchUpdate -CompletionMessage "Thank you for submitting. We will contact you soon." -DisclosureLanguage "By entering your personal information, you agree that your data will be collected and used." -HasAcceptedTerms $false -Id "MyId" -Name "Lead Form 3/14/2023" -PolicyLinks $LeadFormPolicyLink -PrivacyPolicyLink "https://www.advertisername.com/privacy-policy" -Questions $LeadFormQuestion -Status "DRAFT" # LeadFormBatchUpdate[] | 

# Update lead forms
try {
    $Result = Invoke-LeadFormsUpdate -AdAccountId $AdAccountId -LeadFormBatchUpdate $LeadFormBatchUpdate
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadFormsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **LeadFormBatchUpdate** | [**LeadFormBatchUpdate[]**](LeadFormBatchUpdate.md)|  | 

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

