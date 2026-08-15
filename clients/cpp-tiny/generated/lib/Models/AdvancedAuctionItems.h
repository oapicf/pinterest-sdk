
/*
 * AdvancedAuctionItems.h
 *
 * Response object containing item bid options
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionItems_H_
#define TINY_CPP_CLIENT_AdvancedAuctionItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvancedAuctionItem.h"
#include <list>

namespace Tiny {


/*! \brief Response object containing item bid options
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItems{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionItems();
    AdvancedAuctionItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Response object of item bid options
	 */
	std::string getCatalogId();

	/*! \brief Set Response object of item bid options
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get Array with item bid options
	 */
	std::list<AdvancedAuctionItem> getItems();

	/*! \brief Set Array with item bid options
	 */
	void setItems(std::list <AdvancedAuctionItem> items);


    private:
    std::string catalog_id{};
    std::list<AdvancedAuctionItem> items;
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionItems_H_ */
