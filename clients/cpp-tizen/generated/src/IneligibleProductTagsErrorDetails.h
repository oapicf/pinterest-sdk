/*
 * IneligibleProductTagsErrorDetails.h
 *
 * Details about ineligible product tags in the request.
 */

#ifndef _IneligibleProductTagsErrorDetails_H_
#define _IneligibleProductTagsErrorDetails_H_


#include <string>
#include "IneligibleProductTagErrorItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details about ineligible product tags in the request.
 *
 *  \ingroup Models
 *
 */

class IneligibleProductTagsErrorDetails : public Object {
public:
	/*! \brief Constructor.
	 */
	IneligibleProductTagsErrorDetails();
	IneligibleProductTagsErrorDetails(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IneligibleProductTagsErrorDetails();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of product tags that failed eligibility check.
	 */
	std::list<IneligibleProductTagErrorItem> getProductTags();

	/*! \brief Set List of product tags that failed eligibility check.
	 */
	void setProductTags(std::list <IneligibleProductTagErrorItem> product_tags);

private:
	std::list <IneligibleProductTagErrorItem>product_tags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IneligibleProductTagsErrorDetails_H_ */
