
/*
 * CatalogsProductGroupFiltersRequestAnyOfItems0.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsProductGroupFiltersRequestAnyOfItems0_H_
#define TINY_CPP_CLIENT_CatalogsProductGroupFiltersRequestAnyOfItems0_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupFilterKeys.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupFiltersRequestAnyOfItems0{
public:

    /*! \brief Constructor.
	 */
    CatalogsProductGroupFiltersRequestAnyOfItems0();
    CatalogsProductGroupFiltersRequestAnyOfItems0(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsProductGroupFiltersRequestAnyOfItems0();


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


    private:
    std::list<CatalogsProductGroupFilterKeys> any_of;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsProductGroupFiltersRequestAnyOfItems0_H_ */
