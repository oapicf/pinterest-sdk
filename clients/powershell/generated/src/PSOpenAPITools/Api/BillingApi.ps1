#
# Pinterest REST API
# Pinterest's REST API
# Version: 5.14.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Redeem ad credits

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER AdsCreditRedeemRequest
Redeem ad credits request.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

AdsCreditRedeemResponse
#>
function Invoke-AdsCreditRedeem {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${AdsCreditRedeemRequest},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-AdsCreditRedeem' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/ads_credit/redeem'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling adsCredit_redeem."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if (!$AdsCreditRedeemRequest) {
            throw "Error! The required parameter `AdsCreditRedeemRequest` missing when calling adsCredit_redeem."
        }

        $LocalVarBodyParameter = $AdsCreditRedeemRequest | ConvertTo-Json -Depth 100


        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "AdsCreditRedeemResponse" `
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

Get ads credit discounts

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER Bookmark
Cursor used to fetch the next page of items

.PARAMETER PageSize
Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

AdsCreditsDiscountsGet200Response
#>
function Invoke-AdsCreditsDiscountsGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Bookmark},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${PageSize},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-AdsCreditsDiscountsGet' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/ads_credit/discounts'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling adsCreditsDiscounts_get."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if ($Bookmark) {
            $LocalVarQueryParameters['bookmark'] = $Bookmark
        }

        if ($PageSize) {
            $LocalVarQueryParameters['page_size'] = $PageSize
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
                                -ReturnType "AdsCreditsDiscountsGet200Response" `
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

Get billing profiles

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER IsActive
Return active billing profiles, if false return all billing profiles.

.PARAMETER Bookmark
Cursor used to fetch the next page of items

.PARAMETER PageSize
Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

BillingProfilesGet200Response
#>
function Invoke-BillingProfilesGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Boolean]
        ${IsActive},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Bookmark},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${PageSize},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-BillingProfilesGet' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/billing_profiles'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling billingProfiles_get."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if (!$IsActive) {
            throw "Error! The required parameter `IsActive` missing when calling billingProfiles_get."
        }
        $LocalVarQueryParameters['is_active'] = $IsActive

        if ($Bookmark) {
            $LocalVarQueryParameters['bookmark'] = $Bookmark
        }

        if ($PageSize) {
            $LocalVarQueryParameters['page_size'] = $PageSize
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
                                -ReturnType "BillingProfilesGet200Response" `
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

Get Salesforce account details including bill-to information.

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

SSIOAccountResponse
#>
function Invoke-SsioAccountsGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-SsioAccountsGet' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/ssio/accounts'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling ssioAccounts_get."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))


        $LocalVarResult = Invoke-ApiClient -Method 'GET' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "SSIOAccountResponse" `
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

Create insertion order through SSIO.

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER SSIOCreateInsertionOrderRequest
Order line to create.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

SSIOCreateInsertionOrderResponse
#>
function Invoke-SsioInsertionOrderCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${SSIOCreateInsertionOrderRequest},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-SsioInsertionOrderCreate' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/ssio/insertion_orders'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling ssioInsertionOrder_create."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if (!$SSIOCreateInsertionOrderRequest) {
            throw "Error! The required parameter `SSIOCreateInsertionOrderRequest` missing when calling ssioInsertionOrder_create."
        }

        $LocalVarBodyParameter = $SSIOCreateInsertionOrderRequest | ConvertTo-Json -Depth 100


        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "SSIOCreateInsertionOrderResponse" `
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

Edit insertion order through SSIO.

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER SSIOEditInsertionOrderRequest
Order line to create.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

SSIOEditInsertionOrderResponse
#>
function Invoke-SsioInsertionOrderEdit {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${SSIOEditInsertionOrderRequest},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-SsioInsertionOrderEdit' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/ssio/insertion_orders'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling ssioInsertionOrder_edit."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if (!$SSIOEditInsertionOrderRequest) {
            throw "Error! The required parameter `SSIOEditInsertionOrderRequest` missing when calling ssioInsertionOrder_edit."
        }

        $LocalVarBodyParameter = $SSIOEditInsertionOrderRequest | ConvertTo-Json -Depth 100


        $LocalVarResult = Invoke-ApiClient -Method 'PATCH' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "SSIOEditInsertionOrderResponse" `
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

Get insertion order status by ad account id.

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER Bookmark
Cursor used to fetch the next page of items

.PARAMETER PageSize
Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

SsioInsertionOrdersStatusGetByAdAccount200Response
#>
function Invoke-SsioInsertionOrdersStatusGetByAdAccount {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Bookmark},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${PageSize},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-SsioInsertionOrdersStatusGetByAdAccount' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/ssio/insertion_orders/status'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling ssioInsertionOrdersStatus_getByAdAccount."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if ($Bookmark) {
            $LocalVarQueryParameters['bookmark'] = $Bookmark
        }

        if ($PageSize) {
            $LocalVarQueryParameters['page_size'] = $PageSize
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
                                -ReturnType "SsioInsertionOrdersStatusGetByAdAccount200Response" `
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

Get insertion order status by pin order id.

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER PinOrderId
The pin order id associated with the ssio insertion order

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

SSIOInsertionOrderStatusResponse
#>
function Invoke-SsioInsertionOrdersStatusGetByPinOrderId {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${PinOrderId},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-SsioInsertionOrdersStatusGetByPinOrderId' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling ssioInsertionOrdersStatus_getByPinOrderId."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))
        if (!$PinOrderId) {
            throw "Error! The required parameter `PinOrderId` missing when calling ssioInsertionOrdersStatus_getByPinOrderId."
        }
        $LocalVarUri = $LocalVarUri.replace('{pin_order_id}', [System.Web.HTTPUtility]::UrlEncode($PinOrderId))


        $LocalVarResult = Invoke-ApiClient -Method 'GET' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "SSIOInsertionOrderStatusResponse" `
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

Get Salesforce order lines by ad account id.

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER Bookmark
Cursor used to fetch the next page of items

.PARAMETER PageSize
Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

.PARAMETER PinOrderId
The pin order id associated with the ssio insertino order

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

SsioOrderLinesGetByAdAccount200Response
#>
function Invoke-SsioOrderLinesGetByAdAccount {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Bookmark},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${PageSize},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${PinOrderId},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-SsioOrderLinesGetByAdAccount' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/ssio/order_lines'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling ssioOrderLines_getByAdAccount."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if ($Bookmark) {
            $LocalVarQueryParameters['bookmark'] = $Bookmark
        }

        if ($PageSize) {
            $LocalVarQueryParameters['page_size'] = $PageSize
        }

        if ($PinOrderId) {
            $LocalVarQueryParameters['pin_order_id'] = $PinOrderId
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
                                -ReturnType "SsioOrderLinesGetByAdAccount200Response" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

