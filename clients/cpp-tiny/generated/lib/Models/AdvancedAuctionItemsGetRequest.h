
/*
 * AdvancedAuctionItemsGetRequest.h
 *
 * Request object used to get bid options values for a batch of retail catalog items
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionItemsGetRequest_H_
#define TINY_CPP_CLIENT_AdvancedAuctionItemsGetRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvancedAuctionItemsGetRecord.h"
#include <list>

namespace Tiny {


/*! \brief Request object used to get bid options values for a batch of retail catalog items
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItemsGetRequest{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionItemsGetRequest();
    AdvancedAuctionItemsGetRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionItemsGetRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the retail item
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the retail item
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get A list of retail catalog items to fetch bid options for
	 */
	std::list<AdvancedAuctionItemsGetRecord> getItems();

	/*! \brief Set A list of retail catalog items to fetch bid options for
	 */
	void setItems(std::list <AdvancedAuctionItemsGetRecord> items);


    private:
    std::string catalog_id{};
    std::list<AdvancedAuctionItemsGetRecord> items;
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionItemsGetRequest_H_ */
