/*
 * OauthAccessTokenRequest.h
 *
 * Describes the valid schema for possible OAuth access token requests.
 */

#ifndef _OauthAccessTokenRequest_H_
#define _OauthAccessTokenRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Describes the valid schema for possible OAuth access token requests.
 *
 *  \ingroup Models
 *
 */

class OauthAccessTokenRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	OauthAccessTokenRequest();
	OauthAccessTokenRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OauthAccessTokenRequest();

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

private:
	std::string grant_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OauthAccessTokenRequest_H_ */
