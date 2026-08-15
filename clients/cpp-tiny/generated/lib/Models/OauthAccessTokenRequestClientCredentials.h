
/*
 * OauthAccessTokenRequestClientCredentials.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OauthAccessTokenRequestClientCredentials_H_
#define TINY_CPP_CLIENT_OauthAccessTokenRequestClientCredentials_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OauthAccessTokenRequestClientCredentials{
public:

    /*! \brief Constructor.
	 */
    OauthAccessTokenRequestClientCredentials();
    OauthAccessTokenRequestClientCredentials(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OauthAccessTokenRequestClientCredentials();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getScope();

	/*! \brief Set 
	 */
	void setScope(std::string  scope);
	/*! \brief Get 
	 */
	std::string getGrantType();

	/*! \brief Set 
	 */
	void setGrantType(std::string  grant_type);


    private:
    std::string scope{};
    std::string grant_type{};
};
}

#endif /* TINY_CPP_CLIENT_OauthAccessTokenRequestClientCredentials_H_ */
