/*
 * CustomerListRecordRow.h
 *
 * A single row in a multi-field customer list (v2 format).
 */

#ifndef _CustomerListRecordRow_H_
#define _CustomerListRecordRow_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A single row in a multi-field customer list (v2 format).
 *
 *  \ingroup Models
 *
 */

class CustomerListRecordRow : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerListRecordRow();
	CustomerListRecordRow(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerListRecordRow();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Email address (plain or hashed with SHA1, SHA256, or MD5).
	 */
	std::string getEmail();

	/*! \brief Set Email address (plain or hashed with SHA1, SHA256, or MD5).
	 */
	void setEmail(std::string  email);
	/*! \brief Get External ID identifier (not hashed).
	 */
	std::string getExternalId();

	/*! \brief Set External ID identifier (not hashed).
	 */
	void setExternalId(std::string  external_id);
	/*! \brief Get Hashed phone number (hashed with SHA1, SHA256, or MD5).
	 */
	std::string getHashedPhoneNumber();

	/*! \brief Set Hashed phone number (hashed with SHA1, SHA256, or MD5).
	 */
	void setHashedPhoneNumber(std::string  hashed_phone_number);
	/*! \brief Get Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
	 */
	std::string getHashedPinnerId();

	/*! \brief Set Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
	 */
	void setHashedPinnerId(std::string  hashed_pinner_id);
	/*! \brief Get IP address (not hashed).
	 */
	std::string getIpAddress();

	/*! \brief Set IP address (not hashed).
	 */
	void setIpAddress(std::string  ip_address);
	/*! \brief Get LiveRamp envelope identifier (Base64-encoded, not hashed).
	 */
	std::string getLiverampEnvelope();

	/*! \brief Set LiveRamp envelope identifier (Base64-encoded, not hashed).
	 */
	void setLiverampEnvelope(std::string  liveramp_envelope);
	/*! \brief Get Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
	 */
	std::string getMaid();

	/*! \brief Set Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
	 */
	void setMaid(std::string  maid);
	/*! \brief Get User agent string (not hashed).
	 */
	std::string getUserAgent();

	/*! \brief Set User agent string (not hashed).
	 */
	void setUserAgent(std::string  user_agent);

private:
	std::string email;
	std::string external_id;
	std::string hashed_phone_number;
	std::string hashed_pinner_id;
	std::string ip_address;
	std::string liveramp_envelope;
	std::string maid;
	std::string user_agent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomerListRecordRow_H_ */
