
/*
 * AvailabilityFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AvailabilityFilter_H_
#define TINY_CPP_CLIENT_AvailabilityFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupMultipleStringCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AvailabilityFilter{
public:

    /*! \brief Constructor.
	 */
    AvailabilityFilter();
    AvailabilityFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AvailabilityFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getAVAILABILITY();

	/*! \brief Set 
	 */
	void setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria aVAILABILITY);


    private:
    CatalogsProductGroupMultipleStringCriteria aVAILABILITY;
};
}

#endif /* TINY_CPP_CLIENT_AvailabilityFilter_H_ */
