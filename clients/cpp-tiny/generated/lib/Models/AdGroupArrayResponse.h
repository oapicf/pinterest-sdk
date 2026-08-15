
/*
 * AdGroupArrayResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroupArrayResponse_H_
#define TINY_CPP_CLIENT_AdGroupArrayResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdGroupArrayResponseElement.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroupArrayResponse{
public:

    /*! \brief Constructor.
	 */
    AdGroupArrayResponse();
    AdGroupArrayResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupArrayResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AdGroupArrayResponseElement> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdGroupArrayResponseElement> items);


    private:
    std::list<AdGroupArrayResponseElement> items;
};
}

#endif /* TINY_CPP_CLIENT_AdGroupArrayResponse_H_ */
