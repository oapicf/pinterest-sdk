#
# Pinterest REST API
# Pinterest's REST API
# Version: 5.14.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Create lead form test data

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER LeadFormId
Unique identifier of a lead form.

.PARAMETER LeadFormTestRequest
Subscription to create.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

LeadFormTestResponse
#>
function Invoke-LeadFormTestCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${LeadFormId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${LeadFormTestRequest},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-LeadFormTestCreate' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        # HTTP header 'Content-Type'
        $LocalVarContentTypes = @('application/json')

        $LocalVarUri = '/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling leadFormTest_create."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))
        if (!$LeadFormId) {
            throw "Error! The required parameter `LeadFormId` missing when calling leadFormTest_create."
        }
        $LocalVarUri = $LocalVarUri.replace('{lead_form_id}', [System.Web.HTTPUtility]::UrlEncode($LeadFormId))

        if (!$LeadFormTestRequest) {
            throw "Error! The required parameter `LeadFormTestRequest` missing when calling leadFormTest_create."
        }

        $LocalVarBodyParameter = $LeadFormTestRequest | ConvertTo-Json -Depth 100


        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "LeadFormTestResponse" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

<#
.SYNOPSIS

Get lead form by id

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER LeadFormId
Unique identifier of a lead form.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

LeadFormResponse
#>
function Invoke-LeadFormGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${LeadFormId},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-LeadFormGet' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        $LocalVarUri = '/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling leadForm_get."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))
        if (!$LeadFormId) {
            throw "Error! The required parameter `LeadFormId` missing when calling leadForm_get."
        }
        $LocalVarUri = $LocalVarUri.replace('{lead_form_id}', [System.Web.HTTPUtility]::UrlEncode($LeadFormId))


        $LocalVarResult = Invoke-ApiClient -Method 'GET' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "LeadFormResponse" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

<#
.SYNOPSIS

Create lead forms

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER LeadFormCreateRequest
List of lead forms to create, size limit [1, 30].

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

LeadFormArrayResponse
#>
function Invoke-LeadFormsCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject[]]
        ${LeadFormCreateRequest},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-LeadFormsCreate' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        # HTTP header 'Content-Type'
        $LocalVarContentTypes = @('application/json')

        $LocalVarUri = '/ad_accounts/{ad_account_id}/lead_forms'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling leadForms_create."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if (!$LeadFormCreateRequest) {
            throw "Error! The required parameter `LeadFormCreateRequest` missing when calling leadForms_create."
        }

        $LocalVarBodyParameter = ConvertTo-Json @($LeadFormCreateRequest) -Depth 100


        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "LeadFormArrayResponse" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

<#
.SYNOPSIS

List lead forms

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER PageSize
Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

.PARAMETER Order
The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.

.PARAMETER Bookmark
Cursor used to fetch the next page of items

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

LeadFormsList200Response
#>
function Invoke-LeadFormsList {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${PageSize},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("ASCENDING", "DESCENDING")]
        [String]
        ${Order},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Bookmark},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-LeadFormsList' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        $LocalVarUri = '/ad_accounts/{ad_account_id}/lead_forms'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling leadForms_list."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if ($PageSize) {
            $LocalVarQueryParameters['page_size'] = $PageSize
        }

        if ($Order) {
            $LocalVarQueryParameters['order'] = $Order
        }

        if ($Bookmark) {
            $LocalVarQueryParameters['bookmark'] = $Bookmark
        }


        $LocalVarResult = Invoke-ApiClient -Method 'GET' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "LeadFormsList200Response" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

<#
.SYNOPSIS

Update lead forms

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER LeadFormUpdateRequest
List of lead forms to update, size limit [1, 30].

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

LeadFormArrayResponse
#>
function Invoke-LeadFormsUpdate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject[]]
        ${LeadFormUpdateRequest},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-LeadFormsUpdate' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        # HTTP header 'Content-Type'
        $LocalVarContentTypes = @('application/json')

        $LocalVarUri = '/ad_accounts/{ad_account_id}/lead_forms'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling leadForms_update."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if (!$LeadFormUpdateRequest) {
            throw "Error! The required parameter `LeadFormUpdateRequest` missing when calling leadForms_update."
        }

        $LocalVarBodyParameter = ConvertTo-Json @($LeadFormUpdateRequest) -Depth 100


        $LocalVarResult = Invoke-ApiClient -Method 'PATCH' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "LeadFormArrayResponse" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

