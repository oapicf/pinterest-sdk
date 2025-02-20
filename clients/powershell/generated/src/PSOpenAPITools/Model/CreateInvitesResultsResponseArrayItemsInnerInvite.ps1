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

An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.

.PARAMETER Id
Unique identifier of the invite/request.
.PARAMETER User
Metadata for the member/partner that was sent the invite/request.
.OUTPUTS

CreateInvitesResultsResponseArrayItemsInnerInvite<PSCustomObject>
#>

function Initialize-CreateInvitesResultsResponseArrayItemsInnerInvite {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${User}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CreateInvitesResultsResponseArrayItemsInnerInvite' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "user" = ${User}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CreateInvitesResultsResponseArrayItemsInnerInvite<PSCustomObject>

.DESCRIPTION

Convert from JSON to CreateInvitesResultsResponseArrayItemsInnerInvite<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CreateInvitesResultsResponseArrayItemsInnerInvite<PSCustomObject>
#>
function ConvertFrom-JsonToCreateInvitesResultsResponseArrayItemsInnerInvite {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CreateInvitesResultsResponseArrayItemsInnerInvite' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CreateInvitesResultsResponseArrayItemsInnerInvite
        $AllProperties = ("id", "user")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "user"))) { #optional property not found
            $User = $null
        } else {
            $User = $JsonParameters.PSobject.Properties["user"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "user" = ${User}
        }

        return $PSO
    }

}

