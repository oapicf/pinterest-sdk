#ifndef _PromotionsManager_H_
#define _PromotionsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "Promotion.h"
#include "PromotionBatchUpdate.h"
#include "PromotionCreate.h"
#include "PromotionsResponse.h"
#include "Promotions_list_200_response.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Promotions Promotions
 * \ingroup Operations
 *  @{
 */
class PromotionsManager {
public:
	PromotionsManager();
	virtual ~PromotionsManager();

/*! \brief Create promotions. *Synchronous*
 *
 * Create multiple new promotions.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsCreateSync(char * accessToken,
	std::string adAccountId, std::list<PromotionCreate> promotionCreate, 
	void(* handler)(PromotionsResponse, Error, void* )
	, void* userData);

/*! \brief Create promotions. *Asynchronous*
 *
 * Create multiple new promotions.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsCreateAsync(char * accessToken,
	std::string adAccountId, std::list<PromotionCreate> promotionCreate, 
	void(* handler)(PromotionsResponse, Error, void* )
	, void* userData);


/*! \brief Delete promotion by id. *Synchronous*
 *
 * Delete a promotion within Pinterest.
 * \param promotionId Promotion ID *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsDeleteSync(char * accessToken,
	std::string promotionId, std::string adAccountId, 
	void(* handler)(Promotion, Error, void* )
	, void* userData);

/*! \brief Delete promotion by id. *Asynchronous*
 *
 * Delete a promotion within Pinterest.
 * \param promotionId Promotion ID *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsDeleteAsync(char * accessToken,
	std::string promotionId, std::string adAccountId, 
	void(* handler)(Promotion, Error, void* )
	, void* userData);


/*! \brief Get promotion by id. *Synchronous*
 *
 * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
 * \param promotionId Promotion ID *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsGetSync(char * accessToken,
	std::string promotionId, std::string adAccountId, 
	void(* handler)(Promotion, Error, void* )
	, void* userData);

/*! \brief Get promotion by id. *Asynchronous*
 *
 * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
 * \param promotionId Promotion ID *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsGetAsync(char * accessToken,
	std::string promotionId, std::string adAccountId, 
	void(* handler)(Promotion, Error, void* )
	, void* userData);


/*! \brief Get promotions. *Synchronous*
 *
 * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, 
	void(* handler)(Promotions_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get promotions. *Asynchronous*
 *
 * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, 
	void(* handler)(Promotions_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update promotions. *Synchronous*
 *
 * Update multiple promotions.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionBatchUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsUpdateSync(char * accessToken,
	std::string adAccountId, std::list<PromotionBatchUpdate> promotionBatchUpdate, 
	void(* handler)(PromotionsResponse, Error, void* )
	, void* userData);

/*! \brief Update promotions. *Asynchronous*
 *
 * Update multiple promotions.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionBatchUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<PromotionBatchUpdate> promotionBatchUpdate, 
	void(* handler)(PromotionsResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* PromotionsManager_H_ */
