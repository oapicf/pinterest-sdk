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

A request object that can have multiple operations on a single batch

.PARAMETER Json

JSON object

.OUTPUTS

CatalogsVerticalBatchRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsVerticalBatchRequest {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # try to match CatalogsCreativeAssetsBatchRequest defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToCatalogsCreativeAssetsBatchRequest $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "CatalogsCreativeAssetsBatchRequest"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'CatalogsCreativeAssetsBatchRequest' defined in oneOf (CatalogsVerticalBatchRequest). Proceeding to the next one if any."
        }

        # try to match CatalogsHotelBatchRequest defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToCatalogsHotelBatchRequest $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "CatalogsHotelBatchRequest"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'CatalogsHotelBatchRequest' defined in oneOf (CatalogsVerticalBatchRequest). Proceeding to the next one if any."
        }

        # try to match CatalogsRetailBatchRequest defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToCatalogsRetailBatchRequest $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "CatalogsRetailBatchRequest"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'CatalogsRetailBatchRequest' defined in oneOf (CatalogsVerticalBatchRequest). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([CatalogsCreativeAssetsBatchRequest, CatalogsHotelBatchRequest, CatalogsRetailBatchRequest]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("CatalogsCreativeAssetsBatchRequest", "CatalogsHotelBatchRequest", "CatalogsRetailBatchRequest")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([CatalogsCreativeAssetsBatchRequest, CatalogsHotelBatchRequest, CatalogsRetailBatchRequest]). JSON Payload: $($Json)"
        }
    }
}

