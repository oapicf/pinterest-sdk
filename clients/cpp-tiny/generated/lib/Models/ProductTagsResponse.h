
/*
 * ProductTagsResponse.h
 *
 * Response containing a list of product tags for a pin.
 */

#ifndef TINY_CPP_CLIENT_ProductTagsResponse_H_
#define TINY_CPP_CLIENT_ProductTagsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProductTagItem.h"
#include <list>

namespace Tiny {


/*! \brief Response containing a list of product tags for a pin.
 *
 *  \ingroup Models
 *
 */

class ProductTagsResponse{
public:

    /*! \brief Constructor.
	 */
    ProductTagsResponse();
    ProductTagsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductTagsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of product tags on the pin.
	 */
	std::list<ProductTagItem> getProductTags();

	/*! \brief Set List of product tags on the pin.
	 */
	void setProductTags(std::list<ProductTagItem> product_tags);


    private:
    std::list<ProductTagItem> product_tags;
};
}

#endif /* TINY_CPP_CLIENT_ProductTagsResponse_H_ */
