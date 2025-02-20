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

Response object containing item bid options

.PARAMETER CatalogId
Response object of item bid options
.PARAMETER Items
Array with item bid options
.OUTPUTS

AdvancedAuctionItems<PSCustomObject>
#>

function Initialize-AdvancedAuctionItems {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${CatalogId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Items}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => AdvancedAuctionItems' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "catalog_id" = ${CatalogId}
            "items" = ${Items}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to AdvancedAuctionItems<PSCustomObject>

.DESCRIPTION

Convert from JSON to AdvancedAuctionItems<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

AdvancedAuctionItems<PSCustomObject>
#>
function ConvertFrom-JsonToAdvancedAuctionItems {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => AdvancedAuctionItems' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in AdvancedAuctionItems
        $AllProperties = ("catalog_id", "items")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "catalog_id"))) { #optional property not found
            $CatalogId = $null
        } else {
            $CatalogId = $JsonParameters.PSobject.Properties["catalog_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "items"))) { #optional property not found
            $Items = $null
        } else {
            $Items = $JsonParameters.PSobject.Properties["items"].value
        }

        $PSO = [PSCustomObject]@{
            "catalog_id" = ${CatalogId}
            "items" = ${Items}
        }

        return $PSO
    }

}

