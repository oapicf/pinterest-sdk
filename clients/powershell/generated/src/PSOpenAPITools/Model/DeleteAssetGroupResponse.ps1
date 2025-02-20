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

No description available.

.PARAMETER DeletedAssetGroups
A list of ids of successfully deleted asset groups.
.PARAMETER Exceptions
A list of errors associated with the asset groups. Will be returned if there is an error.
.OUTPUTS

DeleteAssetGroupResponse<PSCustomObject>
#>

function Initialize-DeleteAssetGroupResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${DeletedAssetGroups},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Exceptions}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => DeleteAssetGroupResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "deleted_asset_groups" = ${DeletedAssetGroups}
            "exceptions" = ${Exceptions}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to DeleteAssetGroupResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to DeleteAssetGroupResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

DeleteAssetGroupResponse<PSCustomObject>
#>
function ConvertFrom-JsonToDeleteAssetGroupResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => DeleteAssetGroupResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in DeleteAssetGroupResponse
        $AllProperties = ("deleted_asset_groups", "exceptions")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deleted_asset_groups"))) { #optional property not found
            $DeletedAssetGroups = $null
        } else {
            $DeletedAssetGroups = $JsonParameters.PSobject.Properties["deleted_asset_groups"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "exceptions"))) { #optional property not found
            $Exceptions = $null
        } else {
            $Exceptions = $JsonParameters.PSobject.Properties["exceptions"].value
        }

        $PSO = [PSCustomObject]@{
            "deleted_asset_groups" = ${DeletedAssetGroups}
            "exceptions" = ${Exceptions}
        }

        return $PSO
    }

}

