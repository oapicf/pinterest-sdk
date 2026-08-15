
/*
 * OauthAccessTokenResponseRefresh.h
 *
 * A successful OAuth access token response for the refresh token flow.
 */

#ifndef TINY_CPP_CLIENT_OauthAccessTokenResponseRefresh_H_
#define TINY_CPP_CLIENT_OauthAccessTokenResponseRefresh_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A successful OAuth access token response for the refresh token flow.
 *
 *  \ingroup Models
 *
 */

class OauthAccessTokenResponseRefresh{
public:

    /*! \brief Constructor.
	 */
    OauthAccessTokenResponseRefresh();
    OauthAccessTokenResponseRefresh(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OauthAccessTokenResponseRefresh();


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
	/*! \brief Get 
	 */
	std::string getRefreshToken();

	/*! \brief Set 
	 */
	void setRefreshToken(std::string  refresh_token);
	/*! \brief Get 
	 */
	int getRefreshTokenExpiresAt();

	/*! \brief Set 
	 */
	void setRefreshTokenExpiresAt(int  refresh_token_expires_at);
	/*! \brief Get 
	 */
	int getRefreshTokenExpiresIn();

	/*! \brief Set 
	 */
	void setRefreshTokenExpiresIn(int  refresh_token_expires_in);


    private:
    std::string access_token{};
    int expires_in{};
    std::string response_type{};
    std::string scope{};
    std::string token_type{};
    std::string refresh_token{};
    int refresh_token_expires_at{};
    int refresh_token_expires_in{};
};
}

#endif /* TINY_CPP_CLIENT_OauthAccessTokenResponseRefresh_H_ */
