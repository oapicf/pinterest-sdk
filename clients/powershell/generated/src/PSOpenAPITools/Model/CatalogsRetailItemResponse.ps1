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

Object describing a retail item record

.PARAMETER CatalogType
No description available.
.PARAMETER ItemId
The catalog retail item id in the merchant namespace
.PARAMETER Pins
The pins mapped to the item
.PARAMETER Attributes
No description available.
.OUTPUTS

CatalogsRetailItemResponse<PSCustomObject>
#>

function Initialize-CatalogsRetailItemResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("RETAIL", "HOTEL", "CREATIVE_ASSETS")]
        [PSCustomObject]
        ${CatalogType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ItemId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Pins},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Attributes}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CatalogsRetailItemResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $CatalogType) {
            throw "invalid value for 'CatalogType', 'CatalogType' cannot be null."
        }

        if (!$Pins -and $Pins.length -gt 11) {
            throw "invalid value for 'Pins', number of items must be less than or equal to 11."
        }


        $PSO = [PSCustomObject]@{
            "catalog_type" = ${CatalogType}
            "item_id" = ${ItemId}
            "pins" = ${Pins}
            "attributes" = ${Attributes}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CatalogsRetailItemResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to CatalogsRetailItemResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CatalogsRetailItemResponse<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsRetailItemResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CatalogsRetailItemResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CatalogsRetailItemResponse
        $AllProperties = ("catalog_type", "item_id", "pins", "attributes")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'catalog_type' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "catalog_type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'catalog_type' missing."
        } else {
            $CatalogType = $JsonParameters.PSobject.Properties["catalog_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "item_id"))) { #optional property not found
            $ItemId = $null
        } else {
            $ItemId = $JsonParameters.PSobject.Properties["item_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pins"))) { #optional property not found
            $Pins = $null
        } else {
            $Pins = $JsonParameters.PSobject.Properties["pins"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "attributes"))) { #optional property not found
            $Attributes = $null
        } else {
            $Attributes = $JsonParameters.PSobject.Properties["attributes"].value
        }

        $PSO = [PSCustomObject]@{
            "catalog_type" = ${CatalogType}
            "item_id" = ${ItemId}
            "pins" = ${Pins}
            "attributes" = ${Attributes}
        }

        return $PSO
    }

}

