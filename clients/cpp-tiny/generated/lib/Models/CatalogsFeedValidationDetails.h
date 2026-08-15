
/*
 * CatalogsFeedValidationDetails.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedValidationDetails_H_
#define TINY_CPP_CLIENT_CatalogsFeedValidationDetails_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsFeedValidationErrors.h"
#include "CatalogsFeedValidationWarnings.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedValidationDetails{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedValidationDetails();
    CatalogsFeedValidationDetails(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedValidationDetails();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsFeedValidationErrors getErrors();

	/*! \brief Set 
	 */
	void setErrors(CatalogsFeedValidationErrors  errors);
	/*! \brief Get 
	 */
	CatalogsFeedValidationWarnings getWarnings();

	/*! \brief Set 
	 */
	void setWarnings(CatalogsFeedValidationWarnings  warnings);


    private:
    CatalogsFeedValidationErrors errors;
    CatalogsFeedValidationWarnings warnings;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedValidationDetails_H_ */
