/*
 * ConversionEventsUserData.h
 *
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 */

#ifndef _ConversionEventsUserData_H_
#define _ConversionEventsUserData_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 *
 *  \ingroup Models
 *
 */

class ConversionEventsUserData : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventsUserData();
	ConversionEventsUserData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventsUserData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros.
	 */
	std::list<std::string> getPh();

	/*! \brief Set Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros.
	 */
	void setPh(std::list <std::string> ph);
	/*! \brief Get Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender.
	 */
	std::list<std::string> getGe();

	/*! \brief Set Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender.
	 */
	void setGe(std::list <std::string> ge);
	/*! \brief Get Sha256 hashes of user's date of birthday, given as year, month, and day.
	 */
	std::list<std::string> getDb();

	/*! \brief Set Sha256 hashes of user's date of birthday, given as year, month, and day.
	 */
	void setDb(std::list <std::string> db);
	/*! \brief Get Sha256 hashes of user's last name, in lowercase.
	 */
	std::list<std::string> getLn();

	/*! \brief Set Sha256 hashes of user's last name, in lowercase.
	 */
	void setLn(std::list <std::string> ln);
	/*! \brief Get Sha256 hashes of user's first name, in lowercase.
	 */
	std::list<std::string> getFn();

	/*! \brief Set Sha256 hashes of user's first name, in lowercase.
	 */
	void setFn(std::list <std::string> fn);
	/*! \brief Get Sha256 hashes of user's city, in lowercase, and without spaces or punctuation.
	 */
	std::list<std::string> getCt();

	/*! \brief Set Sha256 hashes of user's city, in lowercase, and without spaces or punctuation.
	 */
	void setCt(std::list <std::string> ct);
	/*! \brief Get Sha256 hashes of user's state, given as a two-letter code in lowercase.
	 */
	std::list<std::string> getSt();

	/*! \brief Set Sha256 hashes of user's state, given as a two-letter code in lowercase.
	 */
	void setSt(std::list <std::string> st);
	/*! \brief Get Sha256 hashes of user's zipcode, only digits.
	 */
	std::list<std::string> getZp();

	/*! \brief Set Sha256 hashes of user's zipcode, only digits.
	 */
	void setZp(std::list <std::string> zp);
	/*! \brief Get Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase.
	 */
	std::list<std::string> getCountry();

	/*! \brief Set Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase.
	 */
	void setCountry(std::list <std::string> country);
	/*! \brief Get Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc.
	 */
	std::list<std::string> getExternalId();

	/*! \brief Set Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc.
	 */
	void setExternalId(std::list <std::string> external_id);

private:
	std::list <std::string>ph;
	std::list <std::string>ge;
	std::list <std::string>db;
	std::list <std::string>ln;
	std::list <std::string>fn;
	std::list <std::string>ct;
	std::list <std::string>st;
	std::list <std::string>zp;
	std::list <std::string>country;
	std::list <std::string>external_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEventsUserData_H_ */
