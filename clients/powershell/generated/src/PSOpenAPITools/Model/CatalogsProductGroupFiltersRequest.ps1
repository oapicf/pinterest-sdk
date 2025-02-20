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

Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.

.PARAMETER Json

JSON object

.OUTPUTS

CatalogsProductGroupFiltersRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsProductGroupFiltersRequest {
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
            # try to match CatalogsProductGroupFiltersRequestAnyOf defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCatalogsProductGroupFiltersRequestAnyOf $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CatalogsProductGroupFiltersRequestAnyOf"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CatalogsProductGroupFiltersRequestAnyOf' defined in anyOf (CatalogsProductGroupFiltersRequest). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match CatalogsProductGroupFiltersRequestAnyOf1 defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCatalogsProductGroupFiltersRequestAnyOf1 $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CatalogsProductGroupFiltersRequestAnyOf1"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CatalogsProductGroupFiltersRequestAnyOf1' defined in anyOf (CatalogsProductGroupFiltersRequest). Proceeding to the next one if any."
            }
        }

        if ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "anyOfSchemas" = @("CatalogsProductGroupFiltersRequestAnyOf", "CatalogsProductGroupFiltersRequestAnyOf1")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in anyOf schemas ([CatalogsProductGroupFiltersRequestAnyOf, CatalogsProductGroupFiltersRequestAnyOf1]). JSON Payload: $($Json)"
        }
    }
}

