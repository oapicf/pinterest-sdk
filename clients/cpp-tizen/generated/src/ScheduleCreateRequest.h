/*
 * ScheduleCreateRequest.h
 *
 * 
 */

#ifndef _ScheduleCreateRequest_H_
#define _ScheduleCreateRequest_H_


#include <string>
#include "ScheduleAction.h"
#include "ScheduleCommonDeltaValue.h"
#include "ScheduleStatus.h"
#include "ScheduleType.h"
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

class ScheduleCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleCreateRequest();
	ScheduleCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getEntityId();

	/*! \brief Set 
	 */
	void setEntityId(std::string  entity_id);
	/*! \brief Get Entity type
	 */
	std::string getEntityType();

	/*! \brief Set Entity type
	 */
	void setEntityType(std::string  entity_type);
	/*! \brief Get 
	 */
	ScheduleCommonDeltaValue getDeltaValue();

	/*! \brief Set 
	 */
	void setDeltaValue(ScheduleCommonDeltaValue  delta_value);
	/*! \brief Get Schedule end time. Unix timestamp in seconds.
	 */
	int getEndTimestamp();

	/*! \brief Set Schedule end time. Unix timestamp in seconds.
	 */
	void setEndTimestamp(int  end_timestamp);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	ScheduleAction getScheduleAction();

	/*! \brief Set 
	 */
	void setScheduleAction(ScheduleAction  schedule_action);
	/*! \brief Get 
	 */
	ScheduleStatus getScheduleStatus();

	/*! \brief Set 
	 */
	void setScheduleStatus(ScheduleStatus  schedule_status);
	/*! \brief Get 
	 */
	ScheduleType getScheduleType();

	/*! \brief Set 
	 */
	void setScheduleType(ScheduleType  schedule_type);
	/*! \brief Get Schedule start time. Unix timestamp in seconds.
	 */
	int getStartTimestamp();

	/*! \brief Set Schedule start time. Unix timestamp in seconds.
	 */
	void setStartTimestamp(int  start_timestamp);

private:
	std::string entity_id;
	std::string entity_type;
	ScheduleCommonDeltaValue delta_value;
	int end_timestamp;
	std::string name;
	ScheduleAction schedule_action;
	ScheduleStatus schedule_status;
	ScheduleType schedule_type;
	int start_timestamp;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ScheduleCreateRequest_H_ */
