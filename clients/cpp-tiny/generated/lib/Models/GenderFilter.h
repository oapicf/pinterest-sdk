
/*
 * GenderFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GenderFilter_H_
#define TINY_CPP_CLIENT_GenderFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupMultipleGenderCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GenderFilter{
public:

    /*! \brief Constructor.
	 */
    GenderFilter();
    GenderFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenderFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleGenderCriteria getGENDER();

	/*! \brief Set 
	 */
	void setGENDER(CatalogsProductGroupMultipleGenderCriteria  gENDER);


    private:
    CatalogsProductGroupMultipleGenderCriteria gENDER;
};
}

#endif /* TINY_CPP_CLIENT_GenderFilter_H_ */
