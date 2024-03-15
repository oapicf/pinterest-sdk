/*
 * CatalogsFeedIngestionDetails.h
 *
 * 
 */

#ifndef _CatalogsFeedIngestionDetails_H_
#define _CatalogsFeedIngestionDetails_H_


#include <string>
#include "CatalogsFeedIngestionErrors.h"
#include "CatalogsFeedIngestionInfo.h"
#include "CatalogsFeedIngestionWarnings.h"
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

class CatalogsFeedIngestionDetails : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedIngestionDetails();
	CatalogsFeedIngestionDetails(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedIngestionDetails();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsFeedIngestionErrors getErrors();

	/*! \brief Set 
	 */
	void setErrors(CatalogsFeedIngestionErrors  errors);
	/*! \brief Get 
	 */
	CatalogsFeedIngestionInfo getInfo();

	/*! \brief Set 
	 */
	void setInfo(CatalogsFeedIngestionInfo  info);
	/*! \brief Get 
	 */
	CatalogsFeedIngestionWarnings getWarnings();

	/*! \brief Set 
	 */
	void setWarnings(CatalogsFeedIngestionWarnings  warnings);

private:
	CatalogsFeedIngestionErrors errors;
	CatalogsFeedIngestionInfo info;
	CatalogsFeedIngestionWarnings warnings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedIngestionDetails_H_ */
