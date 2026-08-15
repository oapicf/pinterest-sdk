
/*
 * ActionType.h
 *
 * Ad group billable event type. For update, only draft ad groups may update billable event.
 */

#ifndef TINY_CPP_CLIENT_ActionType_H_
#define TINY_CPP_CLIENT_ActionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ad group billable event type. For update, only draft ad groups may update billable event.
 *
 *  \ingroup Models
 *
 */

class ActionType{
public:

    /*! \brief Constructor.
	 */
    ActionType();
    ActionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ActionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ActionType_H_ */
