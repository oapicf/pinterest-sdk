
/*
 * LocalInventoryItemsBatchCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_LocalInventoryItemsBatchCreate_H_
#define TINY_CPP_CLIENT_LocalInventoryItemsBatchCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LocalInventoryOperation.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class LocalInventoryItemsBatchCreate{
public:

    /*! \brief Constructor.
	 */
    LocalInventoryItemsBatchCreate();
    LocalInventoryItemsBatchCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocalInventoryItemsBatchCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array of inventory operations. Up to 1000 items per request.
	 */
	std::list<LocalInventoryOperation> getOperations();

	/*! \brief Set Array of inventory operations. Up to 1000 items per request.
	 */
	void setOperations(std::list<LocalInventoryOperation> operations);


    private:
    std::list<LocalInventoryOperation> operations;
};
}

#endif /* TINY_CPP_CLIENT_LocalInventoryItemsBatchCreate_H_ */
