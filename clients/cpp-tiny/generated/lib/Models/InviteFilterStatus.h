
/*
 * InviteFilterStatus.h
 *
 * Invite statuses used for filters.
 */

#ifndef TINY_CPP_CLIENT_InviteFilterStatus_H_
#define TINY_CPP_CLIENT_InviteFilterStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Invite statuses used for filters.
 *
 *  \ingroup Models
 *
 */

class InviteFilterStatus{
public:

    /*! \brief Constructor.
	 */
    InviteFilterStatus();
    InviteFilterStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteFilterStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_InviteFilterStatus_H_ */
