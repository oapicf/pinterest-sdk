
/*
 * CustomerListRecordRow.h
 *
 * A single row in a multi-field customer list (v2 format).
 */

#ifndef TINY_CPP_CLIENT_CustomerListRecordRow_H_
#define TINY_CPP_CLIENT_CustomerListRecordRow_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A single row in a multi-field customer list (v2 format).
 *
 *  \ingroup Models
 *
 */

class CustomerListRecordRow{
public:

    /*! \brief Constructor.
	 */
    CustomerListRecordRow();
    CustomerListRecordRow(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerListRecordRow();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Email address (plain or hashed with SHA1, SHA256, or MD5).
	 */
	std::string getEmail();

	/*! \brief Set Email address (plain or hashed with SHA1, SHA256, or MD5).
	 */
	void setEmail(std::string email);
	/*! \brief Get External ID identifier (not hashed).
	 */
	std::string getExternalId();

	/*! \brief Set External ID identifier (not hashed).
	 */
	void setExternalId(std::string external_id);
	/*! \brief Get Hashed phone number (hashed with SHA1, SHA256, or MD5).
	 */
	std::string getHashedPhoneNumber();

	/*! \brief Set Hashed phone number (hashed with SHA1, SHA256, or MD5).
	 */
	void setHashedPhoneNumber(std::string hashed_phone_number);
	/*! \brief Get Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
	 */
	std::string getHashedPinnerId();

	/*! \brief Set Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
	 */
	void setHashedPinnerId(std::string hashed_pinner_id);
	/*! \brief Get IP address (not hashed).
	 */
	std::string getIpAddress();

	/*! \brief Set IP address (not hashed).
	 */
	void setIpAddress(std::string ip_address);
	/*! \brief Get LiveRamp envelope identifier (Base64-encoded, not hashed).
	 */
	std::string getLiverampEnvelope();

	/*! \brief Set LiveRamp envelope identifier (Base64-encoded, not hashed).
	 */
	void setLiverampEnvelope(std::string liveramp_envelope);
	/*! \brief Get Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
	 */
	std::string getMaid();

	/*! \brief Set Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
	 */
	void setMaid(std::string maid);
	/*! \brief Get User agent string (not hashed).
	 */
	std::string getUserAgent();

	/*! \brief Set User agent string (not hashed).
	 */
	void setUserAgent(std::string user_agent);


    private:
    std::string email{};
    std::string external_id{};
    std::string hashed_phone_number{};
    std::string hashed_pinner_id{};
    std::string ip_address{};
    std::string liveramp_envelope{};
    std::string maid{};
    std::string user_agent{};
};
}

#endif /* TINY_CPP_CLIENT_CustomerListRecordRow_H_ */
