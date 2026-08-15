
/*
 * OauthAccessTokenResponse.h
 *
 * A successful OAuth access token response.
 */

#ifndef TINY_CPP_CLIENT_OauthAccessTokenResponse_H_
#define TINY_CPP_CLIENT_OauthAccessTokenResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A successful OAuth access token response.
 *
 *  \ingroup Models
 *
 */

class OauthAccessTokenResponse{
public:

    /*! \brief Constructor.
	 */
    OauthAccessTokenResponse();
    OauthAccessTokenResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OauthAccessTokenResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getAccessToken();

	/*! \brief Set 
	 */
	void setAccessToken(std::string  access_token);
	/*! \brief Get 
	 */
	int getExpiresIn();

	/*! \brief Set 
	 */
	void setExpiresIn(int  expires_in);
	/*! \brief Get 
	 */
	std::string getResponseType();

	/*! \brief Set 
	 */
	void setResponseType(std::string  response_type);
	/*! \brief Get 
	 */
	std::string getScope();

	/*! \brief Set 
	 */
	void setScope(std::string  scope);
	/*! \brief Get 
	 */
	std::string getTokenType();

	/*! \brief Set 
	 */
	void setTokenType(std::string  token_type);


    private:
    std::string access_token{};
    int expires_in{};
    std::string response_type{};
    std::string scope{};
    std::string token_type{};
};
}

#endif /* TINY_CPP_CLIENT_OauthAccessTokenResponse_H_ */
