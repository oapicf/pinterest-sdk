/*
 * InviteType.h
 *
 * The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner&#39;s business assets.
 */

#ifndef _InviteType_H_
#define _InviteType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.
 *
 *  \ingroup Models
 *
 */

class InviteType : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteType();
	InviteType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteType_H_ */
