
/*
 * AppsflyerAudienceSyncCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_AppsflyerAudienceSyncCreate_H_
#define TINY_CPP_CLIENT_AppsflyerAudienceSyncCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AppsflyerAudienceSyncCreate{
public:

    /*! \brief Constructor.
	 */
    AppsflyerAudienceSyncCreate();
    AppsflyerAudienceSyncCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AppsflyerAudienceSyncCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The container ID of the audience
	 */
	std::string getContainerId();

	/*! \brief Set The container ID of the audience
	 */
	void setContainerId(std::string container_id);
	/*! \brief Get The pre-signed URL for SHA256 hashed GAID/IDFA file
	 */
	std::string getUrlAdidSha256();

	/*! \brief Set The pre-signed URL for SHA256 hashed GAID/IDFA file
	 */
	void setUrlAdidSha256(std::string url_adid_sha256);
	/*! \brief Get The pre-signed URL for SHA256 hashed email file
	 */
	std::string getUrlEmailSha256();

	/*! \brief Set The pre-signed URL for SHA256 hashed email file
	 */
	void setUrlEmailSha256(std::string url_email_sha256);


    private:
    std::string container_id{};
    std::string url_adid_sha256{};
    std::string url_email_sha256{};
};
}

#endif /* TINY_CPP_CLIENT_AppsflyerAudienceSyncCreate_H_ */
