/*
 * ConversionAccessToken.h
 *
 * A successful conversion access token response.
 */

#ifndef _ConversionAccessToken_H_
#define _ConversionAccessToken_H_


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

class ConversionAccessToken : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionAccessToken();
	ConversionAccessToken(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionAccessToken();

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

#endif /* _ConversionAccessToken_H_ */
