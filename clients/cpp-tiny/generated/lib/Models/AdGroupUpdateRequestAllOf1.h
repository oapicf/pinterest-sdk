
/*
 * AdGroupUpdateRequestAllOf1.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroupUpdateRequestAllOf1_H_
#define TINY_CPP_CLIENT_AdGroupUpdateRequestAllOf1_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpecOperations.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroupUpdateRequestAllOf1{
public:

    /*! \brief Constructor.
	 */
    AdGroupUpdateRequestAllOf1();
    AdGroupUpdateRequestAllOf1(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupUpdateRequestAllOf1();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
	 */
	long getBidMultiplier();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
	 */
	void setBidMultiplier(long bid_multiplier);
	/*! \brief Get Ad group ID.
	 */
	std::string getId();

	/*! \brief Set Ad group ID.
	 */
	void setId(std::string id);
	/*! \brief Get <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>
	 */
	std::list<TargetingSpecOperations> getTargetingSpecOperations();

	/*! \brief Set <div>Targeting spec operations define modifications to apply to the targeting spec.</div> <br /> <div><strong>NOTE:</strong> The <code>targeting_spec</code> and <code>targeting_spec_operations</code> cannot be sent at the same time.</div> <br /> <div>The supported operations are:</div> <ul> <li><code>SET</code>: sets the field with the given values. If value is set to <code>null</code>, the field will be removed.</li> <li><code>ADD</code>: adds the given values to the field.</li> <li><code>REMOVE</code>: removes the given values from the field.</li> </ul> <div>Note the following:</div> <ul> <li>Same items are not added and removed at the same time.</li> <li>For a given field, only <code>ADD</code>/<code>REMOVE</code> or <code>SET</code> operations are allowed, not a mix of them.</li> <li>Only one SET operation is allowed for a given field.</li> <li>The <code>AGE_BUCKET</code>, <code>MAXIMUM_AGE</code>, <code>MINIMUM_AGE</code> and <code>SHOPPING_RETARGETING</code> fields only support the <code>SET</code> operation.</li> </ul>
	 */
	void setTargetingSpecOperations(std::list<TargetingSpecOperations> targeting_spec_operations);


    private:
    long bid_multiplier{};
    std::string id{};
    std::list<TargetingSpecOperations> targeting_spec_operations;
};
}

#endif /* TINY_CPP_CLIENT_AdGroupUpdateRequestAllOf1_H_ */
