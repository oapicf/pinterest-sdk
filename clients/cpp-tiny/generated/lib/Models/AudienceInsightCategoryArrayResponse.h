
/*
 * AudienceInsightCategoryArrayResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AudienceInsightCategoryArrayResponse_H_
#define TINY_CPP_CLIENT_AudienceInsightCategoryArrayResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceInsightCategoryCommon.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AudienceInsightCategoryArrayResponse{
public:

    /*! \brief Constructor.
	 */
    AudienceInsightCategoryArrayResponse();
    AudienceInsightCategoryArrayResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceInsightCategoryArrayResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AudienceInsightCategoryCommon> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AudienceInsightCategoryCommon> items);


    private:
    std::list<AudienceInsightCategoryCommon> items;
};
}

#endif /* TINY_CPP_CLIENT_AudienceInsightCategoryArrayResponse_H_ */
