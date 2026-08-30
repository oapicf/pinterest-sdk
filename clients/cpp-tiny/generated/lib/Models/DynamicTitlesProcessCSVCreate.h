
/*
 * DynamicTitlesProcessCSVCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_DynamicTitlesProcessCSVCreate_H_
#define TINY_CPP_CLIENT_DynamicTitlesProcessCSVCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class DynamicTitlesProcessCSVCreate{
public:

    /*! \brief Constructor.
	 */
    DynamicTitlesProcessCSVCreate();
    DynamicTitlesProcessCSVCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DynamicTitlesProcessCSVCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The request_id returned from the GET uploads endpoint.
	 */
	std::string getRequestId();

	/*! \brief Set The request_id returned from the GET uploads endpoint.
	 */
	void setRequestId(std::string request_id);


    private:
    std::string request_id{};
};
}

#endif /* TINY_CPP_CLIENT_DynamicTitlesProcessCSVCreate_H_ */
