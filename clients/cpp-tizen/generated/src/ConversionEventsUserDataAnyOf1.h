/*
 * ConversionEventsUserData_anyOf_1.h
 *
 * 
 */

#ifndef _ConversionEventsUserData_anyOf_1_H_
#define _ConversionEventsUserData_anyOf_1_H_


#include <string>
#include <list>
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

class ConversionEventsUserData_anyOf_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventsUserData_anyOf_1();
	ConversionEventsUserData_anyOf_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventsUserData_anyOf_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getEm();

	/*! \brief Set Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	void setEm(std::list <std::string> em);
	/*! \brief Get Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getHashedMaids();

	/*! \brief Set Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	void setHashedMaids(std::list <std::string> hashed_maids);
	/*! \brief Get The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
	 */
	std::string getClientIpAddress();

	/*! \brief Set The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
	 */
	void setClientIpAddress(std::string  client_ip_address);
	/*! \brief Get The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
	 */
	std::string getClientUserAgent();

	/*! \brief Set The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
	 */
	void setClientUserAgent(std::string  client_user_agent);

private:
	std::list <std::string>em;
	std::list <std::string>hashed_maids;
	std::string client_ip_address;
	std::string client_user_agent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEventsUserData_anyOf_1_H_ */
