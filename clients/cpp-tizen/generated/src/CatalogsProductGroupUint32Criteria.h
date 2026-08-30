/*
 * CatalogsProductGroupUint32Criteria.h
 *
 * 
 */

#ifndef _CatalogsProductGroupUint32Criteria_H_
#define _CatalogsProductGroupUint32Criteria_H_


#include <string>
#include "NumericFilterOperatorType.h"
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

class CatalogsProductGroupUint32Criteria : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupUint32Criteria();
	CatalogsProductGroupUint32Criteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupUint32Criteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);
	/*! \brief Get 
	 */
	NumericFilterOperatorType getROperator();

	/*! \brief Set 
	 */
	void setROperator(NumericFilterOperatorType  r_operator);
	/*! \brief Get 
	 */
	int getValue();

	/*! \brief Set 
	 */
	void setValue(int  value);

private:
	bool negated;
	NumericFilterOperatorType r_operator;
	int value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupUint32Criteria_H_ */
