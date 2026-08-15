
/*
 * CustomLabel4Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomLabel4Filter_H_
#define TINY_CPP_CLIENT_CustomLabel4Filter_H_


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

class CustomLabel4Filter{
public:

    /*! \brief Constructor.
	 */
    CustomLabel4Filter();
    CustomLabel4Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomLabel4Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4();

	/*! \brief Set 
	 */
	void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_4);


    private:
    CatalogsProductGroupFilterOperatorTypeCriteria cUSTOM_LABEL_4;
};
}

#endif /* TINY_CPP_CLIENT_CustomLabel4Filter_H_ */
