
/*
 * AdvancedAuctionItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionItem_H_
#define TINY_CPP_CLIENT_AdvancedAuctionItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvancedAuctionBidOptions.h"
#include "Country.h"
#include "Language.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItem{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionItem();
    AdvancedAuctionItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get The catalog retail item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog retail item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
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
    Country country;
    std::string item_id{};
    Language language;
    AdvancedAuctionBidOptions bid_options;
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionItem_H_ */
