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

.PARAMETER Em
Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
.PARAMETER HashedMaids
Sha256 hashes of user's ""Google Advertising IDs"" (GAIDs) or ""Apple's Identifier for Advertisers"" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
.PARAMETER ClientIpAddress
The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
.PARAMETER ClientUserAgent
The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
.OUTPUTS

ConversionEventsUserDataAnyOf<PSCustomObject>
#>

function Initialize-ConversionEventsUserDataAnyOf {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Em},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${HashedMaids},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ClientIpAddress},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ClientUserAgent}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ConversionEventsUserDataAnyOf' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Em) {
            throw "invalid value for 'Em', 'Em' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "em" = ${Em}
            "hashed_maids" = ${HashedMaids}
            "client_ip_address" = ${ClientIpAddress}
            "client_user_agent" = ${ClientUserAgent}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ConversionEventsUserDataAnyOf<PSCustomObject>

.DESCRIPTION

Convert from JSON to ConversionEventsUserDataAnyOf<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ConversionEventsUserDataAnyOf<PSCustomObject>
#>
function ConvertFrom-JsonToConversionEventsUserDataAnyOf {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ConversionEventsUserDataAnyOf' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ConversionEventsUserDataAnyOf
        $AllProperties = ("em", "hashed_maids", "client_ip_address", "client_user_agent")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'em' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "em"))) {
            throw "Error! JSON cannot be serialized due to the required property 'em' missing."
        } else {
            $Em = $JsonParameters.PSobject.Properties["em"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hashed_maids"))) { #optional property not found
            $HashedMaids = $null
        } else {
            $HashedMaids = $JsonParameters.PSobject.Properties["hashed_maids"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "client_ip_address"))) { #optional property not found
            $ClientIpAddress = $null
        } else {
            $ClientIpAddress = $JsonParameters.PSobject.Properties["client_ip_address"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "client_user_agent"))) { #optional property not found
            $ClientUserAgent = $null
        } else {
            $ClientUserAgent = $JsonParameters.PSobject.Properties["client_user_agent"].value
        }

        $PSO = [PSCustomObject]@{
            "em" = ${Em}
            "hashed_maids" = ${HashedMaids}
            "client_ip_address" = ${ClientIpAddress}
            "client_user_agent" = ${ClientUserAgent}
        }

        return $PSO
    }

}

