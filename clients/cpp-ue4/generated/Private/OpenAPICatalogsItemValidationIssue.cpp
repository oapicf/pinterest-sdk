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

#include "OpenAPICatalogsItemValidationIssue.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPICatalogsItemValidationIssue::Values& Value)
{
	switch (Value)
	{
	case OpenAPICatalogsItemValidationIssue::Values::AdLinkFormatWarning:
		return TEXT("AD_LINK_FORMAT_WARNING");
	case OpenAPICatalogsItemValidationIssue::Values::AdLinkSameAsLink:
		return TEXT("AD_LINK_SAME_AS_LINK");
	case OpenAPICatalogsItemValidationIssue::Values::AdditionalImageLinkLengthTooLong:
		return TEXT("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG");
	case OpenAPICatalogsItemValidationIssue::Values::AdditionalImageLinkWarning:
		return TEXT("ADDITIONAL_IMAGE_LINK_WARNING");
	case OpenAPICatalogsItemValidationIssue::Values::AdultInvalid:
		return TEXT("ADULT_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::AdwordsFormatInvalid:
		return TEXT("ADWORDS_FORMAT_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::AdwordsFormatWarning:
		return TEXT("ADWORDS_FORMAT_WARNING");
	case OpenAPICatalogsItemValidationIssue::Values::AdwordsSameAsLink:
		return TEXT("ADWORDS_SAME_AS_LINK");
	case OpenAPICatalogsItemValidationIssue::Values::AgeGroupInvalid:
		return TEXT("AGE_GROUP_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::AndroidDeepLinkInvalid:
		return TEXT("ANDROID_DEEP_LINK_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::AvailabilityDateInvalid:
		return TEXT("AVAILABILITY_DATE_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::AvailabilityInvalid:
		return TEXT("AVAILABILITY_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::BlocklistedImageSignature:
		return TEXT("BLOCKLISTED_IMAGE_SIGNATURE");
	case OpenAPICatalogsItemValidationIssue::Values::CountryDoesNotMapToCurrency:
		return TEXT("COUNTRY_DOES_NOT_MAP_TO_CURRENCY");
	case OpenAPICatalogsItemValidationIssue::Values::CustomLabelLengthTooLong:
		return TEXT("CUSTOM_LABEL_LENGTH_TOO_LONG");
	case OpenAPICatalogsItemValidationIssue::Values::DescriptionLengthTooLong:
		return TEXT("DESCRIPTION_LENGTH_TOO_LONG");
	case OpenAPICatalogsItemValidationIssue::Values::DescriptionMissing:
		return TEXT("DESCRIPTION_MISSING");
	case OpenAPICatalogsItemValidationIssue::Values::DuplicateProducts:
		return TEXT("DUPLICATE_PRODUCTS");
	case OpenAPICatalogsItemValidationIssue::Values::ExpirationDateInvalid:
		return TEXT("EXPIRATION_DATE_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::GenderInvalid:
		return TEXT("GENDER_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::GtinInvalid:
		return TEXT("GTIN_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::ImageLinkInvalid:
		return TEXT("IMAGE_LINK_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::ImageLinkLengthTooLong:
		return TEXT("IMAGE_LINK_LENGTH_TOO_LONG");
	case OpenAPICatalogsItemValidationIssue::Values::ImageLinkMissing:
		return TEXT("IMAGE_LINK_MISSING");
	case OpenAPICatalogsItemValidationIssue::Values::ImageLinkWarning:
		return TEXT("IMAGE_LINK_WARNING");
	case OpenAPICatalogsItemValidationIssue::Values::InvalidDomain:
		return TEXT("INVALID_DOMAIN");
	case OpenAPICatalogsItemValidationIssue::Values::IosDeepLinkInvalid:
		return TEXT("IOS_DEEP_LINK_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::IsBundleInvalid:
		return TEXT("IS_BUNDLE_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::ItemAdditionalImageDownloadFailure:
		return TEXT("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE");
	case OpenAPICatalogsItemValidationIssue::Values::ItemMainImageDownloadFailure:
		return TEXT("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE");
	case OpenAPICatalogsItemValidationIssue::Values::ItemidMissing:
		return TEXT("ITEMID_MISSING");
	case OpenAPICatalogsItemValidationIssue::Values::LinkFormatInvalid:
		return TEXT("LINK_FORMAT_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::LinkFormatWarning:
		return TEXT("LINK_FORMAT_WARNING");
	case OpenAPICatalogsItemValidationIssue::Values::LinkLengthTooLong:
		return TEXT("LINK_LENGTH_TOO_LONG");
	case OpenAPICatalogsItemValidationIssue::Values::ListPriceInvalid:
		return TEXT("LIST_PRICE_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::MaxItemsPerItemGroupExceeded:
		return TEXT("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED");
	case OpenAPICatalogsItemValidationIssue::Values::MinAdPriceInvalid:
		return TEXT("MIN_AD_PRICE_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::MpnInvalid:
		return TEXT("MPN_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::MultipackInvalid:
		return TEXT("MULTIPACK_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::OptionalConditionInvalid:
		return TEXT("OPTIONAL_CONDITION_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::OptionalConditionMissing:
		return TEXT("OPTIONAL_CONDITION_MISSING");
	case OpenAPICatalogsItemValidationIssue::Values::OptionalProductCategoryInvalid:
		return TEXT("OPTIONAL_PRODUCT_CATEGORY_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::OptionalProductCategoryMissing:
		return TEXT("OPTIONAL_PRODUCT_CATEGORY_MISSING");
	case OpenAPICatalogsItemValidationIssue::Values::ParseLineError:
		return TEXT("PARSE_LINE_ERROR");
	case OpenAPICatalogsItemValidationIssue::Values::PinjoinContentUnsafe:
		return TEXT("PINJOIN_CONTENT_UNSAFE");
	case OpenAPICatalogsItemValidationIssue::Values::PriceCannotBeDetermined:
		return TEXT("PRICE_CANNOT_BE_DETERMINED");
	case OpenAPICatalogsItemValidationIssue::Values::PriceMissing:
		return TEXT("PRICE_MISSING");
	case OpenAPICatalogsItemValidationIssue::Values::ProductCategoryDepthWarning:
		return TEXT("PRODUCT_CATEGORY_DEPTH_WARNING");
	case OpenAPICatalogsItemValidationIssue::Values::ProductLinkMissing:
		return TEXT("PRODUCT_LINK_MISSING");
	case OpenAPICatalogsItemValidationIssue::Values::ProductPriceInvalid:
		return TEXT("PRODUCT_PRICE_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::ProductTypeLengthTooLong:
		return TEXT("PRODUCT_TYPE_LENGTH_TOO_LONG");
	case OpenAPICatalogsItemValidationIssue::Values::SaleDateInvalid:
		return TEXT("SALE_DATE_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::SalesPriceInvalid:
		return TEXT("SALES_PRICE_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::SalesPriceTooHigh:
		return TEXT("SALES_PRICE_TOO_HIGH");
	case OpenAPICatalogsItemValidationIssue::Values::SalesPriceTooLow:
		return TEXT("SALES_PRICE_TOO_LOW");
	case OpenAPICatalogsItemValidationIssue::Values::ShippingInvalid:
		return TEXT("SHIPPING_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::ShippingHeightInvalid:
		return TEXT("SHIPPING_HEIGHT_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::ShippingWeightInvalid:
		return TEXT("SHIPPING_WEIGHT_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::ShippingWidthInvalid:
		return TEXT("SHIPPING_WIDTH_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::SizeSystemInvalid:
		return TEXT("SIZE_SYSTEM_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::SizeTypeInvalid:
		return TEXT("SIZE_TYPE_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::TaxInvalid:
		return TEXT("TAX_INVALID");
	case OpenAPICatalogsItemValidationIssue::Values::TitleLengthTooLong:
		return TEXT("TITLE_LENGTH_TOO_LONG");
	case OpenAPICatalogsItemValidationIssue::Values::TitleMissing:
		return TEXT("TITLE_MISSING");
	case OpenAPICatalogsItemValidationIssue::Values::TooManyAdditionalImageLinks:
		return TEXT("TOO_MANY_ADDITIONAL_IMAGE_LINKS");
	case OpenAPICatalogsItemValidationIssue::Values::UtmSourceAutoCorrected:
		return TEXT("UTM_SOURCE_AUTO_CORRECTED");
	case OpenAPICatalogsItemValidationIssue::Values::WeightUnitInvalid:
		return TEXT("WEIGHT_UNIT_INVALID");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPICatalogsItemValidationIssue::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPICatalogsItemValidationIssue::EnumToString(const OpenAPICatalogsItemValidationIssue::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPICatalogsItemValidationIssue::Values& Value)
{
	static TMap<FString, OpenAPICatalogsItemValidationIssue::Values> StringToEnum = { 
		{ TEXT("AD_LINK_FORMAT_WARNING"), OpenAPICatalogsItemValidationIssue::Values::AdLinkFormatWarning },
		{ TEXT("AD_LINK_SAME_AS_LINK"), OpenAPICatalogsItemValidationIssue::Values::AdLinkSameAsLink },
		{ TEXT("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG"), OpenAPICatalogsItemValidationIssue::Values::AdditionalImageLinkLengthTooLong },
		{ TEXT("ADDITIONAL_IMAGE_LINK_WARNING"), OpenAPICatalogsItemValidationIssue::Values::AdditionalImageLinkWarning },
		{ TEXT("ADULT_INVALID"), OpenAPICatalogsItemValidationIssue::Values::AdultInvalid },
		{ TEXT("ADWORDS_FORMAT_INVALID"), OpenAPICatalogsItemValidationIssue::Values::AdwordsFormatInvalid },
		{ TEXT("ADWORDS_FORMAT_WARNING"), OpenAPICatalogsItemValidationIssue::Values::AdwordsFormatWarning },
		{ TEXT("ADWORDS_SAME_AS_LINK"), OpenAPICatalogsItemValidationIssue::Values::AdwordsSameAsLink },
		{ TEXT("AGE_GROUP_INVALID"), OpenAPICatalogsItemValidationIssue::Values::AgeGroupInvalid },
		{ TEXT("ANDROID_DEEP_LINK_INVALID"), OpenAPICatalogsItemValidationIssue::Values::AndroidDeepLinkInvalid },
		{ TEXT("AVAILABILITY_DATE_INVALID"), OpenAPICatalogsItemValidationIssue::Values::AvailabilityDateInvalid },
		{ TEXT("AVAILABILITY_INVALID"), OpenAPICatalogsItemValidationIssue::Values::AvailabilityInvalid },
		{ TEXT("BLOCKLISTED_IMAGE_SIGNATURE"), OpenAPICatalogsItemValidationIssue::Values::BlocklistedImageSignature },
		{ TEXT("COUNTRY_DOES_NOT_MAP_TO_CURRENCY"), OpenAPICatalogsItemValidationIssue::Values::CountryDoesNotMapToCurrency },
		{ TEXT("CUSTOM_LABEL_LENGTH_TOO_LONG"), OpenAPICatalogsItemValidationIssue::Values::CustomLabelLengthTooLong },
		{ TEXT("DESCRIPTION_LENGTH_TOO_LONG"), OpenAPICatalogsItemValidationIssue::Values::DescriptionLengthTooLong },
		{ TEXT("DESCRIPTION_MISSING"), OpenAPICatalogsItemValidationIssue::Values::DescriptionMissing },
		{ TEXT("DUPLICATE_PRODUCTS"), OpenAPICatalogsItemValidationIssue::Values::DuplicateProducts },
		{ TEXT("EXPIRATION_DATE_INVALID"), OpenAPICatalogsItemValidationIssue::Values::ExpirationDateInvalid },
		{ TEXT("GENDER_INVALID"), OpenAPICatalogsItemValidationIssue::Values::GenderInvalid },
		{ TEXT("GTIN_INVALID"), OpenAPICatalogsItemValidationIssue::Values::GtinInvalid },
		{ TEXT("IMAGE_LINK_INVALID"), OpenAPICatalogsItemValidationIssue::Values::ImageLinkInvalid },
		{ TEXT("IMAGE_LINK_LENGTH_TOO_LONG"), OpenAPICatalogsItemValidationIssue::Values::ImageLinkLengthTooLong },
		{ TEXT("IMAGE_LINK_MISSING"), OpenAPICatalogsItemValidationIssue::Values::ImageLinkMissing },
		{ TEXT("IMAGE_LINK_WARNING"), OpenAPICatalogsItemValidationIssue::Values::ImageLinkWarning },
		{ TEXT("INVALID_DOMAIN"), OpenAPICatalogsItemValidationIssue::Values::InvalidDomain },
		{ TEXT("IOS_DEEP_LINK_INVALID"), OpenAPICatalogsItemValidationIssue::Values::IosDeepLinkInvalid },
		{ TEXT("IS_BUNDLE_INVALID"), OpenAPICatalogsItemValidationIssue::Values::IsBundleInvalid },
		{ TEXT("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE"), OpenAPICatalogsItemValidationIssue::Values::ItemAdditionalImageDownloadFailure },
		{ TEXT("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE"), OpenAPICatalogsItemValidationIssue::Values::ItemMainImageDownloadFailure },
		{ TEXT("ITEMID_MISSING"), OpenAPICatalogsItemValidationIssue::Values::ItemidMissing },
		{ TEXT("LINK_FORMAT_INVALID"), OpenAPICatalogsItemValidationIssue::Values::LinkFormatInvalid },
		{ TEXT("LINK_FORMAT_WARNING"), OpenAPICatalogsItemValidationIssue::Values::LinkFormatWarning },
		{ TEXT("LINK_LENGTH_TOO_LONG"), OpenAPICatalogsItemValidationIssue::Values::LinkLengthTooLong },
		{ TEXT("LIST_PRICE_INVALID"), OpenAPICatalogsItemValidationIssue::Values::ListPriceInvalid },
		{ TEXT("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"), OpenAPICatalogsItemValidationIssue::Values::MaxItemsPerItemGroupExceeded },
		{ TEXT("MIN_AD_PRICE_INVALID"), OpenAPICatalogsItemValidationIssue::Values::MinAdPriceInvalid },
		{ TEXT("MPN_INVALID"), OpenAPICatalogsItemValidationIssue::Values::MpnInvalid },
		{ TEXT("MULTIPACK_INVALID"), OpenAPICatalogsItemValidationIssue::Values::MultipackInvalid },
		{ TEXT("OPTIONAL_CONDITION_INVALID"), OpenAPICatalogsItemValidationIssue::Values::OptionalConditionInvalid },
		{ TEXT("OPTIONAL_CONDITION_MISSING"), OpenAPICatalogsItemValidationIssue::Values::OptionalConditionMissing },
		{ TEXT("OPTIONAL_PRODUCT_CATEGORY_INVALID"), OpenAPICatalogsItemValidationIssue::Values::OptionalProductCategoryInvalid },
		{ TEXT("OPTIONAL_PRODUCT_CATEGORY_MISSING"), OpenAPICatalogsItemValidationIssue::Values::OptionalProductCategoryMissing },
		{ TEXT("PARSE_LINE_ERROR"), OpenAPICatalogsItemValidationIssue::Values::ParseLineError },
		{ TEXT("PINJOIN_CONTENT_UNSAFE"), OpenAPICatalogsItemValidationIssue::Values::PinjoinContentUnsafe },
		{ TEXT("PRICE_CANNOT_BE_DETERMINED"), OpenAPICatalogsItemValidationIssue::Values::PriceCannotBeDetermined },
		{ TEXT("PRICE_MISSING"), OpenAPICatalogsItemValidationIssue::Values::PriceMissing },
		{ TEXT("PRODUCT_CATEGORY_DEPTH_WARNING"), OpenAPICatalogsItemValidationIssue::Values::ProductCategoryDepthWarning },
		{ TEXT("PRODUCT_LINK_MISSING"), OpenAPICatalogsItemValidationIssue::Values::ProductLinkMissing },
		{ TEXT("PRODUCT_PRICE_INVALID"), OpenAPICatalogsItemValidationIssue::Values::ProductPriceInvalid },
		{ TEXT("PRODUCT_TYPE_LENGTH_TOO_LONG"), OpenAPICatalogsItemValidationIssue::Values::ProductTypeLengthTooLong },
		{ TEXT("SALE_DATE_INVALID"), OpenAPICatalogsItemValidationIssue::Values::SaleDateInvalid },
		{ TEXT("SALES_PRICE_INVALID"), OpenAPICatalogsItemValidationIssue::Values::SalesPriceInvalid },
		{ TEXT("SALES_PRICE_TOO_HIGH"), OpenAPICatalogsItemValidationIssue::Values::SalesPriceTooHigh },
		{ TEXT("SALES_PRICE_TOO_LOW"), OpenAPICatalogsItemValidationIssue::Values::SalesPriceTooLow },
		{ TEXT("SHIPPING_INVALID"), OpenAPICatalogsItemValidationIssue::Values::ShippingInvalid },
		{ TEXT("SHIPPING_HEIGHT_INVALID"), OpenAPICatalogsItemValidationIssue::Values::ShippingHeightInvalid },
		{ TEXT("SHIPPING_WEIGHT_INVALID"), OpenAPICatalogsItemValidationIssue::Values::ShippingWeightInvalid },
		{ TEXT("SHIPPING_WIDTH_INVALID"), OpenAPICatalogsItemValidationIssue::Values::ShippingWidthInvalid },
		{ TEXT("SIZE_SYSTEM_INVALID"), OpenAPICatalogsItemValidationIssue::Values::SizeSystemInvalid },
		{ TEXT("SIZE_TYPE_INVALID"), OpenAPICatalogsItemValidationIssue::Values::SizeTypeInvalid },
		{ TEXT("TAX_INVALID"), OpenAPICatalogsItemValidationIssue::Values::TaxInvalid },
		{ TEXT("TITLE_LENGTH_TOO_LONG"), OpenAPICatalogsItemValidationIssue::Values::TitleLengthTooLong },
		{ TEXT("TITLE_MISSING"), OpenAPICatalogsItemValidationIssue::Values::TitleMissing },
		{ TEXT("TOO_MANY_ADDITIONAL_IMAGE_LINKS"), OpenAPICatalogsItemValidationIssue::Values::TooManyAdditionalImageLinks },
		{ TEXT("UTM_SOURCE_AUTO_CORRECTED"), OpenAPICatalogsItemValidationIssue::Values::UtmSourceAutoCorrected },
		{ TEXT("WEIGHT_UNIT_INVALID"), OpenAPICatalogsItemValidationIssue::Values::WeightUnitInvalid }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPICatalogsItemValidationIssue::EnumFromString(const FString& EnumAsString, OpenAPICatalogsItemValidationIssue::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPICatalogsItemValidationIssue::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPICatalogsItemValidationIssue::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPICatalogsItemValidationIssue::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPICatalogsItemValidationIssue::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
