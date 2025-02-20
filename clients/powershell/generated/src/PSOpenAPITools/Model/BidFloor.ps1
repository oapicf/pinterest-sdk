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

.PARAMETER BidFloors
A list of bid floors in micro currency. For example, [100000, 200000]
.PARAMETER Type
Always the string 'bidfloor'
.OUTPUTS

BidFloor<PSCustomObject>
#>

function Initialize-BidFloor {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [Int32[]]
        ${BidFloors},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Type} = "bidfloor"
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => BidFloor' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "bid_floors" = ${BidFloors}
            "type" = ${Type}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BidFloor<PSCustomObject>

.DESCRIPTION

Convert from JSON to BidFloor<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BidFloor<PSCustomObject>
#>
function ConvertFrom-JsonToBidFloor {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => BidFloor' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BidFloor
        $AllProperties = ("bid_floors", "type")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "bid_floors"))) { #optional property not found
            $BidFloors = $null
        } else {
            $BidFloors = $JsonParameters.PSobject.Properties["bid_floors"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) { #optional property not found
            $Type = $null
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        $PSO = [PSCustomObject]@{
            "bid_floors" = ${BidFloors}
            "type" = ${Type}
        }

        return $PSO
    }

}

