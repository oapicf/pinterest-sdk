/*
 * BidFloorCreate.h
 *
 * Resource create operation model.
 */

#ifndef _BidFloorCreate_H_
#define _BidFloorCreate_H_


#include <string>
#include "BidFloorSpec.h"
#include "TargetingSpecOptimal.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class BidFloorCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	BidFloorCreate();
	BidFloorCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BidFloorCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of bid floor specifications.
	 */
	std::list<BidFloorSpec> getBidFloorSpecs();

	/*! \brief Set List of bid floor specifications.
	 */
	void setBidFloorSpecs(std::list <BidFloorSpec> bid_floor_specs);
	/*! \brief Get Ad group targeting specification defining the ad group target audience.
	 */
	TargetingSpecOptimal getTargetingSpec();

	/*! \brief Set Ad group targeting specification defining the ad group target audience.
	 */
	void setTargetingSpec(TargetingSpecOptimal  targeting_spec);

private:
	std::list <BidFloorSpec>bid_floor_specs;
	TargetingSpecOptimal targeting_spec;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BidFloorCreate_H_ */
