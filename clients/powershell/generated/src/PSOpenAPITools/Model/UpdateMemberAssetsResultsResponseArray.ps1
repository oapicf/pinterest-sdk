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

.PARAMETER Items
List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
.OUTPUTS

UpdateMemberAssetsResultsResponseArray<PSCustomObject>
#>

function Initialize-UpdateMemberAssetsResultsResponseArray {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Items}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => UpdateMemberAssetsResultsResponseArray' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "items" = ${Items}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UpdateMemberAssetsResultsResponseArray<PSCustomObject>

.DESCRIPTION

Convert from JSON to UpdateMemberAssetsResultsResponseArray<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UpdateMemberAssetsResultsResponseArray<PSCustomObject>
#>
function ConvertFrom-JsonToUpdateMemberAssetsResultsResponseArray {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => UpdateMemberAssetsResultsResponseArray' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UpdateMemberAssetsResultsResponseArray
        $AllProperties = ("items")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "items"))) { #optional property not found
            $Items = $null
        } else {
            $Items = $JsonParameters.PSobject.Properties["items"].value
        }

        $PSO = [PSCustomObject]@{
            "items" = ${Items}
        }

        return $PSO
    }

}

