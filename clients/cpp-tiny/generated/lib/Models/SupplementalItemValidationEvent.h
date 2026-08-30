
/*
 * SupplementalItemValidationEvent.h
 *
 * Item validation event
 */

#ifndef TINY_CPP_CLIENT_SupplementalItemValidationEvent_H_
#define TINY_CPP_CLIENT_SupplementalItemValidationEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Item validation event
 *
 *  \ingroup Models
 *
 */

class SupplementalItemValidationEvent{
public:

    /*! \brief Constructor.
	 */
    SupplementalItemValidationEvent();
    SupplementalItemValidationEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SupplementalItemValidationEvent();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The item attribute referenced by the validation event eg. price, availability, ad_link
	 */
	std::string getAttribute();

	/*! \brief Set The item attribute referenced by the validation event eg. price, availability, ad_link
	 */
	void setAttribute(std::string attribute);
	/*! \brief Get The event code that the item validation event references
	 */
	int getCode();

	/*! \brief Set The event code that the item validation event references
	 */
	void setCode(int code);
	/*! \brief Get Title message describing the item validation event
	 */
	std::string getMessage();

	/*! \brief Set Title message describing the item validation event
	 */
	void setMessage(std::string message);


    private:
    std::string attribute{};
    int code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_SupplementalItemValidationEvent_H_ */
