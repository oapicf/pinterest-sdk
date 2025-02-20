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

Object describing an item processing record

.PARAMETER ItemId
The catalog item id in the merchant namespace
.PARAMETER Errors
Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
.PARAMETER Warnings
Array with the validation warnings for the item processing record
.PARAMETER Status
No description available.
.OUTPUTS

ItemProcessingRecord<PSCustomObject>
#>

function Initialize-ItemProcessingRecord {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ItemId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Errors},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Warnings},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("SUCCESS", "FAILURE", "PROCESSING")]
        [PSCustomObject]
        ${Status}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ItemProcessingRecord' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "item_id" = ${ItemId}
            "errors" = ${Errors}
            "warnings" = ${Warnings}
            "status" = ${Status}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ItemProcessingRecord<PSCustomObject>

.DESCRIPTION

Convert from JSON to ItemProcessingRecord<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ItemProcessingRecord<PSCustomObject>
#>
function ConvertFrom-JsonToItemProcessingRecord {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ItemProcessingRecord' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ItemProcessingRecord
        $AllProperties = ("item_id", "errors", "warnings", "status")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "errors"))) { #optional property not found
            $Errors = $null
        } else {
            $Errors = $JsonParameters.PSobject.Properties["errors"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "warnings"))) { #optional property not found
            $Warnings = $null
        } else {
            $Warnings = $JsonParameters.PSobject.Properties["warnings"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status"))) { #optional property not found
            $Status = $null
        } else {
            $Status = $JsonParameters.PSobject.Properties["status"].value
        }

        $PSO = [PSCustomObject]@{
            "item_id" = ${ItemId}
            "errors" = ${Errors}
            "warnings" = ${Warnings}
            "status" = ${Status}
        }

        return $PSO
    }

}

