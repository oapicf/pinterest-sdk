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

No description available.

.PARAMETER VarData
No description available.
.OUTPUTS

OrderLineSingleResponse<PSCustomObject>
#>

function Initialize-OrderLineSingleResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${VarData}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => OrderLineSingleResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "data" = ${VarData}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OrderLineSingleResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to OrderLineSingleResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OrderLineSingleResponse<PSCustomObject>
#>
function ConvertFrom-JsonToOrderLineSingleResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => OrderLineSingleResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OrderLineSingleResponse
        $AllProperties = ("data")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "data"))) { #optional property not found
            $VarData = $null
        } else {
            $VarData = $JsonParameters.PSobject.Properties["data"].value
        }

        $PSO = [PSCustomObject]@{
            "data" = ${VarData}
        }

        return $PSO
    }

}
