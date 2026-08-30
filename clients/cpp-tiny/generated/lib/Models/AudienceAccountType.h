
/*
 * AudienceAccountType.h
 *
 * Account type filter for audience sharing.
 */

#ifndef TINY_CPP_CLIENT_AudienceAccountType_H_
#define TINY_CPP_CLIENT_AudienceAccountType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Account type filter for audience sharing.
 *
 *  \ingroup Models
 *
 */

class AudienceAccountType{
public:

    /*! \brief Constructor.
	 */
    AudienceAccountType();
    AudienceAccountType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceAccountType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AudienceAccountType_H_ */
