
/*
 * All_of.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_All_of_H_
#define TINY_CPP_CLIENT_All_of_H_


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

class All_of{
public:

    /*! \brief Constructor.
	 */
    All_of();
    All_of(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~All_of();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsProductGroupFilterKeys> all_of);


    private:
    std::list<CatalogsProductGroupFilterKeys> all_of;
};
}

#endif /* TINY_CPP_CLIENT_All_of_H_ */
