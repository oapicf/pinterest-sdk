#
# Pinterest REST API
# Pinterest's REST API
# Version: 5.14.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER DataStatus
No description available.
.PARAMETER Date
Metrics date (UTC): YYYY-MM-DD.
.PARAMETER Metrics
The metric name and daily value for each requested metric
.OUTPUTS

PinAnalyticsMetricsResponseDailyMetricsInner<PSCustomObject>
#>

function Initialize-PinAnalyticsMetricsResponseDailyMetricsInner {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("PROCESSING", "READY", "ESTIMATE", "BEFORE_BUSINESS_CREATED", "BEFORE_DATA_RETENTION_PERIOD", "BEFORE_PIN_DATA_RETENTION_PERIOD", "BEFORE_METRIC_START_DATE", "BEFORE_CORE_METRIC_START_DATE", "BEFORE_PIN_FORMAT_METRIC_START_DATE", "BEFORE_AUDIENCE_METRIC_START_DATE", "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE", "BEFORE_VIDEO_METRIC_START_DATE", "BEFORE_CONVERSION_METRIC_START_DATE", "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD", "IN_BAD_TAG_DATE", "BEFORE_PUBLISHED_METRIC_START_DATE", "BEFORE_ASSIST_METRIC_START_DATE", "BEFORE_PIN_CREATED", "BEFORE_ACCOUNT_CLAIMED", "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE", "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD", "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD", "BEFORE_PRODUCT_GROUP_FILTER_START_DATE")]
        [PSCustomObject]
        ${DataStatus},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Date},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Collections.Hashtable]
        ${Metrics}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => PinAnalyticsMetricsResponseDailyMetricsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "data_status" = ${DataStatus}
            "date" = ${Date}
            "metrics" = ${Metrics}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to PinAnalyticsMetricsResponseDailyMetricsInner<PSCustomObject>

.DESCRIPTION

Convert from JSON to PinAnalyticsMetricsResponseDailyMetricsInner<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

PinAnalyticsMetricsResponseDailyMetricsInner<PSCustomObject>
#>
function ConvertFrom-JsonToPinAnalyticsMetricsResponseDailyMetricsInner {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => PinAnalyticsMetricsResponseDailyMetricsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PinAnalyticsMetricsResponseDailyMetricsInner
        $AllProperties = ("data_status", "date", "metrics")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "data_status"))) { #optional property not found
            $DataStatus = $null
        } else {
            $DataStatus = $JsonParameters.PSobject.Properties["data_status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "date"))) { #optional property not found
            $Date = $null
        } else {
            $Date = $JsonParameters.PSobject.Properties["date"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "metrics"))) { #optional property not found
            $Metrics = $null
        } else {
            $Metrics = $JsonParameters.PSobject.Properties["metrics"].value
        }

        $PSO = [PSCustomObject]@{
            "data_status" = ${DataStatus}
            "date" = ${Date}
            "metrics" = ${Metrics}
        }

        return $PSO
    }

}

