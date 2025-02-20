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

Request object for creating a feed.

.PARAMETER Json

JSON object

.OUTPUTS

CatalogsVerticalFeedsCreateRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsVerticalFeedsCreateRequest {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # try to match CatalogsCreativeAssetsFeedsCreateRequest defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToCatalogsCreativeAssetsFeedsCreateRequest $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "CatalogsCreativeAssetsFeedsCreateRequest"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'CatalogsCreativeAssetsFeedsCreateRequest' defined in oneOf (CatalogsVerticalFeedsCreateRequest). Proceeding to the next one if any."
        }

        # try to match CatalogsHotelFeedsCreateRequest defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToCatalogsHotelFeedsCreateRequest $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "CatalogsHotelFeedsCreateRequest"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'CatalogsHotelFeedsCreateRequest' defined in oneOf (CatalogsVerticalFeedsCreateRequest). Proceeding to the next one if any."
        }

        # try to match CatalogsRetailFeedsCreateRequest defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToCatalogsRetailFeedsCreateRequest $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "CatalogsRetailFeedsCreateRequest"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'CatalogsRetailFeedsCreateRequest' defined in oneOf (CatalogsVerticalFeedsCreateRequest). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([CatalogsCreativeAssetsFeedsCreateRequest, CatalogsHotelFeedsCreateRequest, CatalogsRetailFeedsCreateRequest]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("CatalogsCreativeAssetsFeedsCreateRequest", "CatalogsHotelFeedsCreateRequest", "CatalogsRetailFeedsCreateRequest")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([CatalogsCreativeAssetsFeedsCreateRequest, CatalogsHotelFeedsCreateRequest, CatalogsRetailFeedsCreateRequest]). JSON Payload: $($Json)"
        }
    }
}

