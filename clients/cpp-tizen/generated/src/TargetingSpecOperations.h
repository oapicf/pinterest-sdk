/*
 * TargetingSpecOperations.h
 *
 * 
 */

#ifndef _TargetingSpecOperations_H_
#define _TargetingSpecOperations_H_


#include <string>
#include "TargetingSpecOperationAgeBucket.h"
#include "TargetingSpecOperationAppType.h"
#include "TargetingSpecOperationAudienceExclude.h"
#include "TargetingSpecOperationAudienceInclude.h"
#include "TargetingSpecOperationGender.h"
#include "TargetingSpecOperationGeo.h"
#include "TargetingSpecOperationGeoExclude.h"
#include "TargetingSpecOperationInterest.h"
#include "TargetingSpecOperationLocale.h"
#include "TargetingSpecOperationLocation.h"
#include "TargetingSpecOperationLocationExclude.h"
#include "TargetingSpecOperationMaximumAge.h"
#include "TargetingSpecOperationMinimumAge.h"
#include "TargetingSpecOperationShoppingRetargeting.h"
#include "TargetingSpecShoppingRetargeting.h"
#include <list>
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

class TargetingSpecOperations : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecOperations();
	TargetingSpecOperations(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecOperations();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getField();

	/*! \brief Set 
	 */
	void setField(std::string  field);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
	/*! \brief Get 
	 */
	std::list<TargetingSpecShoppingRetargeting> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <TargetingSpecShoppingRetargeting> values);
	/*! \brief Get 
	 */
	std::string getValue();

	/*! \brief Set 
	 */
	void setValue(std::string  value);

private:
	std::string field;
	std::string operation;
	std::list <TargetingSpecShoppingRetargeting>values;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpecOperations_H_ */
