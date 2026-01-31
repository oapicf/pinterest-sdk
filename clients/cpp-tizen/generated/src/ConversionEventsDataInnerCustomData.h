/*
 * ConversionEvents_data_inner_custom_data.h
 *
 * Object containing other custom data.
 */

#ifndef _ConversionEvents_data_inner_custom_data_H_
#define _ConversionEvents_data_inner_custom_data_H_


#include <string>
#include "ConversionEvents_data_inner_custom_data_contents_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object containing other custom data.
 *
 *  \ingroup Models
 *
 */

class ConversionEvents_data_inner_custom_data : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEvents_data_inner_custom_data();
	ConversionEvents_data_inner_custom_data(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEvents_data_inner_custom_data();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The brand of the content associated with the event.
	 */
	std::string getContentBrand();

	/*! \brief Set The brand of the content associated with the event.
	 */
	void setContentBrand(std::string  content_brand);
	/*! \brief Get The category of the content associated with the event.
	 */
	std::string getContentCategory();

	/*! \brief Set The category of the content associated with the event.
	 */
	void setContentCategory(std::string  content_category);
	/*! \brief Get List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	std::list<std::string> getContentIds();

	/*! \brief Set List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	void setContentIds(std::list <std::string> content_ids);
	/*! \brief Get The name of the page or product associated with the event.
	 */
	std::string getContentName();

	/*! \brief Set The name of the page or product associated with the event.
	 */
	void setContentName(std::string  content_name);
	/*! \brief Get A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	std::list<ConversionEvents_data_inner_custom_data_contents_inner> getContents();

	/*! \brief Set A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	void setContents(std::list <ConversionEvents_data_inner_custom_data_contents_inner> contents);
	/*! \brief Get The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
	 */
	std::string getCurrency();

	/*! \brief Set The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
	 */
	void setCurrency(std::string  currency);
	/*! \brief Get Only use when instructed.
	 */
	std::string getExternalMeasurementId();

	/*! \brief Set Only use when instructed.
	 */
	void setExternalMeasurementId(std::string  external_measurement_id);
	/*! \brief Get Only use when instructed.
	 */
	int getExternalMeasurementVendorId();

	/*! \brief Set Only use when instructed.
	 */
	void setExternalMeasurementVendorId(int  external_measurement_vendor_id);
	/*! \brief Get Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
	 */
	std::string getNp();

	/*! \brief Set Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
	 */
	void setNp(std::string  np);
	/*! \brief Get Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	long long getNumItems();

	/*! \brief Set Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
	 */
	void setNumItems(long long  num_items);
	/*! \brief Get Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.
	 */
	std::string getOptOutType();

	/*! \brief Set Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.
	 */
	void setOptOutType(std::string  opt_out_type);
	/*! \brief Get The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
	 */
	std::string getOrderId();

	/*! \brief Set The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
	 */
	void setOrderId(std::string  order_id);
	/*! \brief Get Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
	 */
	std::string getPredictedLtv();

	/*! \brief Set Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
	 */
	void setPredictedLtv(std::string  predicted_ltv);
	/*! \brief Get The search string related to the user conversion event.
	 */
	std::string getSearchString();

	/*! \brief Set The search string related to the user conversion event.
	 */
	void setSearchString(std::string  search_string);
	/*! \brief Get Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
	 */
	std::string getValue();

	/*! \brief Set Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
	 */
	void setValue(std::string  value);

private:
	std::string content_brand;
	std::string content_category;
	std::list <std::string>content_ids;
	std::string content_name;
	std::list <ConversionEvents_data_inner_custom_data_contents_inner>contents;
	std::string currency;
	std::string external_measurement_id;
	int external_measurement_vendor_id;
	std::string np;
	long long num_items;
	std::string opt_out_type;
	std::string order_id;
	std::string predicted_ltv;
	std::string search_string;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEvents_data_inner_custom_data_H_ */
