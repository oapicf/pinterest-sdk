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

.PARAMETER AcceptInvite
Whether the invite/request is accepted.
.PARAMETER AssetIdToPermissions
An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
.OUTPUTS

AuthRespondInvitesBodyInvitesInnerAction<PSCustomObject>
#>

function Initialize-AuthRespondInvitesBodyInvitesInnerAction {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Boolean]
        ${AcceptInvite},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Collections.Hashtable]
        ${AssetIdToPermissions}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => AuthRespondInvitesBodyInvitesInnerAction' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $AcceptInvite) {
            throw "invalid value for 'AcceptInvite', 'AcceptInvite' cannot be null."
        }

        if (!$AssetIdToPermissions -and $AssetIdToPermissions.length -lt 1) {
            throw "invalid value for 'AssetIdToPermissions', number of items must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "accept_invite" = ${AcceptInvite}
            "asset_id_to_permissions" = ${AssetIdToPermissions}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to AuthRespondInvitesBodyInvitesInnerAction<PSCustomObject>

.DESCRIPTION

Convert from JSON to AuthRespondInvitesBodyInvitesInnerAction<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

AuthRespondInvitesBodyInvitesInnerAction<PSCustomObject>
#>
function ConvertFrom-JsonToAuthRespondInvitesBodyInvitesInnerAction {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => AuthRespondInvitesBodyInvitesInnerAction' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in AuthRespondInvitesBodyInvitesInnerAction
        $AllProperties = ("accept_invite", "asset_id_to_permissions")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'accept_invite' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "accept_invite"))) {
            throw "Error! JSON cannot be serialized due to the required property 'accept_invite' missing."
        } else {
            $AcceptInvite = $JsonParameters.PSobject.Properties["accept_invite"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "asset_id_to_permissions"))) { #optional property not found
            $AssetIdToPermissions = $null
        } else {
            $AssetIdToPermissions = $JsonParameters.PSobject.Properties["asset_id_to_permissions"].value
        }

        $PSO = [PSCustomObject]@{
            "accept_invite" = ${AcceptInvite}
            "asset_id_to_permissions" = ${AssetIdToPermissions}
        }

        return $PSO
    }

}

