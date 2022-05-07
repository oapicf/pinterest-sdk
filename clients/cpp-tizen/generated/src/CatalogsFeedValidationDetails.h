/*
 * CatalogsFeedValidationDetails.h
 *
 * 
 */

#ifndef _CatalogsFeedValidationDetails_H_
#define _CatalogsFeedValidationDetails_H_


#include <string>
#include "CatalogsFeedValidationErrors.h"
#include "CatalogsFeedValidationWarnings.h"
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

class CatalogsFeedValidationDetails : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedValidationDetails();
	CatalogsFeedValidationDetails(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedValidationDetails();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedValidationDetails_H_ */
