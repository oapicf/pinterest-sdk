
/*
 * PartnerMetadata.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PartnerMetadata_H_
#define TINY_CPP_CLIENT_PartnerMetadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PartnerMetadata{
public:

    /*! \brief Constructor.
	 */
    PartnerMetadata();
    PartnerMetadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PartnerMetadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Text field value that uniquely identifies a subscriber.
	 */
	std::string getSubscriberKey();

	/*! \brief Set Text field value that uniquely identifies a subscriber.
	 */
	void setSubscriberKey(std::string subscriber_key);


    private:
    std::string subscriber_key{};
};
}

#endif /* TINY_CPP_CLIENT_PartnerMetadata_H_ */
