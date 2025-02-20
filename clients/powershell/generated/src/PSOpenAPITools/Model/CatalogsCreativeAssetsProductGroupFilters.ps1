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

Object holding a group of filters for a creative assets product group

.PARAMETER Json

JSON object

.OUTPUTS

CatalogsCreativeAssetsProductGroupFilters<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsCreativeAssetsProductGroupFilters {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        if ($match -ne 0) { # no match yet
            # try to match CatalogsCreativeAssetsProductGroupFiltersAllOf defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCatalogsCreativeAssetsProductGroupFiltersAllOf $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CatalogsCreativeAssetsProductGroupFiltersAllOf"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CatalogsCreativeAssetsProductGroupFiltersAllOf' defined in anyOf (CatalogsCreativeAssetsProductGroupFilters). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match CatalogsCreativeAssetsProductGroupFiltersAnyOf defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCatalogsCreativeAssetsProductGroupFiltersAnyOf $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CatalogsCreativeAssetsProductGroupFiltersAnyOf"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CatalogsCreativeAssetsProductGroupFiltersAnyOf' defined in anyOf (CatalogsCreativeAssetsProductGroupFilters). Proceeding to the next one if any."
            }
        }

        if ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "anyOfSchemas" = @("CatalogsCreativeAssetsProductGroupFiltersAllOf", "CatalogsCreativeAssetsProductGroupFiltersAnyOf")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in anyOf schemas ([CatalogsCreativeAssetsProductGroupFiltersAllOf, CatalogsCreativeAssetsProductGroupFiltersAnyOf]). JSON Payload: $($Json)"
        }
    }
}

