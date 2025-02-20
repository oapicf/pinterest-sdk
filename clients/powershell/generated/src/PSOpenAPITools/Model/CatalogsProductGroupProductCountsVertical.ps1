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

Product counts for a CatalogsProductGroup

.PARAMETER Json

JSON object

.OUTPUTS

CatalogsProductGroupProductCountsVertical<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsProductGroupProductCountsVertical {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # try to match CatalogsCreativeAssetsProductGroupProductCounts defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToCatalogsCreativeAssetsProductGroupProductCounts $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "CatalogsCreativeAssetsProductGroupProductCounts"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'CatalogsCreativeAssetsProductGroupProductCounts' defined in oneOf (CatalogsProductGroupProductCountsVertical). Proceeding to the next one if any."
        }

        # try to match CatalogsHotelProductGroupProductCounts defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToCatalogsHotelProductGroupProductCounts $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "CatalogsHotelProductGroupProductCounts"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'CatalogsHotelProductGroupProductCounts' defined in oneOf (CatalogsProductGroupProductCountsVertical). Proceeding to the next one if any."
        }

        # try to match CatalogsRetailProductGroupProductCounts defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToCatalogsRetailProductGroupProductCounts $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "CatalogsRetailProductGroupProductCounts"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'CatalogsRetailProductGroupProductCounts' defined in oneOf (CatalogsProductGroupProductCountsVertical). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("CatalogsCreativeAssetsProductGroupProductCounts", "CatalogsHotelProductGroupProductCounts", "CatalogsRetailProductGroupProductCounts")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([CatalogsCreativeAssetsProductGroupProductCounts, CatalogsHotelProductGroupProductCounts, CatalogsRetailProductGroupProductCounts]). JSON Payload: $($Json)"
        }
    }
}

