#
# Pinterest REST API
# Pinterest's REST API
# Version: 5.12.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

The relative date range of the template

.PARAMETER Type
The date range type
.PARAMETER StartDaysInPast
The start date of the date range
.PARAMETER EndDaysInPast
The end date of the date range
.OUTPUTS

TemplateResponseDateRangeRelativeDateRange<PSCustomObject>
#>

function Initialize-TemplateResponseDateRangeRelativeDateRange {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Type},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${StartDaysInPast},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${EndDaysInPast}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => TemplateResponseDateRangeRelativeDateRange' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "start_days_in_past" = ${StartDaysInPast}
            "end_days_in_past" = ${EndDaysInPast}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to TemplateResponseDateRangeRelativeDateRange<PSCustomObject>

.DESCRIPTION

Convert from JSON to TemplateResponseDateRangeRelativeDateRange<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

TemplateResponseDateRangeRelativeDateRange<PSCustomObject>
#>
function ConvertFrom-JsonToTemplateResponseDateRangeRelativeDateRange {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => TemplateResponseDateRangeRelativeDateRange' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in TemplateResponseDateRangeRelativeDateRange
        $AllProperties = ("type", "start_days_in_past", "end_days_in_past")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) { #optional property not found
            $Type = $null
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "start_days_in_past"))) { #optional property not found
            $StartDaysInPast = $null
        } else {
            $StartDaysInPast = $JsonParameters.PSobject.Properties["start_days_in_past"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "end_days_in_past"))) { #optional property not found
            $EndDaysInPast = $null
        } else {
            $EndDaysInPast = $JsonParameters.PSobject.Properties["end_days_in_past"].value
        }

        $PSO = [PSCustomObject]@{
            "type" = ${Type}
            "start_days_in_past" = ${StartDaysInPast}
            "end_days_in_past" = ${EndDaysInPast}
        }

        return $PSO
    }

}
