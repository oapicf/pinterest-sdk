/*
 * BidFloorRequest.h
 *
 * 
 */

#ifndef _BidFloorRequest_H_
#define _BidFloorRequest_H_


#include <string>
#include "BidFloorSpec.h"
#include "TargetingSpec.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BidFloorRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	BidFloorRequest();
	BidFloorRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BidFloorRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::list <BidFloorSpec>bid_floor_specs;
	TargetingSpec targeting_spec;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BidFloorRequest_H_ */
