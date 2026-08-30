/*
 * AppsflyerAudienceSyncCreate.h
 *
 * Resource create operation model.
 */

#ifndef _AppsflyerAudienceSyncCreate_H_
#define _AppsflyerAudienceSyncCreate_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AppsflyerAudienceSyncCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	AppsflyerAudienceSyncCreate();
	AppsflyerAudienceSyncCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AppsflyerAudienceSyncCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The container ID of the audience
	 */
	std::string getContainerId();

	/*! \brief Set The container ID of the audience
	 */
	void setContainerId(std::string  container_id);
	/*! \brief Get The pre-signed URL for SHA256 hashed GAID/IDFA file
	 */
	std::string getUrlAdidSha256();

	/*! \brief Set The pre-signed URL for SHA256 hashed GAID/IDFA file
	 */
	void setUrlAdidSha256(std::string  url_adid_sha256);
	/*! \brief Get The pre-signed URL for SHA256 hashed email file
	 */
	std::string getUrlEmailSha256();

	/*! \brief Set The pre-signed URL for SHA256 hashed email file
	 */
	void setUrlEmailSha256(std::string  url_email_sha256);

private:
	std::string container_id;
	std::string url_adid_sha256;
	std::string url_email_sha256;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AppsflyerAudienceSyncCreate_H_ */
