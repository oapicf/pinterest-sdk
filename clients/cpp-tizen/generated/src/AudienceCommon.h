/*
 * AudienceCommon.h
 *
 * 
 */

#ifndef _AudienceCommon_H_
#define _AudienceCommon_H_


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

class AudienceCommon : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceCommon();
	AudienceCommon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceCommon();

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

private:
	std::string ad_account_id;
	std::string name;
	AudienceRule rule;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AudienceCommon_H_ */
