
/*
 * Any_of.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Any_of_H_
#define TINY_CPP_CLIENT_Any_of_H_


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

class Any_of{
public:

    /*! \brief Constructor.
	 */
    Any_of();
    Any_of(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Any_of();


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
	void setAnyOf(std::list <CatalogsProductGroupFilterKeys> any_of);


    private:
    std::list<CatalogsProductGroupFilterKeys> any_of;
};
}

#endif /* TINY_CPP_CLIENT_Any_of_H_ */
