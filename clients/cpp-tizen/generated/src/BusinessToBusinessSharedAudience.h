/*
 * BusinessToBusinessSharedAudience.h
 *
 * 
 */

#ifndef _BusinessToBusinessSharedAudience_H_
#define _BusinessToBusinessSharedAudience_H_


#include <string>
#include "Role.h"
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

class BusinessToBusinessSharedAudience : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessToBusinessSharedAudience();
	BusinessToBusinessSharedAudience(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessToBusinessSharedAudience();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of an audience
	 */
	std::string getAudienceId();

	/*! \brief Set Unique identifier of an audience
	 */
	void setAudienceId(std::string  audience_id);
	/*! \brief Get Permissions granted to the recipients.
	 */
	std::list<Role> getPermissions();

	/*! \brief Set Permissions granted to the recipients.
	 */
	void setPermissions(std::list <Role> permissions);
	/*! \brief Get Business IDs to share with or revoke from (request) / that received the audience (response).
	 */
	std::list<std::string> getRecipientBusinessIds();

	/*! \brief Set Business IDs to share with or revoke from (request) / that received the audience (response).
	 */
	void setRecipientBusinessIds(std::list <std::string> recipient_business_ids);

private:
	std::string audience_id;
	std::list <Role>permissions;
	std::list <std::string>recipient_business_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BusinessToBusinessSharedAudience_H_ */
