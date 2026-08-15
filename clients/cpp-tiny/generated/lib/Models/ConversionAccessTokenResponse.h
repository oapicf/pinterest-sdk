
/*
 * ConversionAccessTokenResponse.h
 *
 * A successful conversion access token response.
 */

#ifndef TINY_CPP_CLIENT_ConversionAccessTokenResponse_H_
#define TINY_CPP_CLIENT_ConversionAccessTokenResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A successful conversion access token response.
 *
 *  \ingroup Models
 *
 */

class ConversionAccessTokenResponse{
public:

    /*! \brief Constructor.
	 */
    ConversionAccessTokenResponse();
    ConversionAccessTokenResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionAccessTokenResponse();


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
	std::string getTokenType();

	/*! \brief Set 
	 */
	void setTokenType(std::string  token_type);


    private:
    std::string access_token{};
    std::string token_type{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionAccessTokenResponse_H_ */
