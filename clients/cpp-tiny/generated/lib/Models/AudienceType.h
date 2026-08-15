
/*
 * AudienceType.h
 *
 * Audience type
 */

#ifndef TINY_CPP_CLIENT_AudienceType_H_
#define TINY_CPP_CLIENT_AudienceType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Audience type
 *
 *  \ingroup Models
 *
 */

class AudienceType{
public:

    /*! \brief Constructor.
	 */
    AudienceType();
    AudienceType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AudienceType_H_ */
