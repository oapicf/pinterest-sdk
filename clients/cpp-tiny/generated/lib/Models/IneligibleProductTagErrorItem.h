
/*
 * IneligibleProductTagErrorItem.h
 *
 * Error item for a product tag that failed eligibility check.
 */

#ifndef TINY_CPP_CLIENT_IneligibleProductTagErrorItem_H_
#define TINY_CPP_CLIENT_IneligibleProductTagErrorItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "IneligibleProductTagReason.h"

namespace Tiny {


/*! \brief Error item for a product tag that failed eligibility check.
 *
 *  \ingroup Models
 *
 */

class IneligibleProductTagErrorItem{
public:

    /*! \brief Constructor.
	 */
    IneligibleProductTagErrorItem();
    IneligibleProductTagErrorItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IneligibleProductTagErrorItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Reason why the pin is ineligible for tagging.
	 */
	IneligibleProductTagReason getErrorMessage();

	/*! \brief Set Reason why the pin is ineligible for tagging.
	 */
	void setErrorMessage(IneligibleProductTagReason error_message);
	/*! \brief Get Pin ID that failed eligibility check.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID that failed eligibility check.
	 */
	void setPinId(std::string pin_id);


    private:
    IneligibleProductTagReason error_message;
    std::string pin_id{};
};
}

#endif /* TINY_CPP_CLIENT_IneligibleProductTagErrorItem_H_ */
