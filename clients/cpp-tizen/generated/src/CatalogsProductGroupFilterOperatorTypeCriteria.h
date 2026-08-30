/*
 * CatalogsProductGroupFilterOperatorTypeCriteria.h
 *
 * 
 */

#ifndef _CatalogsProductGroupFilterOperatorTypeCriteria_H_
#define _CatalogsProductGroupFilterOperatorTypeCriteria_H_


#include <string>
#include "FilterOperatorType.h"
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

class CatalogsProductGroupFilterOperatorTypeCriteria : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria();
	CatalogsProductGroupFilterOperatorTypeCriteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupFilterOperatorTypeCriteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FilterOperatorType getFilterOperatorType();

	/*! \brief Set 
	 */
	void setFilterOperatorType(FilterOperatorType  filter_operator_type);
	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);
	/*! \brief Get 
	 */
	std::list<std::string> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <std::string> values);

private:
	FilterOperatorType filter_operator_type;
	bool negated;
	std::list <std::string>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupFilterOperatorTypeCriteria_H_ */
