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

.PARAMETER QuestionType
No description available.
.PARAMETER CustomQuestionFieldType
No description available.
.PARAMETER CustomQuestionLabel
Question label for a custom question.
.PARAMETER CustomQuestionOptions
Question options for a custom question.
.OUTPUTS

LeadFormQuestion<PSCustomObject>
#>

function Initialize-LeadFormQuestion {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("CUSTOM", "FULL_NAME", "FIRST_NAME", "LAST_NAME", "EMAIL", "PHONE_NUMBER", "ZIP_CODE", "AGE", "GENDER", "CITY", "COUNTRY", "PREFERRED_CONTACT_METHOD", "STATE_PROVINCE", "ADDRESS", "DATE_OF_BIRTH")]
        [PSCustomObject]
        ${QuestionType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("TEXT_FIELD", "TEXT_AREA", "RADIO_LIST", "CHECKBOX", "")]
        [PSCustomObject]
        ${CustomQuestionFieldType},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${CustomQuestionLabel},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${CustomQuestionOptions}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => LeadFormQuestion' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if (!$CustomQuestionOptions -and $CustomQuestionOptions.length -gt 5) {
            throw "invalid value for 'CustomQuestionOptions', number of items must be less than or equal to 5."
        }

        if (!$CustomQuestionOptions -and $CustomQuestionOptions.length -lt 0) {
            throw "invalid value for 'CustomQuestionOptions', number of items must be greater than or equal to 0."
        }


        $PSO = [PSCustomObject]@{
            "question_type" = ${QuestionType}
            "custom_question_field_type" = ${CustomQuestionFieldType}
            "custom_question_label" = ${CustomQuestionLabel}
            "custom_question_options" = ${CustomQuestionOptions}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to LeadFormQuestion<PSCustomObject>

.DESCRIPTION

Convert from JSON to LeadFormQuestion<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

LeadFormQuestion<PSCustomObject>
#>
function ConvertFrom-JsonToLeadFormQuestion {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => LeadFormQuestion' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in LeadFormQuestion
        $AllProperties = ("question_type", "custom_question_field_type", "custom_question_label", "custom_question_options")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "question_type"))) { #optional property not found
            $QuestionType = $null
        } else {
            $QuestionType = $JsonParameters.PSobject.Properties["question_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "custom_question_field_type"))) { #optional property not found
            $CustomQuestionFieldType = $null
        } else {
            $CustomQuestionFieldType = $JsonParameters.PSobject.Properties["custom_question_field_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "custom_question_label"))) { #optional property not found
            $CustomQuestionLabel = $null
        } else {
            $CustomQuestionLabel = $JsonParameters.PSobject.Properties["custom_question_label"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "custom_question_options"))) { #optional property not found
            $CustomQuestionOptions = $null
        } else {
            $CustomQuestionOptions = $JsonParameters.PSobject.Properties["custom_question_options"].value
        }

        $PSO = [PSCustomObject]@{
            "question_type" = ${QuestionType}
            "custom_question_field_type" = ${CustomQuestionFieldType}
            "custom_question_label" = ${CustomQuestionLabel}
            "custom_question_options" = ${CustomQuestionOptions}
        }

        return $PSO
    }

}
