/*
 * TargetingSpecOperationMinimumAge.h
 *
 * 
 */

#ifndef _TargetingSpecOperationMinimumAge_H_
#define _TargetingSpecOperationMinimumAge_H_


#include <string>
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

class TargetingSpecOperationMinimumAge : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecOperationMinimumAge();
	TargetingSpecOperationMinimumAge(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecOperationMinimumAge();

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
	std::string getValue();

	/*! \brief Set 
	 */
	void setValue(std::string  value);

private:
	std::string field;
	std::string operation;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpecOperationMinimumAge_H_ */
