#ifndef TINY_CPP_CLIENT_TermsApi_H_
#define TINY_CPP_CLIENT_TermsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Pinterest.Lib.Error.h"
#include "RelatedTerms.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class TermsApi : public Service {
public:
    TermsApi() = default;

    virtual ~TermsApi();

    /**
    * List related terms.
    *
    * Get a list of terms logically related to each input term.  Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
    * \param terms List of input terms. *Required*
    */
    Response<
                RelatedTerms
        >
    termsRelated_list(
            std::list<std::string> terms
            
            
    );
    /**
    * List suggested terms.
    *
    * Get popular search terms that begin with your input term.  Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
    * \param term Input term. *Required*
    * \param limit Max suggested terms to return.
    */
    Response<
                    std::list<std::string>
        >
    termsSuggested_list(
            
            std::string term
            , 
            
            int limit
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_TermsApi_H_ */