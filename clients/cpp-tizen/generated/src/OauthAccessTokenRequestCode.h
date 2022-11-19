/*
 * OauthAccessTokenRequestCode.h
 *
 * A request to exchange an authorization code for an access token.
 */

#ifndef _OauthAccessTokenRequestCode_H_
#define _OauthAccessTokenRequestCode_H_


#include <string>
#include "OauthAccessTokenRequest.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A request to exchange an authorization code for an access token.
 *
 *  \ingroup Models
 *
 */

class OauthAccessTokenRequestCode : public Object {
public:
	/*! \brief Constructor.
	 */
	OauthAccessTokenRequestCode();
	OauthAccessTokenRequestCode(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OauthAccessTokenRequestCode();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getGrantType();

	/*! \brief Set 
	 */
	void setGrantType(std::string  grant_type);
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

private:
	std::string grant_type;
	std::string code;
	std::string redirect_uri;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OauthAccessTokenRequestCode_H_ */
