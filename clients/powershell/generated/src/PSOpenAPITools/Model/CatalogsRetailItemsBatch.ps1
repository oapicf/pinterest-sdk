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

Object describing the catalogs retail items batch

.PARAMETER BatchId
Id of the catalogs items batch
.PARAMETER CreatedTime
Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
.PARAMETER CompletedTime
Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
.PARAMETER Status
No description available.
.PARAMETER CatalogType
No description available.
.PARAMETER Items
Array with the catalogs items processing records part of the catalogs items batch
.OUTPUTS

CatalogsRetailItemsBatch<PSCustomObject>
#>

function Initialize-CatalogsRetailItemsBatch {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${BatchId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${CreatedTime},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${CompletedTime},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("PROCESSING", "COMPLETED")]
        [PSCustomObject]
        ${Status},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("RETAIL", "HOTEL")]
        [PSCustomObject]
        ${CatalogType},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Items}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CatalogsRetailItemsBatch' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $CatalogType) {
            throw "invalid value for 'CatalogType', 'CatalogType' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "batch_id" = ${BatchId}
            "created_time" = ${CreatedTime}
            "completed_time" = ${CompletedTime}
            "status" = ${Status}
            "catalog_type" = ${CatalogType}
            "items" = ${Items}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CatalogsRetailItemsBatch<PSCustomObject>

.DESCRIPTION

Convert from JSON to CatalogsRetailItemsBatch<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CatalogsRetailItemsBatch<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsRetailItemsBatch {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CatalogsRetailItemsBatch' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CatalogsRetailItemsBatch
        $AllProperties = ("batch_id", "created_time", "completed_time", "status", "catalog_type", "items")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "batch_id"))) { #optional property not found
            $BatchId = $null
        } else {
            $BatchId = $JsonParameters.PSobject.Properties["batch_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_time"))) { #optional property not found
            $CreatedTime = $null
        } else {
            $CreatedTime = $JsonParameters.PSobject.Properties["created_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "completed_time"))) { #optional property not found
            $CompletedTime = $null
        } else {
            $CompletedTime = $JsonParameters.PSobject.Properties["completed_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status"))) { #optional property not found
            $Status = $null
        } else {
            $Status = $JsonParameters.PSobject.Properties["status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "items"))) { #optional property not found
            $Items = $null
        } else {
            $Items = $JsonParameters.PSobject.Properties["items"].value
        }

        $PSO = [PSCustomObject]@{
            "batch_id" = ${BatchId}
            "created_time" = ${CreatedTime}
            "completed_time" = ${CompletedTime}
            "status" = ${Status}
            "catalog_type" = ${CatalogType}
            "items" = ${Items}
        }

        return $PSO
    }

}
