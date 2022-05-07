/*
 * CatalogsFeedValidationErrors.h
 *
 * 
 */

#ifndef _CatalogsFeedValidationErrors_H_
#define _CatalogsFeedValidationErrors_H_


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

class CatalogsFeedValidationErrors : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedValidationErrors();
	CatalogsFeedValidationErrors(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedValidationErrors();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getFetchError();

	/*! \brief Set 
	 */
	void setFetchError(int  fetch_error);
	/*! \brief Get 
	 */
	int getFetchInactiveFeedError();

	/*! \brief Set 
	 */
	void setFetchInactiveFeedError(int  fetch_inactive_feed_error);
	/*! \brief Get 
	 */
	int getEncodingError();

	/*! \brief Set 
	 */
	void setEncodingError(int  encoding_error);
	/*! \brief Get 
	 */
	int getDelimiterError();

	/*! \brief Set 
	 */
	void setDelimiterError(int  delimiter_error);
	/*! \brief Get 
	 */
	int getRequiredColumnsMissing();

	/*! \brief Set 
	 */
	void setRequiredColumnsMissing(int  required_columns_missing);
	/*! \brief Get 
	 */
	int getImageLinkInvalid();

	/*! \brief Set 
	 */
	void setImageLinkInvalid(int  image_link_invalid);
	/*! \brief Get 
	 */
	int getItemidMissing();

	/*! \brief Set 
	 */
	void setItemidMissing(int  itemid_missing);
	/*! \brief Get 
	 */
	int getTitleMissing();

	/*! \brief Set 
	 */
	void setTitleMissing(int  title_missing);
	/*! \brief Get 
	 */
	int getDescriptionMissing();

	/*! \brief Set 
	 */
	void setDescriptionMissing(int  description_missing);
	/*! \brief Get 
	 */
	int getProductCategoryInvalid();

	/*! \brief Set 
	 */
	void setProductCategoryInvalid(int  product_category_invalid);
	/*! \brief Get 
	 */
	int getProductLinkMissing();

	/*! \brief Set 
	 */
	void setProductLinkMissing(int  product_link_missing);
	/*! \brief Get 
	 */
	int getImageLinkMissing();

	/*! \brief Set 
	 */
	void setImageLinkMissing(int  image_link_missing);
	/*! \brief Get 
	 */
	int getAvailabilityInvalid();

	/*! \brief Set 
	 */
	void setAvailabilityInvalid(int  availability_invalid);
	/*! \brief Get 
	 */
	int getProductPriceInvalid();

	/*! \brief Set 
	 */
	void setProductPriceInvalid(int  product_price_invalid);
	/*! \brief Get 
	 */
	int getLinkFormatInvalid();

	/*! \brief Set 
	 */
	void setLinkFormatInvalid(int  link_format_invalid);
	/*! \brief Get 
	 */
	int getParseLineError();

	/*! \brief Set 
	 */
	void setParseLineError(int  parse_line_error);
	/*! \brief Get 
	 */
	int getAdwordsFormatInvalid();

	/*! \brief Set 
	 */
	void setAdwordsFormatInvalid(int  adwords_format_invalid);
	/*! \brief Get 
	 */
	int getProductCategoryMissing();

	/*! \brief Set 
	 */
	void setProductCategoryMissing(int  product_category_missing);
	/*! \brief Get 
	 */
	int getInternalServiceError();

	/*! \brief Set 
	 */
	void setInternalServiceError(int  internal_service_error);
	/*! \brief Get 
	 */
	int getNoVerifiedDomain();

	/*! \brief Set 
	 */
	void setNoVerifiedDomain(int  no_verified_domain);
	/*! \brief Get 
	 */
	int getAdultInvalid();

	/*! \brief Set 
	 */
	void setAdultInvalid(int  adult_invalid);
	/*! \brief Get 
	 */
	int getInvalidDomain();

	/*! \brief Set 
	 */
	void setInvalidDomain(int  invalid_domain);
	/*! \brief Get 
	 */
	int getFeedLengthTooLong();

	/*! \brief Set 
	 */
	void setFeedLengthTooLong(int  feed_length_too_long);
	/*! \brief Get 
	 */
	int getLinkLengthTooLong();

	/*! \brief Set 
	 */
	void setLinkLengthTooLong(int  link_length_too_long);
	/*! \brief Get 
	 */
	int getMalformedXml();

	/*! \brief Set 
	 */
	void setMalformedXml(int  malformed_xml);
	/*! \brief Get 
	 */
	int getRedirectInvalid();

	/*! \brief Set 
	 */
	void setRedirectInvalid(int  redirect_invalid);
	/*! \brief Get 
	 */
	int getPriceMissing();

	/*! \brief Set 
	 */
	void setPriceMissing(int  price_missing);
	/*! \brief Get 
	 */
	int getFeedTooSmall();

	/*! \brief Set 
	 */
	void setFeedTooSmall(int  feed_too_small);
	/*! \brief Get 
	 */
	int getConditionInvalid();

	/*! \brief Set 
	 */
	void setConditionInvalid(int  condition_invalid);
	/*! \brief Get 
	 */
	int getShopifyNoProducts();

	/*! \brief Set 
	 */
	void setShopifyNoProducts(int  shopify_no_products);
	/*! \brief Get 
	 */
	int getMaxItemsPerItemGroupExceeded();

	/*! \brief Set 
	 */
	void setMaxItemsPerItemGroupExceeded(int  max_items_per_item_group_exceeded);
	/*! \brief Get 
	 */
	int getItemMainImageDownloadFailure();

	/*! \brief Set 
	 */
	void setItemMainImageDownloadFailure(int  item_main_image_download_failure);
	/*! \brief Get 
	 */
	int getPinjoinContentUnsafe();

	/*! \brief Set 
	 */
	void setPinjoinContentUnsafe(int  pinjoin_content_unsafe);
	/*! \brief Get 
	 */
	int getBlocklistedImageSignature();

	/*! \brief Set 
	 */
	void setBlocklistedImageSignature(int  blocklisted_image_signature);

private:
	int fetch_error;
	int fetch_inactive_feed_error;
	int encoding_error;
	int delimiter_error;
	int required_columns_missing;
	int image_link_invalid;
	int itemid_missing;
	int title_missing;
	int description_missing;
	int product_category_invalid;
	int product_link_missing;
	int image_link_missing;
	int availability_invalid;
	int product_price_invalid;
	int link_format_invalid;
	int parse_line_error;
	int adwords_format_invalid;
	int product_category_missing;
	int internal_service_error;
	int no_verified_domain;
	int adult_invalid;
	int invalid_domain;
	int feed_length_too_long;
	int link_length_too_long;
	int malformed_xml;
	int redirect_invalid;
	int price_missing;
	int feed_too_small;
	int condition_invalid;
	int shopify_no_products;
	int max_items_per_item_group_exceeded;
	int item_main_image_download_failure;
	int pinjoin_content_unsafe;
	int blocklisted_image_signature;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedValidationErrors_H_ */
