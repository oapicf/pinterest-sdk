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

Object describing an item bid option operation

.PARAMETER Json

JSON object

.OUTPUTS

AdvancedAuctionItemsSubmitRecord<PSCustomObject>
#>
function ConvertFrom-JsonToAdvancedAuctionItemsSubmitRecord {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # try to match AdvancedAuctionItemsSubmitDeleteRecord defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToAdvancedAuctionItemsSubmitDeleteRecord $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "AdvancedAuctionItemsSubmitDeleteRecord"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'AdvancedAuctionItemsSubmitDeleteRecord' defined in oneOf (AdvancedAuctionItemsSubmitRecord). Proceeding to the next one if any."
        }

        # try to match AdvancedAuctionItemsSubmitUpsertRecord defined in the oneOf schemas
        try {
            $matchInstance = ConvertFrom-JsonToAdvancedAuctionItemsSubmitUpsertRecord $Json

            foreach($property in $matchInstance.PsObject.Properties) {
                if ($null -ne $property.Value) {
                    $matchType = "AdvancedAuctionItemsSubmitUpsertRecord"
                    $match++
                    break
                }
            }
        } catch {
            # fail to match the schema defined in oneOf, proceed to the next one
            Write-Debug "Failed to match 'AdvancedAuctionItemsSubmitUpsertRecord' defined in oneOf (AdvancedAuctionItemsSubmitRecord). Proceeding to the next one if any."
        }

        if ($match -gt 1) {
            throw "Error! The JSON payload matches more than one type defined in oneOf schemas ([AdvancedAuctionItemsSubmitDeleteRecord, AdvancedAuctionItemsSubmitUpsertRecord]). JSON Payload: $($Json)"
        } elseif ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "OneOfSchemas" = @("AdvancedAuctionItemsSubmitDeleteRecord", "AdvancedAuctionItemsSubmitUpsertRecord")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in oneOf schemas ([AdvancedAuctionItemsSubmitDeleteRecord, AdvancedAuctionItemsSubmitUpsertRecord]). JSON Payload: $($Json)"
        }
    }
}

