/*
 * OauthAccessTokenRequestCode_allOf.h
 *
 * 
 */

#ifndef _OauthAccessTokenRequestCode_allOf_H_
#define _OauthAccessTokenRequestCode_allOf_H_


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

class OauthAccessTokenRequestCode_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	OauthAccessTokenRequestCode_allOf();
	OauthAccessTokenRequestCode_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OauthAccessTokenRequestCode_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string code;
	std::string redirect_uri;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OauthAccessTokenRequestCode_allOf_H_ */
