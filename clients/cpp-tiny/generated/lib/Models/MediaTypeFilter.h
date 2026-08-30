
/*
 * MediaTypeFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MediaTypeFilter_H_
#define TINY_CPP_CLIENT_MediaTypeFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupMultipleMediaTypesCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MediaTypeFilter{
public:

    /*! \brief Constructor.
	 */
    MediaTypeFilter();
    MediaTypeFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MediaTypeFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleMediaTypesCriteria getMEDIATYPE();

	/*! \brief Set 
	 */
	void setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria mEDIA_TYPE);


    private:
    CatalogsProductGroupMultipleMediaTypesCriteria mEDIA_TYPE;
};
}

#endif /* TINY_CPP_CLIENT_MediaTypeFilter_H_ */
