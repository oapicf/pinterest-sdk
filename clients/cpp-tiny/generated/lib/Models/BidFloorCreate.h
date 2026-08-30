
/*
 * BidFloorCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_BidFloorCreate_H_
#define TINY_CPP_CLIENT_BidFloorCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BidFloorSpec.h"
#include "TargetingSpecOptimal.h"
#include <list>

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class BidFloorCreate{
public:

    /*! \brief Constructor.
	 */
    BidFloorCreate();
    BidFloorCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BidFloorCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of bid floor specifications.
	 */
	std::list<BidFloorSpec> getBidFloorSpecs();

	/*! \brief Set List of bid floor specifications.
	 */
	void setBidFloorSpecs(std::list<BidFloorSpec> bid_floor_specs);
	/*! \brief Get Ad group targeting specification defining the ad group target audience.
	 */
	TargetingSpecOptimal getTargetingSpec();

	/*! \brief Set Ad group targeting specification defining the ad group target audience.
	 */
	void setTargetingSpec(TargetingSpecOptimal targeting_spec);


    private:
    std::list<BidFloorSpec> bid_floor_specs;
    TargetingSpecOptimal targeting_spec;
};
}

#endif /* TINY_CPP_CLIENT_BidFloorCreate_H_ */
