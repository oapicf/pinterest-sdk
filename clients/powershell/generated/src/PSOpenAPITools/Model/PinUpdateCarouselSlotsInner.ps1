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

.PARAMETER Title
Carousel Pin slot title.
.PARAMETER Description
Carousel Pin slot description.
.PARAMETER Link
Carousel Pin slot link.
.OUTPUTS

PinUpdateCarouselSlotsInner<PSCustomObject>
#>

function Initialize-PinUpdateCarouselSlotsInner {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Title},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Description},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Link}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => PinUpdateCarouselSlotsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "title" = ${Title}
            "description" = ${Description}
            "link" = ${Link}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to PinUpdateCarouselSlotsInner<PSCustomObject>

.DESCRIPTION

Convert from JSON to PinUpdateCarouselSlotsInner<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

PinUpdateCarouselSlotsInner<PSCustomObject>
#>
function ConvertFrom-JsonToPinUpdateCarouselSlotsInner {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => PinUpdateCarouselSlotsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PinUpdateCarouselSlotsInner
        $AllProperties = ("title", "description", "link")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "title"))) { #optional property not found
            $Title = $null
        } else {
            $Title = $JsonParameters.PSobject.Properties["title"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "description"))) { #optional property not found
            $Description = $null
        } else {
            $Description = $JsonParameters.PSobject.Properties["description"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "link"))) { #optional property not found
            $Link = $null
        } else {
            $Link = $JsonParameters.PSobject.Properties["link"].value
        }

        $PSO = [PSCustomObject]@{
            "title" = ${Title}
            "description" = ${Description}
            "link" = ${Link}
        }

        return $PSO
    }

}
