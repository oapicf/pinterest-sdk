
/*
 * CountryFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CountryFilter_H_
#define TINY_CPP_CLIENT_CountryFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupMultipleCountriesCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CountryFilter{
public:

    /*! \brief Constructor.
	 */
    CountryFilter();
    CountryFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CountryFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleCountriesCriteria getCOUNTRY();

	/*! \brief Set 
	 */
	void setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria  cOUNTRY);


    private:
    CatalogsProductGroupMultipleCountriesCriteria cOUNTRY;
};
}

#endif /* TINY_CPP_CLIENT_CountryFilter_H_ */
