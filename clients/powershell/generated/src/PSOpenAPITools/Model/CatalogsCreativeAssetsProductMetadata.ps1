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

Creative assets product metadata entity

.PARAMETER CreativeAssetsId
The user-created unique ID that represents the creative assets item.
.PARAMETER Visibility
No description available.
.OUTPUTS

CatalogsCreativeAssetsProductMetadata<PSCustomObject>
#>

function Initialize-CatalogsCreativeAssetsProductMetadata {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CreativeAssetsId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("VISIBLE", "HIDDEN")]
        [PSCustomObject]
        ${Visibility}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CatalogsCreativeAssetsProductMetadata' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $CreativeAssetsId) {
            throw "invalid value for 'CreativeAssetsId', 'CreativeAssetsId' cannot be null."
        }

        if ($null -eq $Visibility) {
            throw "invalid value for 'Visibility', 'Visibility' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "creative_assets_id" = ${CreativeAssetsId}
            "visibility" = ${Visibility}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CatalogsCreativeAssetsProductMetadata<PSCustomObject>

.DESCRIPTION

Convert from JSON to CatalogsCreativeAssetsProductMetadata<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CatalogsCreativeAssetsProductMetadata<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsCreativeAssetsProductMetadata {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CatalogsCreativeAssetsProductMetadata' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CatalogsCreativeAssetsProductMetadata
        $AllProperties = ("creative_assets_id", "visibility")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'creative_assets_id' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "creative_assets_id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'creative_assets_id' missing."
        } else {
            $CreativeAssetsId = $JsonParameters.PSobject.Properties["creative_assets_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "visibility"))) {
            throw "Error! JSON cannot be serialized due to the required property 'visibility' missing."
        } else {
            $Visibility = $JsonParameters.PSobject.Properties["visibility"].value
        }

        $PSO = [PSCustomObject]@{
            "creative_assets_id" = ${CreativeAssetsId}
            "visibility" = ${Visibility}
        }

        return $PSO
    }

}

