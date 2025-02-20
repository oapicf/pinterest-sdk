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

Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.

.PARAMETER SourceType
No description available.
.PARAMETER IsAffiliateLink
This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
.OUTPUTS

PinMediaSourcePinURL<PSCustomObject>
#>

function Initialize-PinMediaSourcePinURL {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("pin_url")]
        [String]
        ${SourceType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${IsAffiliateLink} = $false
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => PinMediaSourcePinURL' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $SourceType) {
            throw "invalid value for 'SourceType', 'SourceType' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "source_type" = ${SourceType}
            "is_affiliate_link" = ${IsAffiliateLink}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to PinMediaSourcePinURL<PSCustomObject>

.DESCRIPTION

Convert from JSON to PinMediaSourcePinURL<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

PinMediaSourcePinURL<PSCustomObject>
#>
function ConvertFrom-JsonToPinMediaSourcePinURL {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => PinMediaSourcePinURL' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PinMediaSourcePinURL
        $AllProperties = ("source_type", "is_affiliate_link")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'source_type' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "source_type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'source_type' missing."
        } else {
            $SourceType = $JsonParameters.PSobject.Properties["source_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "is_affiliate_link"))) { #optional property not found
            $IsAffiliateLink = $null
        } else {
            $IsAffiliateLink = $JsonParameters.PSobject.Properties["is_affiliate_link"].value
        }

        $PSO = [PSCustomObject]@{
            "source_type" = ${SourceType}
            "is_affiliate_link" = ${IsAffiliateLink}
        }

        return $PSO
    }

}

