#ifndef TINY_CPP_CLIENT_LeadFormsApi_H_
#define TINY_CPP_CLIENT_LeadFormsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "LeadForm.h"
#include "LeadFormBatchUpdate.h"
#include "LeadFormCreate.h"
#include "LeadFormTest.h"
#include "LeadFormTestCreate.h"
#include "Lead_forms_create_200_response.h"
#include "Lead_forms_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class LeadFormsApi : public Service {
public:
    LeadFormsApi() = default;

    virtual ~LeadFormsApi();

    /**
    * Create lead form test data.
    *
    * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
    * \param adAccountId  *Required*
    * \param leadFormId Unique identifier of a lead form. *Required*
    * \param leadFormTestCreate  *Required*
    */
    Response<
                LeadFormTest
        >
    leadFormTest_create(
            
            std::string adAccountId
            , 
            
            std::string leadFormId
            , 
            
            LeadFormTestCreate leadFormTestCreate
            
    );
    /**
    * Get lead form by id.
    *
    * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    * \param leadFormId The ID of this lead form *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                LeadForm
        >
    leadForm_get(
            
            std::string leadFormId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Create lead forms.
    *
    * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param leadFormCreate  *Required*
    */
    Response<
                Lead_forms_create_200_response
        >
    leadForms_create(
            
            std::string adAccountId
            , 
            std::list<LeadFormCreate> leadFormCreate
            
            
    );
    /**
    * List lead forms.
    *
    * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    */
    Response<
                Lead_forms_list_200_response
        >
    leadForms_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
    );
    /**
    * Update lead forms.
    *
    * **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param leadFormBatchUpdate  *Required*
    */
    Response<
                Lead_forms_create_200_response
        >
    leadForms_update(
            
            std::string adAccountId
            , 
            std::list<LeadFormBatchUpdate> leadFormBatchUpdate
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_LeadFormsApi_H_ */