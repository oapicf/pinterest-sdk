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

Response when logs are successfully processed.

.PARAMETER Message
No description available.
.OUTPUTS

IntegrationLogsSuccessResponse<PSCustomObject>
#>

function Initialize-IntegrationLogsSuccessResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Message}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => IntegrationLogsSuccessResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "message" = ${Message}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to IntegrationLogsSuccessResponse<PSCustomObject>

.DESCRIPTION

Convert from JSON to IntegrationLogsSuccessResponse<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

IntegrationLogsSuccessResponse<PSCustomObject>
#>
function ConvertFrom-JsonToIntegrationLogsSuccessResponse {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => IntegrationLogsSuccessResponse' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in IntegrationLogsSuccessResponse
        $AllProperties = ("message")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "message"))) { #optional property not found
            $Message = $null
        } else {
            $Message = $JsonParameters.PSobject.Properties["message"].value
        }

        $PSO = [PSCustomObject]@{
            "message" = ${Message}
        }

        return $PSO
    }

}

