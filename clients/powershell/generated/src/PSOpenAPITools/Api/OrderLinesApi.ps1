#
# Pinterest REST API
# Pinterest's REST API
# Version: 5.12.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Get order line

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER OrderLineId
Unique identifier of an order line.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

OrderLine
#>
function Invoke-OrderLinesGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${OrderLineId},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-OrderLinesGet' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/order_lines/{order_line_id}'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling orderLines_get."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))
        if (!$OrderLineId) {
            throw "Error! The required parameter `OrderLineId` missing when calling orderLines_get."
        }
        $LocalVarUri = $LocalVarUri.replace('{order_line_id}', [System.Web.HTTPUtility]::UrlEncode($OrderLineId))


        $LocalVarResult = Invoke-ApiClient -Method 'GET' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "OrderLine" `
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

Get order lines

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER PageSize
Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.

.PARAMETER Order
The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.

.PARAMETER Bookmark
Cursor used to fetch the next page of items

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

OrderLinesList200Response
#>
function Invoke-OrderLinesList {
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
        'Calling method: Invoke-OrderLinesList' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/order_lines'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling orderLines_list."
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
                                -ReturnType "OrderLinesList200Response" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}
