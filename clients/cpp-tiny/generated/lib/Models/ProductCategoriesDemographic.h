
/*
 * ProductCategoriesDemographic.h
 *
 * Age and gender distribution who engaged with this product category in the past 3 months
 */

#ifndef TINY_CPP_CLIENT_ProductCategoriesDemographic_H_
#define TINY_CPP_CLIENT_ProductCategoriesDemographic_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GenderDemographics.h"
#include <map>

namespace Tiny {


/*! \brief Age and gender distribution who engaged with this product category in the past 3 months
 *
 *  \ingroup Models
 *
 */

class ProductCategoriesDemographic{
public:

    /*! \brief Constructor.
	 */
    ProductCategoriesDemographic();
    ProductCategoriesDemographic(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductCategoriesDemographic();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Age demographic distribution
	 */
	Map<std::string, std::string> getAge();

	/*! \brief Set Age demographic distribution
	 */
	void setAge(Map <std::string, std::string> age);
	/*! \brief Get 
	 */
	GenderDemographics getGender();

	/*! \brief Set 
	 */
	void setGender(GenderDemographics  gender);


    private:
    Map<std::string, std::string> age;
    GenderDemographics gender;
};
}

#endif /* TINY_CPP_CLIENT_ProductCategoriesDemographic_H_ */
