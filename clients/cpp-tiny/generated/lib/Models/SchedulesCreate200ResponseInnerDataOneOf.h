
/*
 * Schedules_create_200_response_inner_data_oneOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Schedules_create_200_response_inner_data_oneOf_H_
#define TINY_CPP_CLIENT_Schedules_create_200_response_inner_data_oneOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Schedules_create_200_response_inner_data_oneOf{
public:

    /*! \brief Constructor.
	 */
    Schedules_create_200_response_inner_data_oneOf();
    Schedules_create_200_response_inner_data_oneOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Schedules_create_200_response_inner_data_oneOf();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string id);
	/*! \brief Get Schedule ID.
	 */
	std::string getScheduleId();

	/*! \brief Set Schedule ID.
	 */
	void setScheduleId(std::string schedule_id);
	/*! \brief Get 
	 */
	Pinterest.Lib.Error getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Pinterest.Lib.Error exceptions);


    private:
    std::string id{};
    std::string schedule_id{};
    Pinterest.Lib.Error exceptions;
};
}

#endif /* TINY_CPP_CLIENT_Schedules_create_200_response_inner_data_oneOf_H_ */
