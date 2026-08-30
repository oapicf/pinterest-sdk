/*
 * TargetingSpecOperationInterest.h
 *
 * 
 */

#ifndef _TargetingSpecOperationInterest_H_
#define _TargetingSpecOperationInterest_H_


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

class TargetingSpecOperationInterest : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecOperationInterest();
	TargetingSpecOperationInterest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecOperationInterest();

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

#endif /* _TargetingSpecOperationInterest_H_ */
