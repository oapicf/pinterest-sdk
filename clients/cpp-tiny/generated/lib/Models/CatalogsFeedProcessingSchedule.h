
/*
 * CatalogsFeedProcessingSchedule.h
 *
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedProcessingSchedule_H_
#define TINY_CPP_CLIENT_CatalogsFeedProcessingSchedule_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsFeedProcessingScheduleTimezone.h"

namespace Tiny {


/*! \brief Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedProcessingSchedule{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedProcessingSchedule();
    CatalogsFeedProcessingSchedule(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedProcessingSchedule();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A time in format HH:MM with leading 0 (zero)
	 */
	std::string getTime();

	/*! \brief Set A time in format HH:MM with leading 0 (zero)
	 */
	void setTime(std::string time);
	/*! \brief Get The timezone considered for the processing schedule time.
	 */
	CatalogsFeedProcessingScheduleTimezone getTimezone();

	/*! \brief Set The timezone considered for the processing schedule time.
	 */
	void setTimezone(CatalogsFeedProcessingScheduleTimezone timezone);


    private:
    std::string time{};
    CatalogsFeedProcessingScheduleTimezone timezone;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedProcessingSchedule_H_ */
