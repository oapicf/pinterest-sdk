#
# Pinterest REST API
# Pinterest's REST API
# Version: 5.14.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Create product group promotions

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER ProductGroupPromotionCreateRequest
List of Product Group Promotions to create, size limit [1, 30].

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

ProductGroupPromotionResponse
#>
function Invoke-ProductGroupPromotionsCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${ProductGroupPromotionCreateRequest},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-ProductGroupPromotionsCreate' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/product_group_promotions'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling productGroupPromotions_create."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if (!$ProductGroupPromotionCreateRequest) {
            throw "Error! The required parameter `ProductGroupPromotionCreateRequest` missing when calling productGroupPromotions_create."
        }

        $LocalVarBodyParameter = $ProductGroupPromotionCreateRequest | ConvertTo-Json -Depth 100


        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "ProductGroupPromotionResponse" `
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

Get a product group promotion by id

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER ProductGroupPromotionId
Unique identifier of a product group promotion

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

ProductGroupPromotionResponse
#>
function Invoke-ProductGroupPromotionsGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${ProductGroupPromotionId},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-ProductGroupPromotionsGet' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling productGroupPromotions_get."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))
        if (!$ProductGroupPromotionId) {
            throw "Error! The required parameter `ProductGroupPromotionId` missing when calling productGroupPromotions_get."
        }
        $LocalVarUri = $LocalVarUri.replace('{product_group_promotion_id}', [System.Web.HTTPUtility]::UrlEncode($ProductGroupPromotionId))


        $LocalVarResult = Invoke-ApiClient -Method 'GET' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "ProductGroupPromotionResponse" `
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

Get product group promotions

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER ProductGroupPromotionIds
List of Product group promotion Ids.

.PARAMETER EntityStatuses
Entity status

.PARAMETER AdGroupId
Ad group Id.

.PARAMETER PageSize
Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

.PARAMETER Order
The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.

.PARAMETER Bookmark
Cursor used to fetch the next page of items

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

ProductGroupPromotionsList200Response
#>
function Invoke-ProductGroupPromotionsList {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${ProductGroupPromotionIds},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("ACTIVE", "PAUSED", "ARCHIVED", "DRAFT", "DELETED_DRAFT")]
        [String[]]
        ${EntityStatuses},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdGroupId},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.Nullable[Int32]]
        ${PageSize},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("ASCENDING", "DESCENDING")]
        [String]
        ${Order},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Bookmark},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-ProductGroupPromotionsList' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/product_group_promotions'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling productGroupPromotions_list."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if ($ProductGroupPromotionIds) {
            $LocalVarQueryParameters['product_group_promotion_ids'] = $ProductGroupPromotionIds
        }

        if ($EntityStatuses) {
            $LocalVarQueryParameters['entity_statuses'] = $EntityStatuses
        }

        if ($AdGroupId) {
            $LocalVarQueryParameters['ad_group_id'] = $AdGroupId
        }

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
                                -ReturnType "ProductGroupPromotionsList200Response" `
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

Update product group promotions

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER ProductGroupPromotionUpdateRequest
Parameters to update Product group promotions

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

ProductGroupPromotionResponse
#>
function Invoke-ProductGroupPromotionsUpdate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${ProductGroupPromotionUpdateRequest},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-ProductGroupPromotionsUpdate' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/product_group_promotions'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling productGroupPromotions_update."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if (!$ProductGroupPromotionUpdateRequest) {
            throw "Error! The required parameter `ProductGroupPromotionUpdateRequest` missing when calling productGroupPromotions_update."
        }

        $LocalVarBodyParameter = $ProductGroupPromotionUpdateRequest | ConvertTo-Json -Depth 100


        $LocalVarResult = Invoke-ApiClient -Method 'PATCH' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "ProductGroupPromotionResponse" `
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

Get product group analytics

.DESCRIPTION

No description available.

.PARAMETER AdAccountId
Unique identifier of an ad account.

.PARAMETER StartDate
Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.

.PARAMETER EndDate
Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.

.PARAMETER ProductGroupIds
List of Product group Ids to use to filter the results.

.PARAMETER Columns
Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned

.PARAMETER Granularity
TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly

.PARAMETER ClickWindowDays
Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.

.PARAMETER EngagementWindowDays
Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.

.PARAMETER ViewWindowDays
Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.

.PARAMETER ConversionReportTime
The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

ProductGroupAnalyticsResponseInner[]
#>
function Invoke-ProductGroupsAnalytics {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.DateTime]
        ${StartDate},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [System.DateTime]
        ${EndDate},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String[]]
        ${ProductGroupIds},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("SPEND_IN_MICRO_DOLLAR", "PAID_IMPRESSION", "SPEND_IN_DOLLAR", "CPC_IN_MICRO_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPC_IN_DOLLAR", "CTR", "ECTR", "CAMPAIGN_NAME", "PIN_ID", "TOTAL_ENGAGEMENT", "ENGAGEMENT_1", "ENGAGEMENT_2", "ECPE_IN_DOLLAR", "ENGAGEMENT_RATE", "EENGAGEMENT_RATE", "ECPM_IN_MICRO_DOLLAR", "REPIN_RATE", "CTR_2", "CAMPAIGN_ID", "ADVERTISER_ID", "AD_ACCOUNT_ID", "PIN_PROMOTION_ID", "AD_ID", "AD_GROUP_ID", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_OBJECTIVE_TYPE", "CPM_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "AD_GROUP_ENTITY_STATUS", "ORDER_LINE_ID", "ORDER_LINE_NAME", "CLICKTHROUGH_1", "REPIN_1", "IMPRESSION_1", "IMPRESSION_1_GROSS", "CLICKTHROUGH_1_GROSS", "OUTBOUND_CLICK_1", "CLICKTHROUGH_2", "REPIN_2", "IMPRESSION_2", "OUTBOUND_CLICK_2", "TOTAL_CLICKTHROUGH", "TOTAL_IMPRESSION", "TOTAL_IMPRESSION_USER", "TOTAL_IMPRESSION_FREQUENCY", "COST_PER_OUTBOUND_CLICK_IN_DOLLAR", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_LEAD", "TOTAL_CONVERSIONS", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_DAILY_SPEND_CAP", "TOTAL_PAGE_VISIT", "TOTAL_SIGNUP", "TOTAL_CHECKOUT", "TOTAL_CUSTOM", "TOTAL_LEAD", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "CHECKOUT_ROAS", "CUSTOM_ROAS", "VIDEO_MRC_VIEWS_1", "VIDEO_3SEC_VIEWS_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P0_COMBINED_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "VIDEO_MRC_VIEWS_2", "PAID_VIDEO_VIEWABLE_RATE", "VIDEO_LENGTH", "ECPV_IN_DOLLAR", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_REPIN_RATE", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "INAPP_CHECKOUT_COST_PER_ACTION", "TOTAL_OFFLINE_CHECKOUT", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "LEADS", "COST_PER_LEAD", "QUIZ_COMPLETED", "QUIZ_PIN_RESULT_OPEN", "QUIZ_COMPLETION_RATE", "SHOWCASE_PIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_CLICKTHROUGH", "SHOWCASE_SUBPIN_CLICKTHROUGH", "SHOWCASE_SUBPAGE_IMPRESSION", "SHOWCASE_SUBPIN_IMPRESSION", "SHOWCASE_SUBPAGE_SWIPE_LEFT", "SHOWCASE_SUBPAGE_SWIPE_RIGHT", "SHOWCASE_SUBPIN_SWIPE_LEFT", "SHOWCASE_SUBPIN_SWIPE_RIGHT", "SHOWCASE_SUBPAGE_REPIN", "SHOWCASE_SUBPIN_REPIN", "SHOWCASE_SUBPAGE_CLOSEUP", "SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD", "SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD", "SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION", "TOTAL_CHECKOUT_CONVERSION_RATE", "TOTAL_VIEW_CATEGORY_CONVERSION_RATE", "TOTAL_ADD_TO_CART_CONVERSION_RATE", "TOTAL_SIGNUP_CONVERSION_RATE", "TOTAL_PAGE_VISIT_CONVERSION_RATE", "TOTAL_LEAD_CONVERSION_RATE", "TOTAL_SEARCH_CONVERSION_RATE", "TOTAL_WATCH_VIDEO_CONVERSION_RATE", "TOTAL_UNKNOWN_CONVERSION_RATE", "TOTAL_CUSTOM_CONVERSION_RATE")]
        [String[]]
        ${Columns},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [PSCustomObject]
        ${Granularity},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("0", "1", "7", "14", "30", "60")]
        [System.Nullable[Int32]]
        ${ClickWindowDays},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("0", "1", "7", "14", "30", "60")]
        [System.Nullable[Int32]]
        ${EngagementWindowDays},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("0", "1", "7", "14", "30", "60")]
        [System.Nullable[Int32]]
        ${ViewWindowDays},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [ValidateSet("TIME_OF_AD_ACTION", "TIME_OF_CONVERSION")]
        [String]
        ${ConversionReportTime},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-ProductGroupsAnalytics' | Write-Debug
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

        $LocalVarUri = '/ad_accounts/{ad_account_id}/product_groups/analytics'
        if (!$AdAccountId) {
            throw "Error! The required parameter `AdAccountId` missing when calling productGroups_analytics."
        }
        $LocalVarUri = $LocalVarUri.replace('{ad_account_id}', [System.Web.HTTPUtility]::UrlEncode($AdAccountId))

        if (!$StartDate) {
            throw "Error! The required parameter `StartDate` missing when calling productGroups_analytics."
        }
        $LocalVarQueryParameters['start_date'] = $StartDate

        if (!$EndDate) {
            throw "Error! The required parameter `EndDate` missing when calling productGroups_analytics."
        }
        $LocalVarQueryParameters['end_date'] = $EndDate

        if (!$ProductGroupIds) {
            throw "Error! The required parameter `ProductGroupIds` missing when calling productGroups_analytics."
        }
        $LocalVarQueryParameters['product_group_ids'] = $ProductGroupIds

        if (!$Columns) {
            throw "Error! The required parameter `Columns` missing when calling productGroups_analytics."
        }
        $LocalVarQueryParameters['columns'] = $Columns

        if (!$Granularity) {
            throw "Error! The required parameter `Granularity` missing when calling productGroups_analytics."
        }
        $LocalVarQueryParameters['granularity'] = $Granularity

        if ($ClickWindowDays) {
            $LocalVarQueryParameters['click_window_days'] = $ClickWindowDays
        }

        if ($EngagementWindowDays) {
            $LocalVarQueryParameters['engagement_window_days'] = $EngagementWindowDays
        }

        if ($ViewWindowDays) {
            $LocalVarQueryParameters['view_window_days'] = $ViewWindowDays
        }

        if ($ConversionReportTime) {
            $LocalVarQueryParameters['conversion_report_time'] = $ConversionReportTime
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
                                -ReturnType "ProductGroupAnalyticsResponseInner[]" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

