#ifndef _LeadFormsManager_H_
#define _LeadFormsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "LeadForm.h"
#include "LeadFormBatchUpdate.h"
#include "LeadFormCreate.h"
#include "LeadFormTest.h"
#include "LeadFormTestCreate.h"
#include "Lead_forms_create_200_response.h"
#include "Lead_forms_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup LeadForms LeadForms
 * \ingroup Operations
 *  @{
 */
class LeadFormsManager {
public:
	LeadFormsManager();
	virtual ~LeadFormsManager();

/*! \brief Get lead form by id. *Synchronous*
 *
 * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
 * \param leadFormId The ID of this lead form *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormGetSync(char * accessToken,
	std::string leadFormId, std::string adAccountId, 
	void(* handler)(LeadForm, Error, void* )
	, void* userData);

/*! \brief Get lead form by id. *Asynchronous*
 *
 * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
 * \param leadFormId The ID of this lead form *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormGetAsync(char * accessToken,
	std::string leadFormId, std::string adAccountId, 
	void(* handler)(LeadForm, Error, void* )
	, void* userData);


/*! \brief Create lead form test data. *Synchronous*
 *
 * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
 * \param adAccountId  *Required*
 * \param leadFormId Unique identifier of a lead form. *Required*
 * \param leadFormTestCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormTestCreateSync(char * accessToken,
	std::string adAccountId, std::string leadFormId, std::shared_ptr<LeadFormTestCreate> leadFormTestCreate, 
	void(* handler)(LeadFormTest, Error, void* )
	, void* userData);

/*! \brief Create lead form test data. *Asynchronous*
 *
 * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
 * \param adAccountId  *Required*
 * \param leadFormId Unique identifier of a lead form. *Required*
 * \param leadFormTestCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormTestCreateAsync(char * accessToken,
	std::string adAccountId, std::string leadFormId, std::shared_ptr<LeadFormTestCreate> leadFormTestCreate, 
	void(* handler)(LeadFormTest, Error, void* )
	, void* userData);


/*! \brief Create lead forms. *Synchronous*
 *
 * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsCreateSync(char * accessToken,
	std::string adAccountId, std::list<LeadFormCreate> leadFormCreate, 
	void(* handler)(Lead_forms_create_200_response, Error, void* )
	, void* userData);

/*! \brief Create lead forms. *Asynchronous*
 *
 * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsCreateAsync(char * accessToken,
	std::string adAccountId, std::list<LeadFormCreate> leadFormCreate, 
	void(* handler)(Lead_forms_create_200_response, Error, void* )
	, void* userData);


/*! \brief List lead forms. *Synchronous*
 *
 * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, 
	void(* handler)(Lead_forms_list_200_response, Error, void* )
	, void* userData);

/*! \brief List lead forms. *Asynchronous*
 *
 * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, 
	void(* handler)(Lead_forms_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update lead forms. *Synchronous*
 *
 * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormBatchUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsUpdateSync(char * accessToken,
	std::string adAccountId, std::list<LeadFormBatchUpdate> leadFormBatchUpdate, 
	void(* handler)(Lead_forms_create_200_response, Error, void* )
	, void* userData);

/*! \brief Update lead forms. *Asynchronous*
 *
 * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormBatchUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<LeadFormBatchUpdate> leadFormBatchUpdate, 
	void(* handler)(Lead_forms_create_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* LeadFormsManager_H_ */
