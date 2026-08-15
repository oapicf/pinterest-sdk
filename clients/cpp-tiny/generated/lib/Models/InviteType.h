
/*
 * InviteType.h
 *
 * The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
 */

#ifndef TINY_CPP_CLIENT_InviteType_H_
#define TINY_CPP_CLIENT_InviteType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
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
