
/*
 * OauthAccessTokenRequestCode.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OauthAccessTokenRequestCode_H_
#define TINY_CPP_CLIENT_OauthAccessTokenRequestCode_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OauthAccessTokenRequestCode{
public:

    /*! \brief Constructor.
	 */
    OauthAccessTokenRequestCode();
    OauthAccessTokenRequestCode(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OauthAccessTokenRequestCode();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getCode();

	/*! \brief Set 
	 */
	void setCode(std::string  code);
	/*! \brief Get 
	 */
	std::string getRedirectUri();

	/*! \brief Set 
	 */
	void setRedirectUri(std::string  redirect_uri);
	/*! \brief Get 
	 */
	std::string getGrantType();

	/*! \brief Set 
	 */
	void setGrantType(std::string  grant_type);


    private:
    std::string code{};
    std::string redirect_uri{};
    std::string grant_type{};
};
}

#endif /* TINY_CPP_CLIENT_OauthAccessTokenRequestCode_H_ */
