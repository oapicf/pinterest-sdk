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

.PARAMETER ClickWindowDays
No description available.
.PARAMETER EngagementWindowDays
No description available.
.PARAMETER ViewWindowDays
No description available.
.OUTPUTS

OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows<PSCustomObject>
#>

function Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ClickWindowDays},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${EngagementWindowDays},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ViewWindowDays}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "click_window_days" = ${ClickWindowDays}
            "engagement_window_days" = ${EngagementWindowDays}
            "view_window_days" = ${ViewWindowDays}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows<PSCustomObject>

.DESCRIPTION

Convert from JSON to OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows<PSCustomObject>
#>
function ConvertFrom-JsonToOptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
        $AllProperties = ("click_window_days", "engagement_window_days", "view_window_days")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "click_window_days"))) { #optional property not found
            $ClickWindowDays = $null
        } else {
            $ClickWindowDays = $JsonParameters.PSobject.Properties["click_window_days"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "engagement_window_days"))) { #optional property not found
            $EngagementWindowDays = $null
        } else {
            $EngagementWindowDays = $JsonParameters.PSobject.Properties["engagement_window_days"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "view_window_days"))) { #optional property not found
            $ViewWindowDays = $null
        } else {
            $ViewWindowDays = $JsonParameters.PSobject.Properties["view_window_days"].value
        }

        $PSO = [PSCustomObject]@{
            "click_window_days" = ${ClickWindowDays}
            "engagement_window_days" = ${EngagementWindowDays}
            "view_window_days" = ${ViewWindowDays}
        }

        return $PSO
    }

}

