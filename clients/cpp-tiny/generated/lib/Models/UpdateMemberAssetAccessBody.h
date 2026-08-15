
/*
 * UpdateMemberAssetAccessBody.h
 *
 * An object with a list of all the new accesses.
 */

#ifndef TINY_CPP_CLIENT_UpdateMemberAssetAccessBody_H_
#define TINY_CPP_CLIENT_UpdateMemberAssetAccessBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateMemberAssetAccessBody_accesses_inner.h"
#include <list>

namespace Tiny {


/*! \brief An object with a list of all the new accesses.
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

	/*! \brief Get 
	 */
	std::list<UpdateMemberAssetAccessBody_accesses_inner> getAccesses();

	/*! \brief Set 
	 */
	void setAccesses(std::list <UpdateMemberAssetAccessBody_accesses_inner> accesses);


    private:
    std::list<UpdateMemberAssetAccessBody_accesses_inner> accesses;
};
}

#endif /* TINY_CPP_CLIENT_UpdateMemberAssetAccessBody_H_ */
