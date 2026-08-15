
/*
 * NullableCurrency.h
 *
 * Currency Codes from ISO 4217.
 */

#ifndef TINY_CPP_CLIENT_NullableCurrency_H_
#define TINY_CPP_CLIENT_NullableCurrency_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Currency Codes from ISO 4217.
 *
 *  \ingroup Models
 *
 */

class NullableCurrency{
public:

    /*! \brief Constructor.
	 */
    NullableCurrency();
    NullableCurrency(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NullableCurrency();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_NullableCurrency_H_ */
