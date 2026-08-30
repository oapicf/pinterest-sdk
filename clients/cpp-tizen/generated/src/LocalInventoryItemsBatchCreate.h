/*
 * LocalInventoryItemsBatchCreate.h
 *
 * Resource create operation model.
 */

#ifndef _LocalInventoryItemsBatchCreate_H_
#define _LocalInventoryItemsBatchCreate_H_


#include <string>
#include "LocalInventoryOperation.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class LocalInventoryItemsBatchCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	LocalInventoryItemsBatchCreate();
	LocalInventoryItemsBatchCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocalInventoryItemsBatchCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Array of inventory operations. Up to 1000 items per request.
	 */
	std::list<LocalInventoryOperation> getOperations();

	/*! \brief Set Array of inventory operations. Up to 1000 items per request.
	 */
	void setOperations(std::list <LocalInventoryOperation> operations);

private:
	std::list <LocalInventoryOperation>operations;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocalInventoryItemsBatchCreate_H_ */
