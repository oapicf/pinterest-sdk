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

.PARAMETER AdAccountId
Ad account ID.
.PARAMETER Name
Audience name.
.PARAMETER Rule
No description available.
.PARAMETER Description
Audience description.
.PARAMETER AudienceType
No description available.
.OUTPUTS

AudienceCreateRequest<PSCustomObject>
#>

function Initialize-AudienceCreateRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${AdAccountId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Rule},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Description},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${AudienceType}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => AudienceCreateRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Name) {
            throw "invalid value for 'Name', 'Name' cannot be null."
        }

        if ($null -eq $Rule) {
            throw "invalid value for 'Rule', 'Rule' cannot be null."
        }

        if ($null -eq $AudienceType) {
            throw "invalid value for 'AudienceType', 'AudienceType' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "ad_account_id" = ${AdAccountId}
            "name" = ${Name}
            "rule" = ${Rule}
            "description" = ${Description}
            "audience_type" = ${AudienceType}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to AudienceCreateRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to AudienceCreateRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

AudienceCreateRequest<PSCustomObject>
#>
function ConvertFrom-JsonToAudienceCreateRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => AudienceCreateRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in AudienceCreateRequest
        $AllProperties = ("ad_account_id", "name", "rule", "description", "audience_type")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'name' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) {
            throw "Error! JSON cannot be serialized due to the required property 'name' missing."
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "rule"))) {
            throw "Error! JSON cannot be serialized due to the required property 'rule' missing."
        } else {
            $Rule = $JsonParameters.PSobject.Properties["rule"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "audience_type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'audience_type' missing."
        } else {
            $AudienceType = $JsonParameters.PSobject.Properties["audience_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ad_account_id"))) { #optional property not found
            $AdAccountId = $null
        } else {
            $AdAccountId = $JsonParameters.PSobject.Properties["ad_account_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "description"))) { #optional property not found
            $Description = $null
        } else {
            $Description = $JsonParameters.PSobject.Properties["description"].value
        }

        $PSO = [PSCustomObject]@{
            "ad_account_id" = ${AdAccountId}
            "name" = ${Name}
            "rule" = ${Rule}
            "description" = ${Description}
            "audience_type" = ${AudienceType}
        }

        return $PSO
    }

}

