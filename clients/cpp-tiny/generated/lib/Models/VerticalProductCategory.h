
/*
 * VerticalProductCategory.h
 *
 * List of verticals for product categories.
 */

#ifndef TINY_CPP_CLIENT_VerticalProductCategory_H_
#define TINY_CPP_CLIENT_VerticalProductCategory_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief List of verticals for product categories.
 *
 *  \ingroup Models
 *
 */

class VerticalProductCategory{
public:

    /*! \brief Constructor.
	 */
    VerticalProductCategory();
    VerticalProductCategory(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VerticalProductCategory();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_VerticalProductCategory_H_ */
