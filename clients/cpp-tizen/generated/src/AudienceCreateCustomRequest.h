/*
 * AudienceCreateCustomRequest.h
 *
 * 
 */

#ifndef _AudienceCreateCustomRequest_H_
#define _AudienceCreateCustomRequest_H_


#include <string>
#include "AudienceDataParty.h"
#include "AudienceRule.h"
#include "AudienceSharingType.h"
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

class AudienceCreateCustomRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceCreateCustomRequest();
	AudienceCreateCustomRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceCreateCustomRequest();

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
	/*! \brief Get Audience name.
	 */
	std::string getName();

	/*! \brief Set Audience name.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	AudienceRule getRule();

	/*! \brief Set 
	 */
	void setRule(AudienceRule  rule);
	/*! \brief Get 
	 */
	AudienceSharingType getSharingType();

	/*! \brief Set 
	 */
	void setSharingType(AudienceSharingType  sharing_type);
	/*! \brief Get 
	 */
	AudienceDataParty getDataParty();

	/*! \brief Set 
	 */
	void setDataParty(AudienceDataParty  data_party);
	/*! \brief Get 
	 */
	std::string getCategory();

	/*! \brief Set 
	 */
	void setCategory(std::string  category);

private:
	std::string ad_account_id;
	std::string name;
	AudienceRule rule;
	AudienceSharingType sharing_type;
	AudienceDataParty data_party;
	std::string category;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceCreateCustomRequest_H_ */
