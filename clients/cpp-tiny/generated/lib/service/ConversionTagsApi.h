#ifndef TINY_CPP_CLIENT_ConversionTagsApi_H_
#define TINY_CPP_CLIENT_ConversionTagsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ConversionEventResponse.h"
#include "ConversionTag.h"
#include "ConversionTagCreate.h"
#include "Conversion_tags_list_200_response.h"
#include "Page_visit_conversion_tags_get_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include <map>

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ConversionTagsApi : public Service {
public:
    ConversionTagsApi() = default;

    virtual ~ConversionTagsApi();

    /**
    * Create conversion tag.
    *
    * Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param conversionTagCreate  *Required*
    */
    Response<
                ConversionTag
        >
    conversionTags_create(
            
            std::string adAccountId
            , 
            
            ConversionTagCreate conversionTagCreate
            
    );
    /**
    * Get conversion tag.
    *
    * Get information about an existing conversion tag.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param conversionTagId Id of the conversion tag. *Required*
    */
    Response<
                ConversionTag
        >
    conversionTags_get(
            
            std::string adAccountId
            , 
            
            std::string conversionTagId
            
    );
    /**
    * List conversion tags.
    *
    * List conversion tags associated with an ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param filterDeleted Filter by deleted status
    */
    Response<
                Conversion_tags_list_200_response
        >
    conversionTags_list(
            
            std::string adAccountId
            , 
            
            bool filterDeleted
            
    );
    /**
    * Get Ocpm eligible conversion tags.
    *
    * Get Ocpm eligible conversion tag events for an ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                String
        >
    ocpmEligibleConversionTags_get(
            
            std::string adAccountId
            
    );
    /**
    * Get page visit conversion tags.
    *
    * Get all page visit conversion tag events for an ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    */
    Response<
                Page_visit_conversion_tags_get_200_response
        >
    pageVisitConversionTags_get(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ConversionTagsApi_H_ */