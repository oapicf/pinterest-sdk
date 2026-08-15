
/*
 * ItemDeleteDiscontinuedBatchRecord.h
 *
 * Object describing an item batch record to discontinue items
 */

#ifndef TINY_CPP_CLIENT_ItemDeleteDiscontinuedBatchRecord_H_
#define TINY_CPP_CLIENT_ItemDeleteDiscontinuedBatchRecord_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Object describing an item batch record to discontinue items
 *
 *  \ingroup Models
 *
 */

class ItemDeleteDiscontinuedBatchRecord{
public:

    /*! \brief Constructor.
	 */
    ItemDeleteDiscontinuedBatchRecord();
    ItemDeleteDiscontinuedBatchRecord(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemDeleteDiscontinuedBatchRecord();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);


    private:
    std::string item_id{};
};
}

#endif /* TINY_CPP_CLIENT_ItemDeleteDiscontinuedBatchRecord_H_ */
