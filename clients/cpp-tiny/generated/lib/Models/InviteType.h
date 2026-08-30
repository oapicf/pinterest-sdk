
/*
 * InviteType.h
 *
 * The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner&#39;s business assets.
 */

#ifndef TINY_CPP_CLIENT_InviteType_H_
#define TINY_CPP_CLIENT_InviteType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.
 *
 *  \ingroup Models
 *
 */

class InviteType{
public:

    /*! \brief Constructor.
	 */
    InviteType();
    InviteType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_InviteType_H_ */
