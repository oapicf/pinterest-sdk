#ifndef _LabelsManager_H_
#define _LabelsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "LabelCreateRequest.h"
#include "LabelUpdateRequest.h"
#include "LabeledEntities.h"
#include "LabeledEntitiesCreate.h"
#include "LabelsResponse.h"
#include "Labels_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "QueryLabelEntityStatusesItems.h"
#include "QueryLabelTypesItems.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Labels Labels
 * \ingroup Operations
 *  @{
 */
class LabelsManager {
public:
	LabelsManager();
	virtual ~LabelsManager();

/*! \brief Apply label to entity. *Synchronous*
 *
 *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
 * \param adAccountId  *Required*
 * \param labelId Label ID. *Required*
 * \param labeledEntitiesCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsApplySync(char * accessToken,
	std::string adAccountId, std::string labelId, std::shared_ptr<LabeledEntitiesCreate> labeledEntitiesCreate, 
	void(* handler)(LabeledEntities, Error, void* )
	, void* userData);

/*! \brief Apply label to entity. *Asynchronous*
 *
 *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
 * \param adAccountId  *Required*
 * \param labelId Label ID. *Required*
 * \param labeledEntitiesCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsApplyAsync(char * accessToken,
	std::string adAccountId, std::string labelId, std::shared_ptr<LabeledEntitiesCreate> labeledEntitiesCreate, 
	void(* handler)(LabeledEntities, Error, void* )
	, void* userData);


/*! \brief Create labels. *Synchronous*
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param labelCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LabelCreateRequest> labelCreateRequest, 
	void(* handler)(LabelsResponse, Error, void* )
	, void* userData);

/*! \brief Create labels. *Asynchronous*
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param labelCreateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LabelCreateRequest> labelCreateRequest, 
	void(* handler)(LabelsResponse, Error, void* )
	, void* userData);


/*! \brief List labels. *Synchronous*
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param labelIds List of Label Ids to use to filter the results.
 * \param entityStatuses Label entity status
 * \param labelTypes Label type.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> labelIds, std::list<QueryLabelEntityStatusesItems> entityStatuses, std::list<QueryLabelTypesItems> labelTypes, std::string bookmark, int pageSize, 
	void(* handler)(Labels_list_200_response, Error, void* )
	, void* userData);

/*! \brief List labels. *Asynchronous*
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param labelIds List of Label Ids to use to filter the results.
 * \param entityStatuses Label entity status
 * \param labelTypes Label type.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> labelIds, std::list<QueryLabelEntityStatusesItems> entityStatuses, std::list<QueryLabelTypesItems> labelTypes, std::string bookmark, int pageSize, 
	void(* handler)(Labels_list_200_response, Error, void* )
	, void* userData);


/*! \brief Remove label from entities. *Synchronous*
 *
 *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
 * \param adAccountId  *Required*
 * \param labelId Label ID. *Required*
 * \param labeledEntitiesCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsRemoveSync(char * accessToken,
	std::string adAccountId, std::string labelId, std::shared_ptr<LabeledEntitiesCreate> labeledEntitiesCreate, 
	void(* handler)(LabeledEntities, Error, void* )
	, void* userData);

/*! \brief Remove label from entities. *Asynchronous*
 *
 *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
 * \param adAccountId  *Required*
 * \param labelId Label ID. *Required*
 * \param labeledEntitiesCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsRemoveAsync(char * accessToken,
	std::string adAccountId, std::string labelId, std::shared_ptr<LabeledEntitiesCreate> labeledEntitiesCreate, 
	void(* handler)(LabeledEntities, Error, void* )
	, void* userData);


/*! \brief Update labels. *Synchronous*
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param labelUpdateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsUpdateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LabelUpdateRequest> labelUpdateRequest, 
	void(* handler)(LabelsResponse, Error, void* )
	, void* userData);

/*! \brief Update labels. *Asynchronous*
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param labelUpdateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool labelsUpdateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<LabelUpdateRequest> labelUpdateRequest, 
	void(* handler)(LabelsResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* LabelsManager_H_ */
