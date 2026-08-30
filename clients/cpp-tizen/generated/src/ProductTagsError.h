/*
 * ProductTagsError.h
 *
 * Error response for requests containing ineligible product tags.
 */

#ifndef _ProductTagsError_H_
#define _ProductTagsError_H_


#include <string>
#include "IneligibleProductTagsErrorDetails.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Error response for requests containing ineligible product tags.
 *
 *  \ingroup Models
 *
 */

class ProductTagsError : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductTagsError();
	ProductTagsError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductTagsError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int  code);
	/*! \brief Get Details about which product tags failed eligibility check.
	 */
	IneligibleProductTagsErrorDetails getDetails();

	/*! \brief Set Details about which product tags failed eligibility check.
	 */
	void setDetails(IneligibleProductTagsErrorDetails  details);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);

private:
	int code;
	IneligibleProductTagsErrorDetails details;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductTagsError_H_ */
