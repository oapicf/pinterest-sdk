
/*
 * AdGroupArrayResponseElement.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroupArrayResponseElement_H_
#define TINY_CPP_CLIENT_AdGroupArrayResponseElement_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdGroupResponse.h"
#include "Exception.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroupArrayResponseElement{
public:

    /*! \brief Constructor.
	 */
    AdGroupArrayResponseElement();
    AdGroupArrayResponseElement(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupArrayResponseElement();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AdGroupResponse getData();

	/*! \brief Set 
	 */
	void setData(AdGroupResponse  data);
	/*! \brief Get 
	 */
	std::list<Exception> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <Exception> exceptions);


    private:
    AdGroupResponse data;
    std::list<Exception> exceptions;
};
}

#endif /* TINY_CPP_CLIENT_AdGroupArrayResponseElement_H_ */
