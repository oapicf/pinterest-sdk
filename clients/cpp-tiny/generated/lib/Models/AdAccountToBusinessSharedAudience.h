
/*
 * AdAccountToBusinessSharedAudience.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccountToBusinessSharedAudience_H_
#define TINY_CPP_CLIENT_AdAccountToBusinessSharedAudience_H_


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

class AdAccountToBusinessSharedAudience{
public:

    /*! \brief Constructor.
	 */
    AdAccountToBusinessSharedAudience();
    AdAccountToBusinessSharedAudience(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountToBusinessSharedAudience();


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
	/*! \brief Get Business IDs to share with or revoke from (request) / that received the audience (response).
	 */
	std::list<std::string> getRecipientBusinessIds();

	/*! \brief Set Business IDs to share with or revoke from (request) / that received the audience (response).
	 */
	void setRecipientBusinessIds(std::list<std::string> recipient_business_ids);


    private:
    std::string audience_id{};
    std::list<Role> permissions;
    std::list<std::string> recipient_business_ids;
};
}

#endif /* TINY_CPP_CLIENT_AdAccountToBusinessSharedAudience_H_ */
