
/*
 * BusinessMemberAssetsSummary_profiles_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BusinessMemberAssetsSummary_profiles_inner_H_
#define TINY_CPP_CLIENT_BusinessMemberAssetsSummary_profiles_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BusinessMemberAssetsSummary_profiles_inner{
public:

    /*! \brief Constructor.
	 */
    BusinessMemberAssetsSummary_profiles_inner();
    BusinessMemberAssetsSummary_profiles_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessMemberAssetsSummary_profiles_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of a business profile.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of a business profile.
	 */
	void setId(std::string  id);
	/*! \brief Get Permission levels member or partner has on an asset.
	 */
	std::list<std::string> getPermissions();

	/*! \brief Set Permission levels member or partner has on an asset.
	 */
	void setPermissions(std::list <std::string> permissions);


    private:
    std::string id{};
    std::list<std::string> permissions;
};
}

#endif /* TINY_CPP_CLIENT_BusinessMemberAssetsSummary_profiles_inner_H_ */
