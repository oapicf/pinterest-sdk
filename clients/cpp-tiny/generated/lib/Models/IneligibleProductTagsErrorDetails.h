
/*
 * IneligibleProductTagsErrorDetails.h
 *
 * Details about ineligible product tags in the request.
 */

#ifndef TINY_CPP_CLIENT_IneligibleProductTagsErrorDetails_H_
#define TINY_CPP_CLIENT_IneligibleProductTagsErrorDetails_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "IneligibleProductTagErrorItem.h"
#include <list>

namespace Tiny {


/*! \brief Details about ineligible product tags in the request.
 *
 *  \ingroup Models
 *
 */

class IneligibleProductTagsErrorDetails{
public:

    /*! \brief Constructor.
	 */
    IneligibleProductTagsErrorDetails();
    IneligibleProductTagsErrorDetails(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IneligibleProductTagsErrorDetails();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of product tags that failed eligibility check.
	 */
	std::list<IneligibleProductTagErrorItem> getProductTags();

	/*! \brief Set List of product tags that failed eligibility check.
	 */
	void setProductTags(std::list<IneligibleProductTagErrorItem> product_tags);


    private:
    std::list<IneligibleProductTagErrorItem> product_tags;
};
}

#endif /* TINY_CPP_CLIENT_IneligibleProductTagsErrorDetails_H_ */
