#ifndef _TargetingTemplateManager_H_
#define _TargetingTemplateManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "TargetingTemplateCreate.h"
#include "TargetingTemplateGetResponseData.h"
#include "TargetingTemplateUpdateRequest.h"
#include "Targeting_template_list_200_response.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup TargetingTemplate TargetingTemplate
 * \ingroup Operations
 *  @{
 */
class TargetingTemplateManager {
public:
	TargetingTemplateManager();
	virtual ~TargetingTemplateManager();

/*! \brief Create targeting templates. *Synchronous*
 *
 * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param targetingTemplateCreate targeting template creation entity *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool targetingTemplateCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<TargetingTemplateCreate> targetingTemplateCreate, 
	void(* handler)(TargetingTemplateGetResponseData, Error, void* )
	, void* userData);

/*! \brief Create targeting templates. *Asynchronous*
 *
 * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param targetingTemplateCreate targeting template creation entity *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool targetingTemplateCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<TargetingTemplateCreate> targetingTemplateCreate, 
	void(* handler)(TargetingTemplateGetResponseData, Error, void* )
	, void* userData);


/*! \brief List targeting templates. *Synchronous*
 *
 * Get a list of the targeting templates in the specified <code>ad_account_id</code>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param includeSizing Include audience sizing in result or not
 * \param searchQuery Search keyword for targeting templates
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool targetingTemplateListSync(char * accessToken,
	std::string adAccountId, std::string order, bool includeSizing, std::string searchQuery, int pageSize, std::string bookmark, 
	void(* handler)(Targeting_template_list_200_response, Error, void* )
	, void* userData);

/*! \brief List targeting templates. *Asynchronous*
 *
 * Get a list of the targeting templates in the specified <code>ad_account_id</code>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param includeSizing Include audience sizing in result or not
 * \param searchQuery Search keyword for targeting templates
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool targetingTemplateListAsync(char * accessToken,
	std::string adAccountId, std::string order, bool includeSizing, std::string searchQuery, int pageSize, std::string bookmark, 
	void(* handler)(Targeting_template_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update targeting templates. *Synchronous*
 *
 * <p>Update the targeting template given advertiser ID and targeting template ID</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param targetingTemplateUpdateRequest Operation type and targeting template ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool targetingTemplateUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<TargetingTemplateUpdateRequest> targetingTemplateUpdateRequest, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Update targeting templates. *Asynchronous*
 *
 * <p>Update the targeting template given advertiser ID and targeting template ID</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param targetingTemplateUpdateRequest Operation type and targeting template ID *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool targetingTemplateUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<TargetingTemplateUpdateRequest> targetingTemplateUpdateRequest, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* TargetingTemplateManager_H_ */
