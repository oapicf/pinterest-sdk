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

.PARAMETER ExportStatus
No description available.
.PARAMETER DownloadUrl
No description available.
.OUTPUTS

LeadsExportResponseData<PSCustomObject>
#>

function Initialize-LeadsExportResponseData {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("IN_PROGRESS", "FINISHED", "FAILED")]
        [PSCustomObject]
        ${ExportStatus},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DownloadUrl}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => LeadsExportResponseData' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "export_status" = ${ExportStatus}
            "download_url" = ${DownloadUrl}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to LeadsExportResponseData<PSCustomObject>

.DESCRIPTION

Convert from JSON to LeadsExportResponseData<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

LeadsExportResponseData<PSCustomObject>
#>
function ConvertFrom-JsonToLeadsExportResponseData {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => LeadsExportResponseData' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in LeadsExportResponseData
        $AllProperties = ("export_status", "download_url")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "export_status"))) { #optional property not found
            $ExportStatus = $null
        } else {
            $ExportStatus = $JsonParameters.PSobject.Properties["export_status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "download_url"))) { #optional property not found
            $DownloadUrl = $null
        } else {
            $DownloadUrl = $JsonParameters.PSobject.Properties["download_url"].value
        }

        $PSO = [PSCustomObject]@{
            "export_status" = ${ExportStatus}
            "download_url" = ${DownloadUrl}
        }

        return $PSO
    }

}

