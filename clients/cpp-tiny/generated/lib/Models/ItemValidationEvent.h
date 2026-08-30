
/*
 * ItemValidationEvent.h
 *
 * Object describing an item validation event
 */

#ifndef TINY_CPP_CLIENT_ItemValidationEvent_H_
#define TINY_CPP_CLIENT_ItemValidationEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Object describing an item validation event
 *
 *  \ingroup Models
 *
 */

class ItemValidationEvent{
public:

    /*! \brief Constructor.
	 */
    ItemValidationEvent();
    ItemValidationEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemValidationEvent();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The attribute that the item validation event references
	 */
	std::string getAttribute();

	/*! \brief Set The attribute that the item validation event references
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

#endif /* TINY_CPP_CLIENT_ItemValidationEvent_H_ */
