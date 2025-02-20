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

#include "OpenAPINullableCatalogsItemFieldType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPINullableCatalogsItemFieldType::Values& Value)
{
	switch (Value)
	{
	case OpenAPINullableCatalogsItemFieldType::Values::ItemId:
		return TEXT("ITEM_ID");
	case OpenAPINullableCatalogsItemFieldType::Values::ItemGroupId:
		return TEXT("ITEM_GROUP_ID");
	case OpenAPINullableCatalogsItemFieldType::Values::Title:
		return TEXT("TITLE");
	case OpenAPINullableCatalogsItemFieldType::Values::Description:
		return TEXT("DESCRIPTION");
	case OpenAPINullableCatalogsItemFieldType::Values::ItemLink:
		return TEXT("ITEM_LINK");
	case OpenAPINullableCatalogsItemFieldType::Values::OrganicLink:
		return TEXT("ORGANIC_LINK");
	case OpenAPINullableCatalogsItemFieldType::Values::ImageLink:
		return TEXT("IMAGE_LINK");
	case OpenAPINullableCatalogsItemFieldType::Values::AdwordsRedirectLink:
		return TEXT("ADWORDS_REDIRECT_LINK");
	case OpenAPINullableCatalogsItemFieldType::Values::AdLink:
		return TEXT("AD_LINK");
	case OpenAPINullableCatalogsItemFieldType::Values::Size:
		return TEXT("SIZE");
	case OpenAPINullableCatalogsItemFieldType::Values::GoogleProductCategory:
		return TEXT("GOOGLE_PRODUCT_CATEGORY");
	case OpenAPINullableCatalogsItemFieldType::Values::ProductCategory:
		return TEXT("PRODUCT_CATEGORY");
	case OpenAPINullableCatalogsItemFieldType::Values::Condition:
		return TEXT("CONDITION");
	case OpenAPINullableCatalogsItemFieldType::Values::Availability:
		return TEXT("AVAILABILITY");
	case OpenAPINullableCatalogsItemFieldType::Values::Gender:
		return TEXT("GENDER");
	case OpenAPINullableCatalogsItemFieldType::Values::AgeGroup:
		return TEXT("AGE_GROUP");
	case OpenAPINullableCatalogsItemFieldType::Values::SizeType:
		return TEXT("SIZE_TYPE");
	case OpenAPINullableCatalogsItemFieldType::Values::SizeSystem:
		return TEXT("SIZE_SYSTEM");
	case OpenAPINullableCatalogsItemFieldType::Values::Adult:
		return TEXT("ADULT");
	case OpenAPINullableCatalogsItemFieldType::Values::Shipping:
		return TEXT("SHIPPING");
	case OpenAPINullableCatalogsItemFieldType::Values::ShippingWeight:
		return TEXT("SHIPPING_WEIGHT");
	case OpenAPINullableCatalogsItemFieldType::Values::Tax:
		return TEXT("TAX");
	case OpenAPINullableCatalogsItemFieldType::Values::Multipack:
		return TEXT("MULTIPACK");
	case OpenAPINullableCatalogsItemFieldType::Values::AdditionalImageLink:
		return TEXT("ADDITIONAL_IMAGE_LINK");
	case OpenAPINullableCatalogsItemFieldType::Values::Price:
		return TEXT("PRICE");
	case OpenAPINullableCatalogsItemFieldType::Values::SalePrice:
		return TEXT("SALE_PRICE");
	case OpenAPINullableCatalogsItemFieldType::Values::IsBundle:
		return TEXT("IS_BUNDLE");
	case OpenAPINullableCatalogsItemFieldType::Values::ExpirationDate:
		return TEXT("EXPIRATION_DATE");
	case OpenAPINullableCatalogsItemFieldType::Values::SalePriceEffectiveDate:
		return TEXT("SALE_PRICE_EFFECTIVE_DATE");
	case OpenAPINullableCatalogsItemFieldType::Values::AvailabilityDate:
		return TEXT("AVAILABILITY_DATE");
	case OpenAPINullableCatalogsItemFieldType::Values::WeightUnit:
		return TEXT("WEIGHT_UNIT");
	case OpenAPINullableCatalogsItemFieldType::Values::ProductType:
		return TEXT("PRODUCT_TYPE");
	case OpenAPINullableCatalogsItemFieldType::Values::CUSTOMLABEL0:
		return TEXT("CUSTOM_LABEL_0");
	case OpenAPINullableCatalogsItemFieldType::Values::CUSTOMLABEL1:
		return TEXT("CUSTOM_LABEL_1");
	case OpenAPINullableCatalogsItemFieldType::Values::CUSTOMLABEL2:
		return TEXT("CUSTOM_LABEL_2");
	case OpenAPINullableCatalogsItemFieldType::Values::CUSTOMLABEL3:
		return TEXT("CUSTOM_LABEL_3");
	case OpenAPINullableCatalogsItemFieldType::Values::CUSTOMLABEL4:
		return TEXT("CUSTOM_LABEL_4");
	case OpenAPINullableCatalogsItemFieldType::Values::Material:
		return TEXT("MATERIAL");
	case OpenAPINullableCatalogsItemFieldType::Values::Pattern:
		return TEXT("PATTERN");
	case OpenAPINullableCatalogsItemFieldType::Values::Color:
		return TEXT("COLOR");
	case OpenAPINullableCatalogsItemFieldType::Values::Brand:
		return TEXT("BRAND");
	case OpenAPINullableCatalogsItemFieldType::Values::Gtin:
		return TEXT("GTIN");
	case OpenAPINullableCatalogsItemFieldType::Values::Mpn:
		return TEXT("MPN");
	case OpenAPINullableCatalogsItemFieldType::Values::IosDeepLink:
		return TEXT("IOS_DEEP_LINK");
	case OpenAPINullableCatalogsItemFieldType::Values::AndroidDeepLink:
		return TEXT("ANDROID_DEEP_LINK");
	case OpenAPINullableCatalogsItemFieldType::Values::FreeShippingLabel:
		return TEXT("FREE_SHIPPING_LABEL");
	case OpenAPINullableCatalogsItemFieldType::Values::FreeShippingLimit:
		return TEXT("FREE_SHIPPING_LIMIT");
	case OpenAPINullableCatalogsItemFieldType::Values::AvgReviewRating:
		return TEXT("AVG_REVIEW_RATING");
	case OpenAPINullableCatalogsItemFieldType::Values::NumRatings:
		return TEXT("NUM_RATINGS");
	case OpenAPINullableCatalogsItemFieldType::Values::NumReviews:
		return TEXT("NUM_REVIEWS");
	case OpenAPINullableCatalogsItemFieldType::Values::AltText:
		return TEXT("ALT_TEXT");
	case OpenAPINullableCatalogsItemFieldType::Values::VariantNames:
		return TEXT("VARIANT_NAMES");
	case OpenAPINullableCatalogsItemFieldType::Values::VariantValues:
		return TEXT("VARIANT_VALUES");
	case OpenAPINullableCatalogsItemFieldType::Values::MinAdPrice:
		return TEXT("MIN_AD_PRICE");
	case OpenAPINullableCatalogsItemFieldType::Values::ShippingWidth:
		return TEXT("SHIPPING_WIDTH");
	case OpenAPINullableCatalogsItemFieldType::Values::ShippingHeight:
		return TEXT("SHIPPING_HEIGHT");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPINullableCatalogsItemFieldType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPINullableCatalogsItemFieldType::EnumToString(const OpenAPINullableCatalogsItemFieldType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPINullableCatalogsItemFieldType::Values& Value)
{
	static TMap<FString, OpenAPINullableCatalogsItemFieldType::Values> StringToEnum = { 
		{ TEXT("ITEM_ID"), OpenAPINullableCatalogsItemFieldType::Values::ItemId },
		{ TEXT("ITEM_GROUP_ID"), OpenAPINullableCatalogsItemFieldType::Values::ItemGroupId },
		{ TEXT("TITLE"), OpenAPINullableCatalogsItemFieldType::Values::Title },
		{ TEXT("DESCRIPTION"), OpenAPINullableCatalogsItemFieldType::Values::Description },
		{ TEXT("ITEM_LINK"), OpenAPINullableCatalogsItemFieldType::Values::ItemLink },
		{ TEXT("ORGANIC_LINK"), OpenAPINullableCatalogsItemFieldType::Values::OrganicLink },
		{ TEXT("IMAGE_LINK"), OpenAPINullableCatalogsItemFieldType::Values::ImageLink },
		{ TEXT("ADWORDS_REDIRECT_LINK"), OpenAPINullableCatalogsItemFieldType::Values::AdwordsRedirectLink },
		{ TEXT("AD_LINK"), OpenAPINullableCatalogsItemFieldType::Values::AdLink },
		{ TEXT("SIZE"), OpenAPINullableCatalogsItemFieldType::Values::Size },
		{ TEXT("GOOGLE_PRODUCT_CATEGORY"), OpenAPINullableCatalogsItemFieldType::Values::GoogleProductCategory },
		{ TEXT("PRODUCT_CATEGORY"), OpenAPINullableCatalogsItemFieldType::Values::ProductCategory },
		{ TEXT("CONDITION"), OpenAPINullableCatalogsItemFieldType::Values::Condition },
		{ TEXT("AVAILABILITY"), OpenAPINullableCatalogsItemFieldType::Values::Availability },
		{ TEXT("GENDER"), OpenAPINullableCatalogsItemFieldType::Values::Gender },
		{ TEXT("AGE_GROUP"), OpenAPINullableCatalogsItemFieldType::Values::AgeGroup },
		{ TEXT("SIZE_TYPE"), OpenAPINullableCatalogsItemFieldType::Values::SizeType },
		{ TEXT("SIZE_SYSTEM"), OpenAPINullableCatalogsItemFieldType::Values::SizeSystem },
		{ TEXT("ADULT"), OpenAPINullableCatalogsItemFieldType::Values::Adult },
		{ TEXT("SHIPPING"), OpenAPINullableCatalogsItemFieldType::Values::Shipping },
		{ TEXT("SHIPPING_WEIGHT"), OpenAPINullableCatalogsItemFieldType::Values::ShippingWeight },
		{ TEXT("TAX"), OpenAPINullableCatalogsItemFieldType::Values::Tax },
		{ TEXT("MULTIPACK"), OpenAPINullableCatalogsItemFieldType::Values::Multipack },
		{ TEXT("ADDITIONAL_IMAGE_LINK"), OpenAPINullableCatalogsItemFieldType::Values::AdditionalImageLink },
		{ TEXT("PRICE"), OpenAPINullableCatalogsItemFieldType::Values::Price },
		{ TEXT("SALE_PRICE"), OpenAPINullableCatalogsItemFieldType::Values::SalePrice },
		{ TEXT("IS_BUNDLE"), OpenAPINullableCatalogsItemFieldType::Values::IsBundle },
		{ TEXT("EXPIRATION_DATE"), OpenAPINullableCatalogsItemFieldType::Values::ExpirationDate },
		{ TEXT("SALE_PRICE_EFFECTIVE_DATE"), OpenAPINullableCatalogsItemFieldType::Values::SalePriceEffectiveDate },
		{ TEXT("AVAILABILITY_DATE"), OpenAPINullableCatalogsItemFieldType::Values::AvailabilityDate },
		{ TEXT("WEIGHT_UNIT"), OpenAPINullableCatalogsItemFieldType::Values::WeightUnit },
		{ TEXT("PRODUCT_TYPE"), OpenAPINullableCatalogsItemFieldType::Values::ProductType },
		{ TEXT("CUSTOM_LABEL_0"), OpenAPINullableCatalogsItemFieldType::Values::CUSTOMLABEL0 },
		{ TEXT("CUSTOM_LABEL_1"), OpenAPINullableCatalogsItemFieldType::Values::CUSTOMLABEL1 },
		{ TEXT("CUSTOM_LABEL_2"), OpenAPINullableCatalogsItemFieldType::Values::CUSTOMLABEL2 },
		{ TEXT("CUSTOM_LABEL_3"), OpenAPINullableCatalogsItemFieldType::Values::CUSTOMLABEL3 },
		{ TEXT("CUSTOM_LABEL_4"), OpenAPINullableCatalogsItemFieldType::Values::CUSTOMLABEL4 },
		{ TEXT("MATERIAL"), OpenAPINullableCatalogsItemFieldType::Values::Material },
		{ TEXT("PATTERN"), OpenAPINullableCatalogsItemFieldType::Values::Pattern },
		{ TEXT("COLOR"), OpenAPINullableCatalogsItemFieldType::Values::Color },
		{ TEXT("BRAND"), OpenAPINullableCatalogsItemFieldType::Values::Brand },
		{ TEXT("GTIN"), OpenAPINullableCatalogsItemFieldType::Values::Gtin },
		{ TEXT("MPN"), OpenAPINullableCatalogsItemFieldType::Values::Mpn },
		{ TEXT("IOS_DEEP_LINK"), OpenAPINullableCatalogsItemFieldType::Values::IosDeepLink },
		{ TEXT("ANDROID_DEEP_LINK"), OpenAPINullableCatalogsItemFieldType::Values::AndroidDeepLink },
		{ TEXT("FREE_SHIPPING_LABEL"), OpenAPINullableCatalogsItemFieldType::Values::FreeShippingLabel },
		{ TEXT("FREE_SHIPPING_LIMIT"), OpenAPINullableCatalogsItemFieldType::Values::FreeShippingLimit },
		{ TEXT("AVG_REVIEW_RATING"), OpenAPINullableCatalogsItemFieldType::Values::AvgReviewRating },
		{ TEXT("NUM_RATINGS"), OpenAPINullableCatalogsItemFieldType::Values::NumRatings },
		{ TEXT("NUM_REVIEWS"), OpenAPINullableCatalogsItemFieldType::Values::NumReviews },
		{ TEXT("ALT_TEXT"), OpenAPINullableCatalogsItemFieldType::Values::AltText },
		{ TEXT("VARIANT_NAMES"), OpenAPINullableCatalogsItemFieldType::Values::VariantNames },
		{ TEXT("VARIANT_VALUES"), OpenAPINullableCatalogsItemFieldType::Values::VariantValues },
		{ TEXT("MIN_AD_PRICE"), OpenAPINullableCatalogsItemFieldType::Values::MinAdPrice },
		{ TEXT("SHIPPING_WIDTH"), OpenAPINullableCatalogsItemFieldType::Values::ShippingWidth },
		{ TEXT("SHIPPING_HEIGHT"), OpenAPINullableCatalogsItemFieldType::Values::ShippingHeight }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPINullableCatalogsItemFieldType::EnumFromString(const FString& EnumAsString, OpenAPINullableCatalogsItemFieldType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPINullableCatalogsItemFieldType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPINullableCatalogsItemFieldType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPINullableCatalogsItemFieldType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPINullableCatalogsItemFieldType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
