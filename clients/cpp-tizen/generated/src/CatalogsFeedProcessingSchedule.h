/*
 * CatalogsFeedProcessingSchedule.h
 *
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */

#ifndef _CatalogsFeedProcessingSchedule_H_
#define _CatalogsFeedProcessingSchedule_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedProcessingSchedule : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedProcessingSchedule();
	CatalogsFeedProcessingSchedule(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedProcessingSchedule();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A time in format HH:MM with leading 0 (zero)
	 */
	std::string getTime();

	/*! \brief Set A time in format HH:MM with leading 0 (zero)
	 */
	void setTime(std::string  time);
	/*! \brief Get The timezone considered for the processing schedule time.
	 */
	std::string getTimezone();

	/*! \brief Set The timezone considered for the processing schedule time.
	 */
	void setTimezone(std::string  timezone);

private:
	std::string time;
	std::string timezone;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedProcessingSchedule_H_ */
