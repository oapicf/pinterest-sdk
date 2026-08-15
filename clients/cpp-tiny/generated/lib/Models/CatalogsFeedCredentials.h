
/*
 * CatalogsFeedCredentials.h
 *
 * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedCredentials_H_
#define TINY_CPP_CLIENT_CatalogsFeedCredentials_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief This field is **OPTIONAL**. Use this if your feed file requires username and password.
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedCredentials{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedCredentials();
    CatalogsFeedCredentials(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedCredentials();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The required password for downloading a feed.
	 */
	std::string getPassword();

	/*! \brief Set The required password for downloading a feed.
	 */
	void setPassword(std::string  password);
	/*! \brief Get The required username for downloading a feed.
	 */
	std::string getUsername();

	/*! \brief Set The required username for downloading a feed.
	 */
	void setUsername(std::string  username);


    private:
    std::string password{};
    std::string username{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedCredentials_H_ */
