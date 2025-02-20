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

.PARAMETER CREATIVEASSETSID
No description available.
.OUTPUTS

CreativeAssetsIdFilter<PSCustomObject>
#>

function Initialize-CreativeAssetsIdFilter {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${CREATIVEASSETSID}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreativeAssetsIdFilter' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $CREATIVEASSETSID) {
            throw "invalid value for 'CREATIVEASSETSID', 'CREATIVEASSETSID' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "CREATIVE_ASSETS_ID" = ${CREATIVEASSETSID}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreativeAssetsIdFilter<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreativeAssetsIdFilter<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreativeAssetsIdFilter<PSCustomObject>
#>
function ConvertFrom-JsonToCreativeAssetsIdFilter {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreativeAssetsIdFilter' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreativeAssetsIdFilter
        $AllProperties = ("CREATIVE_ASSETS_ID")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'CREATIVE_ASSETS_ID' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "CREATIVE_ASSETS_ID"))) {
            throw "Error! JSON cannot be serialized due to the required property 'CREATIVE_ASSETS_ID' missing."
        } else {
            $CREATIVEASSETSID = $JsonParameters.PSobject.Properties["CREATIVE_ASSETS_ID"].value
        }

        $PSO = [PSCustomObject]@{
            "CREATIVE_ASSETS_ID" = ${CREATIVEASSETSID}
        }

        return $PSO
    }

}

