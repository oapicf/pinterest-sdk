/*
 * IneligibleProductTagErrorItem.h
 *
 * Error item for a product tag that failed eligibility check.
 */

#ifndef _IneligibleProductTagErrorItem_H_
#define _IneligibleProductTagErrorItem_H_


#include <string>
#include "IneligibleProductTagReason.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Error item for a product tag that failed eligibility check.
 *
 *  \ingroup Models
 *
 */

class IneligibleProductTagErrorItem : public Object {
public:
	/*! \brief Constructor.
	 */
	IneligibleProductTagErrorItem();
	IneligibleProductTagErrorItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IneligibleProductTagErrorItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Reason why the pin is ineligible for tagging.
	 */
	IneligibleProductTagReason getErrorMessage();

	/*! \brief Set Reason why the pin is ineligible for tagging.
	 */
	void setErrorMessage(IneligibleProductTagReason  error_message);
	/*! \brief Get Pin ID that failed eligibility check.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID that failed eligibility check.
	 */
	void setPinId(std::string  pin_id);

private:
	IneligibleProductTagReason error_message;
	std::string pin_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IneligibleProductTagErrorItem_H_ */
