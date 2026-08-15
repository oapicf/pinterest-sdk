
/*
 * BusinessMemberAssetsSummary_ad_accounts_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BusinessMemberAssetsSummary_ad_accounts_inner_H_
#define TINY_CPP_CLIENT_BusinessMemberAssetsSummary_ad_accounts_inner_H_


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

class BusinessMemberAssetsSummary_ad_accounts_inner{
public:

    /*! \brief Constructor.
	 */
    BusinessMemberAssetsSummary_ad_accounts_inner();
    BusinessMemberAssetsSummary_ad_accounts_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessMemberAssetsSummary_ad_accounts_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of a business ad account.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of a business ad account.
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

#endif /* TINY_CPP_CLIENT_BusinessMemberAssetsSummary_ad_accounts_inner_H_ */
