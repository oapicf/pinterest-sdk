
/*
 * AssetGroupBinding.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AssetGroupBinding_H_
#define TINY_CPP_CLIENT_AssetGroupBinding_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessAccessUserSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AssetGroupBinding{
public:

    /*! \brief Constructor.
	 */
    AssetGroupBinding();
    AssetGroupBinding(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetGroupBinding();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of ad account IDs under the asset group
	 */
	std::list<std::string> getAdAccountsIds();

	/*! \brief Set A list of ad account IDs under the asset group
	 */
	void setAdAccountsIds(std::list<std::string> ad_accounts_ids);
	/*! \brief Get Asset group description
	 */
	std::string getAssetGroupDescription();

	/*! \brief Set Asset group description
	 */
	void setAssetGroupDescription(std::string asset_group_description);
	/*! \brief Get Asset Group name
	 */
	std::string getAssetGroupName();

	/*! \brief Set Asset Group name
	 */
	void setAssetGroupName(std::string asset_group_name);
	/*! \brief Get Asset group types
	 */
	std::list<std::string> getAssetGroupTypes();

	/*! \brief Set Asset group types
	 */
	void setAssetGroupTypes(std::list<std::string> asset_group_types);
	/*! \brief Get A list of catalog IDs under asset group
	 */
	std::list<std::string> getCatalogsIds();

	/*! \brief Set A list of catalog IDs under asset group
	 */
	void setCatalogsIds(std::list<std::string> catalogs_ids);
	/*! \brief Get The data of the user that created the asset group.
	 */
	BusinessAccessUserSummary getCreatedBy();

	/*! \brief Set The data of the user that created the asset group.
	 */
	void setCreatedBy(BusinessAccessUserSummary created_by);
	/*! \brief Get The creation time of the asset group
	 */
	int getCreatedTime();

	/*! \brief Set The creation time of the asset group
	 */
	void setCreatedTime(int created_time);
	/*! \brief Get Asset Group ID.
	 */
	std::string getId();

	/*! \brief Set Asset Group ID.
	 */
	void setId(std::string id);
	/*! \brief Get The data of the business that owns the asset group.
	 */
	BusinessAccessUserSummary getOwner();

	/*! \brief Set The data of the business that owns the asset group.
	 */
	void setOwner(BusinessAccessUserSummary owner);
	/*! \brief Get A list of profile IDs under asset group
	 */
	std::list<std::string> getProfilesIds();

	/*! \brief Set A list of profile IDs under asset group
	 */
	void setProfilesIds(std::list<std::string> profiles_ids);
	/*! \brief Get The last update time of the asset group
	 */
	int getUpdatedTime();

	/*! \brief Set The last update time of the asset group
	 */
	void setUpdatedTime(int updated_time);


    private:
    std::list<std::string> ad_accounts_ids;
    std::string asset_group_description{};
    std::string asset_group_name{};
    std::list<std::string> asset_group_types;
    std::list<std::string> catalogs_ids;
    BusinessAccessUserSummary created_by;
    int created_time{};
    std::string id{};
    BusinessAccessUserSummary owner;
    std::list<std::string> profiles_ids;
    int updated_time{};
};
}

#endif /* TINY_CPP_CLIENT_AssetGroupBinding_H_ */
