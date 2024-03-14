/*
 * CatalogsProductGroupPricingCriteria.h
 *
 * 
 */

#ifndef _CatalogsProductGroupPricingCriteria_H_
#define _CatalogsProductGroupPricingCriteria_H_


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

class CatalogsProductGroupPricingCriteria : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupPricingCriteria();
	CatalogsProductGroupPricingCriteria(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupPricingCriteria();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	bool getInclusion();

	/*! \brief Set 
	 */
	void setInclusion(bool  inclusion);
	/*! \brief Get 
	 */
	long long getValues();

	/*! \brief Set 
	 */
	void setValues(long long  values);
	/*! \brief Get 
	 */
	bool getNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);

private:
	bool inclusion;
	long long values;
	bool negated;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupPricingCriteria_H_ */
