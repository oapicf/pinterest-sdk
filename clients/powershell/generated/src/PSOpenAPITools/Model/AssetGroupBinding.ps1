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

.PARAMETER Id
Asset Group ID.
.PARAMETER AssetGroupName
Asset Group name
.PARAMETER AssetGroupDescription
Asset group description
.PARAMETER AssetGroupTypes
Asset group types
.PARAMETER AdAccountsIds
A list of ad account IDs under the asset group
.PARAMETER ProfilesIds
A list of profile IDs under asset group
.PARAMETER CreatedTime
The creation time of the asset group
.PARAMETER UpdatedTime
The last update time of the asset group
.PARAMETER Owner
The data of the business that owns the asset group.
.PARAMETER CreatedBy
The data of the user that created the asset group.
.OUTPUTS

AssetGroupBinding<PSCustomObject>
#>

function Initialize-AssetGroupBinding {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AssetGroupName},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AssetGroupDescription},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${AssetGroupTypes},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${AdAccountsIds},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${ProfilesIds},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${CreatedTime},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${UpdatedTime},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Owner},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${CreatedBy}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => AssetGroupBinding' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "asset_group_name" = ${AssetGroupName}
            "asset_group_description" = ${AssetGroupDescription}
            "asset_group_types" = ${AssetGroupTypes}
            "ad_accounts_ids" = ${AdAccountsIds}
            "profiles_ids" = ${ProfilesIds}
            "created_time" = ${CreatedTime}
            "updated_time" = ${UpdatedTime}
            "owner" = ${Owner}
            "created_by" = ${CreatedBy}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to AssetGroupBinding<PSCustomObject>

.DESCRIPTION

Convert from JSON to AssetGroupBinding<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

AssetGroupBinding<PSCustomObject>
#>
function ConvertFrom-JsonToAssetGroupBinding {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => AssetGroupBinding' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in AssetGroupBinding
        $AllProperties = ("id", "asset_group_name", "asset_group_description", "asset_group_types", "ad_accounts_ids", "profiles_ids", "created_time", "updated_time", "owner", "created_by")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "asset_group_name"))) { #optional property not found
            $AssetGroupName = $null
        } else {
            $AssetGroupName = $JsonParameters.PSobject.Properties["asset_group_name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "asset_group_description"))) { #optional property not found
            $AssetGroupDescription = $null
        } else {
            $AssetGroupDescription = $JsonParameters.PSobject.Properties["asset_group_description"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "asset_group_types"))) { #optional property not found
            $AssetGroupTypes = $null
        } else {
            $AssetGroupTypes = $JsonParameters.PSobject.Properties["asset_group_types"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ad_accounts_ids"))) { #optional property not found
            $AdAccountsIds = $null
        } else {
            $AdAccountsIds = $JsonParameters.PSobject.Properties["ad_accounts_ids"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "profiles_ids"))) { #optional property not found
            $ProfilesIds = $null
        } else {
            $ProfilesIds = $JsonParameters.PSobject.Properties["profiles_ids"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_time"))) { #optional property not found
            $CreatedTime = $null
        } else {
            $CreatedTime = $JsonParameters.PSobject.Properties["created_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "updated_time"))) { #optional property not found
            $UpdatedTime = $null
        } else {
            $UpdatedTime = $JsonParameters.PSobject.Properties["updated_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "owner"))) { #optional property not found
            $Owner = $null
        } else {
            $Owner = $JsonParameters.PSobject.Properties["owner"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_by"))) { #optional property not found
            $CreatedBy = $null
        } else {
            $CreatedBy = $JsonParameters.PSobject.Properties["created_by"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "asset_group_name" = ${AssetGroupName}
            "asset_group_description" = ${AssetGroupDescription}
            "asset_group_types" = ${AssetGroupTypes}
            "ad_accounts_ids" = ${AdAccountsIds}
            "profiles_ids" = ${ProfilesIds}
            "created_time" = ${CreatedTime}
            "updated_time" = ${UpdatedTime}
            "owner" = ${Owner}
            "created_by" = ${CreatedBy}
        }

        return $PSO
    }

}

