/*
 * CatalogsFeedValidationWarnings.h
 *
 * 
 */

#ifndef _CatalogsFeedValidationWarnings_H_
#define _CatalogsFeedValidationWarnings_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedValidationWarnings : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedValidationWarnings();
	CatalogsFeedValidationWarnings(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedValidationWarnings();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getTitleLengthTooLong();

	/*! \brief Set 
	 */
	void setTitleLengthTooLong(int  title_length_too_long);
	/*! \brief Get 
	 */
	int getDescriptionLengthTooLong();

	/*! \brief Set 
	 */
	void setDescriptionLengthTooLong(int  description_length_too_long);
	/*! \brief Get 
	 */
	int getGenderInvalid();

	/*! \brief Set 
	 */
	void setGenderInvalid(int  gender_invalid);
	/*! \brief Get 
	 */
	int getAgeGroupInvalid();

	/*! \brief Set 
	 */
	void setAgeGroupInvalid(int  age_group_invalid);
	/*! \brief Get 
	 */
	int getSizeTypeInvalid();

	/*! \brief Set 
	 */
	void setSizeTypeInvalid(int  size_type_invalid);
	/*! \brief Get 
	 */
	int getLinkFormatWarning();

	/*! \brief Set 
	 */
	void setLinkFormatWarning(int  link_format_warning);
	/*! \brief Get 
	 */
	int getDuplicateProducts();

	/*! \brief Set 
	 */
	void setDuplicateProducts(int  duplicate_products);
	/*! \brief Get 
	 */
	int getDuplicateLinks();

	/*! \brief Set 
	 */
	void setDuplicateLinks(int  duplicate_links);
	/*! \brief Get 
	 */
	int getSalesPriceInvalid();

	/*! \brief Set 
	 */
	void setSalesPriceInvalid(int  sales_price_invalid);
	/*! \brief Get 
	 */
	int getProductCategoryDepthWarning();

	/*! \brief Set 
	 */
	void setProductCategoryDepthWarning(int  product_category_depth_warning);
	/*! \brief Get 
	 */
	int getAdwordsSameAsLink();

	/*! \brief Set 
	 */
	void setAdwordsSameAsLink(int  adwords_same_as_link);
	/*! \brief Get 
	 */
	int getDuplicateHeaders();

	/*! \brief Set 
	 */
	void setDuplicateHeaders(int  duplicate_headers);
	/*! \brief Get 
	 */
	int getFetchSameSignature();

	/*! \brief Set 
	 */
	void setFetchSameSignature(int  fetch_same_signature);
	/*! \brief Get 
	 */
	int getAdwordsFormatWarning();

	/*! \brief Set 
	 */
	void setAdwordsFormatWarning(int  adwords_format_warning);
	/*! \brief Get 
	 */
	int getAdditionalImageLinkWarning();

	/*! \brief Set 
	 */
	void setAdditionalImageLinkWarning(int  additional_image_link_warning);
	/*! \brief Get 
	 */
	int getImageLinkWarning();

	/*! \brief Set 
	 */
	void setImageLinkWarning(int  image_link_warning);
	/*! \brief Get 
	 */
	int getShippingInvalid();

	/*! \brief Set 
	 */
	void setShippingInvalid(int  shipping_invalid);
	/*! \brief Get 
	 */
	int getTaxInvalid();

	/*! \brief Set 
	 */
	void setTaxInvalid(int  tax_invalid);
	/*! \brief Get 
	 */
	int getShippingWeightInvalid();

	/*! \brief Set 
	 */
	void setShippingWeightInvalid(int  shipping_weight_invalid);
	/*! \brief Get 
	 */
	int getExpirationDateInvalid();

	/*! \brief Set 
	 */
	void setExpirationDateInvalid(int  expiration_date_invalid);
	/*! \brief Get 
	 */
	int getAvailabilityDateInvalid();

	/*! \brief Set 
	 */
	void setAvailabilityDateInvalid(int  availability_date_invalid);
	/*! \brief Get 
	 */
	int getSaleDateInvalid();

	/*! \brief Set 
	 */
	void setSaleDateInvalid(int  sale_date_invalid);
	/*! \brief Get 
	 */
	int getWeightUnitInvalid();

	/*! \brief Set 
	 */
	void setWeightUnitInvalid(int  weight_unit_invalid);
	/*! \brief Get 
	 */
	int getIsBundleInvalid();

	/*! \brief Set 
	 */
	void setIsBundleInvalid(int  is_bundle_invalid);
	/*! \brief Get 
	 */
	int getUpdatedTimeInvalid();

	/*! \brief Set 
	 */
	void setUpdatedTimeInvalid(int  updated_time_invalid);
	/*! \brief Get 
	 */
	int getCustomLabelLengthTooLong();

	/*! \brief Set 
	 */
	void setCustomLabelLengthTooLong(int  custom_label_length_too_long);
	/*! \brief Get 
	 */
	int getProductTypeLengthTooLong();

	/*! \brief Set 
	 */
	void setProductTypeLengthTooLong(int  product_type_length_too_long);
	/*! \brief Get 
	 */
	int getTooManyAdditionalImageLinks();

	/*! \brief Set 
	 */
	void setTooManyAdditionalImageLinks(int  too_many_additional_image_links);
	/*! \brief Get 
	 */
	int getMultipackInvalid();

	/*! \brief Set 
	 */
	void setMultipackInvalid(int  multipack_invalid);
	/*! \brief Get 
	 */
	int getIndexedProductCountLargeDelta();

	/*! \brief Set 
	 */
	void setIndexedProductCountLargeDelta(int  indexed_product_count_large_delta);
	/*! \brief Get 
	 */
	int getItemAdditionalImageDownloadFailure();

	/*! \brief Set 
	 */
	void setItemAdditionalImageDownloadFailure(int  item_additional_image_download_failure);
	/*! \brief Get 
	 */
	int getOptionalProductCategoryMissing();

	/*! \brief Set 
	 */
	void setOptionalProductCategoryMissing(int  optional_product_category_missing);
	/*! \brief Get 
	 */
	int getOptionalProductCategoryInvalid();

	/*! \brief Set 
	 */
	void setOptionalProductCategoryInvalid(int  optional_product_category_invalid);
	/*! \brief Get 
	 */
	int getOptionalConditionMissing();

	/*! \brief Set 
	 */
	void setOptionalConditionMissing(int  optional_condition_missing);
	/*! \brief Get 
	 */
	int getOptionalConditionInvalid();

	/*! \brief Set 
	 */
	void setOptionalConditionInvalid(int  optional_condition_invalid);
	/*! \brief Get 
	 */
	int getIosDeepLinkInvalid();

	/*! \brief Set 
	 */
	void setIosDeepLinkInvalid(int  ios_deep_link_invalid);
	/*! \brief Get 
	 */
	int getAndroidDeepLinkInvalid();

	/*! \brief Set 
	 */
	void setAndroidDeepLinkInvalid(int  android_deep_link_invalid);
	/*! \brief Get 
	 */
	int getAvailabilityNormalized();

	/*! \brief Set 
	 */
	void setAvailabilityNormalized(int  availability_normalized);
	/*! \brief Get 
	 */
	int getConditionNormalized();

	/*! \brief Set 
	 */
	void setConditionNormalized(int  condition_normalized);
	/*! \brief Get 
	 */
	int getGenderNormalized();

	/*! \brief Set 
	 */
	void setGenderNormalized(int  gender_normalized);
	/*! \brief Get 
	 */
	int getSizeTypeNormalized();

	/*! \brief Set 
	 */
	void setSizeTypeNormalized(int  size_type_normalized);
	/*! \brief Get 
	 */
	int getAgeGroupNormalized();

	/*! \brief Set 
	 */
	void setAgeGroupNormalized(int  age_group_normalized);
	/*! \brief Get 
	 */
	int getUtmSourceAutoCorrected();

	/*! \brief Set 
	 */
	void setUtmSourceAutoCorrected(int  utm_source_auto_corrected);
	/*! \brief Get 
	 */
	int getCountryDoesNotMapToCurrency();

	/*! \brief Set 
	 */
	void setCountryDoesNotMapToCurrency(int  country_does_not_map_to_currency);
	/*! \brief Get 
	 */
	int getMinAdPriceInvalid();

	/*! \brief Set 
	 */
	void setMinAdPriceInvalid(int  min_ad_price_invalid);

private:
	int title_length_too_long;
	int description_length_too_long;
	int gender_invalid;
	int age_group_invalid;
	int size_type_invalid;
	int link_format_warning;
	int duplicate_products;
	int duplicate_links;
	int sales_price_invalid;
	int product_category_depth_warning;
	int adwords_same_as_link;
	int duplicate_headers;
	int fetch_same_signature;
	int adwords_format_warning;
	int additional_image_link_warning;
	int image_link_warning;
	int shipping_invalid;
	int tax_invalid;
	int shipping_weight_invalid;
	int expiration_date_invalid;
	int availability_date_invalid;
	int sale_date_invalid;
	int weight_unit_invalid;
	int is_bundle_invalid;
	int updated_time_invalid;
	int custom_label_length_too_long;
	int product_type_length_too_long;
	int too_many_additional_image_links;
	int multipack_invalid;
	int indexed_product_count_large_delta;
	int item_additional_image_download_failure;
	int optional_product_category_missing;
	int optional_product_category_invalid;
	int optional_condition_missing;
	int optional_condition_invalid;
	int ios_deep_link_invalid;
	int android_deep_link_invalid;
	int availability_normalized;
	int condition_normalized;
	int gender_normalized;
	int size_type_normalized;
	int age_group_normalized;
	int utm_source_auto_corrected;
	int country_does_not_map_to_currency;
	int min_ad_price_invalid;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedValidationWarnings_H_ */
