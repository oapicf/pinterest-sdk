
/*
 * NullableCatalogsItemFieldType.h
 *
 * Product item fields
 */

#ifndef TINY_CPP_CLIENT_NullableCatalogsItemFieldType_H_
#define TINY_CPP_CLIENT_NullableCatalogsItemFieldType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Product item fields
 *
 *  \ingroup Models
 *
 */

class NullableCatalogsItemFieldType{
public:

    /*! \brief Constructor.
	 */
    NullableCatalogsItemFieldType();
    NullableCatalogsItemFieldType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NullableCatalogsItemFieldType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_NullableCatalogsItemFieldType_H_ */
