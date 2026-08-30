/*
 * CustomerSegment.h
 *
 * 
 */

#ifndef _CustomerSegment_H_
#define _CustomerSegment_H_


#include <string>
#include "TargetingTemplateStatus.h"
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

class CustomerSegment : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomerSegment();
	CustomerSegment(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomerSegment();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the ad account that this customer segment belongs to.
	 */
	std::string getAdAccountId();

	/*! \brief Set The ID of the ad account that this customer segment belongs to.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Audience IDs included in the customer segment.
	 */
	std::list<std::string> getAudienceIds();

	/*! \brief Set Audience IDs included in the customer segment.
	 */
	void setAudienceIds(std::list <std::string> audience_ids);
	/*! \brief Get Customer segment created time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Customer segment created time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get Customer segment ID.
	 */
	std::string getId();

	/*! \brief Set Customer segment ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Customer segment name.
	 */
	std::string getName();

	/*! \brief Set Customer segment name.
	 */
	void setName(std::string  name);
	/*! \brief Get Indicates whether the customer segment is active or deleted.
	 */
	TargetingTemplateStatus getStatus();

	/*! \brief Set Indicates whether the customer segment is active or deleted.
	 */
	void setStatus(TargetingTemplateStatus  status);
	/*! \brief Get Customer segment updated time. Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Customer segment updated time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(int  updated_time);

private:
	std::string ad_account_id;
	std::list <std::string>audience_ids;
	int created_time;
	std::string id;
	std::string name;
	TargetingTemplateStatus status;
	int updated_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomerSegment_H_ */
