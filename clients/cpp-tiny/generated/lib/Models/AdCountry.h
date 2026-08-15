
/*
 * AdCountry.h
 *
 * Country ID from ISO 3166-1 alpha-2.
 */

#ifndef TINY_CPP_CLIENT_AdCountry_H_
#define TINY_CPP_CLIENT_AdCountry_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Country ID from ISO 3166-1 alpha-2.
 *
 *  \ingroup Models
 *
 */

class AdCountry{
public:

    /*! \brief Constructor.
	 */
    AdCountry();
    AdCountry(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdCountry();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdCountry_H_ */
