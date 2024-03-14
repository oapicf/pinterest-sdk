/*
 * AudienceCreateRequest.h
 *
 * 
 */

#ifndef _AudienceCreateRequest_H_
#define _AudienceCreateRequest_H_


#include <string>
#include "AudienceCreateRequest_1_audience_type.h"
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

class AudienceCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceCreateRequest();
	AudienceCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceCreateRequest();

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
	/*! \brief Get Audience description.
	 */
	std::string getDescription();

	/*! \brief Set Audience description.
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	AudienceCreateRequest_1_audience_type getAudienceType();

	/*! \brief Set 
	 */
	void setAudienceType(AudienceCreateRequest_1_audience_type  audience_type);

private:
	std::string ad_account_id;
	std::string name;
	AudienceRule rule;
	std::string description;
	AudienceCreateRequest_1_audience_type audience_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceCreateRequest_H_ */
