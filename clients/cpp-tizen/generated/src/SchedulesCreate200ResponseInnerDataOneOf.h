/*
 * Schedules_create_200_response_inner_data_oneOf.h
 *
 * 
 */

#ifndef _Schedules_create_200_response_inner_data_oneOf_H_
#define _Schedules_create_200_response_inner_data_oneOf_H_


#include <string>
#include "Pinterest.Lib.Error.h"
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

class Schedules_create_200_response_inner_data_oneOf : public Object {
public:
	/*! \brief Constructor.
	 */
	Schedules_create_200_response_inner_data_oneOf();
	Schedules_create_200_response_inner_data_oneOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Schedules_create_200_response_inner_data_oneOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get Schedule ID.
	 */
	std::string getScheduleId();

	/*! \brief Set Schedule ID.
	 */
	void setScheduleId(std::string  schedule_id);
	/*! \brief Get 
	 */
	Pinterest.Lib.Error getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Pinterest.Lib.Error  exceptions);

private:
	std::string id;
	std::string schedule_id;
	Pinterest.Lib.Error exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Schedules_create_200_response_inner_data_oneOf_H_ */
