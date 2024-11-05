/*
 * UpdatePartnerAssetAccessBody_accesses_inner.h
 *
 * 
 */

#ifndef _UpdatePartnerAssetAccessBody_accesses_inner_H_
#define _UpdatePartnerAssetAccessBody_accesses_inner_H_


#include <string>
#include "Permissions.h"
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

class UpdatePartnerAssetAccessBody_accesses_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePartnerAssetAccessBody_accesses_inner();
	UpdatePartnerAssetAccessBody_accesses_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePartnerAssetAccessBody_accesses_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of a business partner to update asset access to.
	 */
	std::string getPartnerId();

	/*! \brief Set Unique identifier of a business partner to update asset access to.
	 */
	void setPartnerId(std::string  partner_id);
	/*! \brief Get Unique identifier of the business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of the business asset.
	 */
	void setAssetId(std::string  asset_id);
	/*! \brief Get A non-empty array of permissions to assign to the partner.
	 */
	std::list<Permissions> getPermissions();

	/*! \brief Set A non-empty array of permissions to assign to the partner.
	 */
	void setPermissions(std::list <Permissions> permissions);

private:
	std::string partner_id;
	std::string asset_id;
	std::list <Permissions>permissions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePartnerAssetAccessBody_accesses_inner_H_ */
