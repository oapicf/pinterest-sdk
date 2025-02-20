/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

/*
 * OpenAPICatalogsFeedValidationWarnings
 *
 * 
 */
class OPENAPI_API OpenAPICatalogsFeedValidationWarnings : public Model
{
public:
    virtual ~OpenAPICatalogsFeedValidationWarnings() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Some items have ad links that are formatted incorrectly. */
	TOptional<int32> AdLinkFormatWarning;
	/* Some items have ad link URLs that are duplicates of the link URLs for those items. */
	TOptional<int32> AdLinkSameAsLink;
	/* The title for some items were truncated because they contain too many characters. */
	TOptional<int32> TitleLengthTooLong;
	/* The description for some items were truncated because they contain too many characters. */
	TOptional<int32> DescriptionLengthTooLong;
	/* Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
	TOptional<int32> GenderInvalid;
	/* Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
	TOptional<int32> AgeGroupInvalid;
	/* Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
	TOptional<int32> SizeTypeInvalid;
	/* Some items have size system values which are not one of the supported size systems. */
	TOptional<int32> SizeSystemInvalid;
	/* Some items have an invalid product link which contains invalid UTM tracking paramaters. */
	TOptional<int32> LinkFormatWarning;
	/* Some items have sale price values that are higher than the original price of the item. */
	TOptional<int32> SalesPriceInvalid;
	/* Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. */
	TOptional<int32> ProductCategoryDepthWarning;
	/* Some items have adwords_redirect links that are formatted incorrectly. */
	TOptional<int32> AdwordsFormatWarning;
	/* Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. */
	TOptional<int32> AdwordsSameAsLink;
	/* Your feed contains duplicate headers. */
	TOptional<int32> DuplicateHeaders;
	enum class FetchSameSignatureEnum
	{
		_1,
  	};

	static FString EnumToString(const FetchSameSignatureEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, FetchSameSignatureEnum& EnumValue);
	/* Ingestion completed early because there are no changes to your feed since the last successful update. */
	TOptional<FetchSameSignatureEnum> FetchSameSignature;
	/* Some items have additional_image_link URLs that contain too many characters, so those items will not be published. */
	TOptional<int32> AdditionalImageLinkLengthTooLong;
	/* Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. */
	TOptional<int32> AdditionalImageLinkWarning;
	/* Some items have image_link URLs that are formatted incorrectly and will not be published with those items. */
	TOptional<int32> ImageLinkWarning;
	/* Some items have shipping values that are formatted incorrectly. */
	TOptional<int32> ShippingInvalid;
	/* Some items have tax values that are formatted incorrectly. */
	TOptional<int32> TaxInvalid;
	/* Some items have invalid shipping_weight values. */
	TOptional<int32> ShippingWeightInvalid;
	/* Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. */
	TOptional<int32> ExpirationDateInvalid;
	/* Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. */
	TOptional<int32> AvailabilityDateInvalid;
	/* Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. */
	TOptional<int32> SaleDateInvalid;
	/* Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. */
	TOptional<int32> WeightUnitInvalid;
	/* Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. */
	TOptional<int32> IsBundleInvalid;
	/* Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. */
	TOptional<int32> UpdatedTimeInvalid;
	/* Some items have custom_label values that are too long, those items will be published without that custom label. */
	TOptional<int32> CustomLabelLengthTooLong;
	/* Some items have product_type values that are too long, those items will be published without that product type. */
	TOptional<int32> ProductTypeLengthTooLong;
	/* Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. */
	TOptional<int32> TooManyAdditionalImageLinks;
	/* Some items have invalid multipack values. */
	TOptional<int32> MultipackInvalid;
	/* The product count has increased or decreased significantly compared to the last successful ingestion. */
	TOptional<int32> IndexedProductCountLargeDelta;
	/* Some items include additional_image_links that can't be found. */
	TOptional<int32> ItemAdditionalImageDownloadFailure;
	/* Some items are missing a google_product_category. */
	TOptional<int32> OptionalProductCategoryMissing;
	/* Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. */
	TOptional<int32> OptionalProductCategoryInvalid;
	/* Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. */
	TOptional<int32> OptionalConditionMissing;
	/* Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
	TOptional<int32> OptionalConditionInvalid;
	/* Some items include invalid ios_deep_link values. */
	TOptional<int32> IosDeepLinkInvalid;
	/* Some items include invalid android_deep_link. */
	TOptional<int32> AndroidDeepLinkInvalid;
	/* Some items include utm_source values that are formatted incorrectly and have been automatically corrected. */
	TOptional<int32> UtmSourceAutoCorrected;
	/* Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped. */
	TOptional<int32> CountryDoesNotMapToCurrency;
	/* Some items include min_ad_price values that are formatted incorrectly. */
	TOptional<int32> MinAdPriceInvalid;
	/* Some items include incorrectly formatted GTINs. */
	TOptional<int32> GtinInvalid;
	/* Some items include inconsistent currencies in price fields. */
	TOptional<int32> InconsistentCurrencyValues;
	/* Some items include sales price that is much lower than the list price. */
	TOptional<int32> SalesPriceTooLow;
	/* Some items include incorrectly formatted shipping_width. */
	TOptional<int32> ShippingWidthInvalid;
	/* Some items include incorrectly formatted shipping_height. */
	TOptional<int32> ShippingHeightInvalid;
	/* Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. */
	TOptional<int32> SalesPriceTooHigh;
	/* Some items include incorrectly formatted MPNs. */
	TOptional<int32> MpnInvalid;
};

}
