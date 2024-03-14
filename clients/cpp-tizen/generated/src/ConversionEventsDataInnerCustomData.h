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

	/*! \brief Get The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation.
	 */
	std::string getCurrency();

	/*! \brief Set The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation.
	 */
	void setCurrency(std::string  currency);
	/*! \brief Get Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price
	 */
	std::string getValue();

	/*! \brief Set Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price
	 */
	void setValue(std::string  value);
	/*! \brief Get List of products IDs
	 */
	std::list<std::string> getContentIds();

	/*! \brief Set List of products IDs
	 */
	void setContentIds(std::list <std::string> content_ids);
	/*! \brief Get A list of objects containing information about products, such as price and quantity.
	 */
	std::list<ConversionEvents_data_inner_custom_data_contents_inner> getContents();

	/*! \brief Set A list of objects containing information about products, such as price and quantity.
	 */
	void setContents(std::list <ConversionEvents_data_inner_custom_data_contents_inner> contents);
	/*! \brief Get Total number of products of the event. For example, the total number of items purchased in a checkout event.
	 */
	long long getNumItems();

	/*! \brief Set Total number of products of the event. For example, the total number of items purchased in a checkout event.
	 */
	void setNumItems(long long  num_items);
	/*! \brief Get The order ID
	 */
	std::string getOrderId();

	/*! \brief Set The order ID
	 */
	void setOrderId(std::string  order_id);
	/*! \brief Get The search string related to the user conversion event.
	 */
	std::string getSearchString();

	/*! \brief Set The search string related to the user conversion event.
	 */
	void setSearchString(std::string  search_string);
	/*! \brief Get Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated.
	 */
	std::string getOptOutType();

	/*! \brief Set Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated.
	 */
	void setOptOutType(std::string  opt_out_type);
	/*! \brief Get Named partner. Not required, this is for Pinterest internal use only.
	 */
	std::string getNp();

	/*! \brief Set Named partner. Not required, this is for Pinterest internal use only.
	 */
	void setNp(std::string  np);

private:
	std::string currency;
	std::string value;
	std::list <std::string>content_ids;
	std::list <ConversionEvents_data_inner_custom_data_contents_inner>contents;
	long long num_items;
	std::string order_id;
	std::string search_string;
	std::string opt_out_type;
	std::string np;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEvents_data_inner_custom_data_H_ */
