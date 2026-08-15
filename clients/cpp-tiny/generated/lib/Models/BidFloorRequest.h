
/*
 * BidFloorRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BidFloorRequest_H_
#define TINY_CPP_CLIENT_BidFloorRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BidFloorSpec.h"
#include "TargetingSpec.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BidFloorRequest{
public:

    /*! \brief Constructor.
	 */
    BidFloorRequest();
    BidFloorRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BidFloorRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<BidFloorSpec> getBidFloorSpecs();

	/*! \brief Set 
	 */
	void setBidFloorSpecs(std::list <BidFloorSpec> bid_floor_specs);
	/*! \brief Get 
	 */
	TargetingSpec getTargetingSpec();

	/*! \brief Set 
	 */
	void setTargetingSpec(TargetingSpec  targeting_spec);


    private:
    std::list<BidFloorSpec> bid_floor_specs;
    TargetingSpec targeting_spec;
};
}

#endif /* TINY_CPP_CLIENT_BidFloorRequest_H_ */
