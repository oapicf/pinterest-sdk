/*
 * Audience.h
 *
 * 
 */

#ifndef _Audience_H_
#define _Audience_H_


#include <string>
#include "AudienceRule.h"
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

class Audience : public Object {
public:
	/*! \brief Constructor.
	 */
	Audience();
	Audience(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Audience();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ad account ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Ad account ID.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Audience ID.
	 */
	std::string getId();

	/*! \brief Set Audience ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Audience name.
	 */
	std::string getName();

	/*! \brief Set Audience name.
	 */
	void setName(std::string  name);
	/*! \brief Get <a href=\"/docs/redoc/#section/Pinner-(audience)-list-type\">Audience type</a>
	 */
	std::string getAudienceType();

	/*! \brief Set <a href=\"/docs/redoc/#section/Pinner-(audience)-list-type\">Audience type</a>
	 */
	void setAudienceType(std::string  audience_type);
	/*! \brief Get Audience description.
	 */
	std::string getDescription();

	/*! \brief Set Audience description.
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	AudienceRule getRule();

	/*! \brief Set 
	 */
	void setRule(AudienceRule  rule);
	/*! \brief Get Audience size.
	 */
	int getSize();

	/*! \brief Set Audience size.
	 */
	void setSize(int  size);
	/*! \brief Get Audience status. TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
	 */
	std::string getStatus();

	/*! \brief Set Audience status. TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
	 */
	void setStatus(std::string  status);
	/*! \brief Get Always \"audience\".
	 */
	std::string getType();

	/*! \brief Set Always \"audience\".
	 */
	void setType(std::string  type);
	/*! \brief Get Creation time. Unix timestamp in seconds.
	 */
	int getCreatedTimestamp();

	/*! \brief Set Creation time. Unix timestamp in seconds.
	 */
	void setCreatedTimestamp(int  created_timestamp);
	/*! \brief Get Last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTimestamp();

	/*! \brief Set Last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTimestamp(int  updated_timestamp);

private:
	std::string ad_account_id;
	std::string id;
	std::string name;
	std::string audience_type;
	std::string description;
	AudienceRule rule;
	int size;
	std::string status;
	std::string type;
	int created_timestamp;
	int updated_timestamp;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Audience_H_ */
