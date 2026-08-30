
/*
 * LinkFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LinkFilter_H_
#define TINY_CPP_CLIENT_LinkFilter_H_


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

class LinkFilter{
public:

    /*! \brief Constructor.
	 */
    LinkFilter();
    LinkFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LinkFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupFilterOperatorTypeCriteria getLINK();

	/*! \brief Set 
	 */
	void setLINK(CatalogsProductGroupFilterOperatorTypeCriteria lINK);


    private:
    CatalogsProductGroupFilterOperatorTypeCriteria lINK;
};
}

#endif /* TINY_CPP_CLIENT_LinkFilter_H_ */
