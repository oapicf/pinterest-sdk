/*
 * TargetingSpecOperationShoppingRetargeting.h
 *
 * 
 */

#ifndef _TargetingSpecOperationShoppingRetargeting_H_
#define _TargetingSpecOperationShoppingRetargeting_H_


#include <string>
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

class TargetingSpecOperationShoppingRetargeting : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpecOperationShoppingRetargeting();
	TargetingSpecOperationShoppingRetargeting(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpecOperationShoppingRetargeting();

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

private:
	std::string field;
	std::string operation;
	std::list <TargetingSpecShoppingRetargeting>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpecOperationShoppingRetargeting_H_ */
