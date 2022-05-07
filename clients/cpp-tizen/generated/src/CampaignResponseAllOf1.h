/*
 * CampaignResponse_allOf_1.h
 *
 * 
 */

#ifndef _CampaignResponse_allOf_1_H_
#define _CampaignResponse_allOf_1_H_


#include <string>
#include "ObjectiveType.h"
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

class CampaignResponse_allOf_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignResponse_allOf_1();
	CampaignResponse_allOf_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignResponse_allOf_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ObjectiveType getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(ObjectiveType  objective_type);
	/*! \brief Get Campaign creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Campaign creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get UTC timestamp. Last update time.
	 */
	int getUpdatedTime();

	/*! \brief Set UTC timestamp. Last update time.
	 */
	void setUpdatedTime(int  updated_time);
	/*! \brief Get Always \"campaign\".
	 */
	std::string getType();

	/*! \brief Set Always \"campaign\".
	 */
	void setType(std::string  type);

private:
	ObjectiveType objective_type;
	int created_time;
	int updated_time;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignResponse_allOf_1_H_ */
