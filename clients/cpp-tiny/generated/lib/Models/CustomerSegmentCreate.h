
/*
 * CustomerSegmentCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_CustomerSegmentCreate_H_
#define TINY_CPP_CLIENT_CustomerSegmentCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class CustomerSegmentCreate{
public:

    /*! \brief Constructor.
	 */
    CustomerSegmentCreate();
    CustomerSegmentCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerSegmentCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Audience IDs included in the customer segment.
	 */
	std::list<std::string> getAudienceIds();

	/*! \brief Set Audience IDs included in the customer segment.
	 */
	void setAudienceIds(std::list<std::string> audience_ids);
	/*! \brief Get Customer segment name.
	 */
	std::string getName();

	/*! \brief Set Customer segment name.
	 */
	void setName(std::string name);


    private:
    std::list<std::string> audience_ids;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CustomerSegmentCreate_H_ */
