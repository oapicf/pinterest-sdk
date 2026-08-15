
/*
 * MatchType.h
 *
 * Keyword match type
 */

#ifndef TINY_CPP_CLIENT_MatchType_H_
#define TINY_CPP_CLIENT_MatchType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Keyword match type
 *
 *  \ingroup Models
 *
 */

class MatchType{
public:

    /*! \brief Constructor.
	 */
    MatchType();
    MatchType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MatchType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_MatchType_H_ */
