#
# Pinterest REST API
# Pinterest's REST API
# Version: 5.12.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Json

JSON object

.OUTPUTS

CatalogsHotelProductGroupFilterKeys<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsHotelProductGroupFilterKeys {
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
            # try to match BrandFilter defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToBrandFilter $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "BrandFilter"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'BrandFilter' defined in anyOf (CatalogsHotelProductGroupFilterKeys). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match CountryFilter defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCountryFilter $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CountryFilter"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CountryFilter' defined in anyOf (CatalogsHotelProductGroupFilterKeys). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match CustomLabel0Filter defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCustomLabel0Filter $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CustomLabel0Filter"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CustomLabel0Filter' defined in anyOf (CatalogsHotelProductGroupFilterKeys). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match CustomLabel1Filter defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCustomLabel1Filter $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CustomLabel1Filter"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CustomLabel1Filter' defined in anyOf (CatalogsHotelProductGroupFilterKeys). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match CustomLabel2Filter defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCustomLabel2Filter $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CustomLabel2Filter"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CustomLabel2Filter' defined in anyOf (CatalogsHotelProductGroupFilterKeys). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match CustomLabel3Filter defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCustomLabel3Filter $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CustomLabel3Filter"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CustomLabel3Filter' defined in anyOf (CatalogsHotelProductGroupFilterKeys). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match CustomLabel4Filter defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToCustomLabel4Filter $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "CustomLabel4Filter"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'CustomLabel4Filter' defined in anyOf (CatalogsHotelProductGroupFilterKeys). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match HotelIdFilter defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToHotelIdFilter $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "HotelIdFilter"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'HotelIdFilter' defined in anyOf (CatalogsHotelProductGroupFilterKeys). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match PriceFilter defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToPriceFilter $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "PriceFilter"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'PriceFilter' defined in anyOf (CatalogsHotelProductGroupFilterKeys). Proceeding to the next one if any."
            }
        }

        if ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "anyOfSchemas" = @("BrandFilter", "CountryFilter", "CustomLabel0Filter", "CustomLabel1Filter", "CustomLabel2Filter", "CustomLabel3Filter", "CustomLabel4Filter", "HotelIdFilter", "PriceFilter")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in anyOf schemas ([BrandFilter, CountryFilter, CustomLabel0Filter, CustomLabel1Filter, CustomLabel2Filter, CustomLabel3Filter, CustomLabel4Filter, HotelIdFilter, PriceFilter]). JSON Payload: $($Json)"
        }
    }
}
