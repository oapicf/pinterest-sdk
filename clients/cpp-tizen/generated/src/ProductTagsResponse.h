/*
 * ProductTagsResponse.h
 *
 * Response containing a list of product tags for a pin.
 */

#ifndef _ProductTagsResponse_H_
#define _ProductTagsResponse_H_


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


/*! \brief Response containing a list of product tags for a pin.
 *
 *  \ingroup Models
 *
 */

class ProductTagsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductTagsResponse();
	ProductTagsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductTagsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of product tags on the pin.
	 */
	std::list<ProductTagItem> getProductTags();

	/*! \brief Set List of product tags on the pin.
	 */
	void setProductTags(std::list <ProductTagItem> product_tags);

private:
	std::list <ProductTagItem>product_tags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductTagsResponse_H_ */
