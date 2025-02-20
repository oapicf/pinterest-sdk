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

Object holding a group of filters for a catalog product group

.PARAMETER Json

JSON object

.OUTPUTS

CatalogsProductGroupFilters<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsProductGroupFilters {
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
            # try to match CatalogsProductGroupFiltersAllOf defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCatalogsProductGroupFiltersAllOf $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CatalogsProductGroupFiltersAllOf"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CatalogsProductGroupFiltersAllOf' defined in anyOf (CatalogsProductGroupFilters). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match CatalogsProductGroupFiltersAnyOf defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCatalogsProductGroupFiltersAnyOf $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CatalogsProductGroupFiltersAnyOf"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CatalogsProductGroupFiltersAnyOf' defined in anyOf (CatalogsProductGroupFilters). Proceeding to the next one if any."
            }
        }

        if ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "anyOfSchemas" = @("CatalogsProductGroupFiltersAllOf", "CatalogsProductGroupFiltersAnyOf")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in anyOf schemas ([CatalogsProductGroupFiltersAllOf, CatalogsProductGroupFiltersAnyOf]). JSON Payload: $($Json)"
        }
    }
}

