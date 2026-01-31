/*
 * TargetingSpecOperationAppType.h
 *
 * 
 */

#ifndef _TargetingSpecOperationAppType_H_
#define _TargetingSpecOperationAppType_H_


#include <string>
#include "TargetingSpecAppType.h"
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

class TargetingSpecOperationAppType : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecOperationAppType();
	TargetingSpecOperationAppType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecOperationAppType();

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
	std::list<TargetingSpecAppType> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <TargetingSpecAppType> values);

private:
	std::string field;
	std::string operation;
	std::list <TargetingSpecAppType>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpecOperationAppType_H_ */
