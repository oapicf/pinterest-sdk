
/*
 * UserWebsiteVerifyRequest.h
 *
 * User website verification request
 */

#ifndef TINY_CPP_CLIENT_UserWebsiteVerifyRequest_H_
#define TINY_CPP_CLIENT_UserWebsiteVerifyRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief User website verification request
 *
 *  \ingroup Models
 *
 */

class UserWebsiteVerifyRequest{
public:

    /*! \brief Constructor.
	 */
    UserWebsiteVerifyRequest();
    UserWebsiteVerifyRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserWebsiteVerifyRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getVerificationMethod();

	/*! \brief Set 
	 */
	void setVerificationMethod(std::string  verification_method);
	/*! \brief Get 
	 */
	std::string getWebsite();

	/*! \brief Set 
	 */
	void setWebsite(std::string  website);


    private:
    std::string verification_method{};
    std::string website{};
};
}

#endif /* TINY_CPP_CLIENT_UserWebsiteVerifyRequest_H_ */
