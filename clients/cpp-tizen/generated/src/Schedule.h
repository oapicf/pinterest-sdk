/*
 * Schedule.h
 *
 * 
 */

#ifndef _Schedule_H_
#define _Schedule_H_


#include <string>
#include "AdAccountEntityType.h"
#include "ScheduleAction.h"
#include "ScheduleStatus.h"
#include "ScheduleType.h"
#include "Schedule_delta_value.h"
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

class Schedule : public Object {
public:
	/*! \brief Constructor.
	 */
	Schedule();
	Schedule(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Schedule();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Schedule_delta_value getDeltaValue();

	/*! \brief Set 
	 */
	void setDeltaValue(Schedule_delta_value  delta_value);
	/*! \brief Get Schedule end time. Unix timestamp in seconds.
	 */
	int getEndTimestamp();

	/*! \brief Set Schedule end time. Unix timestamp in seconds.
	 */
	void setEndTimestamp(int  end_timestamp);
	/*! \brief Get entity ID.
	 */
	std::string getEntityId();

	/*! \brief Set entity ID.
	 */
	void setEntityId(std::string  entity_id);
	/*! \brief Get Specify the entity_type to get summary information
	 */
	AdAccountEntityType getEntityType();

	/*! \brief Set Specify the entity_type to get summary information
	 */
	void setEntityType(AdAccountEntityType  entity_type);
	/*! \brief Get Schedule name.
	 */
	std::string getName();

	/*! \brief Set Schedule name.
	 */
	void setName(std::string  name);
	/*! \brief Get The schedule action.
	 */
	ScheduleAction getScheduleAction();

	/*! \brief Set The schedule action.
	 */
	void setScheduleAction(ScheduleAction  schedule_action);
	/*! \brief Get Schedule ID.
	 */
	std::string getScheduleId();

	/*! \brief Set Schedule ID.
	 */
	void setScheduleId(std::string  schedule_id);
	/*! \brief Get Schedule status.
	 */
	ScheduleStatus getScheduleStatus();

	/*! \brief Set Schedule status.
	 */
	void setScheduleStatus(ScheduleStatus  schedule_status);
	/*! \brief Get The schedule type.
	 */
	ScheduleType getScheduleType();

	/*! \brief Set The schedule type.
	 */
	void setScheduleType(ScheduleType  schedule_type);
	/*! \brief Get Schedule start time. Unix timestamp in seconds.
	 */
	int getStartTimestamp();

	/*! \brief Set Schedule start time. Unix timestamp in seconds.
	 */
	void setStartTimestamp(int  start_timestamp);

private:
	Schedule_delta_value delta_value;
	int end_timestamp;
	std::string entity_id;
	AdAccountEntityType entity_type;
	std::string name;
	ScheduleAction schedule_action;
	std::string schedule_id;
	ScheduleStatus schedule_status;
	ScheduleType schedule_type;
	int start_timestamp;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Schedule_H_ */
