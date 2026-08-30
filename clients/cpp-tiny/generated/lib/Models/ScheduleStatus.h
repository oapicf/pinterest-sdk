
/*
 * ScheduleStatus.h
 *
 * Schedule status
 */

#ifndef TINY_CPP_CLIENT_ScheduleStatus_H_
#define TINY_CPP_CLIENT_ScheduleStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Schedule status
 *
 *  \ingroup Models
 *
 */

class ScheduleStatus{
public:

    /*! \brief Constructor.
	 */
    ScheduleStatus();
    ScheduleStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ScheduleStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ScheduleStatus_H_ */
