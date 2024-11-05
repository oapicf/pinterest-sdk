/*
 * InviteType.h
 *
 * The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
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


/*! \brief The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
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
