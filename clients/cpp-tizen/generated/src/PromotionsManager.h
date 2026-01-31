#ifndef _PromotionsManager_H_
#define _PromotionsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "PromotionCreateRequest.h"
#include "PromotionResponse.h"
#include "PromotionUpdateRequest.h"
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
 * \param promotionCreateRequest List of promotions to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsCreateSync(char * accessToken,
	std::string adAccountId, std::list<PromotionCreateRequest> promotionCreateRequest, 
	void(* handler)(PromotionsResponse, Error, void* )
	, void* userData);

/*! \brief Create promotions. *Asynchronous*
 *
 * Create multiple new promotions.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionCreateRequest List of promotions to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsCreateAsync(char * accessToken,
	std::string adAccountId, std::list<PromotionCreateRequest> promotionCreateRequest, 
	void(* handler)(PromotionsResponse, Error, void* )
	, void* userData);


/*! \brief Delete promotion by id. *Synchronous*
 *
 * Delete a promotion within Pinterest.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionId Unique identifier of a promotion *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsDeleteSync(char * accessToken,
	std::string adAccountId, std::string promotionId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete promotion by id. *Asynchronous*
 *
 * Delete a promotion within Pinterest.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionId Unique identifier of a promotion *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsDeleteAsync(char * accessToken,
	std::string adAccountId, std::string promotionId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get promotion by id. *Synchronous*
 *
 * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionId Unique identifier of a promotion *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsGetSync(char * accessToken,
	std::string adAccountId, std::string promotionId, 
	void(* handler)(PromotionResponse, Error, void* )
	, void* userData);

/*! \brief Get promotion by id. *Asynchronous*
 *
 * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionId Unique identifier of a promotion *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsGetAsync(char * accessToken,
	std::string adAccountId, std::string promotionId, 
	void(* handler)(PromotionResponse, Error, void* )
	, void* userData);


/*! \brief Get promotions. *Synchronous*
 *
 * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsListSync(char * accessToken,
	std::string adAccountId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Promotions_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get promotions. *Asynchronous*
 *
 * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsListAsync(char * accessToken,
	std::string adAccountId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Promotions_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update promotions. *Synchronous*
 *
 * Update multiple promotions.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionUpdateRequest List of promotions to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsUpdateSync(char * accessToken,
	std::string adAccountId, std::list<PromotionUpdateRequest> promotionUpdateRequest, 
	void(* handler)(PromotionsResponse, Error, void* )
	, void* userData);

/*! \brief Update promotions. *Asynchronous*
 *
 * Update multiple promotions.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionUpdateRequest List of promotions to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool promotionsUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<PromotionUpdateRequest> promotionUpdateRequest, 
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
