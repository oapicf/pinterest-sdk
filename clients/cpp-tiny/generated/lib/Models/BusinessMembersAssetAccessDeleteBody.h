
/*
 * BusinessMembersAssetAccessDeleteBody.h
 *
 * An object with a list of member asset accesses to delete.
 */

#ifndef TINY_CPP_CLIENT_BusinessMembersAssetAccessDeleteBody_H_
#define TINY_CPP_CLIENT_BusinessMembersAssetAccessDeleteBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeleteMemberAssetAccessItem.h"
#include <list>

namespace Tiny {


/*! \brief An object with a list of member asset accesses to delete.
 *
 *  \ingroup Models
 *
 */

class BusinessMembersAssetAccessDeleteBody{
public:

    /*! \brief Constructor.
	 */
    BusinessMembersAssetAccessDeleteBody();
    BusinessMembersAssetAccessDeleteBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessMembersAssetAccessDeleteBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of members asset access to be deleted
	 */
	std::list<DeleteMemberAssetAccessItem> getAccesses();

	/*! \brief Set List of members asset access to be deleted
	 */
	void setAccesses(std::list<DeleteMemberAssetAccessItem> accesses);


    private:
    std::list<DeleteMemberAssetAccessItem> accesses;
};
}

#endif /* TINY_CPP_CLIENT_BusinessMembersAssetAccessDeleteBody_H_ */
