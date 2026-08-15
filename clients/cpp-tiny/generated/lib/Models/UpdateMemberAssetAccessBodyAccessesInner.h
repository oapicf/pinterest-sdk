
/*
 * UpdateMemberAssetAccessBody_accesses_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateMemberAssetAccessBody_accesses_inner_H_
#define TINY_CPP_CLIENT_UpdateMemberAssetAccessBody_accesses_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Permissions.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateMemberAssetAccessBody_accesses_inner{
public:

    /*! \brief Constructor.
	 */
    UpdateMemberAssetAccessBody_accesses_inner();
    UpdateMemberAssetAccessBody_accesses_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateMemberAssetAccessBody_accesses_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Id of the asset to update.
	 */
	std::string getAssetId();

	/*! \brief Set Id of the asset to update.
	 */
	void setAssetId(std::string  asset_id);
	/*! \brief Get Unique identifier of the member on which to perform the update
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the member on which to perform the update
	 */
	void setMemberId(std::string  member_id);
	/*! \brief Get A non-empty array of permissions to assign to the member.
	 */
	std::list<Permissions> getPermissions();

	/*! \brief Set A non-empty array of permissions to assign to the member.
	 */
	void setPermissions(std::list <Permissions> permissions);


    private:
    std::string asset_id{};
    std::string member_id{};
    std::list<Permissions> permissions;
};
}

#endif /* TINY_CPP_CLIENT_UpdateMemberAssetAccessBody_accesses_inner_H_ */
