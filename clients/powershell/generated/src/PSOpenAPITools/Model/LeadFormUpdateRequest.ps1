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

.PARAMETER Name
Internal name of the lead form.
.PARAMETER PrivacyPolicyLink
A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
.PARAMETER HasAcceptedTerms
Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=""https://policy.pinterest.com/en/lead-ad-terms"">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=""https://business.pinterest.com/en/pinterest-advertising-services-agreement/"">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
.PARAMETER CompletionMessage
A message for people who complete the form to let them know what happens next.
.PARAMETER Status
No description available.
.PARAMETER DisclosureLanguage
Additional disclosure language to be included in the lead form.
.PARAMETER Questions
List of questions to be displayed on the lead form.
.PARAMETER PolicyLinks
List of additional policy links to be displayed on the lead form.
.PARAMETER Id
The ID of this lead form to be updated
.OUTPUTS

LeadFormUpdateRequest<PSCustomObject>
#>

function Initialize-LeadFormUpdateRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PrivacyPolicyLink},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${HasAcceptedTerms},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CompletionMessage},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("DRAFT", "ACTIVE")]
        [PSCustomObject]
        ${Status},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DisclosureLanguage},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Questions},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${PolicyLinks},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${Id}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => LeadFormUpdateRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if (!$Questions -and $Questions.length -gt 10) {
            throw "invalid value for 'Questions', number of items must be less than or equal to 10."
        }

        if (!$Questions -and $Questions.length -lt 0) {
            throw "invalid value for 'Questions', number of items must be greater than or equal to 0."
        }

        if (!$PolicyLinks -and $PolicyLinks.length -gt 3) {
            throw "invalid value for 'PolicyLinks', number of items must be less than or equal to 3."
        }

        if (!$PolicyLinks -and $PolicyLinks.length -lt 0) {
            throw "invalid value for 'PolicyLinks', number of items must be greater than or equal to 0."
        }

        if ($null -eq $Id) {
            throw "invalid value for 'Id', 'Id' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "name" = ${Name}
            "privacy_policy_link" = ${PrivacyPolicyLink}
            "has_accepted_terms" = ${HasAcceptedTerms}
            "completion_message" = ${CompletionMessage}
            "status" = ${Status}
            "disclosure_language" = ${DisclosureLanguage}
            "questions" = ${Questions}
            "policy_links" = ${PolicyLinks}
            "id" = ${Id}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to LeadFormUpdateRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to LeadFormUpdateRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

LeadFormUpdateRequest<PSCustomObject>
#>
function ConvertFrom-JsonToLeadFormUpdateRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => LeadFormUpdateRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in LeadFormUpdateRequest
        $AllProperties = ("name", "privacy_policy_link", "has_accepted_terms", "completion_message", "status", "disclosure_language", "questions", "policy_links", "id")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'id' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'id' missing."
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "privacy_policy_link"))) { #optional property not found
            $PrivacyPolicyLink = $null
        } else {
            $PrivacyPolicyLink = $JsonParameters.PSobject.Properties["privacy_policy_link"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "has_accepted_terms"))) { #optional property not found
            $HasAcceptedTerms = $null
        } else {
            $HasAcceptedTerms = $JsonParameters.PSobject.Properties["has_accepted_terms"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "completion_message"))) { #optional property not found
            $CompletionMessage = $null
        } else {
            $CompletionMessage = $JsonParameters.PSobject.Properties["completion_message"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "status"))) { #optional property not found
            $Status = $null
        } else {
            $Status = $JsonParameters.PSobject.Properties["status"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "disclosure_language"))) { #optional property not found
            $DisclosureLanguage = $null
        } else {
            $DisclosureLanguage = $JsonParameters.PSobject.Properties["disclosure_language"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "questions"))) { #optional property not found
            $Questions = $null
        } else {
            $Questions = $JsonParameters.PSobject.Properties["questions"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "policy_links"))) { #optional property not found
            $PolicyLinks = $null
        } else {
            $PolicyLinks = $JsonParameters.PSobject.Properties["policy_links"].value
        }

        $PSO = [PSCustomObject]@{
            "name" = ${Name}
            "privacy_policy_link" = ${PrivacyPolicyLink}
            "has_accepted_terms" = ${HasAcceptedTerms}
            "completion_message" = ${CompletionMessage}
            "status" = ${Status}
            "disclosure_language" = ${DisclosureLanguage}
            "questions" = ${Questions}
            "policy_links" = ${PolicyLinks}
            "id" = ${Id}
        }

        return $PSO
    }

}

