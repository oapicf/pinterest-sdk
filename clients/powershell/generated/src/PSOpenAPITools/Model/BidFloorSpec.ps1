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

.PARAMETER Countries
No description available.
.PARAMETER Currency
No description available.
.PARAMETER ObjectiveType
No description available.
.PARAMETER BillableEvent
No description available.
.PARAMETER OptimizationGoalMetadata
No description available.
.PARAMETER CreativeType
No description available.
.OUTPUTS

BidFloorSpec<PSCustomObject>
#>

function Initialize-BidFloorSpec {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Countries},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("UNK", "USD", "GBP", "CAD", "EUR", "AUD", "NZD", "SEK", "ILS", "CHF", "HKD", "JPY", "SGD", "KRW", "NOK", "DKK", "PLN", "RON", "HUF", "CZK", "BRL", "MXN", "ARS", "CLP", "COP", "INR", "TRY")]
        [PSCustomObject]
        ${Currency},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS", "VIDEO_COMPLETION")]
        [PSCustomObject]
        ${ObjectiveType},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("CLICKTHROUGH", "IMPRESSION", "VIDEO_V_50_MRC")]
        [PSCustomObject]
        ${BillableEvent},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${OptimizationGoalMetadata},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA", "SHOWCASE", "QUIZ")]
        [PSCustomObject]
        ${CreativeType}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => BidFloorSpec' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Currency) {
            throw "invalid value for 'Currency', 'Currency' cannot be null."
        }

        if ($null -eq $BillableEvent) {
            throw "invalid value for 'BillableEvent', 'BillableEvent' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "countries" = ${Countries}
            "currency" = ${Currency}
            "objective_type" = ${ObjectiveType}
            "billable_event" = ${BillableEvent}
            "optimization_goal_metadata" = ${OptimizationGoalMetadata}
            "creative_type" = ${CreativeType}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BidFloorSpec<PSCustomObject>

.DESCRIPTION

Convert from JSON to BidFloorSpec<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BidFloorSpec<PSCustomObject>
#>
function ConvertFrom-JsonToBidFloorSpec {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => BidFloorSpec' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BidFloorSpec
        $AllProperties = ("countries", "currency", "objective_type", "billable_event", "optimization_goal_metadata", "creative_type")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'currency' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "currency"))) {
            throw "Error! JSON cannot be serialized due to the required property 'currency' missing."
        } else {
            $Currency = $JsonParameters.PSobject.Properties["currency"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "billable_event"))) {
            throw "Error! JSON cannot be serialized due to the required property 'billable_event' missing."
        } else {
            $BillableEvent = $JsonParameters.PSobject.Properties["billable_event"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "countries"))) { #optional property not found
            $Countries = $null
        } else {
            $Countries = $JsonParameters.PSobject.Properties["countries"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "objective_type"))) { #optional property not found
            $ObjectiveType = $null
        } else {
            $ObjectiveType = $JsonParameters.PSobject.Properties["objective_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "optimization_goal_metadata"))) { #optional property not found
            $OptimizationGoalMetadata = $null
        } else {
            $OptimizationGoalMetadata = $JsonParameters.PSobject.Properties["optimization_goal_metadata"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "creative_type"))) { #optional property not found
            $CreativeType = $null
        } else {
            $CreativeType = $JsonParameters.PSobject.Properties["creative_type"].value
        }

        $PSO = [PSCustomObject]@{
            "countries" = ${Countries}
            "currency" = ${Currency}
            "objective_type" = ${ObjectiveType}
            "billable_event" = ${BillableEvent}
            "optimization_goal_metadata" = ${OptimizationGoalMetadata}
            "creative_type" = ${CreativeType}
        }

        return $PSO
    }

}

