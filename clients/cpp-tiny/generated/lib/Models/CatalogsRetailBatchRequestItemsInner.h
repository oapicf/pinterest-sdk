
/*
 * CatalogsRetailBatchRequest_items_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailBatchRequest_items_inner_H_
#define TINY_CPP_CLIENT_CatalogsRetailBatchRequest_items_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreateRetailItem.h"
#include "CatalogsDeleteRetailItem.h"
#include "CatalogsUpdateRetailItem.h"
#include "CatalogsUpsertRetailItem.h"
#include "ItemAttributesRequest.h"
#include "UpdateMaskFieldType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailBatchRequest_items_inner{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailBatchRequest_items_inner();
    CatalogsRetailBatchRequest_items_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailBatchRequest_items_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ItemAttributesRequest getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(ItemAttributesRequest  attributes);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
	/*! \brief Get The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	 */
	std::list<UpdateMaskFieldType> getUpdateMask();

	/*! \brief Set The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
	 */
	void setUpdateMask(std::list <UpdateMaskFieldType> update_mask);
	/*! \brief Get The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	long getLastUpdatedTime();

	/*! \brief Set The millisecond timestamp when the item was lastly modified by the merchant.
	 */
	void setLastUpdatedTime(long  last_updated_time);


    private:
    ItemAttributesRequest attributes;
    std::string item_id{};
    std::string operation{};
    std::list<UpdateMaskFieldType> update_mask;
    long last_updated_time{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailBatchRequest_items_inner_H_ */
