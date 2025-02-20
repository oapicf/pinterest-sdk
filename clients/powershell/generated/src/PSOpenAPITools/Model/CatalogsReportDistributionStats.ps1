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

.PARAMETER ReportType
No description available.
.PARAMETER CatalogId
ID of the catalog entity.
.PARAMETER Code
The event code that a diagnostics aggregated number references
.PARAMETER CodeLabel
A human-friendly label for the event code (e.g, 'SPAM')
.PARAMETER Message
Title message describing the diagnostic issue
.PARAMETER Occurrences
Number of occurrences of the issue
.PARAMETER IneligibleForAds
Indicates if issue makes items ineligible for ads distribution
.PARAMETER IneligibleForOrganic
Indicates if issue makes items ineligible for organic distribution
.OUTPUTS

CatalogsReportDistributionStats<PSCustomObject>
#>

function Initialize-CatalogsReportDistributionStats {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("DISTRIBUTION_ISSUES")]
        [String]
        ${ReportType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${CatalogId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Code},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CodeLabel},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Message},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Occurrences},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${IneligibleForAds},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${IneligibleForOrganic}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CatalogsReportDistributionStats' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "report_type" = ${ReportType}
            "catalog_id" = ${CatalogId}
            "code" = ${Code}
            "code_label" = ${CodeLabel}
            "message" = ${Message}
            "occurrences" = ${Occurrences}
            "ineligible_for_ads" = ${IneligibleForAds}
            "ineligible_for_organic" = ${IneligibleForOrganic}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CatalogsReportDistributionStats<PSCustomObject>

.DESCRIPTION

Convert from JSON to CatalogsReportDistributionStats<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CatalogsReportDistributionStats<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsReportDistributionStats {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CatalogsReportDistributionStats' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CatalogsReportDistributionStats
        $AllProperties = ("report_type", "catalog_id", "code", "code_label", "message", "occurrences", "ineligible_for_ads", "ineligible_for_organic")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "report_type"))) { #optional property not found
            $ReportType = $null
        } else {
            $ReportType = $JsonParameters.PSobject.Properties["report_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "catalog_id"))) { #optional property not found
            $CatalogId = $null
        } else {
            $CatalogId = $JsonParameters.PSobject.Properties["catalog_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "code"))) { #optional property not found
            $Code = $null
        } else {
            $Code = $JsonParameters.PSobject.Properties["code"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "code_label"))) { #optional property not found
            $CodeLabel = $null
        } else {
            $CodeLabel = $JsonParameters.PSobject.Properties["code_label"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "message"))) { #optional property not found
            $Message = $null
        } else {
            $Message = $JsonParameters.PSobject.Properties["message"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "occurrences"))) { #optional property not found
            $Occurrences = $null
        } else {
            $Occurrences = $JsonParameters.PSobject.Properties["occurrences"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ineligible_for_ads"))) { #optional property not found
            $IneligibleForAds = $null
        } else {
            $IneligibleForAds = $JsonParameters.PSobject.Properties["ineligible_for_ads"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ineligible_for_organic"))) { #optional property not found
            $IneligibleForOrganic = $null
        } else {
            $IneligibleForOrganic = $JsonParameters.PSobject.Properties["ineligible_for_organic"].value
        }

        $PSO = [PSCustomObject]@{
            "report_type" = ${ReportType}
            "catalog_id" = ${CatalogId}
            "code" = ${Code}
            "code_label" = ${CodeLabel}
            "message" = ${Message}
            "occurrences" = ${Occurrences}
            "ineligible_for_ads" = ${IneligibleForAds}
            "ineligible_for_organic" = ${IneligibleForOrganic}
        }

        return $PSO
    }

}

