
/*
 * WebsiteVerificationMethod.h
 *
 * Method used to verify website ownership.
 */

#ifndef TINY_CPP_CLIENT_WebsiteVerificationMethod_H_
#define TINY_CPP_CLIENT_WebsiteVerificationMethod_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Method used to verify website ownership.
 *
 *  \ingroup Models
 *
 */

class WebsiteVerificationMethod{
public:

    /*! \brief Constructor.
	 */
    WebsiteVerificationMethod();
    WebsiteVerificationMethod(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~WebsiteVerificationMethod();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_WebsiteVerificationMethod_H_ */
