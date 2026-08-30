/*
 * AdAccountsAudienceUpdate.h
 *
 * Resource create or update operation model.
 */

#ifndef _AdAccountsAudienceUpdate_H_
#define _AdAccountsAudienceUpdate_H_


#include <string>
#include "AdAccountsAudienceRule.h"
#include "AudienceType.h"
#include "AudienceUpdateOperationType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create or update operation model.
 *
 *  \ingroup Models
 *
 */

class AdAccountsAudienceUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountsAudienceUpdate();
	AdAccountsAudienceUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountsAudienceUpdate();

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
	/*! \brief Get [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
	 */
	AudienceType getAudienceType();

	/*! \brief Set [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
	 */
	void setAudienceType(AudienceType  audience_type);
	/*! \brief Get Audience description.
	 */
	std::string getDescription();

	/*! \brief Set Audience description.
	 */
	void setDescription(std::string  description);
	/*! \brief Get Audience name.
	 */
	std::string getName();

	/*! \brief Set Audience name.
	 */
	void setName(std::string  name);
	/*! \brief Get Audience operation type (update or remove). Only valid in update request body.
	 */
	AudienceUpdateOperationType getOperationType();

	/*! \brief Set Audience operation type (update or remove). Only valid in update request body.
	 */
	void setOperationType(AudienceUpdateOperationType  operation_type);
	/*! \brief Get 
	 */
	AdAccountsAudienceRule getRule();

	/*! \brief Set 
	 */
	void setRule(AdAccountsAudienceRule  rule);

private:
	std::string ad_account_id;
	AudienceType audience_type;
	std::string description;
	std::string name;
	AudienceUpdateOperationType operation_type;
	AdAccountsAudienceRule rule;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountsAudienceUpdate_H_ */
