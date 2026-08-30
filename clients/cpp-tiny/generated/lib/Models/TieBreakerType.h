
/*
 * TieBreakerType.h
 *
 * Quiz ad tie breaker type, default is RANDOM
 */

#ifndef TINY_CPP_CLIENT_TieBreakerType_H_
#define TINY_CPP_CLIENT_TieBreakerType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Quiz ad tie breaker type, default is RANDOM
 *
 *  \ingroup Models
 *
 */

class TieBreakerType{
public:

    /*! \brief Constructor.
	 */
    TieBreakerType();
    TieBreakerType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TieBreakerType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TieBreakerType_H_ */
