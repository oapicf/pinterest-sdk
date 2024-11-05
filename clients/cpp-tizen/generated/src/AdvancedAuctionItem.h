/*
 * AdvancedAuctionItem.h
 *
 * 
 */

#ifndef _AdvancedAuctionItem_H_
#define _AdvancedAuctionItem_H_


#include <string>
#include "AdvancedAuctionBidOptions.h"
#include "Country.h"
#include "Language.h"
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

class AdvancedAuctionItem : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvancedAuctionItem();
	AdvancedAuctionItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvancedAuctionItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The catalog retail item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog retail item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get 
	 */
	Language getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(Language  language);
	/*! \brief Get 
	 */
	AdvancedAuctionBidOptions getBidOptions();

	/*! \brief Set 
	 */
	void setBidOptions(AdvancedAuctionBidOptions  bid_options);

private:
	std::string item_id;
	Country country;
	Language language;
	AdvancedAuctionBidOptions bid_options;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvancedAuctionItem_H_ */
