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

A currency filter. This filter cannot be negated

.PARAMETER Values
No description available.
.PARAMETER Negated
No description available.
.OUTPUTS

CatalogsProductGroupCurrencyCriteria<PSCustomObject>
#>

function Initialize-CatalogsProductGroupCurrencyCriteria {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BYR", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SPL", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWD")]
        [PSCustomObject]
        ${Values},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${Negated} = $false
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CatalogsProductGroupCurrencyCriteria' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Values) {
            throw "invalid value for 'Values', 'Values' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "values" = ${Values}
            "negated" = ${Negated}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CatalogsProductGroupCurrencyCriteria<PSCustomObject>

.DESCRIPTION

Convert from JSON to CatalogsProductGroupCurrencyCriteria<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CatalogsProductGroupCurrencyCriteria<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsProductGroupCurrencyCriteria {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CatalogsProductGroupCurrencyCriteria' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CatalogsProductGroupCurrencyCriteria
        $AllProperties = ("values", "negated")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'values' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "values"))) {
            throw "Error! JSON cannot be serialized due to the required property 'values' missing."
        } else {
            $Values = $JsonParameters.PSobject.Properties["values"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "negated"))) { #optional property not found
            $Negated = $null
        } else {
            $Negated = $JsonParameters.PSobject.Properties["negated"].value
        }

        $PSO = [PSCustomObject]@{
            "values" = ${Values}
            "negated" = ${Negated}
        }

        return $PSO
    }

}
