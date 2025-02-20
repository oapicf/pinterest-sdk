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

Ad accounts and profiles the member/partner will be granted access to with this invite/request.

.PARAMETER AdAccounts
List of ad account IDs and respective permission levels that will be assigned.
.PARAMETER Profiles
List of profile IDs and respective permission levels that will be assigned.
.OUTPUTS

InviteAssetsSummary<PSCustomObject>
#>

function Initialize-InviteAssetsSummary {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${AdAccounts},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Profiles}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => InviteAssetsSummary' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "ad_accounts" = ${AdAccounts}
            "profiles" = ${Profiles}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to InviteAssetsSummary<PSCustomObject>

.DESCRIPTION

Convert from JSON to InviteAssetsSummary<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

InviteAssetsSummary<PSCustomObject>
#>
function ConvertFrom-JsonToInviteAssetsSummary {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => InviteAssetsSummary' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in InviteAssetsSummary
        $AllProperties = ("ad_accounts", "profiles")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ad_accounts"))) { #optional property not found
            $AdAccounts = $null
        } else {
            $AdAccounts = $JsonParameters.PSobject.Properties["ad_accounts"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "profiles"))) { #optional property not found
            $Profiles = $null
        } else {
            $Profiles = $JsonParameters.PSobject.Properties["profiles"].value
        }

        $PSO = [PSCustomObject]@{
            "ad_accounts" = ${AdAccounts}
            "profiles" = ${Profiles}
        }

        return $PSO
    }

}

