
/*
 * AdAccountToAdAccountSharedAudience.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccountToAdAccountSharedAudience_H_
#define TINY_CPP_CLIENT_AdAccountToAdAccountSharedAudience_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Role.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdAccountToAdAccountSharedAudience{
public:

    /*! \brief Constructor.
	 */
    AdAccountToAdAccountSharedAudience();
    AdAccountToAdAccountSharedAudience(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountToAdAccountSharedAudience();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of an audience
	 */
	std::string getAudienceId();

	/*! \brief Set Unique identifier of an audience
	 */
	void setAudienceId(std::string audience_id);
	/*! \brief Get Permissions granted to the recipients.
	 */
	std::list<Role> getPermissions();

	/*! \brief Set Permissions granted to the recipients.
	 */
	void setPermissions(std::list<Role> permissions);
	/*! \brief Get Ad account IDs to share with or revoke from (request) / that received the audience (response).
	 */
	std::list<std::string> getRecipientAccountIds();

	/*! \brief Set Ad account IDs to share with or revoke from (request) / that received the audience (response).
	 */
	void setRecipientAccountIds(std::list<std::string> recipient_account_ids);


    private:
    std::string audience_id{};
    std::list<Role> permissions;
    std::list<std::string> recipient_account_ids;
};
}

#endif /* TINY_CPP_CLIENT_AdAccountToAdAccountSharedAudience_H_ */
