/*
 * TargetingSpecOperationList.h
 *
 * 
 */

#ifndef _TargetingSpecOperationList_H_
#define _TargetingSpecOperationList_H_


#include <string>
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

class TargetingSpecOperationList : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecOperationList();
	TargetingSpecOperationList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecOperationList();

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
	std::list<std::string> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <std::string> values);

private:
	std::string field;
	std::string operation;
	std::list <std::string>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpecOperationList_H_ */
