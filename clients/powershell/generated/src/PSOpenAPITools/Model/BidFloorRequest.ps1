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

.PARAMETER BidFloorSpecs
No description available.
.PARAMETER TargetingSpec
No description available.
.OUTPUTS

BidFloorRequest<PSCustomObject>
#>

function Initialize-BidFloorRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${BidFloorSpecs},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${TargetingSpec}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => BidFloorRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $BidFloorSpecs) {
            throw "invalid value for 'BidFloorSpecs', 'BidFloorSpecs' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "bid_floor_specs" = ${BidFloorSpecs}
            "targeting_spec" = ${TargetingSpec}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BidFloorRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to BidFloorRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BidFloorRequest<PSCustomObject>
#>
function ConvertFrom-JsonToBidFloorRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => BidFloorRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BidFloorRequest
        $AllProperties = ("bid_floor_specs", "targeting_spec")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'bid_floor_specs' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "bid_floor_specs"))) {
            throw "Error! JSON cannot be serialized due to the required property 'bid_floor_specs' missing."
        } else {
            $BidFloorSpecs = $JsonParameters.PSobject.Properties["bid_floor_specs"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "targeting_spec"))) { #optional property not found
            $TargetingSpec = $null
        } else {
            $TargetingSpec = $JsonParameters.PSobject.Properties["targeting_spec"].value
        }

        $PSO = [PSCustomObject]@{
            "bid_floor_specs" = ${BidFloorSpecs}
            "targeting_spec" = ${TargetingSpec}
        }

        return $PSO
    }

}
