
/*
 * UpdateMemberAssetAccessBody.h
 *
 * An object with a list of all the new member asset accesses.
 */

#ifndef TINY_CPP_CLIENT_UpdateMemberAssetAccessBody_H_
#define TINY_CPP_CLIENT_UpdateMemberAssetAccessBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateMemberAssetAccessItem.h"
#include <list>

namespace Tiny {


/*! \brief An object with a list of all the new member asset accesses.
 *
 *  \ingroup Models
 *
 */

class UpdateMemberAssetAccessBody{
public:

    /*! \brief Constructor.
	 */
    UpdateMemberAssetAccessBody();
    UpdateMemberAssetAccessBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateMemberAssetAccessBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of member asset accesses to assign or update.
	 */
	std::list<UpdateMemberAssetAccessItem> getAccesses();

	/*! \brief Set List of member asset accesses to assign or update.
	 */
	void setAccesses(std::list<UpdateMemberAssetAccessItem> accesses);


    private:
    std::list<UpdateMemberAssetAccessItem> accesses;
};
}

#endif /* TINY_CPP_CLIENT_UpdateMemberAssetAccessBody_H_ */
