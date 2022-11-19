/*
 * PinterestTagEventData.h
 *
 * Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
 */

#ifndef _PinterestTagEventData_H_
#define _PinterestTagEventData_H_


#include <string>
#include "Currency.h"
#include "LineItem.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }
 *
 *  \ingroup Models
 *
 */

class PinterestTagEventData : public Object {
public:
	/*! \brief Constructor.
	 */
	PinterestTagEventData();
	PinterestTagEventData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinterestTagEventData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Currency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(Currency  currency);
	/*! \brief Get Promotion code. For example, \"Newsletter\".
	 */
	std::string getLeadType();

	/*! \brief Set Promotion code. For example, \"Newsletter\".
	 */
	void setLeadType(std::string  lead_type);
	/*! \brief Get 
	 */
	LineItem getLineItems();

	/*! \brief Set 
	 */
	void setLineItems(LineItem  line_items);
	/*! \brief Get Order ID. For example, \"X-151481\".
	 */
	std::string getOrderId();

	/*! \brief Set Order ID. For example, \"X-151481\".
	 */
	void setOrderId(std::string  order_id);
	/*! \brief Get Order quantity. For example, 1.
	 */
	int getOrderQuantity();

	/*! \brief Set Order quantity. For example, 1.
	 */
	void setOrderQuantity(int  order_quantity);
	/*! \brief Get Page name. For example, \"Our Favorite Pins on Pinterest\".
	 */
	std::string getPageName();

	/*! \brief Set Page name. For example, \"Our Favorite Pins on Pinterest\".
	 */
	void setPageName(std::string  page_name);
	/*! \brief Get Promotion code. For example, \"WINTER10\".
	 */
	std::string getPromoCode();

	/*! \brief Set Promotion code. For example, \"WINTER10\".
	 */
	void setPromoCode(std::string  promo_code);
	/*! \brief Get Property. For example, \"Athleta\".
	 */
	std::string getProperty();

	/*! \brief Set Property. For example, \"Athleta\".
	 */
	void setProperty(std::string  property);
	/*! \brief Get Search query string. For example, \"boots\".
	 */
	std::string getSearchQuery();

	/*! \brief Set Search query string. For example, \"boots\".
	 */
	void setSearchQuery(std::string  search_query);
	/*! \brief Get Product value. For example, \"199.98\"
	 */
	std::string getValue();

	/*! \brief Set Product value. For example, \"199.98\"
	 */
	void setValue(std::string  value);
	/*! \brief Get Video title. For example, \"How to style your Parker Boots\".
	 */
	std::string getVideoTitle();

	/*! \brief Set Video title. For example, \"How to style your Parker Boots\".
	 */
	void setVideoTitle(std::string  video_title);

private:
	Currency currency;
	std::string lead_type;
	LineItem line_items;
	std::string order_id;
	int order_quantity;
	std::string page_name;
	std::string promo_code;
	std::string property;
	std::string search_query;
	std::string value;
	std::string video_title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PinterestTagEventData_H_ */
