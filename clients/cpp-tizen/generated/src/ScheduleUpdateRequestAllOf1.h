/*
 * ScheduleUpdateRequestAllOf1.h
 *
 * 
 */

#ifndef _ScheduleUpdateRequestAllOf1_H_
#define _ScheduleUpdateRequestAllOf1_H_


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

class ScheduleUpdateRequestAllOf1 : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleUpdateRequestAllOf1();
	ScheduleUpdateRequestAllOf1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleUpdateRequestAllOf1();

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
	/*! \brief Get Schedule ID.
	 */
	std::string getId();

	/*! \brief Set Schedule ID.
	 */
	void setId(std::string  id);

private:
	std::string entity_id;
	std::string entity_type;
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ScheduleUpdateRequestAllOf1_H_ */
