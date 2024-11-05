/*
 * UserBusinessRoleBinding.h
 *
 * 
 */

#ifndef _UserBusinessRoleBinding_H_
#define _UserBusinessRoleBinding_H_


#include <string>
#include "BusinessAccessUserSummary.h"
#include "BusinessMemberAssetsSummary.h"
#include <list>
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

class UserBusinessRoleBinding : public Object {
public:
	/*! \brief Constructor.
	 */
	UserBusinessRoleBinding();
	UserBusinessRoleBinding(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserBusinessRoleBinding();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	BusinessMemberAssetsSummary getAssetsSummary();

	/*! \brief Set 
	 */
	void setAssetsSummary(BusinessMemberAssetsSummary  assets_summary);
	/*! \brief Get The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
	 */
	std::list<std::string> getBusinessRoles();

	/*! \brief Set The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
	 */
	void setBusinessRoles(std::list <std::string> business_roles);
	/*! \brief Get Metadata for the business that created the business relationship.
	 */
	BusinessAccessUserSummary getCreatedByBusiness();

	/*! \brief Set Metadata for the business that created the business relationship.
	 */
	void setCreatedByBusiness(BusinessAccessUserSummary  created_by_business);
	/*! \brief Get Metadata for the user that created the business relationship.
	 */
	BusinessAccessUserSummary getCreatedByUser();

	/*! \brief Set Metadata for the user that created the business relationship.
	 */
	void setCreatedByUser(BusinessAccessUserSummary  created_by_user);
	/*! \brief Get The time the business relationship was created. Returned in milliseconds.
	 */
	int getCreatedTime();

	/*! \brief Set The time the business relationship was created. Returned in milliseconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get Unique identifier of the business member/business partner/employer.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of the business member/business partner/employer.
	 */
	void setId(std::string  id);
	/*! \brief Get This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
	 */
	bool getIsSharedPartner();

	/*! \brief Set This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
	 */
	void setIsSharedPartner(bool  is_shared_partner);
	/*! \brief Get Metadata for the business member/business partner/employer.
	 */
	BusinessAccessUserSummary getUser();

	/*! \brief Set Metadata for the business member/business partner/employer.
	 */
	void setUser(BusinessAccessUserSummary  user);

private:
	BusinessMemberAssetsSummary assets_summary;
	std::list <std::string>business_roles;
	BusinessAccessUserSummary created_by_business;
	BusinessAccessUserSummary created_by_user;
	int created_time;
	std::string id;
	bool is_shared_partner;
	BusinessAccessUserSummary user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserBusinessRoleBinding_H_ */
