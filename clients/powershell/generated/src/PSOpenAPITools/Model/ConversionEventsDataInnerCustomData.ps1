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

Object containing other custom data.

.PARAMETER Currency
The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
.PARAMETER Value
Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
.PARAMETER ContentIds
List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=""https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs"" target=""_blank"">here</a> (Install the Pinterest tag section).
.PARAMETER ContentName
The name of the page or product associated with the event.
.PARAMETER ContentCategory
The category of the content associated with the event.
.PARAMETER ContentBrand
The brand of the content associated with the event.
.PARAMETER Contents
A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=""https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs"" target=""_blank"">here</a> (Install the Pinterest tag section).
.PARAMETER NumItems
Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=""https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs"" target=""_blank"">here</a> (Install the Pinterest tag section).
.PARAMETER OrderId
The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
.PARAMETER SearchString
The search string related to the user conversion event.
.PARAMETER OptOutType
Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=""https://help.pinterest.com/en/business/article/limited-data-processing"" target=""_blank"">Help Center</a> and <a href=""/docs/api-features/conversion-overview/"" target=""_blank"">dev site</a> for specific opt_out_type set up.
.PARAMETER Np
Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
.OUTPUTS

ConversionEventsDataInnerCustomData<PSCustomObject>
#>

function Initialize-ConversionEventsDataInnerCustomData {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Currency},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Value},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${ContentIds},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ContentName},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ContentCategory},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ContentBrand},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Contents},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${NumItems},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${OrderId},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${SearchString},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${OptOutType},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Np}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ConversionEventsDataInnerCustomData' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "currency" = ${Currency}
            "value" = ${Value}
            "content_ids" = ${ContentIds}
            "content_name" = ${ContentName}
            "content_category" = ${ContentCategory}
            "content_brand" = ${ContentBrand}
            "contents" = ${Contents}
            "num_items" = ${NumItems}
            "order_id" = ${OrderId}
            "search_string" = ${SearchString}
            "opt_out_type" = ${OptOutType}
            "np" = ${Np}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ConversionEventsDataInnerCustomData<PSCustomObject>

.DESCRIPTION

Convert from JSON to ConversionEventsDataInnerCustomData<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ConversionEventsDataInnerCustomData<PSCustomObject>
#>
function ConvertFrom-JsonToConversionEventsDataInnerCustomData {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ConversionEventsDataInnerCustomData' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ConversionEventsDataInnerCustomData
        $AllProperties = ("currency", "value", "content_ids", "content_name", "content_category", "content_brand", "contents", "num_items", "order_id", "search_string", "opt_out_type", "np")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "currency"))) { #optional property not found
            $Currency = $null
        } else {
            $Currency = $JsonParameters.PSobject.Properties["currency"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "value"))) { #optional property not found
            $Value = $null
        } else {
            $Value = $JsonParameters.PSobject.Properties["value"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "content_ids"))) { #optional property not found
            $ContentIds = $null
        } else {
            $ContentIds = $JsonParameters.PSobject.Properties["content_ids"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "content_name"))) { #optional property not found
            $ContentName = $null
        } else {
            $ContentName = $JsonParameters.PSobject.Properties["content_name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "content_category"))) { #optional property not found
            $ContentCategory = $null
        } else {
            $ContentCategory = $JsonParameters.PSobject.Properties["content_category"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "content_brand"))) { #optional property not found
            $ContentBrand = $null
        } else {
            $ContentBrand = $JsonParameters.PSobject.Properties["content_brand"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "contents"))) { #optional property not found
            $Contents = $null
        } else {
            $Contents = $JsonParameters.PSobject.Properties["contents"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "num_items"))) { #optional property not found
            $NumItems = $null
        } else {
            $NumItems = $JsonParameters.PSobject.Properties["num_items"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "order_id"))) { #optional property not found
            $OrderId = $null
        } else {
            $OrderId = $JsonParameters.PSobject.Properties["order_id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "search_string"))) { #optional property not found
            $SearchString = $null
        } else {
            $SearchString = $JsonParameters.PSobject.Properties["search_string"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "opt_out_type"))) { #optional property not found
            $OptOutType = $null
        } else {
            $OptOutType = $JsonParameters.PSobject.Properties["opt_out_type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "np"))) { #optional property not found
            $Np = $null
        } else {
            $Np = $JsonParameters.PSobject.Properties["np"].value
        }

        $PSO = [PSCustomObject]@{
            "currency" = ${Currency}
            "value" = ${Value}
            "content_ids" = ${ContentIds}
            "content_name" = ${ContentName}
            "content_category" = ${ContentCategory}
            "content_brand" = ${ContentBrand}
            "contents" = ${Contents}
            "num_items" = ${NumItems}
            "order_id" = ${OrderId}
            "search_string" = ${SearchString}
            "opt_out_type" = ${OptOutType}
            "np" = ${Np}
        }

        return $PSO
    }

}

