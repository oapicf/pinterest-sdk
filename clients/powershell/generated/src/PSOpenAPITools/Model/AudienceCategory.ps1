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

No description available.

.PARAMETER Key
Interest unique key (same as ID).
.PARAMETER Name
Interest name.
.PARAMETER Ratio
Interest's percent of category's total audience.
.PARAMETER Index
Interest affinity index.
.PARAMETER Id
Interest ID.
.PARAMETER Subcategories
Subcategory interest distribution
.OUTPUTS

AudienceCategory<PSCustomObject>
#>

function Initialize-AudienceCategory {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Key},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Ratio},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${Index},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Subcategories}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => AudienceCategory' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "key" = ${Key}
            "name" = ${Name}
            "ratio" = ${Ratio}
            "index" = ${Index}
            "id" = ${Id}
            "subcategories" = ${Subcategories}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to AudienceCategory<PSCustomObject>

.DESCRIPTION

Convert from JSON to AudienceCategory<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

AudienceCategory<PSCustomObject>
#>
function ConvertFrom-JsonToAudienceCategory {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => AudienceCategory' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in AudienceCategory
        $AllProperties = ("key", "name", "ratio", "index", "id", "subcategories")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "key"))) { #optional property not found
            $Key = $null
        } else {
            $Key = $JsonParameters.PSobject.Properties["key"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ratio"))) { #optional property not found
            $Ratio = $null
        } else {
            $Ratio = $JsonParameters.PSobject.Properties["ratio"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "index"))) { #optional property not found
            $Index = $null
        } else {
            $Index = $JsonParameters.PSobject.Properties["index"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "subcategories"))) { #optional property not found
            $Subcategories = $null
        } else {
            $Subcategories = $JsonParameters.PSobject.Properties["subcategories"].value
        }

        $PSO = [PSCustomObject]@{
            "key" = ${Key}
            "name" = ${Name}
            "ratio" = ${Ratio}
            "index" = ${Index}
            "id" = ${Id}
            "subcategories" = ${Subcategories}
        }

        return $PSO
    }

}
