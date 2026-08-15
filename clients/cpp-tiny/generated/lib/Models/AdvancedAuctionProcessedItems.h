
/*
 * AdvancedAuctionProcessedItems.h
 *
 * Response object containing the results of an operation on an item bid option
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionProcessedItems_H_
#define TINY_CPP_CLIENT_AdvancedAuctionProcessedItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvancedAuctionItemsSubmitRecord.h"
#include <list>

namespace Tiny {


/*! \brief Response object containing the results of an operation on an item bid option
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionProcessedItems{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionProcessedItems();
    AdvancedAuctionProcessedItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionProcessedItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to all items
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to all items
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get Array of advanced auction processed items
	 */
	std::list<AdvancedAuctionItemsSubmitRecord> getItems();

	/*! \brief Set Array of advanced auction processed items
	 */
	void setItems(std::list <AdvancedAuctionItemsSubmitRecord> items);


    private:
    std::string catalog_id{};
    std::list<AdvancedAuctionItemsSubmitRecord> items;
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionProcessedItems_H_ */
