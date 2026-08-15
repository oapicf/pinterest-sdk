
/*
 * ItemIdFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemIdFilter_H_
#define TINY_CPP_CLIENT_ItemIdFilter_H_


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

class ItemIdFilter{
public:

    /*! \brief Constructor.
	 */
    ItemIdFilter();
    ItemIdFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemIdFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getITEMID();

	/*! \brief Set 
	 */
	void setITEMID(CatalogsProductGroupMultipleStringCriteria  iTEM_ID);


    private:
    CatalogsProductGroupMultipleStringCriteria iTEM_ID;
};
}

#endif /* TINY_CPP_CLIENT_ItemIdFilter_H_ */
