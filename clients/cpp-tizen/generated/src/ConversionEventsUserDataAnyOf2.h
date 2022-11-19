/*
 * ConversionEventsUserData_anyOf_2.h
 *
 * 
 */

#ifndef _ConversionEventsUserData_anyOf_2_H_
#define _ConversionEventsUserData_anyOf_2_H_


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

class ConversionEventsUserData_anyOf_2 : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventsUserData_anyOf_2();
	ConversionEventsUserData_anyOf_2(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventsUserData_anyOf_2();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching.
	 */
	std::string getClientIpAddress();

	/*! \brief Set The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching.
	 */
	void setClientIpAddress(std::string  client_ip_address);
	/*! \brief Get The user agent string of the user's web browser.
	 */
	std::string getClientUserAgent();

	/*! \brief Set The user agent string of the user's web browser.
	 */
	void setClientUserAgent(std::string  client_user_agent);

private:
	std::string client_ip_address;
	std::string client_user_agent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEventsUserData_anyOf_2_H_ */
