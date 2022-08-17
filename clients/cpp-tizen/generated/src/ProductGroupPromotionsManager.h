#ifndef _ProductGroupPromotionsManager_H_
#define _ProductGroupPromotionsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "ProductGroupPromotion.h"
#include "ProductGroupPromotionArrayElement.h"
#include "ProductGroupPromotionCreateRequest.h"
#include "ProductGroupPromotionUpdateRequest.h"
#include "ProductGroupPromotionUpdateResponseItem.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ProductGroupPromotions ProductGroupPromotions
 * \ingroup Operations
 *  @{
 */
class ProductGroupPromotionsManager {
public:
	ProductGroupPromotionsManager();
	virtual ~ProductGroupPromotionsManager();

/*! \brief Get a product group promotion by id. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Get a product group promotion by id
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionId Unique identifier of a product group promotion *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionGetSync(char * accessToken,
	std::string adAccountId, std::string productGroupPromotionId, 
	void(* handler)(ProductGroupPromotion, Error, void* )
	, void* userData);

/*! \brief Get a product group promotion by id. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Get a product group promotion by id
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionId Unique identifier of a product group promotion *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionGetAsync(char * accessToken,
	std::string adAccountId, std::string productGroupPromotionId, 
	void(* handler)(ProductGroupPromotion, Error, void* )
	, void* userData);


/*! \brief Create product group promotions. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionCreateRequest List of Product Group Promotions to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionCreateRequest> productGroupPromotionCreateRequest, 
	void(* handler)(std::list<ProductGroupPromotionArrayElement>, Error, void* )
	, void* userData);

/*! \brief Create product group promotions. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionCreateRequest List of Product Group Promotions to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionCreateRequest> productGroupPromotionCreateRequest, 
	void(* handler)(std::list<ProductGroupPromotionArrayElement>, Error, void* )
	, void* userData);


/*! \brief Update product group promotions. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Update multiple existing Product Group Promotions (by product_group_id)
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionUpdateRequest Parameters to update Product group promotions *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionUpdateRequest> productGroupPromotionUpdateRequest, 
	void(* handler)(std::list<ProductGroupPromotionUpdateResponseItem>, Error, void* )
	, void* userData);

/*! \brief Update product group promotions. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Update multiple existing Product Group Promotions (by product_group_id)
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param productGroupPromotionUpdateRequest Parameters to update Product group promotions *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool productGroupPromotionsUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ProductGroupPromotionUpdateRequest> productGroupPromotionUpdateRequest, 
	void(* handler)(std::list<ProductGroupPromotionUpdateResponseItem>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* ProductGroupPromotionsManager_H_ */
