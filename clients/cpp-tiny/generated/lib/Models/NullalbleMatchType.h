
/*
 * NullalbleMatchType.h
 *
 * Keyword match type allowing null
 */

#ifndef TINY_CPP_CLIENT_NullalbleMatchType_H_
#define TINY_CPP_CLIENT_NullalbleMatchType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Keyword match type allowing null
 *
 *  \ingroup Models
 *
 */

class NullalbleMatchType{
public:

    /*! \brief Constructor.
	 */
    NullalbleMatchType();
    NullalbleMatchType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NullalbleMatchType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_NullalbleMatchType_H_ */
