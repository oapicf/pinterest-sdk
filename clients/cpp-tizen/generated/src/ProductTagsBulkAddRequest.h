/*
 * ProductTagsBulkAddRequest.h
 *
 * Request body for bulk adding product tags to a pin.
 */

#ifndef _ProductTagsBulkAddRequest_H_
#define _ProductTagsBulkAddRequest_H_


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


/*! \brief Request body for bulk adding product tags to a pin.
 *
 *  \ingroup Models
 *
 */

class ProductTagsBulkAddRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductTagsBulkAddRequest();
	ProductTagsBulkAddRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductTagsBulkAddRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of product tags to add. Maximum 24 items allowed.
	 */
	std::list<ProductTagItem> getProductTags();

	/*! \brief Set List of product tags to add. Maximum 24 items allowed.
	 */
	void setProductTags(std::list <ProductTagItem> product_tags);

private:
	std::list <ProductTagItem>product_tags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductTagsBulkAddRequest_H_ */
