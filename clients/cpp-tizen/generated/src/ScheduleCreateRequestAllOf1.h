/*
 * ScheduleCreateRequestAllOf1.h
 *
 * 
 */

#ifndef _ScheduleCreateRequestAllOf1_H_
#define _ScheduleCreateRequestAllOf1_H_


#include <string>
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

class ScheduleCreateRequestAllOf1 : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleCreateRequestAllOf1();
	ScheduleCreateRequestAllOf1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleCreateRequestAllOf1();

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

private:
	std::string entity_id;
	std::string entity_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ScheduleCreateRequestAllOf1_H_ */
