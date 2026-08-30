
/*
 * ScheduleAction.h
 *
 * The schedule action
 */

#ifndef TINY_CPP_CLIENT_ScheduleAction_H_
#define TINY_CPP_CLIENT_ScheduleAction_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The schedule action
 *
 *  \ingroup Models
 *
 */

class ScheduleAction{
public:

    /*! \brief Constructor.
	 */
    ScheduleAction();
    ScheduleAction(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ScheduleAction();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ScheduleAction_H_ */
