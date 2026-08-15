
/*
 * ConversionEventsUserData.h
 *
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 */

#ifndef TINY_CPP_CLIENT_ConversionEventsUserData_H_
#define TINY_CPP_CLIENT_ConversionEventsUserData_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionEventsUserDataProperties.h"
#include <list>

namespace Tiny {


/*! \brief Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 *
 *  \ingroup Models
 *
 */

class ConversionEventsUserData{
public:

    /*! \brief Constructor.
	 */
    ConversionEventsUserData();
    ConversionEventsUserData(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionEventsUserData();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
	 */
	std::string getClickId();

	/*! \brief Set The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
	 */
	void setClickId(std::string  click_id);
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
	/*! \brief Get Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getCountry();

	/*! \brief Set Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
	 */
	void setCountry(std::list <std::string> country);
	/*! \brief Get Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
	 */
	std::list<std::string> getCt();

	/*! \brief Set Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
	 */
	void setCt(std::list <std::string> ct);
	/*! \brief Get Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getDb();

	/*! \brief Set Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
	 */
	void setDb(std::list <std::string> db);
	/*! \brief Get Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getEm();

	/*! \brief Set Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	void setEm(std::list <std::string> em);
	/*! \brief Get Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getExternalId();

	/*! \brief Set Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	void setExternalId(std::list <std::string> external_id);
	/*! \brief Get Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getFn();

	/*! \brief Set Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	void setFn(std::list <std::string> fn);
	/*! \brief Get Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getGe();

	/*! \brief Set Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
	 */
	void setGe(std::list <std::string> ge);
	/*! \brief Get Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getHashedMaids();

	/*! \brief Set Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	void setHashedMaids(std::list <std::string> hashed_maids);
	/*! \brief Get Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getLn();

	/*! \brief Set Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	void setLn(std::list <std::string> ln);
	/*! \brief Get A unique identifier of visitors' information defined by third party partners. e.g RampID
	 */
	std::string getPartnerId();

	/*! \brief Set A unique identifier of visitors' information defined by third party partners. e.g RampID
	 */
	void setPartnerId(std::string  partner_id);
	/*! \brief Get Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	std::list<std::string> getPh();

	/*! \brief Set Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
	 */
	void setPh(std::list <std::string> ph);
	/*! \brief Get Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
	 */
	std::list<std::string> getSt();

	/*! \brief Set Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
	 */
	void setSt(std::list <std::string> st);
	/*! \brief Get Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
	 */
	std::list<std::string> getZp();

	/*! \brief Set Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
	 */
	void setZp(std::list <std::string> zp);


    private:
    std::string click_id{};
    std::string client_ip_address{};
    std::string client_user_agent{};
    std::list<std::string> country;
    std::list<std::string> ct;
    std::list<std::string> db;
    std::list<std::string> em;
    std::list<std::string> external_id;
    std::list<std::string> fn;
    std::list<std::string> ge;
    std::list<std::string> hashed_maids;
    std::list<std::string> ln;
    std::string partner_id{};
    std::list<std::string> ph;
    std::list<std::string> st;
    std::list<std::string> zp;
};
}

#endif /* TINY_CPP_CLIENT_ConversionEventsUserData_H_ */
