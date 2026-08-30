
/*
 * CatalogsItemValidationDetails.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemValidationDetails_H_
#define TINY_CPP_CLIENT_CatalogsItemValidationDetails_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "NullableCatalogsItemFieldType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsItemValidationDetails{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemValidationDetails();
    CatalogsItemValidationDetails(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemValidationDetails();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Attribute that has a validation issue.
	 */
	NullableCatalogsItemFieldType getAttributeName();

	/*! \brief Set Attribute that has a validation issue.
	 */
	void setAttributeName(NullableCatalogsItemFieldType attribute_name);
	/*! \brief Get Provided value that caused the validation issue.
	 */
	std::string getProvidedValue();

	/*! \brief Set Provided value that caused the validation issue.
	 */
	void setProvidedValue(std::string provided_value);


    private:
    NullableCatalogsItemFieldType attribute_name;
    std::string provided_value{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemValidationDetails_H_ */
