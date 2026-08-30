
/*
 * TokenTypeHint.h
 *
 * The type of token to revoke.
 */

#ifndef TINY_CPP_CLIENT_TokenTypeHint_H_
#define TINY_CPP_CLIENT_TokenTypeHint_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The type of token to revoke.
 *
 *  \ingroup Models
 *
 */

class TokenTypeHint{
public:

    /*! \brief Constructor.
	 */
    TokenTypeHint();
    TokenTypeHint(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TokenTypeHint();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TokenTypeHint_H_ */
