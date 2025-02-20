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

Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.

.PARAMETER Create
No description available.
.PARAMETER Update
No description available.
.OUTPUTS

BulkUpsertRequest<PSCustomObject>
#>

function Initialize-BulkUpsertRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Create},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Update}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => BulkUpsertRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "create" = ${Create}
            "update" = ${Update}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BulkUpsertRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to BulkUpsertRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BulkUpsertRequest<PSCustomObject>
#>
function ConvertFrom-JsonToBulkUpsertRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => BulkUpsertRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BulkUpsertRequest
        $AllProperties = ("create", "update")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "create"))) { #optional property not found
            $Create = $null
        } else {
            $Create = $JsonParameters.PSobject.Properties["create"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "update"))) { #optional property not found
            $Update = $null
        } else {
            $Update = $JsonParameters.PSobject.Properties["update"].value
        }

        $PSO = [PSCustomObject]@{
            "create" = ${Create}
            "update" = ${Update}
        }

        return $PSO
    }

}

