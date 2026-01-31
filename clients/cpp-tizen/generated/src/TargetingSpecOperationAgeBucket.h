/*
 * TargetingSpecOperationAgeBucket.h
 *
 * 
 */

#ifndef _TargetingSpecOperationAgeBucket_H_
#define _TargetingSpecOperationAgeBucket_H_


#include <string>
#include "TargetingSpecAgeBucket.h"
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

class TargetingSpecOperationAgeBucket : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecOperationAgeBucket();
	TargetingSpecOperationAgeBucket(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecOperationAgeBucket();

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
	std::list<TargetingSpecAgeBucket> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <TargetingSpecAgeBucket> values);

private:
	std::string field;
	std::string operation;
	std::list <TargetingSpecAgeBucket>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpecOperationAgeBucket_H_ */
