
/*
 * TokenGrantType.h
 *
 * The type of OAuth grant being requested.
 */

#ifndef TINY_CPP_CLIENT_TokenGrantType_H_
#define TINY_CPP_CLIENT_TokenGrantType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The type of OAuth grant being requested.
 *
 *  \ingroup Models
 *
 */

class TokenGrantType{
public:

    /*! \brief Constructor.
	 */
    TokenGrantType();
    TokenGrantType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TokenGrantType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TokenGrantType_H_ */
