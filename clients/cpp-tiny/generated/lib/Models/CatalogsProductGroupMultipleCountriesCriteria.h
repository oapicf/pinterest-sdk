
/*
 * CatalogsProductGroupMultipleCountriesCriteria.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupMultipleCountriesCriteria_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupMultipleCountriesCriteria_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Country.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupMultipleCountriesCriteria{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupMultipleCountriesCriteria();
    CatalogsProductGroupMultipleCountriesCriteria(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupMultipleCountriesCriteria();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	bool isNegated();

	/*! \brief Set 
	 */
	void setNegated(bool  negated);
	/*! \brief Get 
	 */
	std::list<Country> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <Country> values);


    private:
    bool negated{};
    std::list<Country> values;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupMultipleCountriesCriteria_H_ */
