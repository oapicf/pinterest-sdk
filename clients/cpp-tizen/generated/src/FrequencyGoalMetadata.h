/*
 * FrequencyGoalMetadata.h
 *
 * Frequency target can only be between 2 and 20
 */

#ifndef _FrequencyGoalMetadata_H_
#define _FrequencyGoalMetadata_H_


#include <string>
#include "FrequencyGoalMetadataTimerange.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Frequency target can only be between 2 and 20
 *
 *  \ingroup Models
 *
 */

class FrequencyGoalMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	FrequencyGoalMetadata();
	FrequencyGoalMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FrequencyGoalMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getFrequency();

	/*! \brief Set 
	 */
	void setFrequency(int  frequency);
	/*! \brief Get 
	 */
	FrequencyGoalMetadataTimerange getTimerange();

	/*! \brief Set 
	 */
	void setTimerange(FrequencyGoalMetadataTimerange  timerange);

private:
	int frequency;
	FrequencyGoalMetadataTimerange timerange;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FrequencyGoalMetadata_H_ */
