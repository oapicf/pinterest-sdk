
/*
 * ScheduleCreateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ScheduleCreateRequest_H_
#define TINY_CPP_CLIENT_ScheduleCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ScheduleAction.h"
#include "ScheduleCommonDeltaValue.h"
#include "ScheduleStatus.h"
#include "ScheduleType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ScheduleCreateRequest{
public:

    /*! \brief Constructor.
	 */
    ScheduleCreateRequest();
    ScheduleCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ScheduleCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getEntityId();

	/*! \brief Set 
	 */
	void setEntityId(std::string entity_id);
	/*! \brief Get Entity type
	 */
	std::string getEntityType();

	/*! \brief Set Entity type
	 */
	void setEntityType(std::string entity_type);
	/*! \brief Get 
	 */
	ScheduleCommonDeltaValue getDeltaValue();

	/*! \brief Set 
	 */
	void setDeltaValue(ScheduleCommonDeltaValue delta_value);
	/*! \brief Get Schedule end time. Unix timestamp in seconds.
	 */
	int getEndTimestamp();

	/*! \brief Set Schedule end time. Unix timestamp in seconds.
	 */
	void setEndTimestamp(int end_timestamp);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	ScheduleAction getScheduleAction();

	/*! \brief Set 
	 */
	void setScheduleAction(ScheduleAction schedule_action);
	/*! \brief Get 
	 */
	ScheduleStatus getScheduleStatus();

	/*! \brief Set 
	 */
	void setScheduleStatus(ScheduleStatus schedule_status);
	/*! \brief Get 
	 */
	ScheduleType getScheduleType();

	/*! \brief Set 
	 */
	void setScheduleType(ScheduleType schedule_type);
	/*! \brief Get Schedule start time. Unix timestamp in seconds.
	 */
	int getStartTimestamp();

	/*! \brief Set Schedule start time. Unix timestamp in seconds.
	 */
	void setStartTimestamp(int start_timestamp);


    private:
    std::string entity_id{};
    std::string entity_type{};
    ScheduleCommonDeltaValue delta_value;
    int end_timestamp{};
    std::string name{};
    ScheduleAction schedule_action;
    ScheduleStatus schedule_status;
    ScheduleType schedule_type;
    int start_timestamp{};
};
}

#endif /* TINY_CPP_CLIENT_ScheduleCreateRequest_H_ */
