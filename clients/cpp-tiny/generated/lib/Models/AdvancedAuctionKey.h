
/*
 * AdvancedAuctionKey.h
 *
 * Object uniquely identifying a retail catalog item
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionKey_H_
#define TINY_CPP_CLIENT_AdvancedAuctionKey_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Country.h"
#include "Language.h"

namespace Tiny {


/*! \brief Object uniquely identifying a retail catalog item
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionKey{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionKey();
    AdvancedAuctionKey(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionKey();


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
	void setCountry(Country country);
	/*! \brief Get The catalog retail item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog retail item id in the merchant namespace
	 */
	void setItemId(std::string item_id);
	/*! \brief Get 
	 */
	Language getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(Language language);


    private:
    Country country;
    std::string item_id{};
    Language language;
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionKey_H_ */
