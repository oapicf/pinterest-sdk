
/*
 * DeletePartnerAssetAccessItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeletePartnerAssetAccessItem_H_
#define TINY_CPP_CLIENT_DeletePartnerAssetAccessItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeletePartnerAssetAccessItem{
public:

    /*! \brief Constructor.
	 */
    DeletePartnerAssetAccessItem();
    DeletePartnerAssetAccessItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeletePartnerAssetAccessItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of the business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of the business asset.
	 */
	void setAssetId(std::string asset_id);
	/*! \brief Get Unique identifier of a business partner to update asset access to.
	 */
	std::string getPartnerId();

	/*! \brief Set Unique identifier of a business partner to update asset access to.
	 */
	void setPartnerId(std::string partner_id);
	/*! \brief Get If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
	 */
	std::string getPartnerType();

	/*! \brief Set If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
	 */
	void setPartnerType(std::string partner_type);


    private:
    std::string asset_id{};
    std::string partner_id{};
    std::string partner_type{};
};
}

#endif /* TINY_CPP_CLIENT_DeletePartnerAssetAccessItem_H_ */
