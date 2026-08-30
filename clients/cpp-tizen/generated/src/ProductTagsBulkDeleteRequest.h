/*
 * ProductTagsBulkDeleteRequest.h
 *
 * Request body for bulk deleting product tags from a pin.
 */

#ifndef _ProductTagsBulkDeleteRequest_H_
#define _ProductTagsBulkDeleteRequest_H_


#include <string>
#include "ProductTagItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request body for bulk deleting product tags from a pin.
 *
 *  \ingroup Models
 *
 */

class ProductTagsBulkDeleteRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductTagsBulkDeleteRequest();
	ProductTagsBulkDeleteRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductTagsBulkDeleteRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of product tags to delete.
	 */
	std::list<ProductTagItem> getProductTags();

	/*! \brief Set List of product tags to delete.
	 */
	void setProductTags(std::list <ProductTagItem> product_tags);

private:
	std::list <ProductTagItem>product_tags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductTagsBulkDeleteRequest_H_ */
