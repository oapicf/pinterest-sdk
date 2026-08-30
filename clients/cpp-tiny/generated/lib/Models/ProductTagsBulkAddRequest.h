
/*
 * ProductTagsBulkAddRequest.h
 *
 * Request body for bulk adding product tags to a pin.
 */

#ifndef TINY_CPP_CLIENT_ProductTagsBulkAddRequest_H_
#define TINY_CPP_CLIENT_ProductTagsBulkAddRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProductTagItem.h"
#include <list>

namespace Tiny {


/*! \brief Request body for bulk adding product tags to a pin.
 *
 *  \ingroup Models
 *
 */

class ProductTagsBulkAddRequest{
public:

    /*! \brief Constructor.
	 */
    ProductTagsBulkAddRequest();
    ProductTagsBulkAddRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductTagsBulkAddRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of product tags to add. Maximum 24 items allowed.
	 */
	std::list<ProductTagItem> getProductTags();

	/*! \brief Set List of product tags to add. Maximum 24 items allowed.
	 */
	void setProductTags(std::list<ProductTagItem> product_tags);


    private:
    std::list<ProductTagItem> product_tags;
};
}

#endif /* TINY_CPP_CLIENT_ProductTagsBulkAddRequest_H_ */
