
/*
 * CatalogsProductGroupPricingCriteria.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupPricingCriteria_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupPricingCriteria_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupPricingCriteria{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupPricingCriteria();
    CatalogsProductGroupPricingCriteria(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupPricingCriteria();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isInclusion();

	/*! \brief Set 
	 */
	void setInclusion(bool  inclusion);
	/*! \brief Get 
	 */
	bool isNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);
	/*! \brief Get 
	 */
	long getValues();

	/*! \brief Set 
	 */
	void setValues(long  values);


    private:
    bool inclusion{};
    bool negated{};
    long values{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupPricingCriteria_H_ */
