
/*
 * NonNullableCatalogsCurrency.h
 *
 * Currency Codes from ISO 4217.
 */

#ifndef TINY_CPP_CLIENT_NonNullableCatalogsCurrency_H_
#define TINY_CPP_CLIENT_NonNullableCatalogsCurrency_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Currency Codes from ISO 4217.
 *
 *  \ingroup Models
 *
 */

class NonNullableCatalogsCurrency{
public:

    /*! \brief Constructor.
	 */
    NonNullableCatalogsCurrency();
    NonNullableCatalogsCurrency(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NonNullableCatalogsCurrency();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_NonNullableCatalogsCurrency_H_ */
