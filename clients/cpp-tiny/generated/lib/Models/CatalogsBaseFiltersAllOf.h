
/*
 * CatalogsBaseFiltersAllOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsBaseFiltersAllOf_H_
#define TINY_CPP_CLIENT_CatalogsBaseFiltersAllOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsBaseFilterKeys.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsBaseFiltersAllOf{
public:

    /*! \brief Constructor.
	 */
    CatalogsBaseFiltersAllOf();
    CatalogsBaseFiltersAllOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsBaseFiltersAllOf();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CatalogsBaseFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list<CatalogsBaseFilterKeys> all_of);


    private:
    std::list<CatalogsBaseFilterKeys> all_of;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsBaseFiltersAllOf_H_ */
