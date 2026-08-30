
/*
 * FollowUserCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_FollowUserCreate_H_
#define TINY_CPP_CLIENT_FollowUserCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class FollowUserCreate{
public:

    /*! \brief Constructor.
	 */
    FollowUserCreate();
    FollowUserCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FollowUserCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
	 */
	bool isAutoFollow();

	/*! \brief Set   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
	 */
	void setAutoFollow(bool auto_follow);


    private:
    bool auto_follow{};
};
}

#endif /* TINY_CPP_CLIENT_FollowUserCreate_H_ */
