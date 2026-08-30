/*
 * TargetingSpecOperationLocationExclude.h
 *
 * 
 */

#ifndef _TargetingSpecOperationLocationExclude_H_
#define _TargetingSpecOperationLocationExclude_H_


#include <string>
#include "TargetingSpecListOperation.h"
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

class TargetingSpecOperationLocationExclude : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecOperationLocationExclude();
	TargetingSpecOperationLocationExclude(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecOperationLocationExclude();

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
	TargetingSpecListOperation getOperation();

	/*! \brief Set 
	 */
	void setOperation(TargetingSpecListOperation  operation);
	/*! \brief Get 
	 */
	std::list<std::string> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <std::string> values);

private:
	std::string field;
	TargetingSpecListOperation operation;
	std::list <std::string>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpecOperationLocationExclude_H_ */
