/*
 * ConversionAccessTokenResponse.h
 *
 * A successful conversion access token response.
 */

#ifndef _ConversionAccessTokenResponse_H_
#define _ConversionAccessTokenResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A successful conversion access token response.
 *
 *  \ingroup Models
 *
 */

class ConversionAccessTokenResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionAccessTokenResponse();
	ConversionAccessTokenResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionAccessTokenResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getAccessToken();

	/*! \brief Set 
	 */
	void setAccessToken(std::string  access_token);
	/*! \brief Get 
	 */
	std::string getTokenType();

	/*! \brief Set 
	 */
	void setTokenType(std::string  token_type);

private:
	std::string access_token;
	std::string token_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionAccessTokenResponse_H_ */
