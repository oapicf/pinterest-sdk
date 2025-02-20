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

Request body used to cancel invites

.PARAMETER InviteIds
List of invite/request ids to be cancelled
.OUTPUTS

CancelInvitesBody<PSCustomObject>
#>

function Initialize-CancelInvitesBody {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${InviteIds}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CancelInvitesBody' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $InviteIds) {
            throw "invalid value for 'InviteIds', 'InviteIds' cannot be null."
        }

        if ($InviteIds.length -gt 50) {
            throw "invalid value for 'InviteIds', number of items must be less than or equal to 50."
        }

        if ($InviteIds.length -lt 1) {
            throw "invalid value for 'InviteIds', number of items must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "invite_ids" = ${InviteIds}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CancelInvitesBody<PSCustomObject>

.DESCRIPTION

Convert from JSON to CancelInvitesBody<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CancelInvitesBody<PSCustomObject>
#>
function ConvertFrom-JsonToCancelInvitesBody {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CancelInvitesBody' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CancelInvitesBody
        $AllProperties = ("invite_ids")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'invite_ids' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "invite_ids"))) {
            throw "Error! JSON cannot be serialized due to the required property 'invite_ids' missing."
        } else {
            $InviteIds = $JsonParameters.PSobject.Properties["invite_ids"].value
        }

        $PSO = [PSCustomObject]@{
            "invite_ids" = ${InviteIds}
        }

        return $PSO
    }

}

