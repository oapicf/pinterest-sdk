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

Pin

.PARAMETER Id
No description available.
.PARAMETER CreatedAt
No description available.
.PARAMETER Link
No description available.
.PARAMETER Title
No description available.
.PARAMETER Description
No description available.
.PARAMETER DominantColor
Dominant pin color. Hex number, e.g. \""#6E7874\"".
.PARAMETER AltText
No description available.
.PARAMETER CreativeType
No description available.
.PARAMETER BoardId
The board to which this Pin belongs.
.PARAMETER BoardSectionId
The board section to which this Pin belongs.
.PARAMETER BoardOwner
No description available.
.PARAMETER IsOwner
Whether the ""operation user_account"" is the Pin owner.
.PARAMETER Media
No description available.
.PARAMETER MediaSource
No description available.
.PARAMETER ParentPinId
The source pin id if this pin was saved from another pin. <a href=""https://help.pinterest.com/article/save-pins-on-pinterest"">Learn more</a>.
.PARAMETER IsStandard
Whether the Pin is standard or not. See documentation on <a href=""/docs/api-features/content-overview/"">Changes to Pin creation</a> for more information.
.PARAMETER HasBeenPromoted
Whether the Pin has been promoted or not.
.PARAMETER Note
Private note for this Pin. <a href=""https://help.pinterest.com/en/article/add-notes-to-your-pins"">Learn more</a>.
.PARAMETER PinMetrics
Pin metrics with associated time intervals if any.
.OUTPUTS

Pin<PSCustomObject>
#>

function Initialize-Pin {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${CreatedAt},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Link},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Title},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Description},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DominantColor},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AltText},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA", "SHOWCASE", "QUIZ")]
        [PSCustomObject]
        ${CreativeType},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${BoardId},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${BoardSectionId},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${BoardOwner},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${IsOwner},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Media},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${MediaSource},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${ParentPinId},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${IsStandard},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${HasBeenPromoted},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Note},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${PinMetrics}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => Pin' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if (!$Link -and $Link.length -gt 2048) {
            throw "invalid value for 'Link', the character length must be smaller than or equal to 2048."
        }

        if (!$AltText -and $AltText.length -gt 500) {
            throw "invalid value for 'AltText', the character length must be smaller than or equal to 500."
        }


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "created_at" = ${CreatedAt}
            "link" = ${Link}
            "title" = ${Title}
            "description" = ${Description}
            "dominant_color" = ${DominantColor}
            "alt_text" = ${AltText}
            "creative_type" = ${CreativeType}
            "board_id" = ${BoardId}
            "board_section_id" = ${BoardSectionId}
            "board_owner" = ${BoardOwner}
            "is_owner" = ${IsOwner}
            "media" = ${Media}
            "media_source" = ${MediaSource}
            "parent_pin_id" = ${ParentPinId}
            "is_standard" = ${IsStandard}
            "has_been_promoted" = ${HasBeenPromoted}
            "note" = ${Note}
            "pin_metrics" = ${PinMetrics}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to Pin<PSCustomObject>

.DESCRIPTION

Convert from JSON to Pin<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

Pin<PSCustomObject>
#>
function ConvertFrom-JsonToPin {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => Pin' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in Pin
        $AllProperties = ("id", "created_at", "link", "title", "description", "dominant_color", "alt_text", "creative_type", "board_id", "board_section_id", "board_owner", "is_owner", "media", "media_source", "parent_pin_id", "is_standard", "has_been_promoted", "note", "pin_metrics")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "created_at"))) { #optional property not found
            $CreatedAt = $null
        } else {
            $CreatedAt = $JsonParameters.PSobject.Properties["created_at"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "link"))) { #optional property not found
            $Link = $null
        } else {
            $Link = $JsonParameters.PSobject.Properties["link"].value
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "dominant_color"))) { #optional property not found
            $DominantColor = $null
        } else {
            $DominantColor = $JsonParameters.PSobject.Properties["dominant_color"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "alt_text"))) { #optional property not found
            $AltText = $null
        } else {
            $AltText = $JsonParameters.PSobject.Properties["alt_text"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "creative_type"))) { #optional property not found
            $CreativeType = $null
        } else {
            $CreativeType = $JsonParameters.PSobject.Properties["creative_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "board_id"))) { #optional property not found
            $BoardId = $null
        } else {
            $BoardId = $JsonParameters.PSobject.Properties["board_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "board_section_id"))) { #optional property not found
            $BoardSectionId = $null
        } else {
            $BoardSectionId = $JsonParameters.PSobject.Properties["board_section_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "board_owner"))) { #optional property not found
            $BoardOwner = $null
        } else {
            $BoardOwner = $JsonParameters.PSobject.Properties["board_owner"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_owner"))) { #optional property not found
            $IsOwner = $null
        } else {
            $IsOwner = $JsonParameters.PSobject.Properties["is_owner"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "media"))) { #optional property not found
            $Media = $null
        } else {
            $Media = $JsonParameters.PSobject.Properties["media"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "media_source"))) { #optional property not found
            $MediaSource = $null
        } else {
            $MediaSource = $JsonParameters.PSobject.Properties["media_source"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "parent_pin_id"))) { #optional property not found
            $ParentPinId = $null
        } else {
            $ParentPinId = $JsonParameters.PSobject.Properties["parent_pin_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_standard"))) { #optional property not found
            $IsStandard = $null
        } else {
            $IsStandard = $JsonParameters.PSobject.Properties["is_standard"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "has_been_promoted"))) { #optional property not found
            $HasBeenPromoted = $null
        } else {
            $HasBeenPromoted = $JsonParameters.PSobject.Properties["has_been_promoted"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "note"))) { #optional property not found
            $Note = $null
        } else {
            $Note = $JsonParameters.PSobject.Properties["note"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pin_metrics"))) { #optional property not found
            $PinMetrics = $null
        } else {
            $PinMetrics = $JsonParameters.PSobject.Properties["pin_metrics"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "created_at" = ${CreatedAt}
            "link" = ${Link}
            "title" = ${Title}
            "description" = ${Description}
            "dominant_color" = ${DominantColor}
            "alt_text" = ${AltText}
            "creative_type" = ${CreativeType}
            "board_id" = ${BoardId}
            "board_section_id" = ${BoardSectionId}
            "board_owner" = ${BoardOwner}
            "is_owner" = ${IsOwner}
            "media" = ${Media}
            "media_source" = ${MediaSource}
            "parent_pin_id" = ${ParentPinId}
            "is_standard" = ${IsStandard}
            "has_been_promoted" = ${HasBeenPromoted}
            "note" = ${Note}
            "pin_metrics" = ${PinMetrics}
        }

        return $PSO
    }

}

