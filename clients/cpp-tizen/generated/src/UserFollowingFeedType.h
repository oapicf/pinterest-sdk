/*
 * UserFollowingFeedType.h
 *
 * Specifies the type of followees to be kept when filtering them.
 */

#ifndef _UserFollowingFeedType_H_
#define _UserFollowingFeedType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Specifies the type of followees to be kept when filtering them.
 *
 *  \ingroup Models
 *
 */

class UserFollowingFeedType : public Object {
public:
	/*! \brief Constructor.
	 */
	UserFollowingFeedType();
	UserFollowingFeedType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserFollowingFeedType();

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

#endif /* _UserFollowingFeedType_H_ */
