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

Object describing a creative assets item error

.PARAMETER CatalogType
No description available.
.PARAMETER CreativeAssetsId
The catalog creative assets id in the merchant namespace
.PARAMETER Errors
Array with the errors for the item id requested
.OUTPUTS

CatalogsCreativeAssetsItemErrorResponse<PSCustomObject>
#>

function Initialize-CatalogsCreativeAssetsItemErrorResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("RETAIL", "HOTEL", "CREATIVE_ASSETS")]
        [PSCustomObject]
        ${CatalogType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CreativeAssetsId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Errors}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CatalogsCreativeAssetsItemErrorResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $CatalogType) {
            throw "invalid value for 'CatalogType', 'CatalogType' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "catalog_type" = ${CatalogType}
            "creative_assets_id" = ${CreativeAssetsId}
            "errors" = ${Errors}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CatalogsCreativeAssetsItemErrorResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to CatalogsCreativeAssetsItemErrorResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CatalogsCreativeAssetsItemErrorResponse<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsCreativeAssetsItemErrorResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CatalogsCreativeAssetsItemErrorResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CatalogsCreativeAssetsItemErrorResponse
        $AllProperties = ("catalog_type", "creative_assets_id", "errors")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'catalog_type' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "catalog_type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'catalog_type' missing."
        } else {
            $CatalogType = $JsonParameters.PSobject.Properties["catalog_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "creative_assets_id"))) { #optional property not found
            $CreativeAssetsId = $null
        } else {
            $CreativeAssetsId = $JsonParameters.PSobject.Properties["creative_assets_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "errors"))) { #optional property not found
            $Errors = $null
        } else {
            $Errors = $JsonParameters.PSobject.Properties["errors"].value
        }

        $PSO = [PSCustomObject]@{
            "catalog_type" = ${CatalogType}
            "creative_assets_id" = ${CreativeAssetsId}
            "errors" = ${Errors}
        }

        return $PSO
    }

}

