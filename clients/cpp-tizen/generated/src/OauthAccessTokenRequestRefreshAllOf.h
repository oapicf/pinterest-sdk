/*
 * OauthAccessTokenRequestRefresh_allOf.h
 *
 * 
 */

#ifndef _OauthAccessTokenRequestRefresh_allOf_H_
#define _OauthAccessTokenRequestRefresh_allOf_H_


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

class OauthAccessTokenRequestRefresh_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	OauthAccessTokenRequestRefresh_allOf();
	OauthAccessTokenRequestRefresh_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OauthAccessTokenRequestRefresh_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getRefreshToken();

	/*! \brief Set 
	 */
	void setRefreshToken(std::string  refresh_token);
	/*! \brief Get 
	 */
	std::string getScope();

	/*! \brief Set 
	 */
	void setScope(std::string  scope);

private:
	std::string refresh_token;
	std::string scope;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OauthAccessTokenRequestRefresh_allOf_H_ */
