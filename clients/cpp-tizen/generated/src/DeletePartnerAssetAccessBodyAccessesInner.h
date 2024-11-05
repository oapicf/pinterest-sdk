/*
 * DeletePartnerAssetAccessBody_accesses_inner.h
 *
 * 
 */

#ifndef _DeletePartnerAssetAccessBody_accesses_inner_H_
#define _DeletePartnerAssetAccessBody_accesses_inner_H_


#include <string>
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

class DeletePartnerAssetAccessBody_accesses_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletePartnerAssetAccessBody_accesses_inner();
	DeletePartnerAssetAccessBody_accesses_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletePartnerAssetAccessBody_accesses_inner();

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
	/*! \brief Get If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
	 */
	std::string getPartnerType();

	/*! \brief Set If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
	 */
	void setPartnerType(std::string  partner_type);

private:
	std::string partner_id;
	std::string asset_id;
	std::string partner_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePartnerAssetAccessBody_accesses_inner_H_ */
