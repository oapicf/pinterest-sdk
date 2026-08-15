#ifndef TINY_CPP_CLIENT_TermsOfServiceApi_H_
#define TINY_CPP_CLIENT_TermsOfServiceApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Error.h"
#include "TermsOfService.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class TermsOfServiceApi : public Service {
public:
    TermsOfServiceApi() = default;

    virtual ~TermsOfServiceApi() = default;

    /**
    * Get terms of service.
    *
    * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param includeHtml Return HTML in TOS text.
    * \param tosType Request type.
    */
    Response<
                TermsOfService
        >
    termsOfService_get(
            
            std::string adAccountId
            , 
            
            bool includeHtml
            , 
            
            std::string tosType
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_TermsOfServiceApi_H_ */