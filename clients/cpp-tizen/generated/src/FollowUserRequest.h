/*
 * FollowUserRequest.h
 *
 * 
 */

#ifndef _FollowUserRequest_H_
#define _FollowUserRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class FollowUserRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	FollowUserRequest();
	FollowUserRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FollowUserRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
	 */
	bool getAutoFollow();

	/*! \brief Set Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
	 */
	void setAutoFollow(bool  auto_follow);

private:
	bool auto_follow;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FollowUserRequest_H_ */
