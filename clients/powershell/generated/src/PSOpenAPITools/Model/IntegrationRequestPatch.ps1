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

Schema used for updating the integration metadata.

.PARAMETER ConnectedMerchantId
No description available.
.PARAMETER ConnectedAdvertiserId
No description available.
.PARAMETER ConnectedLbaId
No description available.
.PARAMETER ConnectedTagId
No description available.
.PARAMETER PartnerAccessToken
No description available.
.PARAMETER PartnerRefreshToken
No description available.
.PARAMETER PartnerPrimaryEmail
No description available.
.PARAMETER PartnerAccessTokenExpiry
No description available.
.PARAMETER PartnerRefreshTokenExpiry
No description available.
.PARAMETER Scopes
No description available.
.PARAMETER AdditionalId1
No description available.
.PARAMETER PartnerMetadata
No description available.
.OUTPUTS

IntegrationRequestPatch<PSCustomObject>
#>

function Initialize-IntegrationRequestPatch {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ConnectedMerchantId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ConnectedAdvertiserId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ConnectedLbaId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ConnectedTagId},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PartnerAccessToken},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PartnerRefreshToken},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PartnerPrimaryEmail},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${PartnerAccessTokenExpiry},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Decimal]]
        ${PartnerRefreshTokenExpiry},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Scopes},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${AdditionalId1},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PartnerMetadata}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => IntegrationRequestPatch' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "connected_merchant_id" = ${ConnectedMerchantId}
            "connected_advertiser_id" = ${ConnectedAdvertiserId}
            "connected_lba_id" = ${ConnectedLbaId}
            "connected_tag_id" = ${ConnectedTagId}
            "partner_access_token" = ${PartnerAccessToken}
            "partner_refresh_token" = ${PartnerRefreshToken}
            "partner_primary_email" = ${PartnerPrimaryEmail}
            "partner_access_token_expiry" = ${PartnerAccessTokenExpiry}
            "partner_refresh_token_expiry" = ${PartnerRefreshTokenExpiry}
            "scopes" = ${Scopes}
            "additional_id_1" = ${AdditionalId1}
            "partner_metadata" = ${PartnerMetadata}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to IntegrationRequestPatch<PSCustomObject>

.DESCRIPTION

Convert from JSON to IntegrationRequestPatch<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

IntegrationRequestPatch<PSCustomObject>
#>
function ConvertFrom-JsonToIntegrationRequestPatch {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => IntegrationRequestPatch' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in IntegrationRequestPatch
        $AllProperties = ("connected_merchant_id", "connected_advertiser_id", "connected_lba_id", "connected_tag_id", "partner_access_token", "partner_refresh_token", "partner_primary_email", "partner_access_token_expiry", "partner_refresh_token_expiry", "scopes", "additional_id_1", "partner_metadata")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "connected_merchant_id"))) { #optional property not found
            $ConnectedMerchantId = $null
        } else {
            $ConnectedMerchantId = $JsonParameters.PSobject.Properties["connected_merchant_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "connected_advertiser_id"))) { #optional property not found
            $ConnectedAdvertiserId = $null
        } else {
            $ConnectedAdvertiserId = $JsonParameters.PSobject.Properties["connected_advertiser_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "connected_lba_id"))) { #optional property not found
            $ConnectedLbaId = $null
        } else {
            $ConnectedLbaId = $JsonParameters.PSobject.Properties["connected_lba_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "connected_tag_id"))) { #optional property not found
            $ConnectedTagId = $null
        } else {
            $ConnectedTagId = $JsonParameters.PSobject.Properties["connected_tag_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "partner_access_token"))) { #optional property not found
            $PartnerAccessToken = $null
        } else {
            $PartnerAccessToken = $JsonParameters.PSobject.Properties["partner_access_token"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "partner_refresh_token"))) { #optional property not found
            $PartnerRefreshToken = $null
        } else {
            $PartnerRefreshToken = $JsonParameters.PSobject.Properties["partner_refresh_token"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "partner_primary_email"))) { #optional property not found
            $PartnerPrimaryEmail = $null
        } else {
            $PartnerPrimaryEmail = $JsonParameters.PSobject.Properties["partner_primary_email"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "partner_access_token_expiry"))) { #optional property not found
            $PartnerAccessTokenExpiry = $null
        } else {
            $PartnerAccessTokenExpiry = $JsonParameters.PSobject.Properties["partner_access_token_expiry"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "partner_refresh_token_expiry"))) { #optional property not found
            $PartnerRefreshTokenExpiry = $null
        } else {
            $PartnerRefreshTokenExpiry = $JsonParameters.PSobject.Properties["partner_refresh_token_expiry"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "scopes"))) { #optional property not found
            $Scopes = $null
        } else {
            $Scopes = $JsonParameters.PSobject.Properties["scopes"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "additional_id_1"))) { #optional property not found
            $AdditionalId1 = $null
        } else {
            $AdditionalId1 = $JsonParameters.PSobject.Properties["additional_id_1"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "partner_metadata"))) { #optional property not found
            $PartnerMetadata = $null
        } else {
            $PartnerMetadata = $JsonParameters.PSobject.Properties["partner_metadata"].value
        }

        $PSO = [PSCustomObject]@{
            "connected_merchant_id" = ${ConnectedMerchantId}
            "connected_advertiser_id" = ${ConnectedAdvertiserId}
            "connected_lba_id" = ${ConnectedLbaId}
            "connected_tag_id" = ${ConnectedTagId}
            "partner_access_token" = ${PartnerAccessToken}
            "partner_refresh_token" = ${PartnerRefreshToken}
            "partner_primary_email" = ${PartnerPrimaryEmail}
            "partner_access_token_expiry" = ${PartnerAccessTokenExpiry}
            "partner_refresh_token_expiry" = ${PartnerRefreshTokenExpiry}
            "scopes" = ${Scopes}
            "additional_id_1" = ${AdditionalId1}
            "partner_metadata" = ${PartnerMetadata}
        }

        return $PSO
    }

}

