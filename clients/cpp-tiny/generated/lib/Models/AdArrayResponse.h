
/*
 * AdArrayResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdArrayResponse_H_
#define TINY_CPP_CLIENT_AdArrayResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdArrayResponseElement.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdArrayResponse{
public:

    /*! \brief Constructor.
	 */
    AdArrayResponse();
    AdArrayResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdArrayResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AdArrayResponseElement> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <AdArrayResponseElement> items);


    private:
    std::list<AdArrayResponseElement> items;
};
}

#endif /* TINY_CPP_CLIENT_AdArrayResponse_H_ */
