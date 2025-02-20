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

Array with metrics, status, and pin id for the requested metric

.PARAMETER Metrics
The metric name and daily value for each requested metric
.PARAMETER DataStatus
No description available.
.PARAMETER PinId
The pin id
.OUTPUTS

TopPinsAnalyticsResponsePinsInner<PSCustomObject>
#>

function Initialize-TopPinsAnalyticsResponsePinsInner {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Collections.Hashtable]
        ${Metrics},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Collections.Hashtable]
        ${DataStatus},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PinId}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => TopPinsAnalyticsResponsePinsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "metrics" = ${Metrics}
            "data_status" = ${DataStatus}
            "pin_id" = ${PinId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to TopPinsAnalyticsResponsePinsInner<PSCustomObject>

.DESCRIPTION

Convert from JSON to TopPinsAnalyticsResponsePinsInner<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

TopPinsAnalyticsResponsePinsInner<PSCustomObject>
#>
function ConvertFrom-JsonToTopPinsAnalyticsResponsePinsInner {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => TopPinsAnalyticsResponsePinsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in TopPinsAnalyticsResponsePinsInner
        $AllProperties = ("metrics", "data_status", "pin_id")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "metrics"))) { #optional property not found
            $Metrics = $null
        } else {
            $Metrics = $JsonParameters.PSobject.Properties["metrics"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "data_status"))) { #optional property not found
            $DataStatus = $null
        } else {
            $DataStatus = $JsonParameters.PSobject.Properties["data_status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pin_id"))) { #optional property not found
            $PinId = $null
        } else {
            $PinId = $JsonParameters.PSobject.Properties["pin_id"].value
        }

        $PSO = [PSCustomObject]@{
            "metrics" = ${Metrics}
            "data_status" = ${DataStatus}
            "pin_id" = ${PinId}
        }

        return $PSO
    }

}

