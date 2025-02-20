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

Request object to update catalogs hotel items

.PARAMETER CatalogType
No description available.
.PARAMETER Country
No description available.
.PARAMETER Language
No description available.
.PARAMETER Items
Array with catalogs item operations
.PARAMETER CatalogId
Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
.OUTPUTS

CatalogsHotelBatchRequest<PSCustomObject>
#>

function Initialize-CatalogsHotelBatchRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("HOTEL")]
        [String]
        ${CatalogType},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HM", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "UM", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM", "ZW")]
        [PSCustomObject]
        ${Country},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Language},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Items},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [ValidatePattern("^\d+$")]
        [String]
        ${CatalogId}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CatalogsHotelBatchRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $CatalogType) {
            throw "invalid value for 'CatalogType', 'CatalogType' cannot be null."
        }

        if ($null -eq $Country) {
            throw "invalid value for 'Country', 'Country' cannot be null."
        }

        if ($null -eq $Language) {
            throw "invalid value for 'Language', 'Language' cannot be null."
        }

        if ($null -eq $Items) {
            throw "invalid value for 'Items', 'Items' cannot be null."
        }

        if ($Items.length -gt 1000) {
            throw "invalid value for 'Items', number of items must be less than or equal to 1000."
        }

        if ($Items.length -lt 1) {
            throw "invalid value for 'Items', number of items must be greater than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "catalog_type" = ${CatalogType}
            "country" = ${Country}
            "language" = ${Language}
            "items" = ${Items}
            "catalog_id" = ${CatalogId}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CatalogsHotelBatchRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to CatalogsHotelBatchRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CatalogsHotelBatchRequest<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsHotelBatchRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CatalogsHotelBatchRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CatalogsHotelBatchRequest
        $AllProperties = ("catalog_type", "country", "language", "items", "catalog_id")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'catalog_type' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "catalog_type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'catalog_type' missing."
        } else {
            $CatalogType = $JsonParameters.PSobject.Properties["catalog_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "country"))) {
            throw "Error! JSON cannot be serialized due to the required property 'country' missing."
        } else {
            $Country = $JsonParameters.PSobject.Properties["country"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "language"))) {
            throw "Error! JSON cannot be serialized due to the required property 'language' missing."
        } else {
            $Language = $JsonParameters.PSobject.Properties["language"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "items"))) {
            throw "Error! JSON cannot be serialized due to the required property 'items' missing."
        } else {
            $Items = $JsonParameters.PSobject.Properties["items"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "catalog_id"))) { #optional property not found
            $CatalogId = $null
        } else {
            $CatalogId = $JsonParameters.PSobject.Properties["catalog_id"].value
        }

        $PSO = [PSCustomObject]@{
            "catalog_type" = ${CatalogType}
            "country" = ${Country}
            "language" = ${Language}
            "items" = ${Items}
            "catalog_id" = ${CatalogId}
        }

        return $PSO
    }

}

