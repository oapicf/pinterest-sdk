
/*
 * MetricsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MetricsResponse_H_
#define TINY_CPP_CLIENT_MetricsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MetricsResponse{
public:

    /*! \brief Constructor.
	 */
    MetricsResponse();
    MetricsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MetricsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<Object> getData();

	/*! \brief Set 
	 */
	void setData(std::list <Object> data);


    private:
    std::list<Object> data;
};
}

#endif /* TINY_CPP_CLIENT_MetricsResponse_H_ */
