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

.PARAMETER StartTime
Unix UTC timestamp.
.PARAMETER EndTime
Unix UTC timestamp.
.PARAMETER Name
Campaign name
.PARAMETER CampaignStatus
No description available.
.PARAMETER ObjectiveType
No description available.
.OUTPUTS

BulkDownloadRequestCampaignFilter<PSCustomObject>
#>

function Initialize-BulkDownloadRequestCampaignFilter {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${StartTime},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${EndTime},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${CampaignStatus},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${ObjectiveType}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => BulkDownloadRequestCampaignFilter' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "start_time" = ${StartTime}
            "end_time" = ${EndTime}
            "name" = ${Name}
            "campaign_status" = ${CampaignStatus}
            "objective_type" = ${ObjectiveType}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BulkDownloadRequestCampaignFilter<PSCustomObject>

.DESCRIPTION

Convert from JSON to BulkDownloadRequestCampaignFilter<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BulkDownloadRequestCampaignFilter<PSCustomObject>
#>
function ConvertFrom-JsonToBulkDownloadRequestCampaignFilter {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => BulkDownloadRequestCampaignFilter' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BulkDownloadRequestCampaignFilter
        $AllProperties = ("start_time", "end_time", "name", "campaign_status", "objective_type")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "start_time"))) { #optional property not found
            $StartTime = $null
        } else {
            $StartTime = $JsonParameters.PSobject.Properties["start_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "end_time"))) { #optional property not found
            $EndTime = $null
        } else {
            $EndTime = $JsonParameters.PSobject.Properties["end_time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "campaign_status"))) { #optional property not found
            $CampaignStatus = $null
        } else {
            $CampaignStatus = $JsonParameters.PSobject.Properties["campaign_status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "objective_type"))) { #optional property not found
            $ObjectiveType = $null
        } else {
            $ObjectiveType = $JsonParameters.PSobject.Properties["objective_type"].value
        }

        $PSO = [PSCustomObject]@{
            "start_time" = ${StartTime}
            "end_time" = ${EndTime}
            "name" = ${Name}
            "campaign_status" = ${CampaignStatus}
            "objective_type" = ${ObjectiveType}
        }

        return $PSO
    }

}

