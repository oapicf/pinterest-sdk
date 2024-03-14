/*
 * CatalogsItemValidationDetails.h
 *
 * 
 */

#ifndef _CatalogsItemValidationDetails_H_
#define _CatalogsItemValidationDetails_H_


#include <string>
#include "NullableCatalogsItemFieldType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsItemValidationDetails : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemValidationDetails();
	CatalogsItemValidationDetails(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemValidationDetails();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	NullableCatalogsItemFieldType getAttributeName();

	/*! \brief Set 
	 */
	void setAttributeName(NullableCatalogsItemFieldType  attribute_name);
	/*! \brief Get Provided value that caused the validation issue.
	 */
	std::string getProvidedValue();

	/*! \brief Set Provided value that caused the validation issue.
	 */
	void setProvidedValue(std::string  provided_value);

private:
	NullableCatalogsItemFieldType attribute_name;
	std::string provided_value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemValidationDetails_H_ */
