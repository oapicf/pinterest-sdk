
/*
 * ProductCategoryEnum.h
 *
 * List of product category details
 */

#ifndef TINY_CPP_CLIENT_ProductCategoryEnum_H_
#define TINY_CPP_CLIENT_ProductCategoryEnum_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief List of product category details
 *
 *  \ingroup Models
 *
 */

class ProductCategoryEnum{
public:

    /*! \brief Constructor.
	 */
    ProductCategoryEnum();
    ProductCategoryEnum(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductCategoryEnum();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ProductCategoryEnum_H_ */
