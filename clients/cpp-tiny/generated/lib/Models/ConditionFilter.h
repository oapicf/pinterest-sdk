
/*
 * ConditionFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConditionFilter_H_
#define TINY_CPP_CLIENT_ConditionFilter_H_


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

class ConditionFilter{
public:

    /*! \brief Constructor.
	 */
    ConditionFilter();
    ConditionFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConditionFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getCONDITION();

	/*! \brief Set 
	 */
	void setCONDITION(CatalogsProductGroupMultipleStringCriteria  cONDITION);


    private:
    CatalogsProductGroupMultipleStringCriteria cONDITION;
};
}

#endif /* TINY_CPP_CLIENT_ConditionFilter_H_ */
