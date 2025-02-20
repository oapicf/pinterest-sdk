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

Pin media objects.

.PARAMETER MediaType
No description available.
.OUTPUTS

PinMedia<PSCustomObject>
#>

function Initialize-PinMedia {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${MediaType}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => PinMedia' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "media_type" = ${MediaType}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to PinMedia<PSCustomObject>

.DESCRIPTION

Convert from JSON to PinMedia<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

PinMedia<PSCustomObject>
#>
function ConvertFrom-JsonToPinMedia {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => PinMedia' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PinMedia
        $AllProperties = ("media_type")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "media_type"))) { #optional property not found
            $MediaType = $null
        } else {
            $MediaType = $JsonParameters.PSobject.Properties["media_type"].value
        }

        $PSO = [PSCustomObject]@{
            "media_type" = ${MediaType}
        }

        return $PSO
    }

}

