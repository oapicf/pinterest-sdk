
/*
 * CatalogsProductGroupFiltersRequest.h
 *
 * Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupFiltersRequest_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupFiltersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupFilterKeys.h"
#include "CatalogsProductGroupFiltersRequestAnyOfItems0.h"
#include "CatalogsProductGroupFiltersRequestAnyOfItems1.h"
#include <list>

namespace Tiny {


/*! \brief Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupFiltersRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupFiltersRequest();
    CatalogsProductGroupFiltersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupFiltersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAnyOf();

	/*! \brief Set 
	 */
	void setAnyOf(std::list<CatalogsProductGroupFilterKeys> any_of);
	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list<CatalogsProductGroupFilterKeys> all_of);


    private:
    std::list<CatalogsProductGroupFilterKeys> any_of;
    std::list<CatalogsProductGroupFilterKeys> all_of;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupFiltersRequest_H_ */
