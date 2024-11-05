#ifndef _LeadFormsManager_H_
#define _LeadFormsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "LeadFormArrayResponse.h"
#include "LeadFormCreateRequest.h"
#include "LeadFormResponse.h"
#include "LeadFormTestRequest.h"
#include "LeadFormTestResponse.h"
#include "LeadFormUpdateRequest.h"
#include "Lead_forms_list_200_response.h"
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
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormId Unique identifier of a lead form. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormGetSync(char * accessToken,
	std::string adAccountId, std::string leadFormId, 
	void(* handler)(LeadFormResponse, Error, void* )
	, void* userData);

/*! \brief Get lead form by id. *Asynchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormId Unique identifier of a lead form. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormGetAsync(char * accessToken,
	std::string adAccountId, std::string leadFormId, 
	void(* handler)(LeadFormResponse, Error, void* )
	, void* userData);


/*! \brief Create lead form test data. *Synchronous*
 *
 * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormId Unique identifier of a lead form. *Required*
 * \param leadFormTestRequest Subscription to create. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormTestCreateSync(char * accessToken,
	std::string adAccountId, std::string leadFormId, std::shared_ptr<LeadFormTestRequest> leadFormTestRequest, 
	void(* handler)(LeadFormTestResponse, Error, void* )
	, void* userData);

/*! \brief Create lead form test data. *Asynchronous*
 *
 * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormId Unique identifier of a lead form. *Required*
 * \param leadFormTestRequest Subscription to create. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormTestCreateAsync(char * accessToken,
	std::string adAccountId, std::string leadFormId, std::shared_ptr<LeadFormTestRequest> leadFormTestRequest, 
	void(* handler)(LeadFormTestResponse, Error, void* )
	, void* userData);


/*! \brief Create lead forms. *Synchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormCreateRequest List of lead forms to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsCreateSync(char * accessToken,
	std::string adAccountId, std::list<LeadFormCreateRequest> leadFormCreateRequest, 
	void(* handler)(LeadFormArrayResponse, Error, void* )
	, void* userData);

/*! \brief Create lead forms. *Asynchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormCreateRequest List of lead forms to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsCreateAsync(char * accessToken,
	std::string adAccountId, std::list<LeadFormCreateRequest> leadFormCreateRequest, 
	void(* handler)(LeadFormArrayResponse, Error, void* )
	, void* userData);


/*! \brief List lead forms. *Synchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsListSync(char * accessToken,
	std::string adAccountId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Lead_forms_list_200_response, Error, void* )
	, void* userData);

/*! \brief List lead forms. *Asynchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsListAsync(char * accessToken,
	std::string adAccountId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Lead_forms_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update lead forms. *Synchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormUpdateRequest List of lead forms to update, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsUpdateSync(char * accessToken,
	std::string adAccountId, std::list<LeadFormUpdateRequest> leadFormUpdateRequest, 
	void(* handler)(LeadFormArrayResponse, Error, void* )
	, void* userData);

/*! \brief Update lead forms. *Asynchronous*
 *
 * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param leadFormUpdateRequest List of lead forms to update, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormsUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<LeadFormUpdateRequest> leadFormUpdateRequest, 
	void(* handler)(LeadFormArrayResponse, Error, void* )
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
