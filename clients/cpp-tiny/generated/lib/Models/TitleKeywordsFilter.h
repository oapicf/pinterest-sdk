
/*
 * TitleKeywordsFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TitleKeywordsFilter_H_
#define TINY_CPP_CLIENT_TitleKeywordsFilter_H_


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

class TitleKeywordsFilter{
public:

    /*! \brief Constructor.
	 */
    TitleKeywordsFilter();
    TitleKeywordsFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TitleKeywordsFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS();

	/*! \brief Set 
	 */
	void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria  tITLE_KEYWORDS);


    private:
    CatalogsProductGroupMultipleStringCriteria tITLE_KEYWORDS;
};
}

#endif /* TINY_CPP_CLIENT_TitleKeywordsFilter_H_ */
