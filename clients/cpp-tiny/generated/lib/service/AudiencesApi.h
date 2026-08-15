#ifndef TINY_CPP_CLIENT_AudiencesApi_H_
#define TINY_CPP_CLIENT_AudiencesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Audience.h"
#include "AudienceCreateRequest.h"
#include "AudienceUpdateRequest.h"
#include "Audiences_list_200_response.h"
#include "Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class AudiencesApi : public Service {
public:
    AudiencesApi() = default;

    virtual ~AudiencesApi() = default;

    /**
    * Create audience.
    *
    * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific `audience_ids` when you create an ad group. <p/> Learn about <a href=\"/docs/work-with-targets-and-audiences/create-audiences/\" target=\"_blank\">creating different kinds of audiences</a>.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param audienceCreateRequest List of ads to create, size limit [1, 30] *Required*
    */
    Response<
                Audience
        >
    audiences_create(
            
            std::string adAccountId
            , 
            
            AudienceCreateRequest audienceCreateRequest
            
    );
    /**
    * Get audience.
    *
    * Get a specific audience given the audience ID.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param audienceId Unique identifier of an audience *Required*
    */
    Response<
                Audience
        >
    audiences_get(
            
            std::string adAccountId
            , 
            
            std::string audienceId
            
    );
    /**
    * List audiences.
    *
    * Get list of audiences for the ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param ownershipType Filter audiences by ownership type.
    */
    Response<
                Audiences_list_200_response
        >
    audiences_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            std::string order
            , 
            
            int pageSize
            , 
            
            std::string ownershipType
            
    );
    /**
    * Update audience.
    *
    * Update (edit or remove) an existing targeting audience.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param audienceId Unique identifier of an audience *Required*
    * \param audienceUpdateRequest The audience to be updated. *Required*
    */
    Response<
                Audience
        >
    audiences_update(
            
            std::string adAccountId
            , 
            
            std::string audienceId
            , 
            
            AudienceUpdateRequest audienceUpdateRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AudiencesApi_H_ */