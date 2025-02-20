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

.PARAMETER AssetsSummary
No description available.
.PARAMETER BusinessRoles
The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
.PARAMETER CreatedByBusiness
Metadata for the business that created the business relationship.
.PARAMETER CreatedByUser
Metadata for the user that created the business relationship.
.PARAMETER CreatedTime
The time the business relationship was created. Returned in milliseconds.
.PARAMETER Id
Unique identifier of the business member/business partner/employer.
.PARAMETER IsSharedPartner
This field is only relevant when business_role=""PARTNER"". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
.PARAMETER User
Metadata for the business member/business partner/employer.
.OUTPUTS

UserBusinessRoleBinding<PSCustomObject>
#>

function Initialize-UserBusinessRoleBinding {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${AssetsSummary},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${BusinessRoles},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${CreatedByBusiness},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${CreatedByUser},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${CreatedTime},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${Id},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${IsSharedPartner},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${User}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => UserBusinessRoleBinding' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "assets_summary" = ${AssetsSummary}
            "business_roles" = ${BusinessRoles}
            "created_by_business" = ${CreatedByBusiness}
            "created_by_user" = ${CreatedByUser}
            "created_time" = ${CreatedTime}
            "id" = ${Id}
            "is_shared_partner" = ${IsSharedPartner}
            "user" = ${User}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to UserBusinessRoleBinding<PSCustomObject>

.DESCRIPTION

Convert from JSON to UserBusinessRoleBinding<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

UserBusinessRoleBinding<PSCustomObject>
#>
function ConvertFrom-JsonToUserBusinessRoleBinding {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => UserBusinessRoleBinding' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in UserBusinessRoleBinding
        $AllProperties = ("assets_summary", "business_roles", "created_by_business", "created_by_user", "created_time", "id", "is_shared_partner", "user")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "assets_summary"))) { #optional property not found
            $AssetsSummary = $null
        } else {
            $AssetsSummary = $JsonParameters.PSobject.Properties["assets_summary"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "business_roles"))) { #optional property not found
            $BusinessRoles = $null
        } else {
            $BusinessRoles = $JsonParameters.PSobject.Properties["business_roles"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_by_business"))) { #optional property not found
            $CreatedByBusiness = $null
        } else {
            $CreatedByBusiness = $JsonParameters.PSobject.Properties["created_by_business"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_by_user"))) { #optional property not found
            $CreatedByUser = $null
        } else {
            $CreatedByUser = $JsonParameters.PSobject.Properties["created_by_user"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_time"))) { #optional property not found
            $CreatedTime = $null
        } else {
            $CreatedTime = $JsonParameters.PSobject.Properties["created_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_shared_partner"))) { #optional property not found
            $IsSharedPartner = $null
        } else {
            $IsSharedPartner = $JsonParameters.PSobject.Properties["is_shared_partner"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "user"))) { #optional property not found
            $User = $null
        } else {
            $User = $JsonParameters.PSobject.Properties["user"].value
        }

        $PSO = [PSCustomObject]@{
            "assets_summary" = ${AssetsSummary}
            "business_roles" = ${BusinessRoles}
            "created_by_business" = ${CreatedByBusiness}
            "created_by_user" = ${CreatedByUser}
            "created_time" = ${CreatedTime}
            "id" = ${Id}
            "is_shared_partner" = ${IsSharedPartner}
            "user" = ${User}
        }

        return $PSO
    }

}

