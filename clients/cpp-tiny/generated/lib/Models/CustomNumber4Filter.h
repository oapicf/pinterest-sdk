
/*
 * CustomNumber4Filter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomNumber4Filter_H_
#define TINY_CPP_CLIENT_CustomNumber4Filter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupUint32Criteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomNumber4Filter{
public:

    /*! \brief Constructor.
	 */
    CustomNumber4Filter();
    CustomNumber4Filter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomNumber4Filter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_4);


    private:
    CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_4;
};
}

#endif /* TINY_CPP_CLIENT_CustomNumber4Filter_H_ */
