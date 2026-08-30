
/*
 * CatalogsItemValidationIssues.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemValidationIssues_H_
#define TINY_CPP_CLIENT_CatalogsItemValidationIssues_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsItemValidationErrors.h"
#include "CatalogsItemValidationWarnings.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsItemValidationIssues{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemValidationIssues();
    CatalogsItemValidationIssues(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemValidationIssues();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsItemValidationErrors getErrors();

	/*! \brief Set 
	 */
	void setErrors(CatalogsItemValidationErrors errors);
	/*! \brief Get The merchant-created unique ID that represents the product.
	 */
	std::string getItemId();

	/*! \brief Set The merchant-created unique ID that represents the product.
	 */
	void setItemId(std::string item_id);
	/*! \brief Get Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
	 */
	int getItemNumber();

	/*! \brief Set Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
	 */
	void setItemNumber(int item_number);
	/*! \brief Get 
	 */
	CatalogsItemValidationWarnings getWarnings();

	/*! \brief Set 
	 */
	void setWarnings(CatalogsItemValidationWarnings warnings);


    private:
    CatalogsItemValidationErrors errors;
    std::string item_id{};
    int item_number{};
    CatalogsItemValidationWarnings warnings;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemValidationIssues_H_ */
