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

Object describing an item batch record to delete items

.PARAMETER ItemId
The catalog item id in the merchant namespace
.OUTPUTS

ItemDeleteBatchRecord<PSCustomObject>
#>

function Initialize-ItemDeleteBatchRecord {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ItemId}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ItemDeleteBatchRecord' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "item_id" = ${ItemId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ItemDeleteBatchRecord<PSCustomObject>

.DESCRIPTION

Convert from JSON to ItemDeleteBatchRecord<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ItemDeleteBatchRecord<PSCustomObject>
#>
function ConvertFrom-JsonToItemDeleteBatchRecord {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ItemDeleteBatchRecord' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ItemDeleteBatchRecord
        $AllProperties = ("item_id")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "item_id"))) { #optional property not found
            $ItemId = $null
        } else {
            $ItemId = $JsonParameters.PSobject.Properties["item_id"].value
        }

        $PSO = [PSCustomObject]@{
            "item_id" = ${ItemId}
        }

        return $PSO
    }

}
