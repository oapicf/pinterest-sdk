/*
 * CatalogsFeedCredentials.h
 *
 * Use this if your feed file requires username and password.
 */

#ifndef _CatalogsFeedCredentials_H_
#define _CatalogsFeedCredentials_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Use this if your feed file requires username and password.
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedCredentials : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedCredentials();
	CatalogsFeedCredentials(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedCredentials();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string password;
	std::string username;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedCredentials_H_ */
