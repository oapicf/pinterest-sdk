#ifndef TINY_CPP_CLIENT_LeadFormsApi_H_
#define TINY_CPP_CLIENT_LeadFormsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Error.h"
#include "LeadFormArrayResponse.h"
#include "LeadFormCreateRequest.h"
#include "LeadFormResponse.h"
#include "LeadFormTestRequest.h"
#include "LeadFormTestResponse.h"
#include "LeadFormUpdateRequest.h"
#include "Lead_forms_list_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class LeadFormsApi : public Service {
public:
    LeadFormsApi() = default;

    virtual ~LeadFormsApi() = default;

    /**
    * Create lead form test data.
    *
    * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param leadFormId Unique identifier of a lead form. *Required*
    * \param leadFormTestRequest Subscription to create. *Required*
    */
    Response<
                LeadFormTestResponse
        >
    leadFormTest_create(
            
            std::string adAccountId
            , 
            
            std::string leadFormId
            , 
            
            LeadFormTestRequest leadFormTestRequest
            
    );
    /**
    * Get lead form by id.
    *
    * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param leadFormId Unique identifier of a lead form. *Required*
    */
    Response<
                LeadFormResponse
        >
    leadForm_get(
            
            std::string adAccountId
            , 
            
            std::string leadFormId
            
    );
    /**
    * Create lead forms.
    *
    * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param leadFormCreateRequest List of lead forms to create, size limit [1, 30]. *Required*
    */
    Response<
                LeadFormArrayResponse
        >
    leadForms_create(
            
            std::string adAccountId
            , 
            std::list<LeadFormCreateRequest> leadFormCreateRequest
            
            
    );
    /**
    * List lead forms.
    *
    * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Lead_forms_list_200_response
        >
    leadForms_list(
            
            std::string adAccountId
            , 
            
            int pageSize
            , 
            
            std::string order
            , 
            
            std::string bookmark
            
    );
    /**
    * Update lead forms.
    *
    * <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param leadFormUpdateRequest List of lead forms to update, size limit [1, 30]. *Required*
    */
    Response<
                LeadFormArrayResponse
        >
    leadForms_update(
            
            std::string adAccountId
            , 
            std::list<LeadFormUpdateRequest> leadFormUpdateRequest
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_LeadFormsApi_H_ */