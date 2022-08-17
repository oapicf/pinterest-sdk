/*
 * CatalogsItemValidationIssues.h
 *
 * 
 */

#ifndef _CatalogsItemValidationIssues_H_
#define _CatalogsItemValidationIssues_H_


#include <string>
#include "CatalogsItemValidationErrors.h"
#include "CatalogsItemValidationWarnings.h"
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

class CatalogsItemValidationIssues : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemValidationIssues();
	CatalogsItemValidationIssues(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemValidationIssues();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
	 */
	int getItemNumber();

	/*! \brief Set Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
	 */
	void setItemNumber(int  item_number);
	/*! \brief Get The merchant-created unique ID that represents the product.
	 */
	std::string getItemId();

	/*! \brief Set The merchant-created unique ID that represents the product.
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get 
	 */
	CatalogsItemValidationErrors getErrors();

	/*! \brief Set 
	 */
	void setErrors(CatalogsItemValidationErrors  errors);
	/*! \brief Get 
	 */
	CatalogsItemValidationWarnings getWarnings();

	/*! \brief Set 
	 */
	void setWarnings(CatalogsItemValidationWarnings  warnings);

private:
	int item_number;
	std::string item_id;
	CatalogsItemValidationErrors errors;
	CatalogsItemValidationWarnings warnings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemValidationIssues_H_ */
