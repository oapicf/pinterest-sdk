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

.PARAMETER ADLINKFORMATWARNING
Some items have ad links that are formatted incorrectly.
.PARAMETER ADLINKSAMEASLINK
Some items have ad link URLs that are duplicates of the link URLs for those items.
.PARAMETER TITLELENGTHTOOLONG
The title for some items were truncated because they contain too many characters.
.PARAMETER DESCRIPTIONLENGTHTOOLONG
The description for some items were truncated because they contain too many characters.
.PARAMETER GENDERINVALID
Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
.PARAMETER AGEGROUPINVALID
Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
.PARAMETER SIZETYPEINVALID
Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
.PARAMETER SIZESYSTEMINVALID
Some items have size system values which are not one of the supported size systems.
.PARAMETER LINKFORMATWARNING
Some items have an invalid product link which contains invalid UTM tracking paramaters.
.PARAMETER SALESPRICEINVALID
Some items have sale price values that are higher than the original price of the item.
.PARAMETER PRODUCTCATEGORYDEPTHWARNING
Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
.PARAMETER ADWORDSFORMATWARNING
Some items have adwords_redirect links that are formatted incorrectly.
.PARAMETER ADWORDSSAMEASLINK
Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
.PARAMETER DUPLICATEHEADERS
Your feed contains duplicate headers.
.PARAMETER FETCHSAMESIGNATURE
Ingestion completed early because there are no changes to your feed since the last successful update.
.PARAMETER ADDITIONALIMAGELINKLENGTHTOOLONG
Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
.PARAMETER ADDITIONALIMAGELINKWARNING
Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
.PARAMETER IMAGELINKWARNING
Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
.PARAMETER SHIPPINGINVALID
Some items have shipping values that are formatted incorrectly.
.PARAMETER TAXINVALID
Some items have tax values that are formatted incorrectly.
.PARAMETER SHIPPINGWEIGHTINVALID
Some items have invalid shipping_weight values.
.PARAMETER EXPIRATIONDATEINVALID
Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
.PARAMETER AVAILABILITYDATEINVALID
Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
.PARAMETER SALEDATEINVALID
Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
.PARAMETER WEIGHTUNITINVALID
Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
.PARAMETER ISBUNDLEINVALID
Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
.PARAMETER UPDATEDTIMEINVALID
Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
.PARAMETER CUSTOMLABELLENGTHTOOLONG
Some items have custom_label values that are too long, those items will be published without that custom label.
.PARAMETER PRODUCTTYPELENGTHTOOLONG
Some items have product_type values that are too long, those items will be published without that product type.
.PARAMETER TOOMANYADDITIONALIMAGELINKS
Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
.PARAMETER MULTIPACKINVALID
Some items have invalid multipack values.
.PARAMETER INDEXEDPRODUCTCOUNTLARGEDELTA
The product count has increased or decreased significantly compared to the last successful ingestion.
.PARAMETER ITEMADDITIONALIMAGEDOWNLOADFAILURE
Some items include additional_image_links that can't be found.
.PARAMETER OPTIONALPRODUCTCATEGORYMISSING
Some items are missing a google_product_category.
.PARAMETER OPTIONALPRODUCTCATEGORYINVALID
Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
.PARAMETER OPTIONALCONDITIONMISSING
Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
.PARAMETER OPTIONALCONDITIONINVALID
Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
.PARAMETER IOSDEEPLINKINVALID
Some items include invalid ios_deep_link values.
.PARAMETER ANDROIDDEEPLINKINVALID
Some items include invalid android_deep_link.
.PARAMETER UTMSOURCEAUTOCORRECTED
Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
.PARAMETER COUNTRYDOESNOTMAPTOCURRENCY
Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
.PARAMETER MINADPRICEINVALID
Some items include min_ad_price values that are formatted incorrectly.
.PARAMETER GTININVALID
Some items include incorrectly formatted GTINs.
.PARAMETER INCONSISTENTCURRENCYVALUES
Some items include inconsistent currencies in price fields.
.PARAMETER SALESPRICETOOLOW
Some items include sales price that is much lower than the list price.
.PARAMETER SHIPPINGWIDTHINVALID
Some items include incorrectly formatted shipping_width.
.PARAMETER SHIPPINGHEIGHTINVALID
Some items include incorrectly formatted shipping_height.
.PARAMETER SALESPRICETOOHIGH
Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
.PARAMETER MPNINVALID
Some items include incorrectly formatted MPNs.
.OUTPUTS

CatalogsFeedValidationWarnings<PSCustomObject>
#>

function Initialize-CatalogsFeedValidationWarnings {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ADLINKFORMATWARNING},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ADLINKSAMEASLINK},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${TITLELENGTHTOOLONG},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${DESCRIPTIONLENGTHTOOLONG},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${GENDERINVALID},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${AGEGROUPINVALID},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SIZETYPEINVALID},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SIZESYSTEMINVALID},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${LINKFORMATWARNING},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SALESPRICEINVALID},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${PRODUCTCATEGORYDEPTHWARNING},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ADWORDSFORMATWARNING},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ADWORDSSAMEASLINK},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${DUPLICATEHEADERS},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("1")]
        [System.Nullable[Int32]]
        ${FETCHSAMESIGNATURE},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ADDITIONALIMAGELINKLENGTHTOOLONG},
        [Parameter(Position = 16, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ADDITIONALIMAGELINKWARNING},
        [Parameter(Position = 17, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${IMAGELINKWARNING},
        [Parameter(Position = 18, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SHIPPINGINVALID},
        [Parameter(Position = 19, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${TAXINVALID},
        [Parameter(Position = 20, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SHIPPINGWEIGHTINVALID},
        [Parameter(Position = 21, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${EXPIRATIONDATEINVALID},
        [Parameter(Position = 22, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${AVAILABILITYDATEINVALID},
        [Parameter(Position = 23, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SALEDATEINVALID},
        [Parameter(Position = 24, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${WEIGHTUNITINVALID},
        [Parameter(Position = 25, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ISBUNDLEINVALID},
        [Parameter(Position = 26, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${UPDATEDTIMEINVALID},
        [Parameter(Position = 27, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${CUSTOMLABELLENGTHTOOLONG},
        [Parameter(Position = 28, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${PRODUCTTYPELENGTHTOOLONG},
        [Parameter(Position = 29, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${TOOMANYADDITIONALIMAGELINKS},
        [Parameter(Position = 30, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${MULTIPACKINVALID},
        [Parameter(Position = 31, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${INDEXEDPRODUCTCOUNTLARGEDELTA},
        [Parameter(Position = 32, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ITEMADDITIONALIMAGEDOWNLOADFAILURE},
        [Parameter(Position = 33, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${OPTIONALPRODUCTCATEGORYMISSING},
        [Parameter(Position = 34, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${OPTIONALPRODUCTCATEGORYINVALID},
        [Parameter(Position = 35, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${OPTIONALCONDITIONMISSING},
        [Parameter(Position = 36, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${OPTIONALCONDITIONINVALID},
        [Parameter(Position = 37, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${IOSDEEPLINKINVALID},
        [Parameter(Position = 38, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${ANDROIDDEEPLINKINVALID},
        [Parameter(Position = 39, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${UTMSOURCEAUTOCORRECTED},
        [Parameter(Position = 40, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${COUNTRYDOESNOTMAPTOCURRENCY},
        [Parameter(Position = 41, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${MINADPRICEINVALID},
        [Parameter(Position = 42, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${GTININVALID},
        [Parameter(Position = 43, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${INCONSISTENTCURRENCYVALUES},
        [Parameter(Position = 44, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SALESPRICETOOLOW},
        [Parameter(Position = 45, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SHIPPINGWIDTHINVALID},
        [Parameter(Position = 46, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SHIPPINGHEIGHTINVALID},
        [Parameter(Position = 47, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${SALESPRICETOOHIGH},
        [Parameter(Position = 48, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${MPNINVALID}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => CatalogsFeedValidationWarnings' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "AD_LINK_FORMAT_WARNING" = ${ADLINKFORMATWARNING}
            "AD_LINK_SAME_AS_LINK" = ${ADLINKSAMEASLINK}
            "TITLE_LENGTH_TOO_LONG" = ${TITLELENGTHTOOLONG}
            "DESCRIPTION_LENGTH_TOO_LONG" = ${DESCRIPTIONLENGTHTOOLONG}
            "GENDER_INVALID" = ${GENDERINVALID}
            "AGE_GROUP_INVALID" = ${AGEGROUPINVALID}
            "SIZE_TYPE_INVALID" = ${SIZETYPEINVALID}
            "SIZE_SYSTEM_INVALID" = ${SIZESYSTEMINVALID}
            "LINK_FORMAT_WARNING" = ${LINKFORMATWARNING}
            "SALES_PRICE_INVALID" = ${SALESPRICEINVALID}
            "PRODUCT_CATEGORY_DEPTH_WARNING" = ${PRODUCTCATEGORYDEPTHWARNING}
            "ADWORDS_FORMAT_WARNING" = ${ADWORDSFORMATWARNING}
            "ADWORDS_SAME_AS_LINK" = ${ADWORDSSAMEASLINK}
            "DUPLICATE_HEADERS" = ${DUPLICATEHEADERS}
            "FETCH_SAME_SIGNATURE" = ${FETCHSAMESIGNATURE}
            "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG" = ${ADDITIONALIMAGELINKLENGTHTOOLONG}
            "ADDITIONAL_IMAGE_LINK_WARNING" = ${ADDITIONALIMAGELINKWARNING}
            "IMAGE_LINK_WARNING" = ${IMAGELINKWARNING}
            "SHIPPING_INVALID" = ${SHIPPINGINVALID}
            "TAX_INVALID" = ${TAXINVALID}
            "SHIPPING_WEIGHT_INVALID" = ${SHIPPINGWEIGHTINVALID}
            "EXPIRATION_DATE_INVALID" = ${EXPIRATIONDATEINVALID}
            "AVAILABILITY_DATE_INVALID" = ${AVAILABILITYDATEINVALID}
            "SALE_DATE_INVALID" = ${SALEDATEINVALID}
            "WEIGHT_UNIT_INVALID" = ${WEIGHTUNITINVALID}
            "IS_BUNDLE_INVALID" = ${ISBUNDLEINVALID}
            "UPDATED_TIME_INVALID" = ${UPDATEDTIMEINVALID}
            "CUSTOM_LABEL_LENGTH_TOO_LONG" = ${CUSTOMLABELLENGTHTOOLONG}
            "PRODUCT_TYPE_LENGTH_TOO_LONG" = ${PRODUCTTYPELENGTHTOOLONG}
            "TOO_MANY_ADDITIONAL_IMAGE_LINKS" = ${TOOMANYADDITIONALIMAGELINKS}
            "MULTIPACK_INVALID" = ${MULTIPACKINVALID}
            "INDEXED_PRODUCT_COUNT_LARGE_DELTA" = ${INDEXEDPRODUCTCOUNTLARGEDELTA}
            "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE" = ${ITEMADDITIONALIMAGEDOWNLOADFAILURE}
            "OPTIONAL_PRODUCT_CATEGORY_MISSING" = ${OPTIONALPRODUCTCATEGORYMISSING}
            "OPTIONAL_PRODUCT_CATEGORY_INVALID" = ${OPTIONALPRODUCTCATEGORYINVALID}
            "OPTIONAL_CONDITION_MISSING" = ${OPTIONALCONDITIONMISSING}
            "OPTIONAL_CONDITION_INVALID" = ${OPTIONALCONDITIONINVALID}
            "IOS_DEEP_LINK_INVALID" = ${IOSDEEPLINKINVALID}
            "ANDROID_DEEP_LINK_INVALID" = ${ANDROIDDEEPLINKINVALID}
            "UTM_SOURCE_AUTO_CORRECTED" = ${UTMSOURCEAUTOCORRECTED}
            "COUNTRY_DOES_NOT_MAP_TO_CURRENCY" = ${COUNTRYDOESNOTMAPTOCURRENCY}
            "MIN_AD_PRICE_INVALID" = ${MINADPRICEINVALID}
            "GTIN_INVALID" = ${GTININVALID}
            "INCONSISTENT_CURRENCY_VALUES" = ${INCONSISTENTCURRENCYVALUES}
            "SALES_PRICE_TOO_LOW" = ${SALESPRICETOOLOW}
            "SHIPPING_WIDTH_INVALID" = ${SHIPPINGWIDTHINVALID}
            "SHIPPING_HEIGHT_INVALID" = ${SHIPPINGHEIGHTINVALID}
            "SALES_PRICE_TOO_HIGH" = ${SALESPRICETOOHIGH}
            "MPN_INVALID" = ${MPNINVALID}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to CatalogsFeedValidationWarnings<PSCustomObject>

.DESCRIPTION

Convert from JSON to CatalogsFeedValidationWarnings<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

CatalogsFeedValidationWarnings<PSCustomObject>
#>
function ConvertFrom-JsonToCatalogsFeedValidationWarnings {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => CatalogsFeedValidationWarnings' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in CatalogsFeedValidationWarnings
        $AllProperties = ("AD_LINK_FORMAT_WARNING", "AD_LINK_SAME_AS_LINK", "TITLE_LENGTH_TOO_LONG", "DESCRIPTION_LENGTH_TOO_LONG", "GENDER_INVALID", "AGE_GROUP_INVALID", "SIZE_TYPE_INVALID", "SIZE_SYSTEM_INVALID", "LINK_FORMAT_WARNING", "SALES_PRICE_INVALID", "PRODUCT_CATEGORY_DEPTH_WARNING", "ADWORDS_FORMAT_WARNING", "ADWORDS_SAME_AS_LINK", "DUPLICATE_HEADERS", "FETCH_SAME_SIGNATURE", "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", "ADDITIONAL_IMAGE_LINK_WARNING", "IMAGE_LINK_WARNING", "SHIPPING_INVALID", "TAX_INVALID", "SHIPPING_WEIGHT_INVALID", "EXPIRATION_DATE_INVALID", "AVAILABILITY_DATE_INVALID", "SALE_DATE_INVALID", "WEIGHT_UNIT_INVALID", "IS_BUNDLE_INVALID", "UPDATED_TIME_INVALID", "CUSTOM_LABEL_LENGTH_TOO_LONG", "PRODUCT_TYPE_LENGTH_TOO_LONG", "TOO_MANY_ADDITIONAL_IMAGE_LINKS", "MULTIPACK_INVALID", "INDEXED_PRODUCT_COUNT_LARGE_DELTA", "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", "OPTIONAL_PRODUCT_CATEGORY_MISSING", "OPTIONAL_PRODUCT_CATEGORY_INVALID", "OPTIONAL_CONDITION_MISSING", "OPTIONAL_CONDITION_INVALID", "IOS_DEEP_LINK_INVALID", "ANDROID_DEEP_LINK_INVALID", "UTM_SOURCE_AUTO_CORRECTED", "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", "MIN_AD_PRICE_INVALID", "GTIN_INVALID", "INCONSISTENT_CURRENCY_VALUES", "SALES_PRICE_TOO_LOW", "SHIPPING_WIDTH_INVALID", "SHIPPING_HEIGHT_INVALID", "SALES_PRICE_TOO_HIGH", "MPN_INVALID")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "AD_LINK_FORMAT_WARNING"))) { #optional property not found
            $ADLINKFORMATWARNING = $null
        } else {
            $ADLINKFORMATWARNING = $JsonParameters.PSobject.Properties["AD_LINK_FORMAT_WARNING"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "AD_LINK_SAME_AS_LINK"))) { #optional property not found
            $ADLINKSAMEASLINK = $null
        } else {
            $ADLINKSAMEASLINK = $JsonParameters.PSobject.Properties["AD_LINK_SAME_AS_LINK"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "TITLE_LENGTH_TOO_LONG"))) { #optional property not found
            $TITLELENGTHTOOLONG = $null
        } else {
            $TITLELENGTHTOOLONG = $JsonParameters.PSobject.Properties["TITLE_LENGTH_TOO_LONG"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "DESCRIPTION_LENGTH_TOO_LONG"))) { #optional property not found
            $DESCRIPTIONLENGTHTOOLONG = $null
        } else {
            $DESCRIPTIONLENGTHTOOLONG = $JsonParameters.PSobject.Properties["DESCRIPTION_LENGTH_TOO_LONG"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "GENDER_INVALID"))) { #optional property not found
            $GENDERINVALID = $null
        } else {
            $GENDERINVALID = $JsonParameters.PSobject.Properties["GENDER_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "AGE_GROUP_INVALID"))) { #optional property not found
            $AGEGROUPINVALID = $null
        } else {
            $AGEGROUPINVALID = $JsonParameters.PSobject.Properties["AGE_GROUP_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "SIZE_TYPE_INVALID"))) { #optional property not found
            $SIZETYPEINVALID = $null
        } else {
            $SIZETYPEINVALID = $JsonParameters.PSobject.Properties["SIZE_TYPE_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "SIZE_SYSTEM_INVALID"))) { #optional property not found
            $SIZESYSTEMINVALID = $null
        } else {
            $SIZESYSTEMINVALID = $JsonParameters.PSobject.Properties["SIZE_SYSTEM_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "LINK_FORMAT_WARNING"))) { #optional property not found
            $LINKFORMATWARNING = $null
        } else {
            $LINKFORMATWARNING = $JsonParameters.PSobject.Properties["LINK_FORMAT_WARNING"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "SALES_PRICE_INVALID"))) { #optional property not found
            $SALESPRICEINVALID = $null
        } else {
            $SALESPRICEINVALID = $JsonParameters.PSobject.Properties["SALES_PRICE_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "PRODUCT_CATEGORY_DEPTH_WARNING"))) { #optional property not found
            $PRODUCTCATEGORYDEPTHWARNING = $null
        } else {
            $PRODUCTCATEGORYDEPTHWARNING = $JsonParameters.PSobject.Properties["PRODUCT_CATEGORY_DEPTH_WARNING"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ADWORDS_FORMAT_WARNING"))) { #optional property not found
            $ADWORDSFORMATWARNING = $null
        } else {
            $ADWORDSFORMATWARNING = $JsonParameters.PSobject.Properties["ADWORDS_FORMAT_WARNING"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ADWORDS_SAME_AS_LINK"))) { #optional property not found
            $ADWORDSSAMEASLINK = $null
        } else {
            $ADWORDSSAMEASLINK = $JsonParameters.PSobject.Properties["ADWORDS_SAME_AS_LINK"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "DUPLICATE_HEADERS"))) { #optional property not found
            $DUPLICATEHEADERS = $null
        } else {
            $DUPLICATEHEADERS = $JsonParameters.PSobject.Properties["DUPLICATE_HEADERS"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "FETCH_SAME_SIGNATURE"))) { #optional property not found
            $FETCHSAMESIGNATURE = $null
        } else {
            $FETCHSAMESIGNATURE = $JsonParameters.PSobject.Properties["FETCH_SAME_SIGNATURE"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG"))) { #optional property not found
            $ADDITIONALIMAGELINKLENGTHTOOLONG = $null
        } else {
            $ADDITIONALIMAGELINKLENGTHTOOLONG = $JsonParameters.PSobject.Properties["ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ADDITIONAL_IMAGE_LINK_WARNING"))) { #optional property not found
            $ADDITIONALIMAGELINKWARNING = $null
        } else {
            $ADDITIONALIMAGELINKWARNING = $JsonParameters.PSobject.Properties["ADDITIONAL_IMAGE_LINK_WARNING"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "IMAGE_LINK_WARNING"))) { #optional property not found
            $IMAGELINKWARNING = $null
        } else {
            $IMAGELINKWARNING = $JsonParameters.PSobject.Properties["IMAGE_LINK_WARNING"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "SHIPPING_INVALID"))) { #optional property not found
            $SHIPPINGINVALID = $null
        } else {
            $SHIPPINGINVALID = $JsonParameters.PSobject.Properties["SHIPPING_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "TAX_INVALID"))) { #optional property not found
            $TAXINVALID = $null
        } else {
            $TAXINVALID = $JsonParameters.PSobject.Properties["TAX_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "SHIPPING_WEIGHT_INVALID"))) { #optional property not found
            $SHIPPINGWEIGHTINVALID = $null
        } else {
            $SHIPPINGWEIGHTINVALID = $JsonParameters.PSobject.Properties["SHIPPING_WEIGHT_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "EXPIRATION_DATE_INVALID"))) { #optional property not found
            $EXPIRATIONDATEINVALID = $null
        } else {
            $EXPIRATIONDATEINVALID = $JsonParameters.PSobject.Properties["EXPIRATION_DATE_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "AVAILABILITY_DATE_INVALID"))) { #optional property not found
            $AVAILABILITYDATEINVALID = $null
        } else {
            $AVAILABILITYDATEINVALID = $JsonParameters.PSobject.Properties["AVAILABILITY_DATE_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "SALE_DATE_INVALID"))) { #optional property not found
            $SALEDATEINVALID = $null
        } else {
            $SALEDATEINVALID = $JsonParameters.PSobject.Properties["SALE_DATE_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "WEIGHT_UNIT_INVALID"))) { #optional property not found
            $WEIGHTUNITINVALID = $null
        } else {
            $WEIGHTUNITINVALID = $JsonParameters.PSobject.Properties["WEIGHT_UNIT_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "IS_BUNDLE_INVALID"))) { #optional property not found
            $ISBUNDLEINVALID = $null
        } else {
            $ISBUNDLEINVALID = $JsonParameters.PSobject.Properties["IS_BUNDLE_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "UPDATED_TIME_INVALID"))) { #optional property not found
            $UPDATEDTIMEINVALID = $null
        } else {
            $UPDATEDTIMEINVALID = $JsonParameters.PSobject.Properties["UPDATED_TIME_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "CUSTOM_LABEL_LENGTH_TOO_LONG"))) { #optional property not found
            $CUSTOMLABELLENGTHTOOLONG = $null
        } else {
            $CUSTOMLABELLENGTHTOOLONG = $JsonParameters.PSobject.Properties["CUSTOM_LABEL_LENGTH_TOO_LONG"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "PRODUCT_TYPE_LENGTH_TOO_LONG"))) { #optional property not found
            $PRODUCTTYPELENGTHTOOLONG = $null
        } else {
            $PRODUCTTYPELENGTHTOOLONG = $JsonParameters.PSobject.Properties["PRODUCT_TYPE_LENGTH_TOO_LONG"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "TOO_MANY_ADDITIONAL_IMAGE_LINKS"))) { #optional property not found
            $TOOMANYADDITIONALIMAGELINKS = $null
        } else {
            $TOOMANYADDITIONALIMAGELINKS = $JsonParameters.PSobject.Properties["TOO_MANY_ADDITIONAL_IMAGE_LINKS"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "MULTIPACK_INVALID"))) { #optional property not found
            $MULTIPACKINVALID = $null
        } else {
            $MULTIPACKINVALID = $JsonParameters.PSobject.Properties["MULTIPACK_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "INDEXED_PRODUCT_COUNT_LARGE_DELTA"))) { #optional property not found
            $INDEXEDPRODUCTCOUNTLARGEDELTA = $null
        } else {
            $INDEXEDPRODUCTCOUNTLARGEDELTA = $JsonParameters.PSobject.Properties["INDEXED_PRODUCT_COUNT_LARGE_DELTA"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE"))) { #optional property not found
            $ITEMADDITIONALIMAGEDOWNLOADFAILURE = $null
        } else {
            $ITEMADDITIONALIMAGEDOWNLOADFAILURE = $JsonParameters.PSobject.Properties["ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "OPTIONAL_PRODUCT_CATEGORY_MISSING"))) { #optional property not found
            $OPTIONALPRODUCTCATEGORYMISSING = $null
        } else {
            $OPTIONALPRODUCTCATEGORYMISSING = $JsonParameters.PSobject.Properties["OPTIONAL_PRODUCT_CATEGORY_MISSING"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "OPTIONAL_PRODUCT_CATEGORY_INVALID"))) { #optional property not found
            $OPTIONALPRODUCTCATEGORYINVALID = $null
        } else {
            $OPTIONALPRODUCTCATEGORYINVALID = $JsonParameters.PSobject.Properties["OPTIONAL_PRODUCT_CATEGORY_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "OPTIONAL_CONDITION_MISSING"))) { #optional property not found
            $OPTIONALCONDITIONMISSING = $null
        } else {
            $OPTIONALCONDITIONMISSING = $JsonParameters.PSobject.Properties["OPTIONAL_CONDITION_MISSING"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "OPTIONAL_CONDITION_INVALID"))) { #optional property not found
            $OPTIONALCONDITIONINVALID = $null
        } else {
            $OPTIONALCONDITIONINVALID = $JsonParameters.PSobject.Properties["OPTIONAL_CONDITION_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "IOS_DEEP_LINK_INVALID"))) { #optional property not found
            $IOSDEEPLINKINVALID = $null
        } else {
            $IOSDEEPLINKINVALID = $JsonParameters.PSobject.Properties["IOS_DEEP_LINK_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ANDROID_DEEP_LINK_INVALID"))) { #optional property not found
            $ANDROIDDEEPLINKINVALID = $null
        } else {
            $ANDROIDDEEPLINKINVALID = $JsonParameters.PSobject.Properties["ANDROID_DEEP_LINK_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "UTM_SOURCE_AUTO_CORRECTED"))) { #optional property not found
            $UTMSOURCEAUTOCORRECTED = $null
        } else {
            $UTMSOURCEAUTOCORRECTED = $JsonParameters.PSobject.Properties["UTM_SOURCE_AUTO_CORRECTED"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "COUNTRY_DOES_NOT_MAP_TO_CURRENCY"))) { #optional property not found
            $COUNTRYDOESNOTMAPTOCURRENCY = $null
        } else {
            $COUNTRYDOESNOTMAPTOCURRENCY = $JsonParameters.PSobject.Properties["COUNTRY_DOES_NOT_MAP_TO_CURRENCY"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "MIN_AD_PRICE_INVALID"))) { #optional property not found
            $MINADPRICEINVALID = $null
        } else {
            $MINADPRICEINVALID = $JsonParameters.PSobject.Properties["MIN_AD_PRICE_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "GTIN_INVALID"))) { #optional property not found
            $GTININVALID = $null
        } else {
            $GTININVALID = $JsonParameters.PSobject.Properties["GTIN_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "INCONSISTENT_CURRENCY_VALUES"))) { #optional property not found
            $INCONSISTENTCURRENCYVALUES = $null
        } else {
            $INCONSISTENTCURRENCYVALUES = $JsonParameters.PSobject.Properties["INCONSISTENT_CURRENCY_VALUES"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "SALES_PRICE_TOO_LOW"))) { #optional property not found
            $SALESPRICETOOLOW = $null
        } else {
            $SALESPRICETOOLOW = $JsonParameters.PSobject.Properties["SALES_PRICE_TOO_LOW"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "SHIPPING_WIDTH_INVALID"))) { #optional property not found
            $SHIPPINGWIDTHINVALID = $null
        } else {
            $SHIPPINGWIDTHINVALID = $JsonParameters.PSobject.Properties["SHIPPING_WIDTH_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "SHIPPING_HEIGHT_INVALID"))) { #optional property not found
            $SHIPPINGHEIGHTINVALID = $null
        } else {
            $SHIPPINGHEIGHTINVALID = $JsonParameters.PSobject.Properties["SHIPPING_HEIGHT_INVALID"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "SALES_PRICE_TOO_HIGH"))) { #optional property not found
            $SALESPRICETOOHIGH = $null
        } else {
            $SALESPRICETOOHIGH = $JsonParameters.PSobject.Properties["SALES_PRICE_TOO_HIGH"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "MPN_INVALID"))) { #optional property not found
            $MPNINVALID = $null
        } else {
            $MPNINVALID = $JsonParameters.PSobject.Properties["MPN_INVALID"].value
        }

        $PSO = [PSCustomObject]@{
            "AD_LINK_FORMAT_WARNING" = ${ADLINKFORMATWARNING}
            "AD_LINK_SAME_AS_LINK" = ${ADLINKSAMEASLINK}
            "TITLE_LENGTH_TOO_LONG" = ${TITLELENGTHTOOLONG}
            "DESCRIPTION_LENGTH_TOO_LONG" = ${DESCRIPTIONLENGTHTOOLONG}
            "GENDER_INVALID" = ${GENDERINVALID}
            "AGE_GROUP_INVALID" = ${AGEGROUPINVALID}
            "SIZE_TYPE_INVALID" = ${SIZETYPEINVALID}
            "SIZE_SYSTEM_INVALID" = ${SIZESYSTEMINVALID}
            "LINK_FORMAT_WARNING" = ${LINKFORMATWARNING}
            "SALES_PRICE_INVALID" = ${SALESPRICEINVALID}
            "PRODUCT_CATEGORY_DEPTH_WARNING" = ${PRODUCTCATEGORYDEPTHWARNING}
            "ADWORDS_FORMAT_WARNING" = ${ADWORDSFORMATWARNING}
            "ADWORDS_SAME_AS_LINK" = ${ADWORDSSAMEASLINK}
            "DUPLICATE_HEADERS" = ${DUPLICATEHEADERS}
            "FETCH_SAME_SIGNATURE" = ${FETCHSAMESIGNATURE}
            "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG" = ${ADDITIONALIMAGELINKLENGTHTOOLONG}
            "ADDITIONAL_IMAGE_LINK_WARNING" = ${ADDITIONALIMAGELINKWARNING}
            "IMAGE_LINK_WARNING" = ${IMAGELINKWARNING}
            "SHIPPING_INVALID" = ${SHIPPINGINVALID}
            "TAX_INVALID" = ${TAXINVALID}
            "SHIPPING_WEIGHT_INVALID" = ${SHIPPINGWEIGHTINVALID}
            "EXPIRATION_DATE_INVALID" = ${EXPIRATIONDATEINVALID}
            "AVAILABILITY_DATE_INVALID" = ${AVAILABILITYDATEINVALID}
            "SALE_DATE_INVALID" = ${SALEDATEINVALID}
            "WEIGHT_UNIT_INVALID" = ${WEIGHTUNITINVALID}
            "IS_BUNDLE_INVALID" = ${ISBUNDLEINVALID}
            "UPDATED_TIME_INVALID" = ${UPDATEDTIMEINVALID}
            "CUSTOM_LABEL_LENGTH_TOO_LONG" = ${CUSTOMLABELLENGTHTOOLONG}
            "PRODUCT_TYPE_LENGTH_TOO_LONG" = ${PRODUCTTYPELENGTHTOOLONG}
            "TOO_MANY_ADDITIONAL_IMAGE_LINKS" = ${TOOMANYADDITIONALIMAGELINKS}
            "MULTIPACK_INVALID" = ${MULTIPACKINVALID}
            "INDEXED_PRODUCT_COUNT_LARGE_DELTA" = ${INDEXEDPRODUCTCOUNTLARGEDELTA}
            "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE" = ${ITEMADDITIONALIMAGEDOWNLOADFAILURE}
            "OPTIONAL_PRODUCT_CATEGORY_MISSING" = ${OPTIONALPRODUCTCATEGORYMISSING}
            "OPTIONAL_PRODUCT_CATEGORY_INVALID" = ${OPTIONALPRODUCTCATEGORYINVALID}
            "OPTIONAL_CONDITION_MISSING" = ${OPTIONALCONDITIONMISSING}
            "OPTIONAL_CONDITION_INVALID" = ${OPTIONALCONDITIONINVALID}
            "IOS_DEEP_LINK_INVALID" = ${IOSDEEPLINKINVALID}
            "ANDROID_DEEP_LINK_INVALID" = ${ANDROIDDEEPLINKINVALID}
            "UTM_SOURCE_AUTO_CORRECTED" = ${UTMSOURCEAUTOCORRECTED}
            "COUNTRY_DOES_NOT_MAP_TO_CURRENCY" = ${COUNTRYDOESNOTMAPTOCURRENCY}
            "MIN_AD_PRICE_INVALID" = ${MINADPRICEINVALID}
            "GTIN_INVALID" = ${GTININVALID}
            "INCONSISTENT_CURRENCY_VALUES" = ${INCONSISTENTCURRENCYVALUES}
            "SALES_PRICE_TOO_LOW" = ${SALESPRICETOOLOW}
            "SHIPPING_WIDTH_INVALID" = ${SHIPPINGWIDTHINVALID}
            "SHIPPING_HEIGHT_INVALID" = ${SHIPPINGHEIGHTINVALID}
            "SALES_PRICE_TOO_HIGH" = ${SALESPRICETOOHIGH}
            "MPN_INVALID" = ${MPNINVALID}
        }

        return $PSO
    }

}
