/*
 * OauthAccessTokenRequestClientCredentials.h
 *
 * 
 */

#ifndef _OauthAccessTokenRequestClientCredentials_H_
#define _OauthAccessTokenRequestClientCredentials_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OauthAccessTokenRequestClientCredentials : public Object {
public:
	/*! \brief Constructor.
	 */
	OauthAccessTokenRequestClientCredentials();
	OauthAccessTokenRequestClientCredentials(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OauthAccessTokenRequestClientCredentials();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string scope;
	std::string grant_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OauthAccessTokenRequestClientCredentials_H_ */
