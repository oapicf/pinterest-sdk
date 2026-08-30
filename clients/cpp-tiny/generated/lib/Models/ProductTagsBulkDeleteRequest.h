
/*
 * ProductTagsBulkDeleteRequest.h
 *
 * Request body for bulk deleting product tags from a pin.
 */

#ifndef TINY_CPP_CLIENT_ProductTagsBulkDeleteRequest_H_
#define TINY_CPP_CLIENT_ProductTagsBulkDeleteRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProductTagItem.h"
#include <list>

namespace Tiny {


/*! \brief Request body for bulk deleting product tags from a pin.
 *
 *  \ingroup Models
 *
 */

class ProductTagsBulkDeleteRequest{
public:

    /*! \brief Constructor.
	 */
    ProductTagsBulkDeleteRequest();
    ProductTagsBulkDeleteRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductTagsBulkDeleteRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of product tags to delete.
	 */
	std::list<ProductTagItem> getProductTags();

	/*! \brief Set List of product tags to delete.
	 */
	void setProductTags(std::list<ProductTagItem> product_tags);


    private:
    std::list<ProductTagItem> product_tags;
};
}

#endif /* TINY_CPP_CLIENT_ProductTagsBulkDeleteRequest_H_ */
