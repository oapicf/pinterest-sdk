
/*
 * AdvancedAuctionItemsSubmitRequest.h
 *
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionItemsSubmitRequest_H_
#define TINY_CPP_CLIENT_AdvancedAuctionItemsSubmitRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvancedAuctionItemsSubmitRecord.h"
#include <list>

namespace Tiny {


/*! \brief Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItemsSubmitRequest{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionItemsSubmitRequest();
    AdvancedAuctionItemsSubmitRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionItemsSubmitRequest();


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
	/*! \brief Get Array of item bid option operations
	 */
	std::list<AdvancedAuctionItemsSubmitRecord> getItems();

	/*! \brief Set Array of item bid option operations
	 */
	void setItems(std::list <AdvancedAuctionItemsSubmitRecord> items);


    private:
    std::string catalog_id{};
    std::list<AdvancedAuctionItemsSubmitRecord> items;
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionItemsSubmitRequest_H_ */
