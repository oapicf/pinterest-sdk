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

.PARAMETER Response
No description available.
.OUTPUTS

UpdateMemberAssetsResultsResponseArrayItemsInner<PSCustomObject>
#>

function Initialize-UpdateMemberAssetsResultsResponseArrayItemsInner {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Response}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => UpdateMemberAssetsResultsResponseArrayItemsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "response" = ${Response}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UpdateMemberAssetsResultsResponseArrayItemsInner<PSCustomObject>

.DESCRIPTION

Convert from JSON to UpdateMemberAssetsResultsResponseArrayItemsInner<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UpdateMemberAssetsResultsResponseArrayItemsInner<PSCustomObject>
#>
function ConvertFrom-JsonToUpdateMemberAssetsResultsResponseArrayItemsInner {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => UpdateMemberAssetsResultsResponseArrayItemsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UpdateMemberAssetsResultsResponseArrayItemsInner
        $AllProperties = ("response")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "response"))) { #optional property not found
            $Response = $null
        } else {
            $Response = $JsonParameters.PSobject.Properties["response"].value
        }

        $PSO = [PSCustomObject]@{
            "response" = ${Response}
        }

        return $PSO
    }

}

