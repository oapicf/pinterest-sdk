
/*
 * CatalogsItemsRequest.h
 *
 * Request object of catalogs items
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemsRequest_H_
#define TINY_CPP_CLIENT_CatalogsItemsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsItemsPostFilters.h"
#include "Country.h"

namespace Tiny {


/*! \brief Request object of catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemsRequest();
    CatalogsItemsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country country);
	/*! \brief Get 
	 */
	CatalogsItemsPostFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsItemsPostFilters filters);
	/*! \brief Get We recommend using the CatalogsLocale values.
	 */
	std::string getLanguage();

	/*! \brief Set We recommend using the CatalogsLocale values.
	 */
	void setLanguage(std::string language);


    private:
    Country country;
    CatalogsItemsPostFilters filters;
    std::string language{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemsRequest_H_ */
