
/*
 * ConversionTagListResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionTagListResponse_H_
#define TINY_CPP_CLIENT_ConversionTagListResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionTag.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionTagListResponse{
public:

    /*! \brief Constructor.
	 */
    ConversionTagListResponse();
    ConversionTagListResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionTagListResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<ConversionTag> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ConversionTag> items);


    private:
    std::list<ConversionTag> items;
};
}

#endif /* TINY_CPP_CLIENT_ConversionTagListResponse_H_ */
