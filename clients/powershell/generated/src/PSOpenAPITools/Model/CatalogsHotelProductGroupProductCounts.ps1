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

Product counts for a Hotel CatalogsProductGroup

.PARAMETER CatalogType
No description available.
.PARAMETER Total
No description available.
.OUTPUTS

CatalogsHotelProductGroupProductCounts<PSCustomObject>
#>

function Initialize-CatalogsHotelProductGroupProductCounts {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("HOTEL")]
        [String]
        ${CatalogType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [Decimal]
        ${Total}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CatalogsHotelProductGroupProductCounts' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $CatalogType) {
            throw "invalid value for 'CatalogType', 'CatalogType' cannot be null."
        }

        if ($null -eq $Total) {
            throw "invalid value for 'Total', 'Total' cannot be null."
        }

        if ($Total -lt 0) {
          throw "invalid value for 'Total', must be greater than or equal to 0."
        }


        $PSO = [PSCustomObject]@{
            "catalog_type" = ${CatalogType}
            "total" = ${Total}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CatalogsHotelProductGroupProductCounts<PSCustomObject>

.DESCRIPTION

Convert from JSON to CatalogsHotelProductGroupProductCounts<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CatalogsHotelProductGroupProductCounts<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsHotelProductGroupProductCounts {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CatalogsHotelProductGroupProductCounts' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CatalogsHotelProductGroupProductCounts
        $AllProperties = ("catalog_type", "total")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "total"))) {
            throw "Error! JSON cannot be serialized due to the required property 'total' missing."
        } else {
            $Total = $JsonParameters.PSobject.Properties["total"].value
        }

        $PSO = [PSCustomObject]@{
            "catalog_type" = ${CatalogType}
            "total" = ${Total}
        }

        return $PSO
    }

}

