
/*
 * ItemGroupIdFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemGroupIdFilter_H_
#define TINY_CPP_CLIENT_ItemGroupIdFilter_H_


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

class ItemGroupIdFilter{
public:

    /*! \brief Constructor.
	 */
    ItemGroupIdFilter();
    ItemGroupIdFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemGroupIdFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getITEMGROUPID();

	/*! \brief Set 
	 */
	void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria iTEM_GROUP_ID);


    private:
    CatalogsProductGroupMultipleStringCriteria iTEM_GROUP_ID;
};
}

#endif /* TINY_CPP_CLIENT_ItemGroupIdFilter_H_ */
