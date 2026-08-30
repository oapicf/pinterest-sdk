
/*
 * CustomLabel0Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomLabel0Filter_H_
#define TINY_CPP_CLIENT_CustomLabel0Filter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupFilterOperatorTypeCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomLabel0Filter{
public:

    /*! \brief Constructor.
	 */
    CustomLabel0Filter();
    CustomLabel0Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomLabel0Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0);


    private:
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_0;
};
}

#endif /* TINY_CPP_CLIENT_CustomLabel0Filter_H_ */
